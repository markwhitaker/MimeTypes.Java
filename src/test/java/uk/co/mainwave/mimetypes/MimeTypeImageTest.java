package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeImageTest {
    @Test
    public void testImageBmp() {
        assertEquals("image/bmp", MimeType.Image.Bmp);
    }

    @Test
    public void testImageGif() {
        assertEquals("image/gif", MimeType.Image.Gif);
    }

    @Test
    public void testImageJpeg() {
        assertEquals("image/jpeg", MimeType.Image.Jpeg);
    }

    @Test
    public void testImagePng() {
        assertEquals("image/png", MimeType.Image.Png);
    }

    @Test
    public void testImageSvgXml() {
        assertEquals("image/svg+xml", MimeType.Image.SvgXml);
    }

    @Test
    public void testImageTiff() {
        assertEquals("image/tiff", MimeType.Image.Tiff);
    }

    @Test
    public void testImageWebp() {
        assertEquals("image/webp", MimeType.Image.Webp);
    }
}
