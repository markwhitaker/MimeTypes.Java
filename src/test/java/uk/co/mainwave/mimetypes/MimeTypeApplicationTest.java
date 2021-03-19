package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeApplicationTest {
    @Test
    public void testApplicationAtomXml() {
        assertEquals("application/atom+xml", MimeType.Application.AtomXml);
    }

    @Test
    public void testApplicationAtomcatXml() {
        assertEquals("application/atomcat+xml", MimeType.Application.AtomcatXml);
    }

    @Test
    public void testApplicationEcmascript() {
        assertEquals("application/ecmascript", MimeType.Application.Ecmascript);
    }

    @Test
    public void testApplicationJavaArchive() {
        assertEquals("application/java-archive", MimeType.Application.JavaArchive);
    }

    @Test
    public void testApplicationJavascript() {
        assertEquals("application/javascript", MimeType.Application.Javascript);
    }

    @Test
    public void testApplicationJson() {
        assertEquals("application/json", MimeType.Application.Json);
    }

    @Test
    public void testApplicationMp4() {
        assertEquals("application/mp4", MimeType.Application.Mp4);
    }

    @Test
    public void testApplicationOctetStream() {
        assertEquals("application/octet-stream", MimeType.Application.OctetStream);
    }

    @Test
    public void testApplicationPdf() {
        assertEquals("application/pdf", MimeType.Application.Pdf);
    }

    @Test
    public void testApplicationPkcs10() {
        assertEquals("application/pkcs10", MimeType.Application.Pkcs10);
    }

    @Test
    public void testApplicationPkcs7Mime() {
        assertEquals("application/pkcs7-mime", MimeType.Application.Pkcs7Mime);
    }

    @Test
    public void testApplicationPkcs7Signature() {
        assertEquals("application/pkcs7-signature", MimeType.Application.Pkcs7Signature);
    }

    @Test
    public void testApplicationPkcs8() {
        assertEquals("application/pkcs8", MimeType.Application.Pkcs8);
    }

    @Test
    public void testApplicationPostscript() {
        assertEquals("application/postscript", MimeType.Application.Postscript);
    }

    @Test
    public void testApplicationRdfXml() {
        assertEquals("application/rdf+xml", MimeType.Application.RdfXml);
    }

    @Test
    public void testApplicationRssXml() {
        assertEquals("application/rss+xml", MimeType.Application.RssXml);
    }

    @Test
    public void testApplicationRtf() {
        assertEquals("application/rtf", MimeType.Application.Rtf);
    }

    @Test
    public void testApplicationSmilXml() {
        assertEquals("application/smil+xml", MimeType.Application.SmilXml);
    }

    @Test
    public void testApplicationXFontOtf() {
        assertEquals("application/x-font-otf", MimeType.Application.XFontOtf);
    }

    @Test
    public void testApplicationXFontTtf() {
        assertEquals("application/x-font-ttf", MimeType.Application.XFontTtf);
    }

    @Test
    public void testApplicationXFontWoff() {
        assertEquals("application/x-font-woff", MimeType.Application.XFontWoff);
    }

    @Test
    public void testApplicationXPkcs12() {
        assertEquals("application/x-pkcs12", MimeType.Application.XPkcs12);
    }

    @Test
    public void testApplicationXShockwaveFlash() {
        assertEquals("application/x-shockwave-flash", MimeType.Application.XShockwaveFlash);
    }

    @Test
    public void testApplicationXSilverlightApp() {
        assertEquals("application/x-silverlight-app", MimeType.Application.XSilverlightApp);
    }

    @Test
    public void testApplicationXhtmlXml() {
        assertEquals("application/xhtml+xml", MimeType.Application.XhtmlXml);
    }

    @Test
    public void testApplicationXml() {
        assertEquals("application/xml", MimeType.Application.Xml);
    }

    @Test
    public void testApplicationXmlDtd() {
        assertEquals("application/xml-dtd", MimeType.Application.XmlDtd);
    }

    @Test
    public void testApplicationXsltXml() {
        assertEquals("application/xslt+xml", MimeType.Application.XsltXml);
    }

    @Test
    public void testApplicationXWwwFormUrlencoded() {
        assertEquals("application/x-www-form-urlencoded", MimeType.Application.XWwwFormUrlencoded);
    }

    @Test
    public void testApplicationZip() {
        assertEquals("application/zip", MimeType.Application.Zip);
    }
}