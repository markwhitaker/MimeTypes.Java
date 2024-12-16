package uk.co.mainwave.mimetypes;

/** MIME type constants */
public class MimeType {

    /** MIME type constants for application types */
    public static class Application {
        private static final String PREFIX = "application/";

        /** <code>application/atom+xml</code> */
        public static final String ATOM_XML = PREFIX + "atom+xml";

        /** <code>application/atomcat+xml</code> */
        public static final String ATOMCAT_XML = PREFIX + "atomcat+xml";

        /** <code>application/ecmascript</code> */
        public static final String ECMASCRIPT = PREFIX + "ecmascript";

        /** <code>application/epub+zip</code> */
        public static final String EPUB_ZIP = PREFIX + "epub+zip";

        /** <code>application/gzip</code> */
        public static final String GZIP = PREFIX + "gzip";

        /** <code>application/java-archive</code> */
        public static final String JAVA_ARCHIVE = PREFIX + "java-archive";

        /** <code>application/javascript</code> */
        public static final String JAVASCRIPT = PREFIX + "javascript";

        /** <code>application/json</code> */
        public static final String JSON = PREFIX + "json";

        /** <code>application/ld+json</code> */
        public static final String LD_JSON = PREFIX + "ld+json";

        /** <code>application/mp4</code> */
        public static final String MP4 = PREFIX + "mp4";

        /** <code>application/msword</code> */
        public static final String MSWORD = PREFIX + "msword";

        /** <code>application/octet-stream</code> */
        public static final String OCTET_STREAM = PREFIX + "octet-stream";

        /** <code>application/ogg</code> */
        public static final String OGG = PREFIX + "ogg";

        /** <code>application/pdf</code> */
        public static final String PDF = PREFIX + "pdf";

        /** <code>application/pkcs10</code> */
        public static final String PKCS_10 = PREFIX + "pkcs10";

        /** <code>application/pkcs7-mime</code> */
        public static final String PKCS_7_MIME = PREFIX + "pkcs7-mime";

        /** <code>application/pkcs7-signature</code> */
        public static final String PKCS_7_SIGNATURE = PREFIX + "pkcs7-signature";

        /** <code>application/pkcs8</code> */
        public static final String PKCS_8 = PREFIX + "pkcs8";

        /** <code>application/postscript</code> */
        public static final String POSTSCRIPT = PREFIX + "postscript";

        /** <code>application/rdf+xml</code> */
        public static final String RDF_XML = PREFIX + "rdf+xml";

        /** <code>application/rss+xml</code> */
        public static final String RSS_XML = PREFIX + "rss+xml";

        /** <code>application/rtf</code> */
        public static final String RTF = PREFIX + "rtf";

        /** <code>application/smil+xml</code> */
        public static final String SMIL_XML = PREFIX + "smil+xml";

        /** <code>application/vnd.amazon.ebook</code> */
        public static final String VND_AMAZON_EBOOK = PREFIX + "vnd.amazon.ebook";

        /** <code>application/vnd.apple.installer+xml</code> */
        public static final String VND_APPLE_INSTALLER_XML = PREFIX + "vnd.apple.installer+xml";

        /** <code>application/vnd.mozilla.xul+xml</code> */
        public static final String VND_MOZILLA_XUL_XML = PREFIX + "vnd.mozilla.xul+xml";

        /** <code>application/vnd.ms-excel</code> */
        public static final String VND_MS_EXCEL = PREFIX + "vnd.ms-excel";

        /** <code>application/vnd.ms-fontobject</code> */
        public static final String VND_MS_FONTOBJECT = PREFIX + "vnd.ms-fontobject";

        /** <code>application/vnd.ms-powerpoint</code> */
        public static final String VND_MS_POWERPOINT = PREFIX + "vnd.ms-powerpoint";

        /** <code>application/vnd.oasis.opendocument.presentation</code> */
        public static final String VND_OASIS_OPENDOCUMENT_PRESENTATION = PREFIX + "vnd.oasis.opendocument.presentation";

        /** <code>application/vnd.oasis.opendocument.spreadsheet</code> */
        public static final String VND_OASIS_OPENDOCUMENT_SPREADSHEET = PREFIX + "vnd.oasis.opendocument.spreadsheet";

        /** <code>application/vnd.oasis.opendocument.text</code> */
        public static final String VND_OASIS_OPENDOCUMENT_TEXT = PREFIX + "vnd.oasis.opendocument.text";

        /** <code>application/vnd.openxmlformats-officedocument.presentationml.presentation</code> */
        public static final String VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION = PREFIX +
                "vnd.openxmlformats-officedocument.presentationml.presentation";

        /** <code>application/vnd.openxmlformats-officedocument.spreadsheetml.sheet</code> */
        public static final String VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET = PREFIX +
                "vnd.openxmlformats-officedocument.spreadsheetml.sheet";

        /** <code>application/vnd.openxmlformats-officedocument.wordprocessingml.document</code> */
        public static final String VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT = PREFIX +
                "vnd.openxmlformats-officedocument.wordprocessingml.document";

        /** <code>application/vnd.rar</code> */
        public static final String VND_RAR = PREFIX + "vnd.rar";

        /** <code>application/vnd.visio</code> */
        public static final String VND_VISIO = PREFIX + "vnd.visio";

        /** <code>application/x-7z-compressed</code> */
        public static final String X_7Z_COMPRESSED = PREFIX + "x-7z-compressed";

        /** <code>application/x-abiword</code> */
        public static final String X_ABIWORD = PREFIX + "x-abiword";

        /** <code>application/x-bzip</code> */
        public static final String X_BZIP = PREFIX + "x-bzip";

        /** <code>application/x-bzip2</code> */
        public static final String X_BZIP2 = PREFIX + "x-bzip2";

        /** <code>application/x-cdf</code> */
        public static final String X_CDF = PREFIX + "x-cdf";

        /** <code>application/x-csh</code> */
        public static final String X_CSH = PREFIX + "x-csh";

        /** <code>application/x-font-otf</code> */
        public static final String X_FONT_OTF = PREFIX + "x-font-otf";

        /** <code>application/x-font-ttf</code> */
        public static final String X_FONT_TTF = PREFIX + "x-font-ttf";

        /** <code>application/x-font-woff</code> */
        public static final String X_FONT_WOFF = PREFIX + "x-font-woff";

        /** <code>application/x-freearc</code> */
        public static final String X_FREEARC = PREFIX + "x-freearc";

        /** <code>application/x-httpd-php</code> */
        public static final String X_HTTPD_PHP = PREFIX + "x-httpd-php";

        /** <code>application/x-pkcs12</code> */
        public static final String X_PKCS_12 = PREFIX + "x-pkcs12";

        /** <code>application/x-sh</code> */
        public static final String X_SH = PREFIX + "x-sh";

        /** <code>application/x-shockwave-flash</code> */
        public static final String X_SHOCKWAVE_FLASH = PREFIX + "x-shockwave-flash";

        /** <code>application/x-silverlight-app</code> */
        public static final String X_SILVERLIGHT_APP = PREFIX + "x-silverlight-app";

        /** <code>application/x-tar</code> */
        public static final String X_TAR = PREFIX + "x-tar";

        /** <code>application/xhtml+xml</code> */
        public static final String XHTML_XML = PREFIX + "xhtml+xml";

        /** <code>application/xml</code> */
        public static final String XML = PREFIX + "xml";

        /** <code>application/xml-dtd</code> */
        public static final String XML_DTD = PREFIX + "xml-dtd";

        /** <code>application/xslt+xml</code> */
        public static final String XSLT_XML = PREFIX + "xslt+xml";

        /** <code>application/x-www-form-urlencoded</code> */
        public static final String X_WWW_FORM_URLENCODED = PREFIX + "x-www-form-urlencoded";

        /** <code>application/zip</code> */
        public static final String ZIP = PREFIX + "zip";

        private Application() {
        }
    }

    /** MIME type constants for audio types */
    public static class Audio {
        private static final String PREFIX = "audio/";

        /** <code>audio/midi</code> */
        public static final String MIDI = PREFIX + "midi";

        /** <code>audio/mp4</code> */
        public static final String MP4 = PREFIX + "mp4";

        /** <code>audio/mpeg</code> */
        public static final String MPEG = PREFIX + "mpeg";

        /** <code>audio/ogg</code> */
        public static final String OGG = PREFIX + "ogg";

        /** <code>audio/opus</code> */
        public static final String OPUS = PREFIX + "opus";

        /** <code>audio/3gpp</code> */
        public static final String THREEGPP = PREFIX + "3gpp";

        /** <code>audio/3gpp2</code> */
        public static final String THREEGPP2 = PREFIX + "3gpp2";

        /** <code>audio/wav</code> */
        public static final String WAV = PREFIX + "wav";

        /** <code>audio/webm</code> */
        public static final String WEBM = PREFIX + "webm";

        /** <code>audio/x-aac</code> */
        public static final String X_AAC = PREFIX + "x-aac";

        /** <code>audio/x-aiff</code> */
        public static final String X_AIFF = PREFIX + "x-aiff";

        /** <code>audio/x-midi</code> */
        public static final String X_MIDI = PREFIX + "x-midi";

        /** <code>audio/x-mpegurl</code> */
        public static final String X_MPEGURL = PREFIX + "x-mpegurl";

        /** <code>audio/x-ms-wma</code> */
        public static final String X_MS_WMA = PREFIX + "x-ms-wma";

        /** <code>audio/x-wav</code> */
        public static final String X_WAV = PREFIX + "x-wav";

        private Audio() {
        }
    }

    /** MIME type constants for font types */
    public static class Font {
        private static final String PREFIX = "font/";

        /** <code>font/collection</code> */
        public static final String COLLECTION = PREFIX + "collection";

        /** <code>font/otf</code> */
        public static final String OTF = PREFIX + "otf";

        /** <code>font/sfnt</code> */
        public static final String SFNT = PREFIX + "sfnt";

        /** <code>font/ttf</code> */
        public static final String TTF = PREFIX + "ttf";

        /** <code>font/woff</code> */
        public static final String WOFF = PREFIX + "woff";

        /** <code>font/woff2</code> */
        public static final String WOFF_2 = PREFIX + "woff2";

        private Font() {
        }
    }

    /** MIME type constants for image types */
    public static class Image {
        private static final String PREFIX = "image/";

        /** <code>image/avif</code> */
        public static final String AVIF = PREFIX + "avif";

        /** <code>image/bmp</code> */
        public static final String BMP = PREFIX + "bmp";

        /** <code>image/gif</code> */
        public static final String GIF = PREFIX + "gif";

        /** <code>image/jpeg</code> */
        public static final String JPEG = PREFIX + "jpeg";

        /** <code>image/png</code> */
        public static final String PNG = PREFIX + "png";

        /** <code>image/svg+xml</code> */
        public static final String SVG_XML = PREFIX + "svg+xml";

        /** <code>image/tiff</code> */
        public static final String TIFF = PREFIX + "tiff";

        /** <code>image/vnd.microsoft.icon</code> */
        public static final String VND_MICROSOFT_ICON = PREFIX + "vnd.microsoft.icon";

        /** <code>image/webp</code> */
        public static final String WEBP = PREFIX + "webp";

        private Image() {
        }
    }

    /** MIME type constants for multipart types */
    public static class Multipart {
        private static final String PREFIX = "multipart/";

        /** <code>multipart/byteranges</code> */
        public static final String BYTERANGES = PREFIX + "byteranges";

        /** <code>multipart/encrypted</code> */
        public static final String ENCRYPTED = PREFIX + "encrypted";

        /** <code>multipart/form-data</code> */
        public static final String FORM_DATA = PREFIX + "form-data";

        /** <code>multipart/related</code> */
        public static final String RELATED = PREFIX + "related";

        private Multipart() {
        }
    }

    /** MIME type constants for text types */
    public static class Text {
        private static final String PREFIX = "text/";

        /** <code>text/calendar</code> */
        public static final String CALENDAR = PREFIX + "calendar";

        /** <code>text/css</code> */
        public static final String CSS = PREFIX + "css";

        /** <code>text/csv</code> */
        public static final String CSV = PREFIX + "csv";

        /** <code>text/html</code> */
        public static final String HTML = PREFIX + "html";

        /** <code>text/javascript</code> */
        public static final String JAVASCRIPT = PREFIX + "javascript";

        /** <code>text/plain</code> */
        public static final String PLAIN = PREFIX + "plain";

        /** <code>text/richtext</code> */
        public static final String RICHTEXT = PREFIX + "richtext";

        /** <code>text/sgml</code> */
        public static final String SGML = PREFIX + "sgml";

        /** <code>text/xml</code> */
        public static final String XML = PREFIX + "xml";

        /** <code>text/yaml</code> */
        public static final String YAML = PREFIX + "yaml";

        private Text() {
        }
    }

    /** MIME type constants for video types */
    public static class Video {
        private static final String PREFIX = "video/";

        /** <code>video/h264</code> */
        public static final String H264 = PREFIX + "h264";

        /** <code>video/mp2t</code> */
        public static final String MP2T = PREFIX + "mp2t";

        /** <code>video/mp4</code> */
        public static final String MP4 = PREFIX + "mp4";

        /** <code>video/mpeg</code> */
        public static final String MPEG = PREFIX + "mpeg";

        /** <code>video/ogg</code> */
        public static final String OGG = PREFIX + "ogg";

        /** <code>video/quicktime</code> */
        public static final String QUICKTIME = PREFIX + "quicktime";

        /** <code>video/3gpp</code> */
        @Deprecated
        public static final String THREE_GPP = PREFIX + "3gpp";

        /** <code>video/3gpp</code> */
        public static final String THREEGPP = PREFIX + "3gpp";

        /** <code>video/3gpp</code> */
        public static final String THREEGPP2 = PREFIX + "3gpp2";

        /** <code>video/webm</code> */
        public static final String WEBM = PREFIX + "webm";

        /** <code>video/x-msvideo</code> */
        public static final String X_MSVIDEO = PREFIX + "x-msvideo";

        private Video() {
        }
    }

    private MimeType() {
    }
}
