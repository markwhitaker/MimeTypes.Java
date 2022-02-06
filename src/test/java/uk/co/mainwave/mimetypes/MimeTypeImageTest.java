package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeImageTest {
    @Test
    public void testImageBmp() {
        assertEquals("image/bmp", MimeType.Image.BMP);
    }

    @Test
    public void testImageGif() {
        assertEquals("image/gif", MimeType.Image.GIF);
    }

    @Test
    public void testImageJpeg() {
        assertEquals("image/jpeg", MimeType.Image.JPEG);
    }

    @Test
    public void testImagePng() {
        assertEquals("image/png", MimeType.Image.PNG);
    }

    @Test
    public void testImageSvgXml() {
        assertEquals("image/svg+xml", MimeType.Image.SVG_XML);
    }

    @Test
    public void testImageTiff() {
        assertEquals("image/tiff", MimeType.Image.TIFF);
    }

    @Test
    public void testImageWebp() {
        assertEquals("image/webp", MimeType.Image.WEBP);
    }
}
