package uk.co.mainwave.mimetypes;

/**
 * MIME type constants
 */
public class MimeType {

    /**
     * MIME type constants for application types
     */
    public static class Application {
        private static final String prefix = "application/";

        /**
         * application/atom+xml
         */
        public static final String AtomXml = prefix + "atom+xml";

        /**
         * application/atomcat+xml
         */
        public static final String AtomcatXml = prefix + "atomcat+xml";

        /**
         * application/ecmascript
         */
        public static final String Ecmascript = prefix + "ecmascript";

        /**
         * application/java-archive
         */
        public static final String JavaArchive = prefix + "java-archive";

        /**
         * application/javascript
         */
        public static final String Javascript = prefix + "javascript";

        /**
         * application/json
         */
        public static final String Json = prefix + "json";

        /**
         * application/mp4
         */
        public static final String Mp4 = prefix + "mp4";

        /**
         * application/octet-stream
         */
        public static final String OctetStream = prefix + "octet-stream";

        /**
         * application/pdf
         */
        public static final String Pdf = prefix + "pdf";

        /**
         * application/pkcs10
         */
        public static final String Pkcs10 = prefix + "pkcs10";

        /**
         * application/pkcs7-mime
         */
        public static final String Pkcs7Mime = prefix + "pkcs7-mime";

        /**
         * application/pkcs7-signature
         */
        public static final String Pkcs7Signature = prefix + "pkcs7-signature";

        /**
         * application/pkcs8
         */
        public static final String Pkcs8 = prefix + "pkcs8";

        /**
         * application/postscript
         */
        public static final String Postscript = prefix + "postscript";

        /**
         * application/rdf+xml
         */
        public static final String RdfXml = prefix + "rdf+xml";

        /**
         * application/rss+xml
         */
        public static final String RssXml = prefix + "rss+xml";

        /**
         * application/rtf
         */
        public static final String Rtf = prefix + "rtf";

        /**
         * application/smil+xml
         */
        public static final String SmilXml = prefix + "smil+xml";

        /**
         * application/x-font-otf
         */
        public static final String XFontOtf = prefix + "x-font-otf";

        /**
         * application/x-font-ttf
         */
        public static final String XFontTtf = prefix + "x-font-ttf";

        /**
         * application/x-font-woff
         */
        public static final String XFontWoff = prefix + "x-font-woff";

        /**
         * application/x-pkcs12
         */
        public static final String XPkcs12 = prefix + "x-pkcs12";

        /**
         * application/x-shockwave-flash
         */
        public static final String XShockwaveFlash = prefix + "x-shockwave-flash";

        /**
         * application/x-silverlight-app
         */
        public static final String XSilverlightApp = prefix + "x-silverlight-app";

        /**
         * application/xhtml+xml
         */
        public static final String XhtmlXml = prefix + "xhtml+xml";

        /**
         * application/xml
         */
        public static final String Xml = prefix + "xml";

        /**
         * application/xml-dtd
         */
        public static final String XmlDtd = prefix + "xml-dtd";

        /**
         * application/xslt+xml
         */
        public static final String XsltXml = prefix + "xslt+xml";

        /**
         * application/x-www-form-urlencoded
         */
        public static final String XWwwFormUrlencoded = prefix + "x-www-form-urlencoded";

        /**
         * application/zip
         */
        public static final String Zip = prefix + "zip";

        private Application() {
        }
    }

    /**
     * MIME type constants for audio types
     */
    public static class Audio {
        private static final String prefix = "audio/";

        /**
         * audio/midi
         */
        public static final String Midi = prefix + "midi";

        /**
         * audio/mp4
         */
        public static final String Mp4 = prefix + "mp4";

        /**
         * audio/mpeg
         */
        public static final String Mpeg = prefix + "mpeg";

        /**
         * audio/ogg
         */
        public static final String Ogg = prefix + "ogg";

        /**
         * audio/wav
         */
        public static final String Wav = prefix + "wav";

        /**
         * audio/webm
         */
        public static final String Webm = prefix + "webm";

        /**
         * audio/x-aac
         */
        public static final String XAac = prefix + "x-aac";

        /**
         * audio/x-aiff
         */
        public static final String XAiff = prefix + "x-aiff";

        /**
         * audio/x-mpegurl
         */
        public static final String XMpegurl = prefix + "x-mpegurl";

        /**
         * audio/x-ms-wma
         */
        public static final String XMsWma = prefix + "x-ms-wma";

        /**
         * audio/x-wav
         */
        public static final String XWav = prefix + "x-wav";

        private Audio() {
        }
    }

    /**
     * MIME type constants for font types
     */
    public static class Font {
        private static final String prefix = "font/";

        /**
         * font/collection
         */
        public static final String Collection = prefix + "collection";

        /**
         * font/otf
         */
        public static final String Otf = prefix + "otf";

        /**
         * font/sfnt
         */
        public static final String Sfnt = prefix + "sfnt";

        /**
         * font/ttf
         */
        public static final String Ttf = prefix + "ttf";

        /**
         * font/woff
         */
        public static final String Woff = prefix + "woff";

        /**
         * font/woff2
         */
        public static final String Woff2 = prefix + "woff2";

        private Font() {
        }
    }

    /**
     * MIME type constants for image types
     */
    public static class Image {
        private static final String prefix = "image/";

        /**
         * image/bmp
         */
        public static final String Bmp = prefix + "bmp";

        /**
         * image/gif
         */
        public static final String Gif = prefix + "gif";

        /**
         * image/jpeg
         */
        public static final String Jpeg = prefix + "jpeg";

        /**
         * image/png
         */
        public static final String Png = prefix + "png";

        /**
         * image/svg+xml
         */
        public static final String SvgXml = prefix + "svg+xml";

        /**
         * image/tiff
         */
        public static final String Tiff = prefix + "tiff";

        /**
         * image/webp
         */
        public static final String Webp = prefix + "webp";

        private Image() {
        }
    }

    /**
     * MIME type constants for multipart types
     */
    public static class Multipart {
        private static final String prefix = "multipart/";

        /**
         * multipart/byteranges
         */
        public static final String Byteranges = prefix + "byteranges";

        /**
         * multipart/encrypted
         */
        public static final String Encrypted = prefix + "encrypted";

        /**
         * multipart/form-data
         */
        public static final String FormData = prefix + "form-data";

        /**
         * multipart/related
         */
        public static final String Related = prefix + "related";

        private Multipart() {
        }
    }

    /**
     * MIME type constants for text types
     */
    public static class Text {
        private static final String prefix = "text/";

        /**
         * text/css
         */
        public static final String Css = prefix + "css";

        /**
         * text/csv
         */
        public static final String Csv = prefix + "csv";

        /**
         * text/html
         */
        public static final String Html = prefix + "html";

        /**
         * text/javascript
         */
        public static final String Javascript = prefix + "javascript";

        /**
         * text/plain
         */
        public static final String Plain = prefix + "plain";

        /**
         * text/richtext
         */
        public static final String Richtext = prefix + "richtext";

        /**
         * text/sgml
         */
        public static final String Sgml = prefix + "sgml";

        /**
         * text/xml
         */
        public static final String Xml = prefix + "xml";

        /**
         * text/yaml
         */
        public static final String Yaml = prefix + "yaml";

        private Text() {
        }
    }

    /**
     * MIME type constants for video types
     */
    public static class Video {
        private static final String prefix = "video/";

        /**
         * video/3gpp
         */
        public static final String Threegpp = prefix + "3gpp";

        /**
         * video/h264
         */
        public static final String H264 = prefix + "h264";

        /**
         * video/mp4
         */
        public static final String Mp4 = prefix + "mp4";

        /**
         * video/mpeg
         */
        public static final String Mpeg = prefix + "mpeg";

        /**
         * video/ogg
         */
        public static final String Ogg = prefix + "ogg";

        /**
         * video/quicktime
         */
        public static final String Quicktime = prefix + "quicktime";

        /**
         * video/webm
         */
        public static final String Webm = prefix + "webm";

        private Video() {
        }
    }

    private MimeType() {
    }
}
