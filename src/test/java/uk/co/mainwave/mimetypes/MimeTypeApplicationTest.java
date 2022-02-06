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
    public void testApplicationMp4() {
        assertEquals("application/mp4", MimeType.Application.MP4);
    }

    @Test
    public void testApplicationOctetStream() {
        assertEquals("application/octet-stream", MimeType.Application.OCTET_STREAM);
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
    public void testApplicationXPkcs12() {
        assertEquals("application/x-pkcs12", MimeType.Application.X_PKCS_12);
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