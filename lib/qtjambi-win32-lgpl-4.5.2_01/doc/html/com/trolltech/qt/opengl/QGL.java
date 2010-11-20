package com.trolltech.qt.opengl;

import com.trolltech.qt.*;



/**
The QGL namespace specifies miscellaneous identifiers used in the Qt OpenGL module.
*/
@QtJambiGeneratedClass
public interface QGL
{
/**
This enum specifies the format options that can be used to configure an OpenGL context. These are set using {@link com.trolltech.qt.opengl.QGLFormat#setOption(com.trolltech.qt.opengl.QGL.FormatOption[]) QGLFormat::setOption()}. <p><DT><b>See also:</b><br><DD>{@link <a href="../opengl-samplebuffers.html">Sample Buffers Example</a>}. <br></DD></DT>
*/

    public enum FormatOption implements com.trolltech.qt.QtEnumerator {
/**
 Specifies the use of double buffering.
*/

        DoubleBuffer(1),
/**
 Enables the use of a depth buffer.
*/

        DepthBuffer(2),
/**
 Specifies that the context should use RGBA as its pixel format.
*/

        Rgba(4),
/**
 Enables the use of an alpha channel.
*/

        AlphaChannel(8),
/**
 Enables the use of an accumulation buffer.
*/

        AccumBuffer(16),
/**
 Enables the use of a stencil buffer.
*/

        StencilBuffer(32),
/**
 Enables the use of a stereo buffers for use with visualization hardware.
*/

        StereoBuffers(64),
/**
 Specifies that the context is used for direct rendering to a display.
*/

        DirectRendering(128),
/**
 Enables the use of an overlay.
*/

        HasOverlay(256),
/**
 Enables the use of sample buffers.
*/

        SampleBuffers(512),
/**
 Specifies the use of a single buffer, as opposed to double buffers.
*/

        SingleBuffer(65536),
/**
 Disables the use of a depth buffer.
*/

        NoDepthBuffer(131072),
/**
 Specifies that the context should use a color index as its pixel format.
*/

        ColorIndex(262144),
/**
 Disables the use of an alpha channel.
*/

        NoAlphaChannel(524288),
/**
 Disables the use of an accumulation buffer.
*/

        NoAccumBuffer(1048576),
/**
 Disables the use of a stencil buffer.
*/

        NoStencilBuffer(2097152),
/**
 Disables the use of stereo buffers.
*/

        NoStereoBuffers(4194304),
/**
 Specifies that the context is used for indirect rendering to a buffer.
*/

        IndirectRendering(8388608),
/**
 Disables the use of an overlay.
*/

        NoOverlay(16777216),
/**
 Disables the use of sample buffers.
*/

        NoSampleBuffers(33554432);

        FormatOption(int value) { this.value = value; }
/**
This function should return an integer value for the enum values of the enumeration that implements this interface.
*/

        public int value() { return value; }

/**
<brief>This function creates a com.trolltech.qt.opengl.QGL$FormatOptions with the specified <tt>com.trolltech.qt.opengl.QGL$FormatOption[]</tt> QGL$FormatOption values set.</brief>
*/

        public static FormatOptions createQFlags(FormatOption ... values) {
            return new FormatOptions(values);
        }
/**
<brief>Returns the QGL$FormatOption constant with the specified <tt>int</tt>.</brief>
*/

        public static FormatOption resolve(int value) {
            return (FormatOption) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 1: return DoubleBuffer;
            case 2: return DepthBuffer;
            case 4: return Rgba;
            case 8: return AlphaChannel;
            case 16: return AccumBuffer;
            case 32: return StencilBuffer;
            case 64: return StereoBuffers;
            case 128: return DirectRendering;
            case 256: return HasOverlay;
            case 512: return SampleBuffers;
            case 65536: return SingleBuffer;
            case 131072: return NoDepthBuffer;
            case 262144: return ColorIndex;
            case 524288: return NoAlphaChannel;
            case 1048576: return NoAccumBuffer;
            case 2097152: return NoStencilBuffer;
            case 4194304: return NoStereoBuffers;
            case 8388608: return IndirectRendering;
            case 16777216: return NoOverlay;
            case 33554432: return NoSampleBuffers;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }
    public static class FormatOptions extends com.trolltech.qt.QFlags<FormatOption> {
        private static final long serialVersionUID = 1L;
/**
<brief>Creates a QGL-FormatOptions with the specified <tt>com.trolltech.qt.opengl.QGL.FormatOption[]</tt>. flags set.</brief>
*/

        public FormatOptions(FormatOption ... args) { super(args); }
        public FormatOptions(int value) { setValue(value); }
    }

}
