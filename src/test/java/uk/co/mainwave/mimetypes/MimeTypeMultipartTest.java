package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeMultipartTest {
    @Test
    public void testMultipartByteranges() {
        assertEquals("multipart/byteranges", MimeType.Multipart.Byteranges);
    }

    @Test
    public void testMultipartEncrypted() {
        assertEquals("multipart/encrypted", MimeType.Multipart.Encrypted);
    }

    @Test
    public void testMultipartFormData() {
        assertEquals("multipart/form-data", MimeType.Multipart.FormData);
    }

    @Test
    public void testMultipartRelated() {
        assertEquals("multipart/related", MimeType.Multipart.Related);
    }
}
