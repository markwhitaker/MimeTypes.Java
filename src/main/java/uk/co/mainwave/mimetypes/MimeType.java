package uk.co.mainwave.mimetypes;

/**
 * MIME type constants
 */
public class MimeType {

    /**
     * MIME type constants for application types
     */
    public static class Application {
        private static final String PREFIX = "application/";

        /**
         * application/atom+xml
         */
        public static final String ATOM_XML = PREFIX + "atom+xml";

        /**
         * application/atomcat+xml
         */
        public static final String ATOMCAT_XML = PREFIX + "atomcat+xml";

        /**
         * application/ecmascript
         */
        public static final String ECMASCRIPT = PREFIX + "ecmascript";

        /**
         * application/epub+zip
         */
        public static final String EPUB_ZIP = PREFIX + "epub+zip";

        /**
         * application/gzip
         */
        public static final String GZIP = PREFIX + "gzip";

        /**
         * application/java-archive
         */
        public static final String JAVA_ARCHIVE = PREFIX + "java-archive";

        /**
         * application/javascript
         */
        public static final String JAVASCRIPT = PREFIX + "javascript";

        /**
         * application/json
         */
        public static final String JSON = PREFIX + "json";

        /**
         * application/ld+json
         */
        public static final String LD_JSON = PREFIX + "ld+json";

        /**
         * application/mp4
         */
        public static final String MP4 = PREFIX + "mp4";

        /**
         * application/msword
         */
        public static final String MSWORD = PREFIX + "msword";

        /**
         * application/octet-stream
         */
        public static final String OCTET_STREAM = PREFIX + "octet-stream";

        /**
         * application/ogg
         */
        public static final String OGG = PREFIX + "ogg";

        /**
         * application/pdf
         */
        public static final String PDF = PREFIX + "pdf";

        /**
         * application/pkcs10
         */
        public static final String PKCS_10 = PREFIX + "pkcs10";

        /**
         * application/pkcs7-mime
         */
        public static final String PKCS_7_MIME = PREFIX + "pkcs7-mime";

        /**
         * application/pkcs7-signature
         */
        public static final String PKCS_7_SIGNATURE = PREFIX + "pkcs7-signature";

        /**
         * application/pkcs8
         */
        public static final String PKCS_8 = PREFIX + "pkcs8";

        /**
         * application/postscript
         */
        public static final String POSTSCRIPT = PREFIX + "postscript";

        /**
         * application/rdf+xml
         */
        public static final String RDF_XML = PREFIX + "rdf+xml";

        /**
         * application/rss+xml
         */
        public static final String RSS_XML = PREFIX + "rss+xml";

        /**
         * application/rtf
         */
        public static final String RTF = PREFIX + "rtf";

        /**
         * application/smil+xml
         */
        public static final String SMIL_XML = PREFIX + "smil+xml";

        /**
         * application/vnd.amazon.ebook
         */
        public static final String VND_AMAZON_EBOOK = PREFIX + "vnd.amazon.ebook";

        /**
         * application/vnd.apple.installer+xml
         */
        public static final String VND_APPLE_INSTALLER_XML = PREFIX + "vnd.apple.installer+xml";

        /**
         * application/vnd.mozilla.xul+xml
         */
        public static final String VND_MOZILLA_XUL_XML = PREFIX + "vnd.mozilla.xul+xml";

        /**
         * application/vnd.ms-excel
         */
        public static final String VND_MS_EXCEL = PREFIX + "vnd.ms-excel";

        /**
         * application/vnd.ms-fontobject
         */
        public static final String VND_MS_FONTOBJECT = PREFIX + "vnd.ms-fontobject";

        /**
         * application/vnd.ms-powerpoint
         */
        public static final String VND_MS_POWERPOINT = PREFIX + "vnd.ms-powerpoint";

        /**
         * application/vnd.oasis.opendocument.presentation
         */
        public static final String VND_OASIS_OPENDOCUMENT_PRESENTATION = PREFIX + "vnd.oasis.opendocument.presentation";

        /**
         * application/vnd.oasis.opendocument.spreadsheet
         */
        public static final String VND_OASIS_OPENDOCUMENT_SPREADSHEET = PREFIX + "vnd.oasis.opendocument.spreadsheet";

        /**
         * application/vnd.oasis.opendocument.text
         */
        public static final String VND_OASIS_OPENDOCUMENT_TEXT = PREFIX + "vnd.oasis.opendocument.text";

        /**
         * application/vnd.openxmlformats-officedocument.presentationml.presentation
         */
        public static final String VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION = PREFIX +
                "vnd.openxmlformats-officedocument.presentationml.presentation";

        /**
         * application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
         */
        public static final String VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET = PREFIX +
                "vnd.openxmlformats-officedocument.spreadsheetml.sheet";

        /**
         * application/vnd.openxmlformats-officedocument.wordprocessingml.document
         */
        public static final String VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT = PREFIX +
                "vnd.openxmlformats-officedocument.wordprocessingml.document";

        /**
         * application/vnd.rar
         */
        public static final String VND_RAR = PREFIX + "vnd.rar";

        /**
         * application/vnd.visio
         */
        public static final String VND_VISIO = PREFIX + "vnd.visio";

        /**
         * application/x-7z-compressed
         */
        public static final String X_7Z_COMPRESSED = PREFIX + "x-7z-compressed";

        /**
         * application/x-abiword
         */
        public static final String X_ABIWORD = PREFIX + "x-abiword";

        /**
         * application/x-bzip
         */
        public static final String X_BZIP = PREFIX + "x-bzip";

        /**
         * application/x-bzip2
         */
        public static final String X_BZIP2 = PREFIX + "x-bzip2";

        /**
         * application/x-cdf
         */
        public static final String X_CDF = PREFIX + "x-cdf";

        /**
         * application/x-csh
         */
        public static final String X_CSH = PREFIX + "x-csh";

        /**
         * application/x-font-otf
         */
        public static final String X_FONT_OTF = PREFIX + "x-font-otf";

        /**
         * application/x-font-ttf
         */
        public static final String X_FONT_TTF = PREFIX + "x-font-ttf";

        /**
         * application/x-font-woff
         */
        public static final String X_FONT_WOFF = PREFIX + "x-font-woff";

        /**
         * application/x-freearc
         */
        public static final String X_FREEARC = PREFIX + "x-freearc";

        /**
         * application/x-httpd-php
         */
        public static final String X_HTTPD_PHP = PREFIX + "x-httpd-php";

        /**
         * application/x-pkcs12
         */
        public static final String X_PKCS_12 = PREFIX + "x-pkcs12";

        /**
         * application/x-sh
         */
        public static final String X_SH = PREFIX + "x-sh";

        /**
         * application/x-shockwave-flash
         */
        public static final String X_SHOCKWAVE_FLASH = PREFIX + "x-shockwave-flash";

        /**
         * application/x-silverlight-app
         */
        public static final String X_SILVERLIGHT_APP = PREFIX + "x-silverlight-app";

        /**
         * application/x-tar
         */
        public static final String X_TAR = PREFIX + "x-tar";

        /**
         * application/xhtml+xml
         */
        public static final String XHTML_XML = PREFIX + "xhtml+xml";

        /**
         * application/xml
         */
        public static final String XML = PREFIX + "xml";

        /**
         * application/xml-dtd
         */
        public static final String XML_DTD = PREFIX + "xml-dtd";

        /**
         * application/xslt+xml
         */
        public static final String XSLT_XML = PREFIX + "xslt+xml";

        /**
         * application/x-www-form-urlencoded
         */
        public static final String X_WWW_FORM_URLENCODED = PREFIX + "x-www-form-urlencoded";

        /**
         * application/zip
         */
        public static final String ZIP = PREFIX + "zip";

        private Application() {
        }
    }

    /**
     * MIME type constants for audio types
     */
    public static class Audio {
        private static final String PREFIX = "audio/";

        /**
         * audio/midi
         */
        public static final String MIDI = PREFIX + "midi";

        /**
         * audio/mp4
         */
        public static final String MP4 = PREFIX + "mp4";

        /**
         * audio/mpeg
         */
        public static final String MPEG = PREFIX + "mpeg";

        /**
         * audio/ogg
         */
        public static final String OGG = PREFIX + "ogg";

        /**
         * audio/wav
         */
        public static final String WAV = PREFIX + "wav";

        /**
         * audio/webm
         */
        public static final String WEBM = PREFIX + "webm";

        /**
         * audio/x-aac
         */
        public static final String X_AAC = PREFIX + "x-aac";

        /**
         * audio/x-aiff
         */
        public static final String X_AIFF = PREFIX + "x-aiff";

        /**
         * audio/x-mpegurl
         */
        public static final String X_MPEGURL = PREFIX + "x-mpegurl";

        /**
         * audio/x-ms-wma
         */
        public static final String X_MS_WMA = PREFIX + "x-ms-wma";

        /**
         * audio/x-wav
         */
        public static final String X_WAV = PREFIX + "x-wav";

        private Audio() {
        }
    }

    /**
     * MIME type constants for font types
     */
    public static class Font {
        private static final String PREFIX = "font/";

        /**
         * font/collection
         */
        public static final String COLLECTION = PREFIX + "collection";

        /**
         * font/otf
         */
        public static final String OTF = PREFIX + "otf";

        /**
         * font/sfnt
         */
        public static final String SFNT = PREFIX + "sfnt";

        /**
         * font/ttf
         */
        public static final String TTF = PREFIX + "ttf";

        /**
         * font/woff
         */
        public static final String WOFF = PREFIX + "woff";

        /**
         * font/woff2
         */
        public static final String WOFF_2 = PREFIX + "woff2";

        private Font() {
        }
    }

    /**
     * MIME type constants for image types
     */
    public static class Image {
        private static final String PREFIX = "image/";

        /**
         * image/bmp
         */
        public static final String BMP = PREFIX + "bmp";

        /**
         * image/gif
         */
        public static final String GIF = PREFIX + "gif";

        /**
         * image/jpeg
         */
        public static final String JPEG = PREFIX + "jpeg";

        /**
         * image/png
         */
        public static final String PNG = PREFIX + "png";

        /**
         * image/svg+xml
         */
        public static final String SVG_XML = PREFIX + "svg+xml";

        /**
         * image/tiff
         */
        public static final String TIFF = PREFIX + "tiff";

        /**
         * image/webp
         */
        public static final String WEBP = PREFIX + "webp";

        private Image() {
        }
    }

    /**
     * MIME type constants for multipart types
     */
    public static class Multipart {
        private static final String PREFIX = "multipart/";

        /**
         * multipart/byteranges
         */
        public static final String BYTERANGES = PREFIX + "byteranges";

        /**
         * multipart/encrypted
         */
        public static final String ENCRYPTED = PREFIX + "encrypted";

        /**
         * multipart/form-data
         */
        public static final String FORM_DATA = PREFIX + "form-data";

        /**
         * multipart/related
         */
        public static final String RELATED = PREFIX + "related";

        private Multipart() {
        }
    }

    /**
     * MIME type constants for text types
     */
    public static class Text {
        private static final String PREFIX = "text/";

        /**
         * text/css
         */
        public static final String CSS = PREFIX + "css";

        /**
         * text/csv
         */
        public static final String CSV = PREFIX + "csv";

        /**
         * text/html
         */
        public static final String HTML = PREFIX + "html";

        /**
         * text/javascript
         */
        public static final String JAVASCRIPT = PREFIX + "javascript";

        /**
         * text/plain
         */
        public static final String PLAIN = PREFIX + "plain";

        /**
         * text/richtext
         */
        public static final String RICHTEXT = PREFIX + "richtext";

        /**
         * text/sgml
         */
        public static final String SGML = PREFIX + "sgml";

        /**
         * text/xml
         */
        public static final String XML = PREFIX + "xml";

        /**
         * text/yaml
         */
        public static final String YAML = PREFIX + "yaml";

        private Text() {
        }
    }

    /**
     * MIME type constants for video types
     */
    public static class Video {
        private static final String PREFIX = "video/";

        /**
         * video/3gpp
         */
        public static final String THREE_GPP = PREFIX + "3gpp";

        /**
         * video/h264
         */
        public static final String H264 = PREFIX + "h264";

        /**
         * video/mp4
         */
        public static final String MP4 = PREFIX + "mp4";

        /**
         * video/mpeg
         */
        public static final String MPEG = PREFIX + "mpeg";

        /**
         * video/ogg
         */
        public static final String OGG = PREFIX + "ogg";

        /**
         * video/quicktime
         */
        public static final String QUICKTIME = PREFIX + "quicktime";

        /**
         * video/webm
         */
        public static final String WEBM = PREFIX + "webm";

        private Video() {
        }
    }

    private MimeType() {
    }
}
