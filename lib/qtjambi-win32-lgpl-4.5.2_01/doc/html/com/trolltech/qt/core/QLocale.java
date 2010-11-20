package com.trolltech.qt.core;

import com.trolltech.qt.*;

import com.trolltech.qt.QNativePointer;


/**
The QLocale class converts between numbers and their string representations in various languages. QLocale is initialized with a language/country pair in its constructor and offers number-to-string and string-to-number conversion functions similar to those in QString. <p>Example: <pre class="snippet">
        QLocale egyptian = new QLocale(QLocale.Language.Arabic, QLocale.Country.Egypt);
        String s1 = egyptian.toString(1.571429E+07, (byte) 'e');
        String s2 = egyptian.toString(10);

        double d = egyptian.toDouble(s1);
        int i = egyptian.toInt(s2);
</pre> QLocale supports the concept of a default locale, which is determined from the system's locale settings at application startup. The default locale can be changed by calling the static member {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) setDefault()}. Setting the default locale has the following effects: <ul><li> If a QLocale object is constructed with the default constructor, it will use the default locale's settings.</li><li> QString::toInt(), QString::toDouble(), etc., interpret the string according to the default locale. If this fails, it falls back on the "C" locale.</li><li> QString::arg() uses the default locale to format a number when its position specifier in the format string contains an 'L', e.g. "%L1".</li></ul> The following example illustrates how to use QLocale directly: <pre class="snippet">
        QLocale.setDefault(new QLocale(QLocale.Language.Hebrew, QLocale.Country.Israel));
        QLocale hebrew = new QLocale(); // Constructs a default QLocale
        String s1 = hebrew.toString(15714.3, (byte) 'e');

        double d;

        d = hebrew.toDouble("1234,56");   // d == 0.0
        d = hebrew.toDouble("1234.56");   // d == 1234.56
</pre> When a language/country pair is specified in the constructor, one of three things can happen: <ul><li> If the language/country pair is found in the database, it is used.</li><li> If the language is found but the country is not, or if the country is <tt>AnyCountry</tt>, the language is used with the most appropriate available country (for example, Germany for German),</li><li> If neither the language nor the country are found, QLocale defaults to the default locale (see {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) setDefault()}).</li></ul> The "C" locale is identical to {@link com.trolltech.qt.core.QLocale.Language English }/{@link com.trolltech.qt.core.QLocale.Country UnitedStates }. <p>Use {@link com.trolltech.qt.core.QLocale#language() language()} and {@link com.trolltech.qt.core.QLocale#country() country()} to determine the actual language and country values used. <p>An alternative method for constructing a QLocale object is by specifying the locale name. <pre class="snippet">
        QLocale korean = new QLocale("ko");
        QLocale swiss = new QLocale("de_CH");
</pre> This constructor converts the locale name to a language/country pair; it does not use the system locale database. <p>The double-to-string and string-to-double conversion functions are covered by the following licenses:Copyright (c) 1991 by AT&T.Permission to use, copy, modify, and distribute this software for any purpose without fee is hereby granted, provided that this entire notice is included in all copies of any software which is or includes a copy or modification of this software and in all copies of the supporting documentation for such software.THIS SOFTWARE IS BEING PROVIDED "AS IS", WITHOUT ANY EXPRESS OR IMPLIED WARRANTY. IN PARTICULAR, NEITHER THE AUTHOR NOR AT&T MAKES ANY REPRESENTATION OR WARRANTY OF ANY KIND CONCERNING THE MERCHANTABILITY OF THIS SOFTWARE OR ITS FITNESS FOR ANY PARTICULAR PURPOSE.This product includes software developed by the University of California, Berkeley and its contributors.QLocale's data is based on Common Locale Data Repository v1.6.1. <p><DT><b>See also:</b><br><DD>QString::arg(), QString::toInt(), and QString::toDouble(). <br></DD></DT>
*/
@QtJambiGeneratedClass
public class QLocale extends com.trolltech.qt.QtJambiObject
    implements java.lang.Cloneable
{

    static {
        com.trolltech.qt.core.QtJambi_LibraryInitializer.init();
    }
/**
This enum defines which units are used for measurement.
*/

    public enum MeasurementSystem implements com.trolltech.qt.QtEnumerator {
/**
 This value indicates metric units, such as meters, centimeters and millimeters.
*/

        MetricSystem(0),
/**
 This value indicates imperial units, such as inches and miles. There are several distinct imperial systems in the world; this value stands for the official United States imperial units.
*/

        ImperialSystem(1);

        MeasurementSystem(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLocale$MeasurementSystem constant with the specified <tt>int</tt>.</brief>
*/

        public static MeasurementSystem resolve(int value) {
            return (MeasurementSystem) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return MetricSystem;
            case 1: return ImperialSystem;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enum defines a set of options for number-to-string and string-to-number conversions. They can be retrieved with {@link com.trolltech.qt.core.QLocale#numberOptions() numberOptions()} and set with {@link com.trolltech.qt.core.QLocale#setNumberOptions(com.trolltech.qt.core.QLocale.NumberOption[]) setNumberOptions()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#setNumberOptions(com.trolltech.qt.core.QLocale.NumberOption[]) setNumberOptions()}, and {@link com.trolltech.qt.core.QLocale#numberOptions() numberOptions()}. <br></DD></DT>
*/

    public enum NumberOption implements com.trolltech.qt.QtEnumerator {
/**
 If this option is set, the number-to-string functions will not insert group separators in their return values. The default is to insert group separators.
*/

        OmitGroupSeparator(1),
/**
 If this option is set, the string-to-number functions will fail if they encounter group separators in their input. The default is to accept numbers containing correctly placed group separators.
*/

        RejectGroupSeparator(2);

        NumberOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.core.QLocale$NumberOptions with the specified <tt>com.trolltech.qt.core.QLocale$NumberOption[]</tt> QLocale$NumberOption values set.</brief>
*/

        public static NumberOptions createQFlags(NumberOption ... values) {
            return new NumberOptions(values);
        }
/**
<brief>Returns the QLocale$NumberOption constant with the specified <tt>int</tt>.</brief>
*/

        public static NumberOption resolve(int value) {
            return (NumberOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return OmitGroupSeparator;
            case 2: return RejectGroupSeparator;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class NumberOptions extends com.trolltech.qt.QFlags<NumberOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QLocale-NumberOptions with the specified <tt>com.trolltech.qt.core.QLocale.NumberOption[]</tt>. flags set.</brief>
*/

        public NumberOptions(NumberOption ... args) { super(args); }
        public NumberOptions(int value) { setValue(value); }
    }
/**
This enum describes the types of format that can be used when converting {@link com.trolltech.qt.core.QDate QDate} and {@link com.trolltech.qt.core.QTime QTime} objects to strings.
*/


    public enum FormatType implements com.trolltech.qt.QtEnumerator {
/**
 The long version of day and month names; for example, returning "January" as a month name.
*/

        LongFormat(0),
/**
 The short version of day and month names; for example, returning "Jan" as a month name.
*/

        ShortFormat(1),
/**
 A special version of day and month names for use when space is limited; for example, returning "J" as a month name. Note that the narrow format might contain the same text for different months and days or it can even be an empty string if the locale doesn't support narrow names, so you should avoid using it for date formatting. Also, for the system locale this format is the same as {@link com.trolltech.qt.core.QLocale.FormatType ShortFormat }.
*/

        NarrowFormat(2);

        FormatType(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLocale$FormatType constant with the specified <tt>int</tt>.</brief>
*/

        public static FormatType resolve(int value) {
            return (FormatType) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return LongFormat;
            case 1: return ShortFormat;
            case 2: return NarrowFormat;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enumerated type is used to specify a country. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#country() country()}. <br></DD></DT>
*/

    public enum Country implements com.trolltech.qt.QtEnumerator {
/**

*/

        AnyCountry(0),
/**

*/

        Afghanistan(1),
/**

*/

        Albania(2),
/**

*/

        Algeria(3),
/**

*/

        AmericanSamoa(4),
/**

*/

        Andorra(5),
/**

*/

        Angola(6),
/**

*/

        Anguilla(7),
/**

*/

        Antarctica(8),
/**

*/

        AntiguaAndBarbuda(9),
/**

*/

        Argentina(10),
/**

*/

        Armenia(11),
/**

*/

        Aruba(12),
/**

*/

        Australia(13),
/**

*/

        Austria(14),
/**

*/

        Azerbaijan(15),
/**

*/

        Bahamas(16),
/**

*/

        Bahrain(17),
/**

*/

        Bangladesh(18),
/**

*/

        Barbados(19),
/**

*/

        Belarus(20),
/**

*/

        Belgium(21),
/**

*/

        Belize(22),
/**

*/

        Benin(23),
/**

*/

        Bermuda(24),
/**

*/

        Bhutan(25),
/**

*/

        Bolivia(26),
/**

*/

        BosniaAndHerzegowina(27),
/**

*/

        Botswana(28),
/**

*/

        BouvetIsland(29),
/**

*/

        Brazil(30),
/**

*/

        BritishIndianOceanTerritory(31),
/**

*/

        BruneiDarussalam(32),
/**

*/

        Bulgaria(33),
/**

*/

        BurkinaFaso(34),
/**

*/

        Burundi(35),
/**

*/

        Cambodia(36),
/**

*/

        Cameroon(37),
/**

*/

        Canada(38),
/**

*/

        CapeVerde(39),
/**

*/

        CaymanIslands(40),
/**

*/

        CentralAfricanRepublic(41),
/**

*/

        Chad(42),
/**

*/

        Chile(43),
/**

*/

        China(44),
/**

*/

        ChristmasIsland(45),
/**

*/

        CocosIslands(46),
/**

*/

        Colombia(47),
/**

*/

        Comoros(48),
/**

*/

        DemocraticRepublicOfCongo(49),
/**

*/

        PeoplesRepublicOfCongo(50),
/**

*/

        CookIslands(51),
/**

*/

        CostaRica(52),
/**

*/

        IvoryCoast(53),
/**

*/

        Croatia(54),
/**

*/

        Cuba(55),
/**

*/

        Cyprus(56),
/**

*/

        CzechRepublic(57),
/**

*/

        Denmark(58),
/**

*/

        Djibouti(59),
/**

*/

        Dominica(60),
/**

*/

        DominicanRepublic(61),
/**

*/

        EastTimor(62),
/**

*/

        Ecuador(63),
/**

*/

        Egypt(64),
/**

*/

        ElSalvador(65),
/**

*/

        EquatorialGuinea(66),
/**

*/

        Eritrea(67),
/**

*/

        Estonia(68),
/**

*/

        Ethiopia(69),
/**

*/

        FalklandIslands(70),
/**

*/

        FaroeIslands(71),
/**

*/

        FijiCountry(72),
/**

*/

        Finland(73),
/**

*/

        France(74),
/**

*/

        MetropolitanFrance(75),
/**

*/

        FrenchGuiana(76),
/**

*/

        FrenchPolynesia(77),
/**

*/

        FrenchSouthernTerritories(78),
/**

*/

        Gabon(79),
/**

*/

        Gambia(80),
/**

*/

        Georgia(81),
/**

*/

        Germany(82),
/**

*/

        Ghana(83),
/**

*/

        Gibraltar(84),
/**

*/

        Greece(85),
/**

*/

        Greenland(86),
/**

*/

        Grenada(87),
/**

*/

        Guadeloupe(88),
/**

*/

        Guam(89),
/**

*/

        Guatemala(90),
/**

*/

        Guinea(91),
/**

*/

        GuineaBissau(92),
/**

*/

        Guyana(93),
/**

*/

        Haiti(94),
/**

*/

        HeardAndMcDonaldIslands(95),
/**

*/

        Honduras(96),
/**

*/

        HongKong(97),
/**

*/

        Hungary(98),
/**

*/

        Iceland(99),
/**

*/

        India(100),
/**

*/

        Indonesia(101),
/**

*/

        Iran(102),
/**

*/

        Iraq(103),
/**

*/

        Ireland(104),
/**

*/

        Israel(105),
/**

*/

        Italy(106),
/**

*/

        Jamaica(107),
/**

*/

        Japan(108),
/**

*/

        Jordan(109),
/**

*/

        Kazakhstan(110),
/**

*/

        Kenya(111),
/**

*/

        Kiribati(112),
/**

*/

        DemocraticRepublicOfKorea(113),
/**

*/

        RepublicOfKorea(114),
/**

*/

        Kuwait(115),
/**

*/

        Kyrgyzstan(116),
/**

*/

        Lao(117),
/**

*/

        Latvia(118),
/**

*/

        Lebanon(119),
/**

*/

        Lesotho(120),
/**

*/

        Liberia(121),
/**

*/

        LibyanArabJamahiriya(122),
/**

*/

        Liechtenstein(123),
/**

*/

        Lithuania(124),
/**

*/

        Luxembourg(125),
/**

*/

        Macau(126),
/**

*/

        Macedonia(127),
/**

*/

        Madagascar(128),
/**

*/

        Malawi(129),
/**

*/

        Malaysia(130),
/**

*/

        Maldives(131),
/**

*/

        Mali(132),
/**

*/

        Malta(133),
/**

*/

        MarshallIslands(134),
/**

*/

        Martinique(135),
/**

*/

        Mauritania(136),
/**

*/

        Mauritius(137),
/**

*/

        Mayotte(138),
/**

*/

        Mexico(139),
/**

*/

        Micronesia(140),
/**

*/

        Moldova(141),
/**

*/

        Monaco(142),
/**

*/

        Mongolia(143),
/**

*/

        Montserrat(144),
/**

*/

        Morocco(145),
/**

*/

        Mozambique(146),
/**

*/

        Myanmar(147),
/**

*/

        Namibia(148),
/**

*/

        NauruCountry(149),
/**

*/

        Nepal(150),
/**

*/

        Netherlands(151),
/**

*/

        NetherlandsAntilles(152),
/**

*/

        NewCaledonia(153),
/**

*/

        NewZealand(154),
/**

*/

        Nicaragua(155),
/**

*/

        Niger(156),
/**

*/

        Nigeria(157),
/**

*/

        Niue(158),
/**

*/

        NorfolkIsland(159),
/**

*/

        NorthernMarianaIslands(160),
/**

*/

        Norway(161),
/**

*/

        Oman(162),
/**

*/

        Pakistan(163),
/**

*/

        Palau(164),
/**

*/

        PalestinianTerritory(165),
/**

*/

        Panama(166),
/**

*/

        PapuaNewGuinea(167),
/**

*/

        Paraguay(168),
/**

*/

        Peru(169),
/**

*/

        Philippines(170),
/**

*/

        Pitcairn(171),
/**

*/

        Poland(172),
/**

*/

        Portugal(173),
/**

*/

        PuertoRico(174),
/**

*/

        Qatar(175),
/**

*/

        Reunion(176),
/**

*/

        Romania(177),
/**

*/

        RussianFederation(178),
/**

*/

        Rwanda(179),
/**

*/

        SaintKittsAndNevis(180),
/**

*/

        StLucia(181),
/**

*/

        StVincentAndTheGrenadines(182),
/**

*/

        Samoa(183),
/**

*/

        SanMarino(184),
/**

*/

        SaoTomeAndPrincipe(185),
/**

*/

        SaudiArabia(186),
/**

*/

        Senegal(187),
/**

*/

        Seychelles(188),
/**

*/

        SierraLeone(189),
/**

*/

        Singapore(190),
/**

*/

        Slovakia(191),
/**

*/

        Slovenia(192),
/**

*/

        SolomonIslands(193),
/**

*/

        Somalia(194),
/**

*/

        SouthAfrica(195),
/**

*/

        SouthGeorgiaAndTheSouthSandwichIslands(196),
/**

*/

        Spain(197),
/**

*/

        SriLanka(198),
/**

*/

        StHelena(199),
/**

*/

        StPierreAndMiquelon(200),
/**

*/

        Sudan(201),
/**

*/

        Suriname(202),
/**

*/

        SvalbardAndJanMayenIslands(203),
/**

*/

        Swaziland(204),
/**

*/

        Sweden(205),
/**

*/

        Switzerland(206),
/**

*/

        SyrianArabRepublic(207),
/**

*/

        Taiwan(208),
/**

*/

        Tajikistan(209),
/**

*/

        Tanzania(210),
/**

*/

        Thailand(211),
/**

*/

        Togo(212),
/**

*/

        Tokelau(213),
/**

*/

        TongaCountry(214),
/**

*/

        TrinidadAndTobago(215),
/**

*/

        Tunisia(216),
/**

*/

        Turkey(217),
/**

*/

        Turkmenistan(218),
/**

*/

        TurksAndCaicosIslands(219),
/**

*/

        Tuvalu(220),
/**

*/

        Uganda(221),
/**

*/

        Ukraine(222),
/**

*/

        UnitedArabEmirates(223),
/**

*/

        UnitedKingdom(224),
/**

*/

        UnitedStates(225),
/**

*/

        UnitedStatesMinorOutlyingIslands(226),
/**

*/

        Uruguay(227),
/**

*/

        Uzbekistan(228),
/**

*/

        Vanuatu(229),
/**

*/

        VaticanCityState(230),
/**

*/

        Venezuela(231),
/**

*/

        VietNam(232),
/**

*/

        BritishVirginIslands(233),
/**

*/

        USVirginIslands(234),
/**

*/

        WallisAndFutunaIslands(235),
/**

*/

        WesternSahara(236),
/**

*/

        Yemen(237),
/**

*/

        Yugoslavia(238),
/**

*/

        Zambia(239),
/**

*/

        Zimbabwe(240),
/**

*/

        SerbiaAndMontenegro(241),
;

        Country(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLocale$Country constant with the specified <tt>int</tt>.</brief>
*/

        public static Country resolve(int value) {
            return (Country) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return AnyCountry;
            case 1: return Afghanistan;
            case 2: return Albania;
            case 3: return Algeria;
            case 4: return AmericanSamoa;
            case 5: return Andorra;
            case 6: return Angola;
            case 7: return Anguilla;
            case 8: return Antarctica;
            case 9: return AntiguaAndBarbuda;
            case 10: return Argentina;
            case 11: return Armenia;
            case 12: return Aruba;
            case 13: return Australia;
            case 14: return Austria;
            case 15: return Azerbaijan;
            case 16: return Bahamas;
            case 17: return Bahrain;
            case 18: return Bangladesh;
            case 19: return Barbados;
            case 20: return Belarus;
            case 21: return Belgium;
            case 22: return Belize;
            case 23: return Benin;
            case 24: return Bermuda;
            case 25: return Bhutan;
            case 26: return Bolivia;
            case 27: return BosniaAndHerzegowina;
            case 28: return Botswana;
            case 29: return BouvetIsland;
            case 30: return Brazil;
            case 31: return BritishIndianOceanTerritory;
            case 32: return BruneiDarussalam;
            case 33: return Bulgaria;
            case 34: return BurkinaFaso;
            case 35: return Burundi;
            case 36: return Cambodia;
            case 37: return Cameroon;
            case 38: return Canada;
            case 39: return CapeVerde;
            case 40: return CaymanIslands;
            case 41: return CentralAfricanRepublic;
            case 42: return Chad;
            case 43: return Chile;
            case 44: return China;
            case 45: return ChristmasIsland;
            case 46: return CocosIslands;
            case 47: return Colombia;
            case 48: return Comoros;
            case 49: return DemocraticRepublicOfCongo;
            case 50: return PeoplesRepublicOfCongo;
            case 51: return CookIslands;
            case 52: return CostaRica;
            case 53: return IvoryCoast;
            case 54: return Croatia;
            case 55: return Cuba;
            case 56: return Cyprus;
            case 57: return CzechRepublic;
            case 58: return Denmark;
            case 59: return Djibouti;
            case 60: return Dominica;
            case 61: return DominicanRepublic;
            case 62: return EastTimor;
            case 63: return Ecuador;
            case 64: return Egypt;
            case 65: return ElSalvador;
            case 66: return EquatorialGuinea;
            case 67: return Eritrea;
            case 68: return Estonia;
            case 69: return Ethiopia;
            case 70: return FalklandIslands;
            case 71: return FaroeIslands;
            case 72: return FijiCountry;
            case 73: return Finland;
            case 74: return France;
            case 75: return MetropolitanFrance;
            case 76: return FrenchGuiana;
            case 77: return FrenchPolynesia;
            case 78: return FrenchSouthernTerritories;
            case 79: return Gabon;
            case 80: return Gambia;
            case 81: return Georgia;
            case 82: return Germany;
            case 83: return Ghana;
            case 84: return Gibraltar;
            case 85: return Greece;
            case 86: return Greenland;
            case 87: return Grenada;
            case 88: return Guadeloupe;
            case 89: return Guam;
            case 90: return Guatemala;
            case 91: return Guinea;
            case 92: return GuineaBissau;
            case 93: return Guyana;
            case 94: return Haiti;
            case 95: return HeardAndMcDonaldIslands;
            case 96: return Honduras;
            case 97: return HongKong;
            case 98: return Hungary;
            case 99: return Iceland;
            case 100: return India;
            case 101: return Indonesia;
            case 102: return Iran;
            case 103: return Iraq;
            case 104: return Ireland;
            case 105: return Israel;
            case 106: return Italy;
            case 107: return Jamaica;
            case 108: return Japan;
            case 109: return Jordan;
            case 110: return Kazakhstan;
            case 111: return Kenya;
            case 112: return Kiribati;
            case 113: return DemocraticRepublicOfKorea;
            case 114: return RepublicOfKorea;
            case 115: return Kuwait;
            case 116: return Kyrgyzstan;
            case 117: return Lao;
            case 118: return Latvia;
            case 119: return Lebanon;
            case 120: return Lesotho;
            case 121: return Liberia;
            case 122: return LibyanArabJamahiriya;
            case 123: return Liechtenstein;
            case 124: return Lithuania;
            case 125: return Luxembourg;
            case 126: return Macau;
            case 127: return Macedonia;
            case 128: return Madagascar;
            case 129: return Malawi;
            case 130: return Malaysia;
            case 131: return Maldives;
            case 132: return Mali;
            case 133: return Malta;
            case 134: return MarshallIslands;
            case 135: return Martinique;
            case 136: return Mauritania;
            case 137: return Mauritius;
            case 138: return Mayotte;
            case 139: return Mexico;
            case 140: return Micronesia;
            case 141: return Moldova;
            case 142: return Monaco;
            case 143: return Mongolia;
            case 144: return Montserrat;
            case 145: return Morocco;
            case 146: return Mozambique;
            case 147: return Myanmar;
            case 148: return Namibia;
            case 149: return NauruCountry;
            case 150: return Nepal;
            case 151: return Netherlands;
            case 152: return NetherlandsAntilles;
            case 153: return NewCaledonia;
            case 154: return NewZealand;
            case 155: return Nicaragua;
            case 156: return Niger;
            case 157: return Nigeria;
            case 158: return Niue;
            case 159: return NorfolkIsland;
            case 160: return NorthernMarianaIslands;
            case 161: return Norway;
            case 162: return Oman;
            case 163: return Pakistan;
            case 164: return Palau;
            case 165: return PalestinianTerritory;
            case 166: return Panama;
            case 167: return PapuaNewGuinea;
            case 168: return Paraguay;
            case 169: return Peru;
            case 170: return Philippines;
            case 171: return Pitcairn;
            case 172: return Poland;
            case 173: return Portugal;
            case 174: return PuertoRico;
            case 175: return Qatar;
            case 176: return Reunion;
            case 177: return Romania;
            case 178: return RussianFederation;
            case 179: return Rwanda;
            case 180: return SaintKittsAndNevis;
            case 181: return StLucia;
            case 182: return StVincentAndTheGrenadines;
            case 183: return Samoa;
            case 184: return SanMarino;
            case 185: return SaoTomeAndPrincipe;
            case 186: return SaudiArabia;
            case 187: return Senegal;
            case 188: return Seychelles;
            case 189: return SierraLeone;
            case 190: return Singapore;
            case 191: return Slovakia;
            case 192: return Slovenia;
            case 193: return SolomonIslands;
            case 194: return Somalia;
            case 195: return SouthAfrica;
            case 196: return SouthGeorgiaAndTheSouthSandwichIslands;
            case 197: return Spain;
            case 198: return SriLanka;
            case 199: return StHelena;
            case 200: return StPierreAndMiquelon;
            case 201: return Sudan;
            case 202: return Suriname;
            case 203: return SvalbardAndJanMayenIslands;
            case 204: return Swaziland;
            case 205: return Sweden;
            case 206: return Switzerland;
            case 207: return SyrianArabRepublic;
            case 208: return Taiwan;
            case 209: return Tajikistan;
            case 210: return Tanzania;
            case 211: return Thailand;
            case 212: return Togo;
            case 213: return Tokelau;
            case 214: return TongaCountry;
            case 215: return TrinidadAndTobago;
            case 216: return Tunisia;
            case 217: return Turkey;
            case 218: return Turkmenistan;
            case 219: return TurksAndCaicosIslands;
            case 220: return Tuvalu;
            case 221: return Uganda;
            case 222: return Ukraine;
            case 223: return UnitedArabEmirates;
            case 224: return UnitedKingdom;
            case 225: return UnitedStates;
            case 226: return UnitedStatesMinorOutlyingIslands;
            case 227: return Uruguay;
            case 228: return Uzbekistan;
            case 229: return Vanuatu;
            case 230: return VaticanCityState;
            case 231: return Venezuela;
            case 232: return VietNam;
            case 233: return BritishVirginIslands;
            case 234: return USVirginIslands;
            case 235: return WallisAndFutunaIslands;
            case 236: return WesternSahara;
            case 237: return Yemen;
            case 238: return Yugoslavia;
            case 239: return Zambia;
            case 240: return Zimbabwe;
            case 241: return SerbiaAndMontenegro;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
/**
This enumerated type is used to specify a language. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#language() language()}. <br></DD></DT>
*/

    public enum Language implements com.trolltech.qt.QtEnumerator {
/**
 The "C" locale is English/{@link com.trolltech.qt.core.QLocale.Country UnitedStates }.
*/

        C(1),
/**

*/

        Abkhazian(2),
/**

*/

        Afan(3),
/**

*/

        Afar(4),
/**

*/

        Afrikaans(5),
/**

*/

        Albanian(6),
/**

*/

        Amharic(7),
/**

*/

        Arabic(8),
/**

*/

        Armenian(9),
/**

*/

        Assamese(10),
/**

*/

        Aymara(11),
/**

*/

        Azerbaijani(12),
/**

*/

        Bashkir(13),
/**

*/

        Basque(14),
/**

*/

        Bengali(15),
/**

*/

        Bhutani(16),
/**

*/

        Bihari(17),
/**

*/

        Bislama(18),
/**

*/

        Breton(19),
/**

*/

        Bulgarian(20),
/**

*/

        Burmese(21),
/**

*/

        Byelorussian(22),
/**

*/

        Cambodian(23),
/**

*/

        Catalan(24),
/**

*/

        Chinese(25),
/**

*/

        Corsican(26),
/**

*/

        Croatian(27),
/**

*/

        Czech(28),
/**

*/

        Danish(29),
/**

*/

        Dutch(30),
/**

*/

        English(31),
/**

*/

        Esperanto(32),
/**

*/

        Estonian(33),
/**

*/

        Faroese(34),
/**

*/

        FijiLanguage(35),
/**

*/

        Finnish(36),
/**

*/

        French(37),
/**

*/

        Frisian(38),
/**

*/

/**

*/

        Gaelic(39),
/**

*/

        Galician(40),
/**

*/

        Georgian(41),
/**

*/

        German(42),
/**

*/

        Greek(43),
/**

*/

        Greenlandic(44),
/**

*/

        Guarani(45),
/**

*/

        Gujarati(46),
/**

*/

        Hausa(47),
/**

*/

        Hebrew(48),
/**

*/

        Hindi(49),
/**

*/

        Hungarian(50),
/**

*/

        Icelandic(51),
/**

*/

        Indonesian(52),
/**

*/

        Interlingua(53),
/**

*/

        Interlingue(54),
/**

*/

        Inuktitut(55),
/**

*/

        Inupiak(56),
/**

*/

        Irish(57),
/**

*/

        Italian(58),
/**

*/

        Japanese(59),
/**

*/

        Javanese(60),
/**

*/

        Kannada(61),
/**

*/

        Kashmiri(62),
/**

*/

        Kazakh(63),
/**

*/

        Kinyarwanda(64),
/**

*/

        Kirghiz(65),
/**

*/

        Korean(66),
/**

*/

        Kurdish(67),
/**

*/

        Kurundi(68),
/**

*/

        Laothian(69),
/**

*/

        Latin(70),
/**

*/

        Latvian(71),
/**

*/

        Lingala(72),
/**

*/

        Lithuanian(73),
/**

*/

        Macedonian(74),
/**

*/

        Malagasy(75),
/**

*/

        Malay(76),
/**

*/

        Malayalam(77),
/**

*/

        Maltese(78),
/**

*/

        Maori(79),
/**

*/

        Marathi(80),
/**

*/

        Moldavian(81),
/**

*/

        Mongolian(82),
/**

*/

        NauruLanguage(83),
/**

*/

        Nepali(84),
/**

*/

        Norwegian(85),
/**

*/

        Occitan(86),
/**

*/

        Oriya(87),
/**

*/

        Pashto(88),
/**

*/

        Persian(89),
/**

*/

        Polish(90),
/**

*/

        Portuguese(91),
/**

*/

        Punjabi(92),
/**

*/

        Quechua(93),
/**

*/

        RhaetoRomance(94),
/**

*/

        Romanian(95),
/**

*/

        Russian(96),
/**

*/

        Samoan(97),
/**

*/

        Sangho(98),
/**

*/

        Sanskrit(99),
/**

*/

        Serbian(100),
/**

*/

        SerboCroatian(101),
/**

*/

        Sesotho(102),
/**

*/

        Setswana(103),
/**

*/

        Shona(104),
/**

*/

        Sindhi(105),
/**

*/

        Singhalese(106),
/**

*/

        Siswati(107),
/**

*/

        Slovak(108),
/**

*/

        Slovenian(109),
/**

*/

        Somali(110),
/**

*/

        Spanish(111),
/**

*/

        Sundanese(112),
/**

*/

        Swahili(113),
/**

*/

        Swedish(114),
/**

*/

        Tagalog(115),
/**

*/

        Tajik(116),
/**

*/

        Tamil(117),
/**

*/

        Tatar(118),
/**

*/

        Telugu(119),
/**

*/

        Thai(120),
/**

*/

        Tibetan(121),
/**

*/

        Tigrinya(122),
/**

*/

        TongaLanguage(123),
/**

*/

        Tsonga(124),
/**

*/

        Turkish(125),
/**

*/

        Turkmen(126),
/**

*/

        Twi(127),
/**

*/

        Uigur(128),
/**

*/

        Ukrainian(129),
/**

*/

        Urdu(130),
/**

*/

        Uzbek(131),
/**

*/

        Vietnamese(132),
/**

*/

        Volapuk(133),
/**

*/

        Welsh(134),
/**

*/

        Wolof(135),
/**

*/

        Xhosa(136),
/**

*/

        Yiddish(137),
/**

*/

        Yoruba(138),
/**

*/

        Zhuang(139),
/**

*/

        Zulu(140),
/**

*/

        NorwegianNynorsk(141),
/**

*/

/**

*/

        Bosnian(142),
/**

*/

/**

*/

        Divehi(143),
/**

*/

/**

*/

        Manx(144),
/**

*/

/**

*/

        Cornish(145),
/**

*/

        Akan(146),
/**

*/

        Konkani(147),
        Ga(148),
/**

*/

        Igbo(149),
/**

*/

        Kamba(150),
/**

*/

        Syriac(151),
/**

*/

        Blin(152),
/**

*/

        Geez(153),
/**

*/

        Koro(154),
/**

*/

        Sidamo(155),
/**

*/

        Atsam(156),
/**

*/

        Tigre(157),
/**

*/

        Jju(158),
/**

*/

        Friulian(159),
/**

*/

        Venda(160),
/**

*/

        Ewe(161),
/**

*/

        Walamo(162),
/**

*/

        Hawaiian(163),
/**

*/

        Tyap(164),
/**

*/

        Chewa(165),
;

        Language(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>Returns the QLocale$Language constant with the specified <tt>int</tt>.</brief>
*/

        public static Language resolve(int value) {
            return (Language) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return C;
            case 2: return Abkhazian;
            case 3: return Afan;
            case 4: return Afar;
            case 5: return Afrikaans;
            case 6: return Albanian;
            case 7: return Amharic;
            case 8: return Arabic;
            case 9: return Armenian;
            case 10: return Assamese;
            case 11: return Aymara;
            case 12: return Azerbaijani;
            case 13: return Bashkir;
            case 14: return Basque;
            case 15: return Bengali;
            case 16: return Bhutani;
            case 17: return Bihari;
            case 18: return Bislama;
            case 19: return Breton;
            case 20: return Bulgarian;
            case 21: return Burmese;
            case 22: return Byelorussian;
            case 23: return Cambodian;
            case 24: return Catalan;
            case 25: return Chinese;
            case 26: return Corsican;
            case 27: return Croatian;
            case 28: return Czech;
            case 29: return Danish;
            case 30: return Dutch;
            case 31: return English;
            case 32: return Esperanto;
            case 33: return Estonian;
            case 34: return Faroese;
            case 35: return FijiLanguage;
            case 36: return Finnish;
            case 37: return French;
            case 38: return Frisian;
            case 39: return Gaelic;
            case 40: return Galician;
            case 41: return Georgian;
            case 42: return German;
            case 43: return Greek;
            case 44: return Greenlandic;
            case 45: return Guarani;
            case 46: return Gujarati;
            case 47: return Hausa;
            case 48: return Hebrew;
            case 49: return Hindi;
            case 50: return Hungarian;
            case 51: return Icelandic;
            case 52: return Indonesian;
            case 53: return Interlingua;
            case 54: return Interlingue;
            case 55: return Inuktitut;
            case 56: return Inupiak;
            case 57: return Irish;
            case 58: return Italian;
            case 59: return Japanese;
            case 60: return Javanese;
            case 61: return Kannada;
            case 62: return Kashmiri;
            case 63: return Kazakh;
            case 64: return Kinyarwanda;
            case 65: return Kirghiz;
            case 66: return Korean;
            case 67: return Kurdish;
            case 68: return Kurundi;
            case 69: return Laothian;
            case 70: return Latin;
            case 71: return Latvian;
            case 72: return Lingala;
            case 73: return Lithuanian;
            case 74: return Macedonian;
            case 75: return Malagasy;
            case 76: return Malay;
            case 77: return Malayalam;
            case 78: return Maltese;
            case 79: return Maori;
            case 80: return Marathi;
            case 81: return Moldavian;
            case 82: return Mongolian;
            case 83: return NauruLanguage;
            case 84: return Nepali;
            case 85: return Norwegian;
            case 86: return Occitan;
            case 87: return Oriya;
            case 88: return Pashto;
            case 89: return Persian;
            case 90: return Polish;
            case 91: return Portuguese;
            case 92: return Punjabi;
            case 93: return Quechua;
            case 94: return RhaetoRomance;
            case 95: return Romanian;
            case 96: return Russian;
            case 97: return Samoan;
            case 98: return Sangho;
            case 99: return Sanskrit;
            case 100: return Serbian;
            case 101: return SerboCroatian;
            case 102: return Sesotho;
            case 103: return Setswana;
            case 104: return Shona;
            case 105: return Sindhi;
            case 106: return Singhalese;
            case 107: return Siswati;
            case 108: return Slovak;
            case 109: return Slovenian;
            case 110: return Somali;
            case 111: return Spanish;
            case 112: return Sundanese;
            case 113: return Swahili;
            case 114: return Swedish;
            case 115: return Tagalog;
            case 116: return Tajik;
            case 117: return Tamil;
            case 118: return Tatar;
            case 119: return Telugu;
            case 120: return Thai;
            case 121: return Tibetan;
            case 122: return Tigrinya;
            case 123: return TongaLanguage;
            case 124: return Tsonga;
            case 125: return Turkish;
            case 126: return Turkmen;
            case 127: return Twi;
            case 128: return Uigur;
            case 129: return Ukrainian;
            case 130: return Urdu;
            case 131: return Uzbek;
            case 132: return Vietnamese;
            case 133: return Volapuk;
            case 134: return Welsh;
            case 135: return Wolof;
            case 136: return Xhosa;
            case 137: return Yiddish;
            case 138: return Yoruba;
            case 139: return Zhuang;
            case 140: return Zulu;
            case 141: return NorwegianNynorsk;
            case 142: return Bosnian;
            case 143: return Divehi;
            case 144: return Manx;
            case 145: return Cornish;
            case 146: return Akan;
            case 147: return Konkani;
            case 148: return Ga;
            case 149: return Igbo;
            case 150: return Kamba;
            case 151: return Syriac;
            case 152: return Blin;
            case 153: return Geez;
            case 154: return Koro;
            case 155: return Sidamo;
            case 156: return Atsam;
            case 157: return Tigre;
            case 158: return Jju;
            case 159: return Friulian;
            case 160: return Venda;
            case 161: return Ewe;
            case 162: return Walamo;
            case 163: return Hawaiian;
            case 164: return Tyap;
            case 165: return Chewa;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }


/**
Constructs a QLocale object initialized with the default locale. If no default locale was set using setDefaultLocale(), this locale will be the same as the one returned by {@link com.trolltech.qt.core.QLocale#system() system()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) setDefault()}. <br></DD></DT>
*/

    public QLocale(){
        super((QPrivateConstructor)null);
        __qt_QLocale();
    }

    native void __qt_QLocale();


/**
Constructs a QLocale object with the specified <tt>language</tt> and <tt>country</tt>. <ul><li> If the language/country pair is found in the database, it is used.</li><li> If the language is found but the country is not, or if the country is <tt>AnyCountry</tt>, the language is used with the most appropriate available country (for example, Germany for German),</li><li> If neither the language nor the country are found, QLocale defaults to the default locale (see {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) setDefault()}).</li></ul> The language and country that are actually used can be queried using {@link com.trolltech.qt.core.QLocale#language() language()} and {@link com.trolltech.qt.core.QLocale#country() country()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) setDefault()}, {@link com.trolltech.qt.core.QLocale#language() language()}, and {@link com.trolltech.qt.core.QLocale#country() country()}. <br></DD></DT>
*/

    public QLocale(com.trolltech.qt.core.QLocale.Language language) {
        this(language, com.trolltech.qt.core.QLocale.Country.AnyCountry);
    }
/**
Constructs a QLocale object with the specified <tt>language</tt> and <tt>country</tt>. <ul><li> If the language/country pair is found in the database, it is used.</li><li> If the language is found but the country is not, or if the country is <tt>AnyCountry</tt>, the language is used with the most appropriate available country (for example, Germany for German),</li><li> If neither the language nor the country are found, QLocale defaults to the default locale (see {@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) setDefault()}).</li></ul> The language and country that are actually used can be queried using {@link com.trolltech.qt.core.QLocale#language() language()} and {@link com.trolltech.qt.core.QLocale#country() country()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#setDefault(com.trolltech.qt.core.QLocale) setDefault()}, {@link com.trolltech.qt.core.QLocale#language() language()}, and {@link com.trolltech.qt.core.QLocale#country() country()}. <br></DD></DT>
*/

    public QLocale(com.trolltech.qt.core.QLocale.Language language, com.trolltech.qt.core.QLocale.Country country){
        super((QPrivateConstructor)null);
        __qt_QLocale_Language_Country(language.value(), country.value());
    }

    native void __qt_QLocale_Language_Country(int language, int country);

/**
Constructs a QLocale object as a copy of <tt>other</tt>.
*/

    public QLocale(com.trolltech.qt.core.QLocale other){
        super((QPrivateConstructor)null);
        __qt_QLocale_QLocale(other == null ? 0 : other.nativeId());
    }

    native void __qt_QLocale_QLocale(long other);

/**
Constructs a QLocale object with the specified <tt>name</tt>, which has the format "language[_country][. odeset][@modifier]" or "C", where: <ul><li> language is a lowercase, two-letter, ISO 639 language code,</li><li> territory is an uppercase, two-letter, ISO 3166 country code,</li><li> and codeset and modifier are ignored.</li></ul> If the string violates the locale format, or language is not a valid ISO 369 code, the "C" locale is used instead. If country is not present, or is not a valid ISO 3166 code, the most appropriate country is chosen for the specified language. <p>The language and country codes are converted to their respective <tt>Language</tt> and <tt>Country</tt> enums. After this conversion is performed the constructor behaves exactly like QLocale(Country, Language). <p>This constructor is much slower than QLocale(Country, Language). <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#name() name()}. <br></DD></DT>
*/

    public QLocale(java.lang.String name){
        super((QPrivateConstructor)null);
        __qt_QLocale_String(name);
    }

    native void __qt_QLocale_String(java.lang.String name);

/**
Returns the localized name of the "AM" suffix for times specified using the conventions of the 12-hour clock. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#pmText() pmText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String amText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_amText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_amText(long __this__nativeId);

/**
Returns the country of this locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#language() language()}, {@link com.trolltech.qt.core.QLocale#countryToString(com.trolltech.qt.core.QLocale.Country) countryToString()}, and {@link com.trolltech.qt.core.QLocale#name() name()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QLocale.Country country()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QLocale.Country.resolve(__qt_country(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_country(long __this__nativeId);


/**
Returns the date format used for the current locale. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QLocale.FormatType LongFormat } the format will be a long version. Otherwise it uses a shorter version. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() QDate::toString()}, and {@link com.trolltech.qt.core.QDate#fromString(java.lang.String) QDate::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String dateFormat() {
        return dateFormat(com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Returns the date format used for the current locale. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QLocale.FormatType LongFormat } the format will be a long version. Otherwise it uses a shorter version. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDate#toString() QDate::toString()}, and {@link com.trolltech.qt.core.QDate#fromString(java.lang.String) QDate::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String dateFormat(com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dateFormat_FormatType(nativeId(), format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_dateFormat_FormatType(long __this__nativeId, int format);


/**
Returns the date time format used for the current locale. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QLocale.FormatType ShortFormat } the format will be a short version. Otherwise it uses a longer version. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()}, and {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String dateTimeFormat() {
        return dateTimeFormat(com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Returns the date time format used for the current locale. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QLocale.FormatType ShortFormat } the format will be a short version. Otherwise it uses a longer version. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QDateTime#toString() QDateTime::toString()}, and {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String dateTimeFormat(com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dateTimeFormat_FormatType(nativeId(), format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_dateTimeFormat_FormatType(long __this__nativeId, int format);


/**
Returns the localized name of the <tt>day</tt> (where 1 represents Monday, 2 represents Tuesday and so on), in the format specified by <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#monthName(int) monthName()}, and {@link com.trolltech.qt.core.QLocale#standaloneDayName(int) standaloneDayName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String dayName(int arg__1) {
        return dayName(arg__1, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Returns the localized name of the <tt>day</tt> (where 1 represents Monday, 2 represents Tuesday and so on), in the format specified by <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#monthName(int) monthName()}, and {@link com.trolltech.qt.core.QLocale#standaloneDayName(int) standaloneDayName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String dayName(int arg__1, com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_dayName_int_FormatType(nativeId(), arg__1, format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_dayName_int_FormatType(long __this__nativeId, int arg__1, int format);

/**
Returns the decimal point character of this locale.
*/

    @QtBlockedSlot
    public final char decimalPoint()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_decimalPoint(nativeId());
    }
    @QtBlockedSlot
    native char __qt_decimalPoint(long __this__nativeId);

/**
Returns the exponential character of this locale.
*/

    @QtBlockedSlot
    public final char exponential()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_exponential(nativeId());
    }
    @QtBlockedSlot
    native char __qt_exponential(long __this__nativeId);

/**
Returns the group separator character of this locale.
*/

    @QtBlockedSlot
    public final char groupSeparator()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_groupSeparator(nativeId());
    }
    @QtBlockedSlot
    native char __qt_groupSeparator(long __this__nativeId);

/**
Returns the language of this locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#country() country()}, {@link com.trolltech.qt.core.QLocale#languageToString(com.trolltech.qt.core.QLocale.Language) languageToString()}, and {@link com.trolltech.qt.core.QLocale#name() name()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QLocale.Language language()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QLocale.Language.resolve(__qt_language(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_language(long __this__nativeId);

/**
Returns the measurement system for the locale.
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QLocale.MeasurementSystem measurementSystem()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.qt.core.QLocale.MeasurementSystem.resolve(__qt_measurementSystem(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_measurementSystem(long __this__nativeId);


/**
Returns the localized name of <tt>month</tt>, in the format specified by <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dayName(int) dayName()}, and {@link com.trolltech.qt.core.QLocale#standaloneMonthName(int) standaloneMonthName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String monthName(int arg__1) {
        return monthName(arg__1, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Returns the localized name of <tt>month</tt>, in the format specified by <tt>type</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dayName(int) dayName()}, and {@link com.trolltech.qt.core.QLocale#standaloneMonthName(int) standaloneMonthName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String monthName(int arg__1, com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_monthName_int_FormatType(nativeId(), arg__1, format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_monthName_int_FormatType(long __this__nativeId, int arg__1, int format);

/**
Returns the language and country of this locale as a string of the form "language_country", where language is a lowercase, two-letter ISO 639 language code, and country is an uppercase, two-letter ISO 3166 country code. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#language() language()}, and {@link com.trolltech.qt.core.QLocale#country() country()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String name()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_name(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_name(long __this__nativeId);

/**
Returns the negative sign character of this locale.
*/

    @QtBlockedSlot
    public final char negativeSign()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_negativeSign(nativeId());
    }
    @QtBlockedSlot
    native char __qt_negativeSign(long __this__nativeId);

/**
Returns the options related to number conversions for this QLocale instance. <p>By default, no options are set for the standard locales. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#setNumberOptions(com.trolltech.qt.core.QLocale.NumberOption[]) setNumberOptions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QLocale.NumberOptions numberOptions()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return new com.trolltech.qt.core.QLocale.NumberOptions(__qt_numberOptions(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_numberOptions(long __this__nativeId);

/**
<brief>Writes thisQLocale
*/

    @QtBlockedSlot
    public final void writeTo(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_writeTo_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_writeTo_QDataStream(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    private final boolean operator_equal(com.trolltech.qt.core.QLocale other)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_operator_equal_QLocale(nativeId(), other == null ? 0 : other.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_operator_equal_QLocale(long __this__nativeId, long other);

/**
<brief>Reads a QLocale
*/

    @QtBlockedSlot
    public final void readFrom(com.trolltech.qt.core.QDataStream arg__1)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_readFrom_QDataStream(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_readFrom_QDataStream(long __this__nativeId, long arg__1);

/**
Returns the percent character of this locale.
*/

    @QtBlockedSlot
    public final char percent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_percent(nativeId());
    }
    @QtBlockedSlot
    native char __qt_percent(long __this__nativeId);

/**
Returns the localized name of the "PM" suffix for times specified using the conventions of the 12-hour clock. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#amText() amText()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String pmText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_pmText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_pmText(long __this__nativeId);

/**
Returns the positive sign character of this locale.
*/

    @QtBlockedSlot
    public final char positiveSign()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_positiveSign(nativeId());
    }
    @QtBlockedSlot
    native char __qt_positiveSign(long __this__nativeId);


/**
This is an overloaded method provided for convenience.
*/

    @QtBlockedSlot
    public final void setNumberOptions(com.trolltech.qt.core.QLocale.NumberOption ... options) {
        this.setNumberOptions(new com.trolltech.qt.core.QLocale.NumberOptions(options));
    }
/**
Sets the <tt>options</tt> related to number conversions for this QLocale instance. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#numberOptions() numberOptions()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final void setNumberOptions(com.trolltech.qt.core.QLocale.NumberOptions options)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setNumberOptions_NumberOptions(nativeId(), options.value());
    }
    @QtBlockedSlot
    native void __qt_setNumberOptions_NumberOptions(long __this__nativeId, int options);


/**
Returns the localized name of the <tt>day</tt> (where 1 represents Monday, 2 represents Tuesday and so on) that is used as a standalone text, in the format specified by <tt>type</tt>. <p>If the locale information does not specify the standalone day name then return value is the same as in {@link com.trolltech.qt.core.QLocale#dayName(int) dayName()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dayName(int) dayName()}, and {@link com.trolltech.qt.core.QLocale#standaloneMonthName(int) standaloneMonthName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String standaloneDayName(int arg__1) {
        return standaloneDayName(arg__1, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Returns the localized name of the <tt>day</tt> (where 1 represents Monday, 2 represents Tuesday and so on) that is used as a standalone text, in the format specified by <tt>type</tt>. <p>If the locale information does not specify the standalone day name then return value is the same as in {@link com.trolltech.qt.core.QLocale#dayName(int) dayName()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dayName(int) dayName()}, and {@link com.trolltech.qt.core.QLocale#standaloneMonthName(int) standaloneMonthName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String standaloneDayName(int arg__1, com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standaloneDayName_int_FormatType(nativeId(), arg__1, format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_standaloneDayName_int_FormatType(long __this__nativeId, int arg__1, int format);


/**
Returns the localized name of <tt>month</tt> that is used as a standalone text, in the format specified by <tt>type</tt>. <p>If the locale information doesn't specify the standalone month name then return value is the same as in {@link com.trolltech.qt.core.QLocale#monthName(int) monthName()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#monthName(int) monthName()}, and {@link com.trolltech.qt.core.QLocale#standaloneDayName(int) standaloneDayName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String standaloneMonthName(int arg__1) {
        return standaloneMonthName(arg__1, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Returns the localized name of <tt>month</tt> that is used as a standalone text, in the format specified by <tt>type</tt>. <p>If the locale information doesn't specify the standalone month name then return value is the same as in {@link com.trolltech.qt.core.QLocale#monthName(int) monthName()}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#monthName(int) monthName()}, and {@link com.trolltech.qt.core.QLocale#standaloneDayName(int) standaloneDayName()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String standaloneMonthName(int arg__1, com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_standaloneMonthName_int_FormatType(nativeId(), arg__1, format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_standaloneMonthName_int_FormatType(long __this__nativeId, int arg__1, int format);


/**
Returns the time format used for the current locale. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QLocale.FormatType LongFormat } the format will be a long version. Otherwise it uses a shorter version. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#toString() QTime::toString()}, and {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) QTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String timeFormat() {
        return timeFormat(com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Returns the time format used for the current locale. <p>If <tt>format</tt> is {@link com.trolltech.qt.core.QLocale.FormatType LongFormat } the format will be a long version. Otherwise it uses a shorter version. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QTime#toString() QTime::toString()}, and {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) QTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final java.lang.String timeFormat(com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_timeFormat_FormatType(nativeId(), format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_timeFormat_FormatType(long __this__nativeId, int format);


/**
Parses the date string given in <tt>string</tt> and returns the date. The format of the date string is chosen according to the <tt>format</tt> parameter (see {@link com.trolltech.qt.core.QLocale#dateFormat() dateFormat()}). <p>If the date could not be parsed, returns an invalid date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dateFormat() dateFormat()}, {@link com.trolltech.qt.core.QLocale#toTime(java.lang.String) toTime()}, {@link com.trolltech.qt.core.QLocale#toDateTime(java.lang.String) toDateTime()}, and {@link com.trolltech.qt.core.QDate#fromString(java.lang.String) QDate::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate toDate(java.lang.String string) {
        return toDate(string, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Parses the date string given in <tt>string</tt> and returns the date. The format of the date string is chosen according to the <tt>format</tt> parameter (see {@link com.trolltech.qt.core.QLocale#dateFormat() dateFormat()}). <p>If the date could not be parsed, returns an invalid date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dateFormat() dateFormat()}, {@link com.trolltech.qt.core.QLocale#toTime(java.lang.String) toTime()}, {@link com.trolltech.qt.core.QLocale#toDateTime(java.lang.String) toDateTime()}, and {@link com.trolltech.qt.core.QDate#fromString(java.lang.String) QDate::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate toDate(java.lang.String string, com.trolltech.qt.core.QLocale.FormatType arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDate_String_FormatType(nativeId(), string, arg__2.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_toDate_String_FormatType(long __this__nativeId, java.lang.String string, int arg__2);

/**
Parses the date string given in <tt>string</tt> and returns the date. See {@link com.trolltech.qt.core.QDate#fromString(java.lang.String) QDate::fromString()} for information on the expressions that can be used with this function. <p>This function searches month names and the names of the days of the week in the current locale. <p>If the date could not be parsed, returns an invalid date. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dateFormat() dateFormat()}, {@link com.trolltech.qt.core.QLocale#toTime(java.lang.String) toTime()}, {@link com.trolltech.qt.core.QLocale#toDateTime(java.lang.String) toDateTime()}, and {@link com.trolltech.qt.core.QDate#fromString(java.lang.String) QDate::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate toDate(java.lang.String string, java.lang.String format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDate_String_String(nativeId(), string, format);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_toDate_String_String(long __this__nativeId, java.lang.String string, java.lang.String format);


/**
Parses the date/time string given in <tt>string</tt> and returns the time. The format of the date/time string is chosen according to the <tt>format</tt> parameter (see {@link com.trolltech.qt.core.QLocale#dateTimeFormat() dateTimeFormat()}). <p>If the string could not be parsed, returns an invalid {@link com.trolltech.qt.core.QDateTime QDateTime}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dateTimeFormat() dateTimeFormat()}, {@link com.trolltech.qt.core.QLocale#toTime(java.lang.String) toTime()}, {@link com.trolltech.qt.core.QLocale#toDate(java.lang.String) toDate()}, and {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime toDateTime(java.lang.String string) {
        return toDateTime(string, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Parses the date/time string given in <tt>string</tt> and returns the time. The format of the date/time string is chosen according to the <tt>format</tt> parameter (see {@link com.trolltech.qt.core.QLocale#dateTimeFormat() dateTimeFormat()}). <p>If the string could not be parsed, returns an invalid {@link com.trolltech.qt.core.QDateTime QDateTime}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dateTimeFormat() dateTimeFormat()}, {@link com.trolltech.qt.core.QLocale#toTime(java.lang.String) toTime()}, {@link com.trolltech.qt.core.QLocale#toDate(java.lang.String) toDate()}, and {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime toDateTime(java.lang.String string, com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDateTime_String_FormatType(nativeId(), string, format.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_toDateTime_String_FormatType(long __this__nativeId, java.lang.String string, int format);

/**
Parses the date/time string given in <tt>string</tt> and returns the time. See {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()} for information on the expressions that can be used with this function. <p><b>Note:</b> The month and day names used must be given in the user's local language. <p>If the string could not be parsed, returns an invalid {@link com.trolltech.qt.core.QDateTime QDateTime}. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#dateTimeFormat() dateTimeFormat()}, {@link com.trolltech.qt.core.QLocale#toTime(java.lang.String) toTime()}, {@link com.trolltech.qt.core.QLocale#toDate(java.lang.String) toDate()}, and {@link com.trolltech.qt.core.QDateTime#fromString(java.lang.String) QDateTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDateTime toDateTime(java.lang.String string, java.lang.String format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDateTime_String_String(nativeId(), string, format);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDateTime __qt_toDateTime_String_String(long __this__nativeId, java.lang.String string, java.lang.String format);

    @QtBlockedSlot
    private final double toDouble(java.lang.String s, com.trolltech.qt.QNativePointer ok)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toDouble_String_nativepointer(nativeId(), s, ok);
    }
    @QtBlockedSlot
    native double __qt_toDouble_String_nativepointer(long __this__nativeId, java.lang.String s, com.trolltech.qt.QNativePointer ok);

    @QtBlockedSlot
    private final float toFloat(java.lang.String s, com.trolltech.qt.QNativePointer ok)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toFloat_String_nativepointer(nativeId(), s, ok);
    }
    @QtBlockedSlot
    native float __qt_toFloat_String_nativepointer(long __this__nativeId, java.lang.String s, com.trolltech.qt.QNativePointer ok);

    @QtBlockedSlot
    private final int toInt(java.lang.String s, com.trolltech.qt.QNativePointer ok, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toInt_String_nativepointer_int(nativeId(), s, ok, base);
    }
    @QtBlockedSlot
    native int __qt_toInt_String_nativepointer_int(long __this__nativeId, java.lang.String s, com.trolltech.qt.QNativePointer ok, int base);

    @QtBlockedSlot
    private final long toLong(java.lang.String s, com.trolltech.qt.QNativePointer ok, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toLong_String_nativepointer_int(nativeId(), s, ok, base);
    }
    @QtBlockedSlot
    native long __qt_toLong_String_nativepointer_int(long __this__nativeId, java.lang.String s, com.trolltech.qt.QNativePointer ok, int base);

    @QtBlockedSlot
    private final char toShort(java.lang.String s, com.trolltech.qt.QNativePointer ok, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toShort_String_nativepointer_int(nativeId(), s, ok, base);
    }
    @QtBlockedSlot
    native char __qt_toShort_String_nativepointer_int(long __this__nativeId, java.lang.String s, com.trolltech.qt.QNativePointer ok, int base);


/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QDate</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QDate date) {
        return toString(date, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QDate date, com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_QDate_FormatType(nativeId(), date == null ? 0 : date.nativeId(), format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_QDate_FormatType(long __this__nativeId, long date, int format);

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QDate date, java.lang.String formatStr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_QDate_String(nativeId(), date == null ? 0 : date.nativeId(), formatStr);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_QDate_String(long __this__nativeId, long date, java.lang.String formatStr);


/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QDateTime</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QDateTime dateTime) {
        return toString(dateTime, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QDateTime</tt> argument. </brief>
*/

/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QDate</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QDateTime dateTime, com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_QDateTime_FormatType(nativeId(), dateTime == null ? 0 : dateTime.nativeId(), format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_QDateTime_FormatType(long __this__nativeId, long dateTime, int format);

/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QDateTime</tt> argument. </brief>
*/

/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QDate</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QDateTime dateTime, java.lang.String format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_QDateTime_String(nativeId(), dateTime == null ? 0 : dateTime.nativeId(), format);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_QDateTime_String(long __this__nativeId, long dateTime, java.lang.String format);


/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QTime</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QTime time) {
        return toString(time, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QTime</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QTime time, com.trolltech.qt.core.QLocale.FormatType format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_QTime_FormatType(nativeId(), time == null ? 0 : time.nativeId(), format.value());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_QTime_FormatType(long __this__nativeId, long time, int format);

/**
<brief>Returns a string representation of the <tt>com.trolltech.qt.core.QTime</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(com.trolltech.qt.core.QTime time, java.lang.String formatStr)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_QTime_String(nativeId(), time == null ? 0 : time.nativeId(), formatStr);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_QTime_String(long __this__nativeId, long time, java.lang.String formatStr);


/**
<brief>Returns a string representation of the <tt>double</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(double i, byte f) {
        return toString(i, f, (int)6);
    }

/**
<brief>Returns a string representation of the <tt>double</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(double i) {
        return toString(i, (byte)'g', (int)6);
    }
/**
<brief>Returns a string representation of the <tt>double</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(double i, byte f, int prec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_double_byte_int(nativeId(), i, f, prec);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_double_byte_int(long __this__nativeId, double i, byte f, int prec);


/**
<brief>Returns a string representation of the <tt>float</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(float i, byte f) {
        return toString(i, f, (int)6);
    }

/**
<brief>Returns a string representation of the <tt>float</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(float i) {
        return toString(i, (byte)'g', (int)6);
    }
/**
<brief>Returns a string representation of the <tt>float</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(float i, byte f, int prec)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_float_byte_int(nativeId(), i, f, prec);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_float_byte_int(long __this__nativeId, float i, byte f, int prec);

/**
<brief>Returns a string representation of the <tt>int</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(int i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_int(nativeId(), i);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_int(long __this__nativeId, int i);

/**
<brief>Returns a string representation of the <tt>long</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(long i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_long(nativeId(), i);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_long(long __this__nativeId, long i);

/**
<brief>Returns a string representation of the <tt>char</tt> argument. </brief>
*/

    @QtBlockedSlot
    public final java.lang.String toString(char i)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toString_char(nativeId(), i);
    }
    @QtBlockedSlot
    native java.lang.String __qt_toString_char(long __this__nativeId, char i);


/**
Parses the time string given in <tt>string</tt> and returns the time. The format of the time string is chosen according to the <tt>format</tt> parameter (see {@link com.trolltech.qt.core.QLocale#timeFormat() timeFormat()}). <p>If the time could not be parsed, returns an invalid time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#timeFormat() timeFormat()}, {@link com.trolltech.qt.core.QLocale#toDate(java.lang.String) toDate()}, {@link com.trolltech.qt.core.QLocale#toDateTime(java.lang.String) toDateTime()}, and {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) QTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime toTime(java.lang.String string) {
        return toTime(string, com.trolltech.qt.core.QLocale.FormatType.LongFormat);
    }
/**
Parses the time string given in <tt>string</tt> and returns the time. The format of the time string is chosen according to the <tt>format</tt> parameter (see {@link com.trolltech.qt.core.QLocale#timeFormat() timeFormat()}). <p>If the time could not be parsed, returns an invalid time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#timeFormat() timeFormat()}, {@link com.trolltech.qt.core.QLocale#toDate(java.lang.String) toDate()}, {@link com.trolltech.qt.core.QLocale#toDateTime(java.lang.String) toDateTime()}, and {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) QTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime toTime(java.lang.String string, com.trolltech.qt.core.QLocale.FormatType arg__2)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toTime_String_FormatType(nativeId(), string, arg__2.value());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_toTime_String_FormatType(long __this__nativeId, java.lang.String string, int arg__2);

/**
Parses the time string given in <tt>string</tt> and returns the time. See {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) QTime::fromString()} for information on what is a valid format string. <p>If the time could not be parsed, returns an invalid time. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#timeFormat() timeFormat()}, {@link com.trolltech.qt.core.QLocale#toDate(java.lang.String) toDate()}, {@link com.trolltech.qt.core.QLocale#toDateTime(java.lang.String) toDateTime()}, and {@link com.trolltech.qt.core.QTime#fromString(java.lang.String) QTime::fromString()}. <br></DD></DT>
*/

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime toTime(java.lang.String string, java.lang.String format)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toTime_String_String(nativeId(), string, format);
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_toTime_String_String(long __this__nativeId, java.lang.String string, java.lang.String format);

    @QtBlockedSlot
    private final char toChar(java.lang.String s, com.trolltech.qt.QNativePointer ok, int base)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toChar_String_nativepointer_int(nativeId(), s, ok, base);
    }
    @QtBlockedSlot
    native char __qt_toChar_String_nativepointer_int(long __this__nativeId, java.lang.String s, com.trolltech.qt.QNativePointer ok, int base);

/**
Returns the zero digit character of this locale.
*/

    @QtBlockedSlot
    public final char zeroDigit()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_zeroDigit(nativeId());
    }
    @QtBlockedSlot
    native char __qt_zeroDigit(long __this__nativeId);

/**
Returns a QLocale object initialized to the "C" locale. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#system() system()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QLocale c();

/**
Returns the list of countries that have entires for <tt>language</tt> in Qt's locale database. If the result is an empty list, then <tt>language</tt> is not represented in Qt's locale database.
*/

    public static java.util.List<com.trolltech.qt.core.QLocale.Country> countriesForLanguage(com.trolltech.qt.core.QLocale.Language lang)    {
        return __qt_countriesForLanguage_Language(lang.value());
    }
    native static java.util.List<com.trolltech.qt.core.QLocale.Country> __qt_countriesForLanguage_Language(int lang);

/**
Returns a QString containing the name of <tt>country</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#country() country()}, and {@link com.trolltech.qt.core.QLocale#name() name()}. <br></DD></DT>
*/

    public static java.lang.String countryToString(com.trolltech.qt.core.QLocale.Country country)    {
        return __qt_countryToString_Country(country.value());
    }
    native static java.lang.String __qt_countryToString_Country(int country);

/**
Returns a QString containing the name of <tt>language</tt>. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#countryToString(com.trolltech.qt.core.QLocale.Country) countryToString()}, and {@link com.trolltech.qt.core.QLocale#name() name()}. <br></DD></DT>
*/

    public static java.lang.String languageToString(com.trolltech.qt.core.QLocale.Language language)    {
        return __qt_languageToString_Language(language.value());
    }
    native static java.lang.String __qt_languageToString_Language(int language);

/**
Sets the global default locale to <tt>locale</tt>. These values are used when a QLocale object is constructed with no arguments. If this function is not called, the system's locale is used. <p><b>Warning:</b> In a multithreaded application, the default locale should be set at application startup, before any non-GUI threads are created. <p><DT><b>See also:</b><br><DD>{@link com.trolltech.qt.core.QLocale#system() system()}, and {@link com.trolltech.qt.core.QLocale#c() c()}. <br></DD></DT>
*/

    public static void setDefault(com.trolltech.qt.core.QLocale locale)    {
        __qt_setDefault_QLocale(locale == null ? 0 : locale.nativeId());
    }
    native static void __qt_setDefault_QLocale(long locale);

/**
Returns a QLocale object initialized to the system locale. <p>On Windows and Mac, this locale will use the decimal/grouping characters and date/time formats specified in the system configuration panel. <p><DT><b>See also:</b><br><DD>QTextCodec::locale(), and {@link com.trolltech.qt.core.QLocale#c() c()}. <br></DD></DT>
*/

    public native static com.trolltech.qt.core.QLocale system();

/**
@exclude
*/

    public static native QLocale fromNativePointer(QNativePointer nativePointer);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    protected QLocale(QPrivateConstructor p) { super(p); } 

/**
@exclude
*/

    public static native QNativePointer nativePointerArray(QLocale array[]);

/**
This method is internal to Qt Jambi. 

	@exclude
*/

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object other) {
    if (other instanceof com.trolltech.qt.core.QLocale)
        return operator_equal((com.trolltech.qt.core.QLocale) other);
        return false;
    }


    // TEMPLATE - core.qlocale_to_type_float - START
    // TEMPLATE - core.qlocale_to_type_general - START
/**
Returns the double represented by the localized string <tt>s</tt>, or
0.0 if the conversion failed.

This function ignores leading and trailing whitespace.
*/

    public final double toDouble(String s) {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);
        double returned = (double) toDouble(s, ok);
        if (!ok.booleanValue())
            throw new NumberFormatException(s);
        return returned;
    }
    // TEMPLATE - core.qlocale_to_type_general - END
    // TEMPLATE - core.qlocale_to_type_float - END


    // TEMPLATE - core.qlocale_to_type_float - START
    // TEMPLATE - core.qlocale_to_type_general - START
/**
Returns the float represented by the localized string <tt>s</tt>, or
0.0 if the conversion failed.

This function ignores leading and trailing whitespace.
*/

    public final float toFloat(String s) {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);
        float returned = (float) toFloat(s, ok);
        if (!ok.booleanValue())
            throw new NumberFormatException(s);
        return returned;
    }
    // TEMPLATE - core.qlocale_to_type_general - END
    // TEMPLATE - core.qlocale_to_type_float - END


    // TEMPLATE - core.qlocale_to_type_integer - START
    // TEMPLATE - core.qlocale_to_type_general - START
/**
Returns the int represented by the localized string <tt>s</tt>, using
base <tt>base</tt>. If <tt>base</tt> is 0 the base is determined automatically
using the following rules: If the string begins with "0x", it is
assumed to be hexadecimal; if it begins with "0", it is assumed to
be octal; otherwise it is assumed to be decimal.

If the conversion fails the function returns 0.

This function ignores leading and trailing whitespace.
*/

    public final int toInt(String s, int base) {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);
        int returned = (int) toInt(s, ok, base);
        if (!ok.booleanValue())
            throw new NumberFormatException(s);
        return returned;
    }
    // TEMPLATE - core.qlocale_to_type_general - END

/**
Returns the int represented by the localized string <tt>s</tt>, using
base 10.
*/

    public final int toInt(String s) {
        return toInt(s, 0);
    }
    // TEMPLATE - core.qlocale_to_type_integer - END


    // TEMPLATE - core.qlocale_to_type_integer - START
    // TEMPLATE - core.qlocale_to_type_general - START
/**
Returns the long represented by the localized string <tt>s</tt>, using
base <tt>base</tt>. If <tt>base</tt> is 0 the base is determined automatically
using the following rules: If the string begins with "0x", it is
assumed to be hexadecimal; if it begins with "0", it is assumed to
be octal; otherwise it is assumed to be decimal.

If the conversion fails the function returns 0.

This function ignores leading and trailing whitespace.
*/

    public final long toLong(String s, int base) {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);
        long returned = (long) toLong(s, ok, base);
        if (!ok.booleanValue())
            throw new NumberFormatException(s);
        return returned;
    }
    // TEMPLATE - core.qlocale_to_type_general - END

/**
Returns the long represented by the localized string <tt>s</tt>, using
base 10.
*/

    public final long toLong(String s) {
        return toLong(s, 0);
    }
    // TEMPLATE - core.qlocale_to_type_integer - END


    // TEMPLATE - core.qlocale_to_type_integer - START
    // TEMPLATE - core.qlocale_to_type_general - START
/**
Returns the short represented by the localized string <tt>s</tt>, using
base <tt>base</tt>. If <tt>base</tt> is 0 the base is determined automatically
using the following rules: If the string begins with "0x", it is
assumed to be hexadecimal; if it begins with "0", it is assumed to
be octal; otherwise it is assumed to be decimal.

If the conversion fails the function returns 0.

This function ignores leading and trailing whitespace.
*/

    public final short toShort(String s, int base) {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);
        short returned = (short) toShort(s, ok, base);
        if (!ok.booleanValue())
            throw new NumberFormatException(s);
        return returned;
    }
    // TEMPLATE - core.qlocale_to_type_general - END

/**
Returns the short represented by the localized string <tt>s</tt>. The
string is interpreted as a decimal number.
*/

    public final short toShort(String s) {
        return toShort(s, 0);
    }
    // TEMPLATE - core.qlocale_to_type_integer - END


    // TEMPLATE - core.qlocale_to_type_integer - START
    // TEMPLATE - core.qlocale_to_type_general - START
/**
Returns the char, which must be written as a number between 0 and 255,
represented by the localized string <tt>s</tt>, using base
<tt>base</tt>. If <tt>base</tt> is 0 the base is determined
automatically using the following rules: If the string begins with
"0x", it is assumed to be hexadecimal; if it begins with "0", it is
assumed to be octal; otherwise it is assumed to be decimal.

If the conversion fails the function returns 0.

This function ignores leading and trailing whitespace.
*/

    public final char toChar(String s, int base) {
        QNativePointer ok = new QNativePointer(QNativePointer.Type.Boolean);
        char returned = (char) toChar(s, ok, base);
        if (!ok.booleanValue())
            throw new NumberFormatException(s);
        return returned;
    }
    // TEMPLATE - core.qlocale_to_type_general - END

/**
Returns the char, which must be written as a number between 0 and 255,
represented by the localized string <tt>s</tt>. The number is assumed
to be decimal.
*/

    public final char toChar(String s) {
        return toChar(s, 0);
    }
    // TEMPLATE - core.qlocale_to_type_integer - END


/**
This method is reimplemented for internal reasons
*/

    @Override
    public QLocale clone() {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_clone(nativeId());
    }
    native QLocale __qt_clone(long __this_nativeId);
}
