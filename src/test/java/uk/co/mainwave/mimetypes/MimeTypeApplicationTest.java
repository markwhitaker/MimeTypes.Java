package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeApplicationTest {
    @Test
    public void testApplicationAtomXml() {
        assertEquals("application/atom+xml", MimeType.Application.ATOM_XML);
    }

    @Test
    public void testApplicationAtomcatXml() {
        assertEquals("application/atomcat+xml", MimeType.Application.ATOMCAT_XML);
    }

    @Test
    public void testApplicationEcmascript() {
        assertEquals("application/ecmascript", MimeType.Application.ECMASCRIPT);
    }

    @Test
    public void testApplicationEpubZip() {
        assertEquals("application/epub+zip", MimeType.Application.EPUB_ZIP);
    }

    @Test
    public void testApplicationGzip() {
        assertEquals("application/gzip", MimeType.Application.GZIP);
    }

    @Test
    public void testApplicationJavaArchive() {
        assertEquals("application/java-archive", MimeType.Application.JAVA_ARCHIVE);
    }

    @Test
    public void testApplicationJavascript() {
        assertEquals("application/javascript", MimeType.Application.JAVASCRIPT);
    }

    @Test
    public void testApplicationJson() {
        assertEquals("application/json", MimeType.Application.JSON);
    }

    @Test
    public void testApplicationLdJson() {
        assertEquals("application/ld+json", MimeType.Application.LD_JSON);
    }

    @Test
    public void testApplicationMp4() {
        assertEquals("application/mp4", MimeType.Application.MP4);
    }

    @Test
    public void testApplicationMsword() {
        assertEquals("application/msword", MimeType.Application.MSWORD);
    }

    @Test
    public void testApplicationOctetStream() {
        assertEquals("application/octet-stream", MimeType.Application.OCTET_STREAM);
    }

    @Test
    public void testApplicationOgg() {
        assertEquals("application/ogg", MimeType.Application.OGG);
    }

    @Test
    public void testApplicationPdf() {
        assertEquals("application/pdf", MimeType.Application.PDF);
    }

    @Test
    public void testApplicationPkcs10() {
        assertEquals("application/pkcs10", MimeType.Application.PKCS_10);
    }

    @Test
    public void testApplicationPkcs7Mime() {
        assertEquals("application/pkcs7-mime", MimeType.Application.PKCS_7_MIME);
    }

    @Test
    public void testApplicationPkcs7Signature() {
        assertEquals("application/pkcs7-signature", MimeType.Application.PKCS_7_SIGNATURE);
    }

    @Test
    public void testApplicationPkcs8() {
        assertEquals("application/pkcs8", MimeType.Application.PKCS_8);
    }

    @Test
    public void testApplicationPostscript() {
        assertEquals("application/postscript", MimeType.Application.POSTSCRIPT);
    }

    @Test
    public void testApplicationRdfXml() {
        assertEquals("application/rdf+xml", MimeType.Application.RDF_XML);
    }

    @Test
    public void testApplicationRssXml() {
        assertEquals("application/rss+xml", MimeType.Application.RSS_XML);
    }

    @Test
    public void testApplicationRtf() {
        assertEquals("application/rtf", MimeType.Application.RTF);
    }

    @Test
    public void testApplicationSmilXml() {
        assertEquals("application/smil+xml", MimeType.Application.SMIL_XML);
    }

    @Test
    public void testApplicationVndAmazonEbook() {
        assertEquals("application/vnd.amazon.ebook", MimeType.Application.VND_AMAZON_EBOOK);
    }

    @Test
    public void testApplicationVndAppleInstallerXml() {
        assertEquals("application/vnd.apple.installer+xml", MimeType.Application.VND_APPLE_INSTALLER_XML);
    }

    @Test
    public void testApplicationVndMozillaXulXml() {
        assertEquals("application/vnd.mozilla.xul+xml", MimeType.Application.VND_MOZILLA_XUL_XML);
    }

    @Test
    public void testApplicationVndMsExcel() {
        assertEquals("application/vnd.ms-excel", MimeType.Application.VND_MS_EXCEL);
    }

    @Test
    public void testApplicationVndMsFontobject() {
        assertEquals("application/vnd.ms-fontobject", MimeType.Application.VND_MS_FONTOBJECT);
    }

    @Test
    public void testApplicationVndMsPowerpoint() {
        assertEquals("application/vnd.ms-powerpoint", MimeType.Application.VND_MS_POWERPOINT);
    }

    @Test
    public void testApplicationVndOasisOpendocumentPresentation() {
        assertEquals("application/vnd.oasis.opendocument.presentation",
                MimeType.Application.VND_OASIS_OPENDOCUMENT_PRESENTATION);
    }

    @Test
    public void testApplicationVndOasisOpendocumentSpreadsheet() {
        assertEquals("application/vnd.oasis.opendocument.spreadsheet",
                MimeType.Application.VND_OASIS_OPENDOCUMENT_SPREADSHEET);
    }

    @Test
    public void testApplicationVndOasisOpendocumentText() {
        assertEquals("application/vnd.oasis.opendocument.text",
                MimeType.Application.VND_OASIS_OPENDOCUMENT_TEXT);
    }

    @Test
    public void testApplicationVndOpenxmlformatsOfficedocumentPresentationmlPresentation() {
        assertEquals("application/vnd.openxmlformats-officedocument.presentationml.presentation",
                MimeType.Application.VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION);
    }

    @Test
    public void testApplicationVndOpenxmlformatsOfficedocumentSpreadsheetmlSheet() {
        assertEquals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                MimeType.Application.VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET);
    }

    @Test
    public void testApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument() {
        assertEquals("application/vnd.openxmlformats-officedocument.wordprocessingml.document",
                MimeType.Application.VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT);
    }

    @Test
    public void testApplicationVndRar() {
        assertEquals("application/vnd.rar", MimeType.Application.VND_RAR);
    }

    @Test
    public void testApplicationVndVisio() {
        assertEquals("application/vnd.visio", MimeType.Application.VND_VISIO);
    }

    @Test
    public void testApplicationX7zCompressed() {
        assertEquals("application/x-7z-compressed", MimeType.Application.X_7Z_COMPRESSED);
    }

    @Test
    public void testApplicationXAbiword() {
        assertEquals("application/x-abiword", MimeType.Application.X_ABIWORD);
    }

    @Test
    public void testApplicationXBzip() {
        assertEquals("application/x-bzip", MimeType.Application.X_BZIP);
    }

    @Test
    public void testApplicationXBzip2() {
        assertEquals("application/x-bzip2", MimeType.Application.X_BZIP2);
    }

    @Test
    public void testApplicationXCdf() {
        assertEquals("application/x-cdf", MimeType.Application.X_CDF);
    }

    @Test
    public void testApplicationXCsh() {
        assertEquals("application/x-csh", MimeType.Application.X_CSH);
    }

    @Test
    public void testApplicationXFontOtf() {
        assertEquals("application/x-font-otf", MimeType.Application.X_FONT_OTF);
    }

    @Test
    public void testApplicationXFontTtf() {
        assertEquals("application/x-font-ttf", MimeType.Application.X_FONT_TTF);
    }

    @Test
    public void testApplicationXFontWoff() {
        assertEquals("application/x-font-woff", MimeType.Application.X_FONT_WOFF);
    }

    @Test
    public void testApplicationXFreearc() {
        assertEquals("application/x-freearc", MimeType.Application.X_FREEARC);
    }

    @Test
    public void testApplicationXHttpdPhp() {
        assertEquals("application/x-httpd-php", MimeType.Application.X_HTTPD_PHP);
    }

    @Test
    public void testApplicationXPkcs12() {
        assertEquals("application/x-pkcs12", MimeType.Application.X_PKCS_12);
    }

    @Test
    public void testApplicationXSh() {
        assertEquals("application/x-sh", MimeType.Application.X_SH);
    }

    @Test
    public void testApplicationXShockwaveFlash() {
        assertEquals("application/x-shockwave-flash", MimeType.Application.X_SHOCKWAVE_FLASH);
    }

    @Test
    public void testApplicationXSilverlightApp() {
        assertEquals("application/x-silverlight-app", MimeType.Application.X_SILVERLIGHT_APP);
    }

    @Test
    public void testApplicationXTar() {
        assertEquals("application/x-tar", MimeType.Application.X_TAR);
    }

    @Test
    public void testApplicationXhtmlXml() {
        assertEquals("application/xhtml+xml", MimeType.Application.XHTML_XML);
    }

    @Test
    public void testApplicationXml() {
        assertEquals("application/xml", MimeType.Application.XML);
    }

    @Test
    public void testApplicationXmlDtd() {
        assertEquals("application/xml-dtd", MimeType.Application.XML_DTD);
    }

    @Test
    public void testApplicationXsltXml() {
        assertEquals("application/xslt+xml", MimeType.Application.XSLT_XML);
    }

    @Test
    public void testApplicationXWwwFormUrlencoded() {
        assertEquals("application/x-www-form-urlencoded", MimeType.Application.X_WWW_FORM_URLENCODED);
    }

    @Test
    public void testApplicationZip() {
        assertEquals("application/zip", MimeType.Application.ZIP);
    }
}