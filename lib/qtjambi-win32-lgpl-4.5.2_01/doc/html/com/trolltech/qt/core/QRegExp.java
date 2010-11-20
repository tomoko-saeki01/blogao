package com.trolltech.qt.core;

import com.trolltech.qt.*;



/**
The QRegExp class provides pattern matching using regular expressions. a name="regular-expression"> A regular expression, or "regexp", is a pattern for matching substrings in a text. This is useful in many contexts, e.g., <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> Validation</td><td> A regexp can test whether a substring meets some criteria, e.g. is an integer or contains no whitespace.</td></tr><tr valign="top" class="odd"><td> Searching</td><td> A regexp provides more powerful pattern matching than simple substring matching, e.g., match one of the words mail, letter or correspondence, but none of the words email, mailman, mailer, letterbox, etc.</td></tr><tr valign="top" class="even"><td> Search and Replace</td><td> A regexp can replace all occurrences of a substring with a different substring, e.g., replace all occurrences of & with &amp; except where the & is already followed by an amp;.</td></tr><tr valign="top" class="odd"><td> String Splitting</td><td> A regexp can be used to identify where a string should be split apart, e.g. splitting tab-delimited strings.</td></tr></table> A brief introduction to regexps is presented, a description of Qt's regexp language, some examples, and the function documentation itself. QRegExp is modeled on Perl's regexp language. It fully supports Unicode. QRegExp can also be used in a simpler, wildcard mode that is similar to the functionality found in command shells. The syntax rules used by QRegExp can be changed with {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}. In particular, the pattern syntax can be set to {@link com.trolltech.qt.core.QRegExp.PatternSyntax QRegExp::FixedString }, which means the pattern to be matched is interpreted as a plain string, i.e., special characters (e.g., backslash) are not escaped. <p>A good text on regexps is Mastering Regular Expressions (Third Edition) by Jeffrey E. F. Friedl, ISBN 0-596-52812-4. <ul><li> {@link <a href="#introduction">Introduction</a>}</li><li> {@link <a href="#characters-and-abbreviations-for-sets-of-characters">Characters and Abbreviations for Sets of Characters</a>}</li><li> {@link <a href="#sets-of-characters">Sets of Characters</a>}</li><li> {@link <a href="#quantifiers">Quantifiers</a>}</li><li> {@link <a href="#capturing-text">Capturing Text</a>}</li><li> {@link <a href="#assertions">Assertions</a>}</li><li> {@link <a href="#wildcard-matching">Wildcard Matching</a>}</li><li> {@link <a href="#notes-for-perl-users">Notes for Perl Users</a>}</li><li> {@link <a href="#code-examples">Code Examples</a>}</li></ul><a name="introduction"><h2>Introduction</h2> Regexps are built up from expressions, quantifiers, and assertions. The simplest expression is a character, e.g. <b>x</b> or <b>5</b>. An expression can also be a set of characters enclosed in square brackets. <b>[ABCD]</b> will match an <b>A</b> or a <b>B</b> or a <b>C</b> or a <b>D</b>. We can write this same expression as <b>[A-D]</b>, and an experession to match any captital letter in the English alphabet is written as <b>[A-Z]</b>. <p>A quantifier specifies the number of occurrences of an expression that must be matched. <b>x{1,1}</b> means match one and only one <b>x</b>. <b>x{1,5}</b> means match a sequence of <b>x</b> characters that contains at least one <b>x</b> but no more than five. <p>Note that in general regexps cannot be used to check for balanced brackets or tags. For example, a regexp can be written to match an opening html <tt>&lt;b&gt;</tt> and its closing <tt>&lt;/b&gt;</tt>, if the <tt>&lt;b&gt;</tt> tags are not nested, but if the <tt>&lt;b&gt;</tt> tags are nested, that same regexp will match an opening <tt>&lt;b&gt;</tt> tag with the wrong closing <tt>&lt;/b&gt;</tt>. For the fragment <tt>&lt;b&gt;bold &lt;b&gt;bolder&lt;/b&gt;&lt;/b&gt;</tt>, the first <tt>&lt;b&gt;</tt> would be matched with the first <tt>&lt;/b&gt;</tt>, which is not correct. However, it is possible to write a regexp that will match nested brackets or tags correctly, but only if the number of nesting levels is fixed and known. If the number of nesting levels is not fixed and known, it is impossible to write a regexp that will not fail. <p>Suppose we want a regexp to match integers in the range 0 to 99. At least one digit is required, so we start with the expression <b>[0-9]{1,1}</b>, which matches a single digit exactly once. This regexp matches integers in the range 0 to 9. To match integers up to 99, increase the maximum number of occurrences to 2, so the regexp becomes <b>[0-9]{1,2}</b>. This regexp satisfies the original requirement to match integers from 0 to 99, but it will also match integers that occur in the middle of strings. If we want the matched integer to be the whole string, we must use the anchor assertions, <b>^</b> (caret) and <b>$</b> (dollar). When <b>^</b> is the first character in a regexp, it means the regexp must match from the beginning of the string. When <b>$</b> is the last character of the regexp, it means the regexp must match to the end of the string. The regexp becomes <b>^[0-9]{1,2}$</b>. Note that assertions, e.g. <b>^</b> and <b>$</b>, do not match characters but locations in the string. <p>If you have seen regexps described elsewhere, they may have looked different from the ones shown here. This is because some sets of characters and some quantifiers are so common that they have been given special symbols to represent them. <b>[0-9]</b> can be replaced with the symbol <b>\d</b>. The quantifier to match exactly one occurrence, <b>{1,1}</b>, can be replaced with the expression itself, i.e. <b>x{1,1}</b> is the same as <b>x</b>. So our 0 to 99 matcher could be written as <b>^\d{1,2}$</b>. It can also be written <b>^\d\d{0,1}$</b>, i.e. From the start of the string, match a digit, followed immediately by 0 or 1 digits. In practice, it would be written as <b>^\d\d?$</b>. The <b>?</b> is shorthand for the quantifier <b>{0,1}</b>, i.e. 0 or 1 occurrences. <b>?</b> makes an expression optional. The regexp <b>^\d\d?$</b> means From the beginning of the string, match one digit, followed immediately by 0 or 1 more digit, followed immediately by end of string. <p>To write a regexp that matches one of the words 'mail' or 'letter' or 'correspondence' but does not match words that contain these words, e.g., 'email', 'mailman', 'mailer', and 'letterbox', start with a regexp that matches 'mail'. Expressed fully, the regexp is <b>m{1,1}a{1,1}i{1,1}l{1,1}</b>, but because a character expression is automatically quantified by <b>{1,1}</b>, we can simplify the regexp to <b>mail</b>, i.e., an 'm' followed by an 'a' followed by an 'i' followed by an 'l'. Now we can use the vertical bar <b>|</b>, which means <b>or</b>, to include the other two words, so our regexp for matching any of the three words becomes <b>mail|letter|correspondence</b>. Match 'mail' <b>or</b> 'letter' <b>or</b> 'correspondence'. While this regexp will match one of the three words we want to match, it will also match words we don't want to match, e.g., 'email'. To prevent the regexp from matching unwanted words, we must tell it to begin and end the match at word boundaries. First we enclose our regexp in parentheses, <b>(mail|letter|correspondence)</b>. Parentheses group expressions together, and they identify a part of the regexp that we wish to capture. Enclosing the expression in parentheses allows us to use it as a component in more complex regexps. It also allows us to examine which of the three words was actually matched. To force the match to begin and end on word boundaries, we enclose the regexp in <b>\b</b>word boundary assertions: <b>\b(mail|letter|correspondence)\b</b>. Now the regexp means: Match a word boundary, followed by the regexp in parentheses, followed by a word boundary. The <b>\b</b> assertion matches a position in the regexp, not a character. A word boundary is any non-word character, e.g., a space, newline, or the beginning or ending of a string. <p>If we want to replace ampersand characters with the HTML entity <b>&amp;</b>, the regexp to match is simply <b>&</b>. But this regexp will also match ampersands that have already been converted to HTML entities. We want to replace only ampersands that are not already followed by <b>amp;</b>. For this, we need the negative lookahead assertion, <b>(?!</b>__<b>)</b>. The regexp can then be written as <b>&(?!amp;)</b>, i.e. Match an ampersand that is<b>not</b>followed by<b>amp;</b>. <p>If we want to count all the occurrences of 'Eric' and 'Eirik' in a string, two valid solutions are <b>\b(Eric|Eirik)\b</b> and <b>\bEi?ri[ck]\b</b>. The word boundary assertion '\b' is required to avoid matching words that contain either name, e.g. 'Ericsson'. Note that the second regexp matches more spellings than we want: 'Eric', 'Erik', 'Eiric' and 'Eirik'. <p>Some of the examples discussed above are implemented in the code examples section.<a name="characters-and-abbreviations-for-sets-of-characters"><a name="characters-and-abbreviations-for-sets-of-characters"><h2>Characters and Abbreviations for Sets of Characters</h2> <table align="center" border="0" cellpadding="2" cellspacing="1"><thead><tr class="qt-style" valign="top"><th><center> Element</center></th><th><center> Meaning</center></th></tr></thead><tr valign="top" class="even"><td> <b>c</b></td><td> A character represents itself unless it has a special regexp meaning. e.g. <b>c</b> matches the character c.</td></tr><tr valign="top" class="odd"><td> <b>\c</b></td><td> A character that follows a backslash matches the character itself, except as specified below. e.g., To match a literal caret at the beginning of a string, write <b>\^</b>.</td></tr><tr valign="top" class="even"><td> <b>\a</b></td><td> Matches the ASCII bell (BEL, 0x07).</td></tr><tr valign="top" class="odd"><td> <b>\f</b></td><td> Matches the ASCII form feed (FF, 0x0C).</td></tr><tr valign="top" class="even"><td> <b>\n</b></td><td> Matches the ASCII line feed (LF, 0x0A, Unix newline).</td></tr><tr valign="top" class="odd"><td> <b>\r</b></td><td> Matches the ASCII carriage return (CR, 0x0D).</td></tr><tr valign="top" class="even"><td> <b>\t</b></td><td> Matches the ASCII horizontal tab (HT, 0x09).</td></tr><tr valign="top" class="odd"><td> <b>\v</b></td><td> Matches the ASCII vertical tab (VT, 0x0B).</td></tr><tr valign="top" class="even"><td> <b>\xhhhh</b></td><td> Matches the Unicode character corresponding to the hexadecimal number hhhh (between 0x0000 and 0xFFFF).</td></tr><tr valign="top" class="odd"><td> <b>\0ooo</b> (i.e., \zero ooo)</td><td> matches the ASCII/Latin1 character for the octal number ooo (between 0 and 0377).</td></tr><tr valign="top" class="even"><td> <b>. (dot)</b></td><td> Matches any character (including newline).</td></tr><tr valign="top" class="odd"><td> <b>\d</b></td><td> Matches a digit (QChar::isDigit()).</td></tr><tr valign="top" class="even"><td> <b>\D</b></td><td> Matches a non-digit.</td></tr><tr valign="top" class="odd"><td> <b>\s</b></td><td> Matches a whitespace character (QChar::isSpace()).</td></tr><tr valign="top" class="even"><td> <b>\S</b></td><td> Matches a non-whitespace character.</td></tr><tr valign="top" class="odd"><td> <b>\w</b></td><td> Matches a word character (QChar::isLetterOrNumber(), QChar::isMark(), or '_').</td></tr><tr valign="top" class="even"><td> <b>\W</b></td><td> Matches a non-word character.</td></tr><tr valign="top" class="odd"><td> <b>\n</b></td><td> The n-th backreference, e.g. \1, \2, etc.</td></tr></table> <b>Note:</b> The C++ compiler transforms backslashes in strings. To include a <b>\</b> in a regexp, enter it twice, i.e. <tt>\\</tt>. To match the backslash character itself, enter it four times, i.e. <tt>\\\\</tt>.<a name="sets-of-characters"><a name="sets-of-characters"><h2>Sets of Characters</h2> Square brackets mean match any character contained in the square brackets. The character set abbreviations described above can appear in a character set in square brackets. Except for the character set abbreviations and the following two exceptions, characters do not have special meanings in square brackets. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <b>^</b></td><td> The caret negates the character set if it occurs as the first character (i.e. immediately after the opening square bracket). <b>[abc]</b> matches 'a' or 'b' or 'c', but <b>[^abc]</b> matches anything but 'a' or 'b' or 'c'.</td></tr><tr valign="top" class="odd"><td> <b>-</b></td><td> The dash indicates a range of characters. <b>[W-Z]</b> matches 'W' or 'X' or 'Y' or 'Z'.</td></tr></table> Using the predefined character set abbreviations is more portable than using character ranges across platforms and languages. For example, <b>[0-9]</b> matches a digit in Western alphabets but <b>\d</b> matches a digit in any alphabet. <p>Note: In other regexp documentation, sets of characters are often called "character classes".<a name="quantifiers"><a name="quantifiers"><h2>Quantifiers</h2> By default, an expression is automatically quantified by <b>{1,1}</b>, i.e. it should occur exactly once. In the following list, <b>E</b> stands for expression. An expression is a character, or an abbreviation for a set of characters, or a set of characters in square brackets, or an expression in parentheses. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <b>E?</b></td><td> Matches zero or one occurrences of E. This quantifier means The previous expression is optional, because it will match whether or not the expression is found. <b>E?</b> is the same as <b>E{0,1}</b>. e.g., <b>dents?</b> matches 'dent' or 'dents'.</td></tr><tr valign="top" class="odd"><td> <b>E+</b></td><td> Matches one or more occurrences of E. <b>E+</b> is the same as <b>E{1,}</b>. e.g., <b>0+</b> matches '0', '00', '000', etc.</td></tr><tr valign="top" class="even"><td> <b>E*</b></td><td> Matches zero or more occurrences of E. It is the same as <b>E{0,}</b>. The <b>*</b> quantifier is often used in error where <b>+</b> should be used. For example, if <b>\s*$</b> is used in an expression to match strings that end in whitespace, it will match every string because <b>\s*$</b> means Match zero or more whitespaces followed by end of string. The correct regexp to match strings that have at least one trailing whitespace character is <b>\s+$</b>.</td></tr><tr valign="top" class="odd"><td> <b>E{n}</b></td><td> Matches exactly n occurrences of E. <b>E{n}</b> is the same as repeating En times. For example, <b>x{5}</b> is the same as <b>xxxxx</b>. It is also the same as <b>E{n,n}</b>, e.g. <b>x{5,5}</b>.</td></tr><tr valign="top" class="even"><td> <b>E{n,}</b></td><td> Matches at least n occurrences of E.</td></tr><tr valign="top" class="odd"><td> <b>E{,m}</b></td><td> Matches at most m occurrences of E. <b>E{,m}</b> is the same as <b>E{0,m}</b>.</td></tr><tr valign="top" class="even"><td> <b>E{n,m}</b></td><td> Matches at least n and at most m occurrences of E.</td></tr></table> To apply a quantifier to more than just the preceding character, use parentheses to group characters together in an expression. For example, <b>tag+</b> matches a 't' followed by an 'a' followed by at least one 'g', whereas <b>(tag)+</b> matches at least one occurrence of 'tag'. <p>Note: Quantifiers are normally "greedy". They always match as much text as they can. For example, <b>0+</b> matches the first zero it finds and all the consecutive zeros after the first zero. Applied to '20005', it matches'20005'. Quantifiers can be made non-greedy, see {@link com.trolltech.qt.core.QRegExp#setMinimal(boolean) setMinimal()}.<a name="capturing-parentheses"><a name="backreferences"><a name="capturing-text"><h2>Capturing Text</h2> Parentheses allow us to group elements together so that we can quantify and capture them. For example if we have the expression <b>mail|letter|correspondence</b> that matches a string we know that one of the words matched but not which one. Using parentheses allows us to "capture" whatever is matched within their bounds, so if we used <b>(mail|letter|correspondence)</b> and matched this regexp against the string "I sent you some email" we can use the {@link com.trolltech.qt.core.QRegExp#cap() cap()} or {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} functions to extract the matched characters, in this case 'mail'. <p>We can use captured text within the regexp itself. To refer to the captured text we use backreferences which are indexed from 1, the same as for {@link com.trolltech.qt.core.QRegExp#cap() cap()}. For example we could search for duplicate words in a string using <b>\b(\w+)\W+\1\b</b> which means match a word boundary followed by one or more word characters followed by one or more non-word characters followed by the same text as the first parenthesized expression followed by a word boundary. <p>If we want to use parentheses purely for grouping and not for capturing we can use the non-capturing syntax, e.g. <b>(?:green|blue)</b>. Non-capturing parentheses begin '(?:' and end ')'. In this example we match either 'green' or 'blue' but we do not capture the match so we only know whether or not we matched but not which color we actually found. Using non-capturing parentheses is more efficient than using capturing parentheses since the regexp engine has to do less book-keeping. <p>Both capturing and non-capturing parentheses may be nested.<a name="greedy-quantifiers"> For historical reasons, quantifiers (e.g. <b>*</b>) that apply to capturing parentheses are more "greedy" than other quantifiers. For example, <b>a*(a)*</b> will match "aaa" with cap(1) == "aaa". This behavior is different from what other regexp engines do (notably, Perl). To obtain a more intuitive capturing behavior, specify {@link com.trolltech.qt.core.QRegExp.PatternSyntax QRegExp::RegExp2 } to the QRegExp constructor or call setPatternSyntax({@link com.trolltech.qt.core.QRegExp.PatternSyntax QRegExp::RegExp2 }).<a name="cap-in-a-loop"> When the number of matches cannot be determined in advance, a common idiom is to use {@link com.trolltech.qt.core.QRegExp#cap() cap()} in a loop. For example: <pre class="snippet">
        QRegExp rx = new QRegExp("(\\d+)");
        String str = "Offsets: 12 14 99 231 7";
        LinkedList&lt;String&gt; list = new LinkedList&lt;String&gt;();
        int pos = 0;

        while ((pos = rx.indexIn(str, pos)) != -1) {
            list.add(rx.cap(1));
            pos += rx.matchedLength();
        }
        // list: ["12", "14", "99", "231", "7"]
</pre><a name="assertions"><a name="assertions"><h2>Assertions</h2> Assertions make some statement about the text at the point where they occur in the regexp but they do not match any characters. In the following list <b>E</b> stands for any expression. <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <b>^</b></td><td> The caret signifies the beginning of the string. If you wish to match a literal <tt>^</tt> you must escape it by writing <tt>\\^</tt>. For example, <b>^#include</b> will only match strings which begin with the characters '#include'. (When the caret is the first character of a character set it has a special meaning, see Sets of Characters.)</td></tr><tr valign="top" class="odd"><td> <b>$</b></td><td> The dollar signifies the end of the string. For example <b>\d\s*$</b> will match strings which end with a digit optionally followed by whitespace. If you wish to match a literal <tt>$</tt> you must escape it by writing <tt>\\$</tt>.</td></tr><tr valign="top" class="even"><td> <b>\b</b></td><td> A word boundary. For example the regexp <b>\bOK\b</b> means match immediately after a word boundary (e.g. start of string or whitespace) the letter 'O' then the letter 'K' immediately before another word boundary (e.g. end of string or whitespace). But note that the assertion does not actually match any whitespace so if we write <b>(\bOK\b)</b> and we have a match it will only contain 'OK' even if the string is "It's OK now".</td></tr><tr valign="top" class="odd"><td> <b>\B</b></td><td> A non-word boundary. This assertion is true wherever <b>\b</b> is false. For example if we searched for <b>\Bon\B</b> in "Left on" the match would fail (space and end of string aren't non-word boundaries), but it would match in "tonne".</td></tr><tr valign="top" class="even"><td> <b>(?=E)</b></td><td> Positive lookahead. This assertion is true if the expression matches at this point in the regexp. For example, <b>const(?=\s+char)</b> matches 'const' whenever it is followed by 'char', as in 'static const char *'. (Compare with <b>const\s+char</b>, which matches 'static const char *'.)</td></tr><tr valign="top" class="odd"><td> <b>(?!E)</b></td><td> Negative lookahead. This assertion is true if the expression does not match at this point in the regexp. For example, <b>const(?!\s+char)</b> matches 'const' except when it is followed by 'char'.</td></tr></table><a name="qregexp-wildcard-matching"><a name="wildcard-matching"><h2>Wildcard Matching</h2> Most command shells such as bash or cmd.exe support "file globbing", the ability to identify a group of files by using wildcards. The {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()} function is used to switch between regexp and wildcard mode. Wildcard matching is much simpler than full regexps and has only four features: <table align="center" border="0" cellpadding="2" cellspacing="1"><tr valign="top" class="even"><td> <b>c</b></td><td> Any character represents itself apart from those mentioned below. Thus <b>c</b> matches the character c.</td></tr><tr valign="top" class="odd"><td> <b>?</b></td><td> Matches any single character. It is the same as <b>.</b> in full regexps.</td></tr><tr valign="top" class="even"><td> <b>*</b></td><td> Matches zero or more of any characters. It is the same as <b>.*</b> in full regexps.</td></tr><tr valign="top" class="odd"><td> <b>[...]</b></td><td> Sets of characters can be represented in square brackets, similar to full regexps. Within the character class, like outside, backslash has no special meaning.</td></tr></table> For example if we are in wildcard mode and have strings which contain filenames we could identify HTML files with <b>*.html</b>. This will match zero or more characters followed by a dot followed by 'h', 't', 'm' and 'l'. <p>To test a string against a wildcard expression, use {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()}. For example: <pre class="snippet">
        QRegExp rx = new QRegExp("*.txt");
        rx.setPatternSyntax(QRegExp.PatternSyntax.Wildcard);
        rx.exactMatch("README.txt");        // returns true
        rx.exactMatch("welcome.txt.bak");   // returns false
</pre><a name="perl-users"><a name="notes-for-perl-users"><h2>Notes for Perl Users</h2> Most of the character class abbreviations supported by Perl are supported by QRegExp, see characters and abbreviations for sets of characters. <p>In QRegExp, apart from within character classes, <tt>^</tt> always signifies the start of the string, so carets must always be escaped unless used for that purpose. In Perl the meaning of caret varies automagically depending on where it occurs so escaping it is rarely necessary. The same applies to <tt>$</tt> which in QRegExp always signifies the end of the string. <p>QRegExp's quantifiers are the same as Perl's greedy quantifiers (but see the note above). Non-greedy matching cannot be applied to individual quantifiers, but can be applied to all the quantifiers in the pattern. For example, to match the Perl regexp <b>ro+?m</b> requires: <pre class="snippet">
// QRegExp
</pre> The equivalent of Perl's <tt>/i</tt> option is setCaseSensitivity({@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseInsensitive }). <p>Perl's <tt>/g</tt> option can be emulated using a loop. <p>In QRegExp<b>.</b> matches any character, therefore all QRegExp regexps have the equivalent of Perl's <tt>/s</tt> option. QRegExp does not have an equivalent to Perl's <tt>/m</tt> option, but this can be emulated in various ways for example by splitting the input into lines or by looping with a regexp that searches for newlines. <p>Because QRegExp is string oriented, there are no \A, \Z, or \z assertions. The \G assertion is not supported but can be emulated in a loop. <p>Perl's $& is cap(0) or {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}[0]. There are no QRegExp equivalents for $`, $' or $+. Perl's capturing variables, $1, $2, ... correspond to cap(1) or {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}[1], cap(2) or {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}[2], etc. <p>To substitute a pattern use QString::replace(). <p>Perl's extended <tt>/x</tt> syntax is not supported, nor are directives, e.g. (?i), or regexp comments, e.g. (?#comment). On the other hand, C++'s rules for literal strings can be used to achieve the same: <pre class="snippet">
        QRegExp mark = new QRegExp("\\b"      // word boundary
                 + "[Mm]ark"  // the word we want to match
                   );
</pre> Both zero-width positive and zero-width negative lookahead assertions (?=pattern) and (?!pattern) are supported with the same syntax as Perl. Perl's lookbehind assertions, "independent" subexpressions and conditional expressions are not supported. <p>Non-capturing parentheses are also supported, with the same (?:pattern) syntax. <p>See QString::split() and QStringList::join() for equivalents to Perl's split and join functions. <p>Note: because C++ transforms \'s they must be written twice in code, e.g. <b>\b</b> must be written <b>\\b</b>.<a name="code-examples"><a name="code-examples"><h2>Code Examples</h2> <pre class="snippet">
        QRegExp rx = new QRegExp("^\\d\\d?$");  // match integers 0 to 99
        rx.indexIn("123");                      // returns -1 (no match)
        rx.indexIn("-6");                       // returns -1 (no match)
        rx.indexIn("6");                        // returns 0 (matched as position 0)
</pre> The third string matches '6'. This is a simple validation regexp for integers in the range 0 to 99. <pre class="snippet">
        QRegExp rx = new QRegExp("^\\S+$"); // match strings without whitespace
        rx.indexIn("Hello world");          // returns -1 (no match)
        rx.indexIn("This_is-OK");           // returns 0 (matched at position 0)
</pre> The second string matches 'This_is-OK'. We've used the character set abbreviation '\S' (non-whitespace) and the anchors to match strings which contain no whitespace. <p>In the following example we match strings containing 'mail' or 'letter' or 'correspondence' but only match whole words i.e. not 'email' <pre class="snippet">
        QRegExp rx = new QRegExp("\\b(mail|letter|correspondence)\\b");
        rx.indexIn("I sent you an email");     // returns -1 (no match)
        rx.indexIn("Please write the letter"); // returns 17
</pre> The second string matches "Please write the letter". The word 'letter' is also captured (because of the parentheses). We can see what text we've captured like this: <pre class="snippet">
        String captured = rx.cap(1); // captured == "letter"
</pre> This will capture the text from the first set of capturing parentheses (counting capturing left parentheses from left to right). The parentheses are counted from 1 since cap(0) is the whole matched regexp (equivalent to '&' in most regexp engines). <pre class="snippet">
        QRegExp rx = new QRegExp("&(?!amp;)"); // match ampersands but not mp;
        String line1 = "This & that";
        line1.replace(rx, "mp;");
        // line1 == "This mp; that"
        String line2 = "His mp; hers & theirs";
        line2.replace(rx, "mp;");
        // line2 == "His mp; hers mp; theirs"
</pre> Here we've passed the QRegExp to QString's replace() function to replace the matched text with new text. <pre class="snippet">
        String str = "One Eric another Eirik, and an Ericsson. "
               + "How many Eiriks, Eric?";
        QRegExp rx = new QRegExp("\\b(Eric|Eirik)\\b"); // match Eric or Eirik
        int pos = 0;    // where we are in the string
        int count = 0;  // how many Eric and Eirik's we've counted
        while (pos &gt;= 0) {
            pos = rx.indexIn(str, pos);
            if (pos &gt;= 0) {
                ++pos;      // move along in str
                ++count;    // count our Eric or Eirik
            }
        }
</pre> We've used the {@link com.trolltech.qt.core.QRegExp#indexIn(java.lang.String, int) indexIn()} function to repeatedly match the regexp in the string. Note that instead of moving forward by one character at a time <tt>pos++</tt> we could have written <tt>pos += rx.matchedLength()</tt> to skip over the already matched string. The count will equal 3, matching 'One Eric another Eirik, and an Ericsson. How many Eiriks, Eric?'; it doesn't match 'Ericsson' or 'Eiriks' because they are not bounded by non-word boundaries. <p>One common use of regexps is to split lines of delimited data into their component fields. <pre class="snippet">
        str = "Nokia\twww.trolltech.com\tNorway";
        String company, web, country;
        rx.setPattern("^([^\t]+)\t([^\t]+)\t([^\t]+)$");
        if (rx.indexIn(str) != -1) {
            company = rx.cap(1);
            web = rx.cap(2);
            country = rx.cap(3);
        }
</pre> In this example our input lines have the format company name, web address and country. Unfortunately the regexp is rather long and not very versatile -- the code will break if we add any more fields. A simpler and better solution is to look for the separator, '\t' in this case, and take the surrounding text. The QString::split() function can take a separator string or regexp as an argument and split a string accordingly. <pre class="snippet">
        String[] field = str.split("\t");
</pre> Here field[0] is the company, field[1] the web address and so on. <p>To imitate the matching of a shell we can use wildcard mode. <pre class="snippet">
        QRegExp rx = new QRegExp("*.html");
        rx.setPatternSyntax(QRegExp.PatternSyntax.Wildcard);
        rx.exactMatch("index.html");                // returns true
        rx.exactMatch("default.htm");               // returns false
        rx.exactMatch("readme.txt");                // returns false
</pre> Wildcard matching can be convenient because of its simplicity, but any wildcard regexp can be defined using full regexps, e.g. <b>.*.html$</b>. Notice that we can't match both <tt>.html</tt> and <tt>.htm</tt> files with a wildcard unless we use <b>*.htm*</b> which will also match 'test.html.bak'. A full regexp gives us the precision we need, <b>.*\.html?$</b>. <p>QRegExp can match case insensitively using {@link com.trolltech.qt.core.QRegExp#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, and can use non-greedy matching, see {@link com.trolltech.qt.core.QRegExp#setMinimal(boolean) setMinimal()}. By default QRegExp uses full regexps but this can be changed with setWildcard(). Searching can be forward with {@link com.trolltech.qt.core.QRegExp#indexIn(java.lang.String, int) indexIn()} or backward with {@link com.trolltech.qt.core.QRegExp#lastIndexIn(java.lang.String, int) lastIndexIn()}. Captured text can be accessed using {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} which returns a string list of all captured strings, or using {@link com.trolltech.qt.core.QRegExp#cap() cap()} which returns the captured string for the given index. The {@link com.trolltech.qt.core.QRegExp#pos() pos()} function takes a match index and returns the position in the string where the match was made (or -1 if there was no match). <p><DT><b>See also:</b><br><DD>QString, QStringList, {@link com.trolltech.qt.gui.QRegExpValidator QRegExpValidator}, {@link com.trolltech.qt.gui.QSortFilterProxyModel QSortFilterProxyModel}, and {@link <a href="../tools-regexp.html">Regular Expression Example</a>}. <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QRegExp extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
The syntax used to interpret the meaning of the pattern. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}. <br></DD></DT>
*/

    public enum PatternSyntax implements com.trolltech.qt.QtEnumerator {
/**
 A rich Perl-like pattern matching syntax. This is the default.
*/

        RegExp(0),
/**
 This provides a simple pattern matching syntax similar to that used by shells (command interpreters) for "file globbing". See {@link com.trolltech.qt.core.QRegExp Wildcard Matching}.
*/

        Wildcard(1),
/**
 The pattern is a fixed string. This is equivalent to using the {@link com.trolltech.qt.core.QRegExp.PatternSyntax RegExp } pattern on a string in which all metacharacters are escaped using {@link com.trolltech.qt.core.QRegExp#escape(java.lang.String) escape()}.
*/

        FixedString(2),
/**
 Like {@link com.trolltech.qt.core.QRegExp.PatternSyntax RegExp }, but with {@link com.trolltech.qt.core.QRegExp greedy quantifiers}. This will be the default in Qt 5. (Introduced in Qt 4.2.)
*/

        RegExp2(3);

        PatternSyntax(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QRegExp$PatternSyntax constant with the specified <tt>int</tt>.</brief>
*/

        public static PatternSyntax resolve(int value) {
            return (PatternSyntax) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return RegExp;
            case 1: return Wildcard;
            case 2: return FixedString;
            case 3: return RegExp2;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
The {@link com.trolltech.qt.core.QRegExp.CaretMode CaretMode } enum defines the different meanings of the caret (<b>^</b>) in a regular expression. The possible values are:
*/

    public enum CaretMode implements com.trolltech.qt.QtEnumerator {
/**
 The caret corresponds to index 0 in the searched string.
*/

        CaretAtZero(0),
/**
 The caret corresponds to the start offset of the search.
*/

        CaretAtOffset(1),
/**
 The caret never matches.
*/

        CaretWontMatch(2);

        CaretMode(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QRegExp$CaretMode constant with the specified <tt>int</tt>.</brief>
*/

        public static CaretMode resolve(int value) {
            return (CaretMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return CaretAtZero;
            case 1: return CaretAtOffset;
            case 2: return CaretWontMatch;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs an empty regexp. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#isValid() isValid()}, and {@link com.trolltech.qt.core.QRegExp#errorString() errorString()}. <br></DD></DT>
*/

    public QRegExp(){
        super((QPrivateConstructor)null);
        __qt_QRegExp();
    }

    native void __qt_QRegExp();

/**
Constructs a regular expression as a copy of <tt>rx</tt>. <p><DT><b>See also:</b><br><DD>operator=(). <br></DD></DT>
*/

    public QRegExp(com.trolltech.qt.core.QRegExp rx){
        super((QPrivateConstructor)null);
        __qt_QRegExp_QRegExp(rx == null ? 0 : rx.nativeId());
    }

    native void __qt_QRegExp_QRegExp(long rx);


/**
Constructs a regular expression object for the given <tt>pattern</tt> string. The pattern must be given using wildcard notation if <tt>syntax</tt> is {@link com.trolltech.qt.core.QRegExp.PatternSyntax Wildcard }; the default is {@link com.trolltech.qt.core.QRegExp.PatternSyntax RegExp }. The pattern is case sensitive, unless <tt>cs</tt> is {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseInsensitive }. Matching is greedy (maximal), but can be changed by calling {@link com.trolltech.qt.core.QRegExp#setMinimal(boolean) setMinimal()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#setPattern(java.lang.String) setPattern()}, {@link com.trolltech.qt.core.QRegExp#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, and {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}. <br></DD></DT>
*/

    public QRegExp(java.lang.String pattern, com.trolltech.qt.core.Qt.CaseSensitivity cs) {
        this(pattern, cs, com.trolltech.qt.core.QRegExp.PatternSyntax.RegExp);
    }

/**
Constructs a regular expression object for the given <tt>pattern</tt> string. The pattern must be given using wildcard notation if <tt>syntax</tt> is {@link com.trolltech.qt.core.QRegExp.PatternSyntax Wildcard }; the default is {@link com.trolltech.qt.core.QRegExp.PatternSyntax RegExp }. The pattern is case sensitive, unless <tt>cs</tt> is {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseInsensitive }. Matching is greedy (maximal), but can be changed by calling {@link com.trolltech.qt.core.QRegExp#setMinimal(boolean) setMinimal()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#setPattern(java.lang.String) setPattern()}, {@link com.trolltech.qt.core.QRegExp#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, and {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}. <br></DD></DT>
*/

    public QRegExp(java.lang.String pattern) {
        this(pattern, com.trolltech.qt.core.Qt.CaseSensitivity.CaseSensitive, com.trolltech.qt.core.QRegExp.PatternSyntax.RegExp);
    }
/**
Constructs a regular expression object for the given <tt>pattern</tt> string. The pattern must be given using wildcard notation if <tt>syntax</tt> is {@link com.trolltech.qt.core.QRegExp.PatternSyntax Wildcard }; the default is {@link com.trolltech.qt.core.QRegExp.PatternSyntax RegExp }. The pattern is case sensitive, unless <tt>cs</tt> is {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseInsensitive }. Matching is greedy (maximal), but can be changed by calling {@link com.trolltech.qt.core.QRegExp#setMinimal(boolean) setMinimal()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#setPattern(java.lang.String) setPattern()}, {@link com.trolltech.qt.core.QRegExp#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, and {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}. <br></DD></DT>
*/

    public QRegExp(java.lang.String pattern, com.trolltech.qt.core.Qt.CaseSensitivity cs, com.trolltech.qt.core.QRegExp.PatternSyntax syntax){
        super((QPrivateConstructor)null);
        __qt_QRegExp_String_CaseSensitivity_PatternSyntax(pattern, cs.value(), syntax.value());
    }

    native void __qt_QRegExp_String_CaseSensitivity_PatternSyntax(java.lang.String pattern, int cs, int syntax);


/**
Returns the text captured by the <tt>nth</tt> subexpression. The entire match has index 0 and the parenthesized subexpressions have indexes starting from 1 (excluding non-capturing parentheses). <pre class="snippet">
        QRegExp rxlen = new QRegExp("(\\d+)(?:\\s*)(cm|inch)");
        int pos = rxlen.indexIn("Length: 189cm");
        if (pos &gt; -1) {
            String value = rxlen.cap(1); // "189"
            String unit = rxlen.cap(2);  // "cm"
            // ...
        }
</pre> The order of elements matched by {@link com.trolltech.qt.core.QRegExp#cap() cap()} is as follows. The first element, cap(0), is the entire matching string. Each subsequent element corresponds to the next capturing open left parentheses. Thus cap(1) is the text of the first capturing parentheses, cap(2) is the text of the second, and so on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}, and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String cap() {
        return cap((int)0);
    }
/**
Returns the text captured by the <tt>nth</tt> subexpression. The entire match has index 0 and the parenthesized subexpressions have indexes starting from 1 (excluding non-capturing parentheses). <pre class="snippet">
        QRegExp rxlen = new QRegExp("(\\d+)(?:\\s*)(cm|inch)");
        int pos = rxlen.indexIn("Length: 189cm");
        if (pos &gt; -1) {
            String value = rxlen.cap(1); // "189"
            String unit = rxlen.cap(2);  // "cm"
            // ...
        }
</pre> The order of elements matched by {@link com.trolltech.qt.core.QRegExp#cap() cap()} is as follows. The first element, cap(0), is the entire matching string. Each subsequent element corresponds to the next capturing open left parentheses. Thus cap(1) is the text of the first capturing parentheses, cap(2) is the text of the second, and so on. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}, and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String cap(int nth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_cap_int(nativeId(), nth);
    }
    @QtBlockedSlot
    native java.lang.String __qt_cap_int(long __this__nativeId, int nth);

/**
Returns a list of the captured text strings. <p>The first string in the list is the entire matched string. Each subsequent list element contains a string that matched a (capturing) subexpression of the regexp. <p>For example: <pre class="snippet">
        QRegExp rx = new QRegExp("(\\d+)(\\s*)(cm|inch(es)?)");
        int pos = rx.indexIn("Length: 36 inches");
        List&lt;String&gt; list = rx.capturedTexts();
        // list is now ("36 inches", "36", " ", "inches", "es")
</pre> The above example also captures elements that may be present but which we have no interest in. This problem can be solved by using non-capturing parentheses: <pre class="snippet">
        QRegExp rx = new QRegExp("(\\d+)(?:\\s*)(cm|inch(?:es)?)");
        int pos = rx.indexIn("Length: 36 inches");
        List&lt;String&gt; list = rx.capturedTexts();
        // list is now ("36 inches", "36", "inches")
</pre> Note that if you want to iterate over the list, you should iterate over a copy, e.g. <pre class="snippet">
        List&lt;String&gt; list = rx.capturedTexts();
        ListIterator&lt;String&gt; it = list.listIterator();
        while (it.hasNext()) {
        String t = it.next();
            //myProcessing();
        }
</pre> Some regexps can match an indeterminate number of times. For example if the input string is "Offsets: 12 14 99 231 7" and the regexp, <tt>rx</tt>, is <b>(\d+)+</b>, we would hope to get a list of all the numbers matched. However, after calling <tt>rx.indexIn(str)</tt>, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} will return the list ("12", "12"), i.e. the entire match was "12" and the first subexpression matched was "12". The correct approach is to use {@link com.trolltech.qt.core.QRegExp#cap() cap()} in a loop. <p>The order of elements in the string list is as follows. The first element is the entire matching string. Each subsequent element corresponds to the next capturing open left parentheses. Thus {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}[1] is the text of the first capturing parentheses, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}[2] is the text of the second and so on (corresponding to $1, $2, etc., in some other regexp languages). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#cap() cap()}, and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.util.List<java.lang.String> capturedTexts()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_capturedTexts(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_capturedTexts(long __this__nativeId);

/**
Returns {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseSensitive } if the regexp is matched case sensitively; otherwise returns {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseInsensitive }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, {@link com.trolltech.qt.core.QRegExp#patternSyntax() patternSyntax()}, {@link com.trolltech.qt.core.QRegExp#pattern() pattern()}, and {@link com.trolltech.qt.core.QRegExp#isMinimal() isMinimal()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.Qt.CaseSensitivity caseSensitivity()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.Qt.CaseSensitivity.resolve(__qt_caseSensitivity(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_caseSensitivity(long __this__nativeId);

/**
Returns a text string that explains why a regexp pattern is invalid the case being; otherwise returns "no error occurred". <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#isValid() isValid()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String errorString()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_errorString(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_errorString(long __this__nativeId);

/**
Returns true if <tt>str</tt> is matched exactly by this regular expression; otherwise returns false. You can determine how much of the string was matched by calling {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()}. <p>For a given regexp string R, exactMatch("R") is the equivalent of indexIn("^R$") since {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()} effectively encloses the regexp in the start of string and end of string anchors, except that it sets {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()} differently. <p>For example, if the regular expression is <b>blue</b>, then {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()} returns true only for input <tt>blue</tt>. For inputs <tt>bluebell</tt>, <tt>blutak</tt> and <tt>lightblue</tt>, {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()} returns false and {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()} will return 4, 3 and 0 respectively. <p>Although const, this function sets {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()}, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}, and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#indexIn(java.lang.String, int) indexIn()}, and {@link com.trolltech.qt.core.QRegExp#lastIndexIn(java.lang.String, int) lastIndexIn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean exactMatch(java.lang.String str)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exactMatch_String(nativeId(), str);
    }
    @QtBlockedSlot
    native boolean __qt_exactMatch_String(long __this__nativeId, java.lang.String str);


/**
Attempts to find a match in <tt>str</tt> from position <tt>offset</tt> (0 by default). If <tt>offset</tt> is -1, the search starts at the last character; if -2, at the next to last character; etc. <p>Returns the position of the first match, or -1 if there was no match. <p>The <tt>caretMode</tt> parameter can be used to instruct whether <b>^</b> should match at index 0 or at <tt>offset</tt>. <p>You might prefer to use QString::indexOf(), QString::contains(), or even QStringList::filter(). To replace matches use QString::replace(). <p>Example: <pre class="snippet">
        String str = "offsets: 1.23 .50 71.00 6.00";
        QRegExp rx = new QRegExp("\\d*\\.\\d+"); // primitive floating point matching
        int count = 0;
        int pos = 0;
        while ((pos = rx.indexIn(str, pos)) != -1) {
            ++count;
            pos += rx.matchedLength();
        }
        // pos will be 9, 14, 18 and finally 24; count will end up as 4
</pre> Although const, this function sets {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()}, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <p>If the QRegExp is a wildcard expression (see {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}) and want to test a string against the whole wildcard expression, use {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()} instead of this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#lastIndexIn(java.lang.String, int) lastIndexIn()}, and {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexIn(java.lang.String str, int offset) {
        return indexIn(str, offset, com.trolltech.qt.core.QRegExp.CaretMode.CaretAtZero);
    }

/**
Attempts to find a match in <tt>str</tt> from position <tt>offset</tt> (0 by default). If <tt>offset</tt> is -1, the search starts at the last character; if -2, at the next to last character; etc. <p>Returns the position of the first match, or -1 if there was no match. <p>The <tt>caretMode</tt> parameter can be used to instruct whether <b>^</b> should match at index 0 or at <tt>offset</tt>. <p>You might prefer to use QString::indexOf(), QString::contains(), or even QStringList::filter(). To replace matches use QString::replace(). <p>Example: <pre class="snippet">
        String str = "offsets: 1.23 .50 71.00 6.00";
        QRegExp rx = new QRegExp("\\d*\\.\\d+"); // primitive floating point matching
        int count = 0;
        int pos = 0;
        while ((pos = rx.indexIn(str, pos)) != -1) {
            ++count;
            pos += rx.matchedLength();
        }
        // pos will be 9, 14, 18 and finally 24; count will end up as 4
</pre> Although const, this function sets {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()}, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <p>If the QRegExp is a wildcard expression (see {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}) and want to test a string against the whole wildcard expression, use {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()} instead of this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#lastIndexIn(java.lang.String, int) lastIndexIn()}, and {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexIn(java.lang.String str) {
        return indexIn(str, (int)0, com.trolltech.qt.core.QRegExp.CaretMode.CaretAtZero);
    }
/**
Attempts to find a match in <tt>str</tt> from position <tt>offset</tt> (0 by default). If <tt>offset</tt> is -1, the search starts at the last character; if -2, at the next to last character; etc. <p>Returns the position of the first match, or -1 if there was no match. <p>The <tt>caretMode</tt> parameter can be used to instruct whether <b>^</b> should match at index 0 or at <tt>offset</tt>. <p>You might prefer to use QString::indexOf(), QString::contains(), or even QStringList::filter(). To replace matches use QString::replace(). <p>Example: <pre class="snippet">
        String str = "offsets: 1.23 .50 71.00 6.00";
        QRegExp rx = new QRegExp("\\d*\\.\\d+"); // primitive floating point matching
        int count = 0;
        int pos = 0;
        while ((pos = rx.indexIn(str, pos)) != -1) {
            ++count;
            pos += rx.matchedLength();
        }
        // pos will be 9, 14, 18 and finally 24; count will end up as 4
</pre> Although const, this function sets {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()}, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <p>If the QRegExp is a wildcard expression (see {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}) and want to test a string against the whole wildcard expression, use {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()} instead of this function. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#lastIndexIn(java.lang.String, int) lastIndexIn()}, and {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int indexIn(java.lang.String str, int offset, com.trolltech.qt.core.QRegExp.CaretMode caretMode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indexIn_String_int_CaretMode(nativeId(), str, offset, caretMode.value());
    }
    @QtBlockedSlot
    native int __qt_indexIn_String_int_CaretMode(long __this__nativeId, java.lang.String str, int offset, int caretMode);

/**
Returns true if the pattern string is empty; otherwise returns false. <p>If you call {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()} with an empty pattern on an empty string it will return true; otherwise it returns false since it operates over the whole string. If you call {@link com.trolltech.qt.core.QRegExp#indexIn(java.lang.String, int) indexIn()} with an empty pattern on any string it will return the start offset (0 by default) because the empty pattern matches the 'emptiness' at the start of the string. In this case the length of the match returned by {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()} will be 0. <p>See QString::isEmpty().
*/

    @QtBlockedSlot
    public final boolean isEmpty()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEmpty(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEmpty(long __this__nativeId);

/**
Returns true if minimal (non-greedy) matching is enabled; otherwise returns false. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#caseSensitivity() caseSensitivity()}, and {@link com.trolltech.qt.core.QRegExp#setMinimal(boolean) setMinimal()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isMinimal()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isMinimal(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isMinimal(long __this__nativeId);

/**
Returns true if the regular expression is valid; otherwise returns false. An invalid regular expression never matches. <p>The pattern <b>[a-z</b> is an example of an invalid pattern, since it lacks a closing square bracket. <p>Note that the validity of a regexp may also depend on the setting of the wildcard flag, for example <b>*.html</b> is a valid wildcard regexp but an invalid full regexp. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#errorString() errorString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final boolean isValid()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isValid(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isValid(long __this__nativeId);


/**
Attempts to find a match backwards in <tt>str</tt> from position <tt>offset</tt>. If <tt>offset</tt> is -1 (the default), the search starts at the last character; if -2, at the next to last character; etc. <p>Returns the position of the first match, or -1 if there was no match. <p>The <tt>caretMode</tt> parameter can be used to instruct whether <b>^</b> should match at index 0 or at <tt>offset</tt>. <p>Although const, this function sets {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()}, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <p><b>Warning:</b> Searching backwards is much slower than searching forwards. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#indexIn(java.lang.String, int) indexIn()}, and {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lastIndexIn(java.lang.String str, int offset) {
        return lastIndexIn(str, offset, com.trolltech.qt.core.QRegExp.CaretMode.CaretAtZero);
    }

/**
Attempts to find a match backwards in <tt>str</tt> from position <tt>offset</tt>. If <tt>offset</tt> is -1 (the default), the search starts at the last character; if -2, at the next to last character; etc. <p>Returns the position of the first match, or -1 if there was no match. <p>The <tt>caretMode</tt> parameter can be used to instruct whether <b>^</b> should match at index 0 or at <tt>offset</tt>. <p>Although const, this function sets {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()}, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <p><b>Warning:</b> Searching backwards is much slower than searching forwards. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#indexIn(java.lang.String, int) indexIn()}, and {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lastIndexIn(java.lang.String str) {
        return lastIndexIn(str, (int)-1, com.trolltech.qt.core.QRegExp.CaretMode.CaretAtZero);
    }
/**
Attempts to find a match backwards in <tt>str</tt> from position <tt>offset</tt>. If <tt>offset</tt> is -1 (the default), the search starts at the last character; if -2, at the next to last character; etc. <p>Returns the position of the first match, or -1 if there was no match. <p>The <tt>caretMode</tt> parameter can be used to instruct whether <b>^</b> should match at index 0 or at <tt>offset</tt>. <p>Although const, this function sets {@link com.trolltech.qt.core.QRegExp#matchedLength() matchedLength()}, {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()} and {@link com.trolltech.qt.core.QRegExp#pos() pos()}. <p><b>Warning:</b> Searching backwards is much slower than searching forwards. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#indexIn(java.lang.String, int) indexIn()}, and {@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int lastIndexIn(java.lang.String str, int offset, com.trolltech.qt.core.QRegExp.CaretMode caretMode)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_lastIndexIn_String_int_CaretMode(nativeId(), str, offset, caretMode.value());
    }
    @QtBlockedSlot
    native int __qt_lastIndexIn_String_int_CaretMode(long __this__nativeId, java.lang.String str, int offset, int caretMode);

/**
Returns the length of the last matched string, or -1 if there was no match. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#exactMatch(java.lang.String) exactMatch()}, {@link com.trolltech.qt.core.QRegExp#indexIn(java.lang.String, int) indexIn()}, and {@link com.trolltech.qt.core.QRegExp#lastIndexIn(java.lang.String, int) lastIndexIn()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int matchedLength()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_matchedLength(nativeId());
    }
    @QtBlockedSlot
    native int __qt_matchedLength(long __this__nativeId);

/**
Returns the number of captures contained in the regular expression.
*/

    @QtBlockedSlot
    public final int numCaptures()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_numCaptures(nativeId());
    }
    @QtBlockedSlot
    native int __qt_numCaptures(long __this__nativeId);

/**
<brief>Writes thisQRegExp
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream out)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), out == null ? 0 : out.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long out);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QRegExp rx)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QRegExp(nativeId(), rx == null ? 0 : rx.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QRegExp(long __this__nativeId, long rx);

/**
<brief>Reads a QRegExp
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream in)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), in == null ? 0 : in.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long in);

/**
Returns the pattern string of the regular expression. The pattern has either regular expression syntax or wildcard syntax, depending on {@link com.trolltech.qt.core.QRegExp#patternSyntax() patternSyntax()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#setPattern(java.lang.String) setPattern()}, {@link com.trolltech.qt.core.QRegExp#patternSyntax() patternSyntax()}, and {@link com.trolltech.qt.core.QRegExp#caseSensitivity() caseSensitivity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String pattern()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pattern(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_pattern(long __this__nativeId);

/**
Returns the syntax used by the regular expression. The default is {@link com.trolltech.qt.core.QRegExp.PatternSyntax QRegExp::RegExp }. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}, {@link com.trolltech.qt.core.QRegExp#pattern() pattern()}, and {@link com.trolltech.qt.core.QRegExp#caseSensitivity() caseSensitivity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QRegExp.PatternSyntax patternSyntax()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QRegExp.PatternSyntax.resolve(__qt_patternSyntax(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_patternSyntax(long __this__nativeId);


/**
Returns the position of the <tt>nth</tt> captured text in the searched string. If <tt>nth</tt> is 0 (the default), {@link com.trolltech.qt.core.QRegExp#pos() pos()} returns the position of the whole match. <p>Example: <pre class="snippet">
        QRegExp rx = new QRegExp("/([a-z]+)/([a-z]+)");
        rx.indexIn("Output /dev/null");   // returns 7 (position of /dev/null)
        rx.pos(0);                        // returns 7 (position of /dev/null)
        rx.pos(1);                        // returns 8 (position of dev)
        rx.pos(2);                        // returns 12 (position of null)
</pre> For zero-length matches, {@link com.trolltech.qt.core.QRegExp#pos() pos()} always returns -1. (For example, if cap(4) would return an empty string, pos(4) returns -1.) This is a feature of the implementation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#cap() cap()}, and {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int pos() {
        return pos((int)0);
    }
/**
Returns the position of the <tt>nth</tt> captured text in the searched string. If <tt>nth</tt> is 0 (the default), {@link com.trolltech.qt.core.QRegExp#pos() pos()} returns the position of the whole match. <p>Example: <pre class="snippet">
        QRegExp rx = new QRegExp("/([a-z]+)/([a-z]+)");
        rx.indexIn("Output /dev/null");   // returns 7 (position of /dev/null)
        rx.pos(0);                        // returns 7 (position of /dev/null)
        rx.pos(1);                        // returns 8 (position of dev)
        rx.pos(2);                        // returns 12 (position of null)
</pre> For zero-length matches, {@link com.trolltech.qt.core.QRegExp#pos() pos()} always returns -1. (For example, if cap(4) would return an empty string, pos(4) returns -1.) This is a feature of the implementation. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#cap() cap()}, and {@link com.trolltech.qt.core.QRegExp#capturedTexts() capturedTexts()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final int pos(int nth)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pos_int(nativeId(), nth);
    }
    @QtBlockedSlot
    native int __qt_pos_int(long __this__nativeId, int nth);

/**
Sets case sensitive matching to <tt>cs</tt>. <p>If <tt>cs</tt> is {@link com.trolltech.qt.core.Qt.CaseSensitivity Qt::CaseSensitive }, <b>\.txt$</b> matches <tt>readme.txt</tt> but not <tt>README.TXT</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#caseSensitivity() caseSensitivity()}, {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}, {@link com.trolltech.qt.core.QRegExp#setPattern(java.lang.String) setPattern()}, and {@link com.trolltech.qt.core.QRegExp#setMinimal(boolean) setMinimal()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity cs)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCaseSensitivity_CaseSensitivity(nativeId(), cs.value());
    }
    @QtBlockedSlot
    native void __qt_setCaseSensitivity_CaseSensitivity(long __this__nativeId, int cs);

/**
Enables or disables minimal matching. If <tt>minimal</tt> is false, matching is greedy (maximal) which is the default. <p>For example, suppose we have the input string "We must be &lt;b&gt;bold&lt;/b&gt;, very &lt;b&gt;bold&lt;/b&gt;!" and the pattern <b>&lt;b&gt;.*&lt;/b&gt;</b>. With the default greedy (maximal) matching, the match is "We must be <b>bold</b>, very <b>bold</b>!". But with minimal (non-greedy) matching, the first match is: "We must be <b>bold</b>, very &lt;b&gt;bold&lt;/b&gt;!" and the second match is "We must be &lt;b&gt;bold&lt;/b&gt;, very <b>bold</b>!". In practice we might use the pattern <b>&lt;b&gt;[^&lt;]*&lt;/b&gt;</b> instead, although this will still fail for nested tags. <p><DT><b>See also:</b><br><DD>minimal(), and {@link com.trolltech.qt.core.QRegExp#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setMinimal(boolean minimal)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimal_boolean(nativeId(), minimal);
    }
    @QtBlockedSlot
    native void __qt_setMinimal_boolean(long __this__nativeId, boolean minimal);

/**
Sets the pattern string to <tt>pattern</tt>. The case sensitivity, wildcard, and minimal matching options are not changed. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#pattern() pattern()}, {@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}, and {@link com.trolltech.qt.core.QRegExp#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPattern(java.lang.String pattern)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPattern_String(nativeId(), pattern);
    }
    @QtBlockedSlot
    native void __qt_setPattern_String(long __this__nativeId, java.lang.String pattern);

/**
Sets the syntax mode for the regular expression. The default is {@link com.trolltech.qt.core.QRegExp.PatternSyntax QRegExp::RegExp }. <p>Setting <tt>syntax</tt> to {@link com.trolltech.qt.core.QRegExp.PatternSyntax QRegExp::Wildcard } enables simple shell-like wildcard matching. For example, <b>r*.txt</b> matches the string <tt>readme.txt</tt> in wildcard mode, but does not match <tt>readme</tt>. <p>Setting <tt>syntax</tt> to {@link com.trolltech.qt.core.QRegExp.PatternSyntax QRegExp::FixedString } means that the pattern is interpreted as a plain string. Special characters (e.g., backslash) don't need to be escaped then. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#patternSyntax() patternSyntax()}, {@link com.trolltech.qt.core.QRegExp#setPattern(java.lang.String) setPattern()}, {@link com.trolltech.qt.core.QRegExp#setCaseSensitivity(com.trolltech.qt.core.Qt.CaseSensitivity) setCaseSensitivity()}, and {@link com.trolltech.qt.core.QRegExp#escape(java.lang.String) escape()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax syntax)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPatternSyntax_PatternSyntax(nativeId(), syntax.value());
    }
    @QtBlockedSlot
    native void __qt_setPatternSyntax_PatternSyntax(long __this__nativeId, int syntax);

/**
Returns the string <tt>str</tt> with every regexp special character escaped with a backslash. The special characters are $, (,), *, +, ., ?, [, ,], ^, {, | and }. <p>Example: <pre class="snippet">
        s1 = QRegExp.escape("bingo");   // s1 == "bingo"
        s2 = QRegExp.escape("f(x)");    // s2 == "f\\(x\\)"
</pre> This function is useful to construct regexp patterns dynamically: <pre class="snippet">
        QRegExp rx = new QRegExp("(" + QRegExp.escape(name) +
                 "|" + QRegExp.escape(alias) + ")");
</pre> <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QRegExp#setPatternSyntax(com.trolltech.qt.core.QRegExp.PatternSyntax) setPatternSyntax()}. <br></DD></DT>
*/

    public native static java.lang.String escape(java.lang.String str);

/**
@exclude
*/

    public static native QRegExp fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QRegExp(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QRegExp array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QRegExp)
        return operator_equal((com.trolltech.qt.core.QRegExp) other);
        return false;
    }


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QRegExp clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QRegExp __qt_clone(long __this_nativeId);
}
