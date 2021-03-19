package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeFontTest {
    @Test
    public void testFontCollection() {
        assertEquals("font/collection", MimeType.Font.Collection);
    }

    @Test
    public void testFontOtf() {
        assertEquals("font/otf", MimeType.Font.Otf);
    }

    @Test
    public void testFontSfnt() {
        assertEquals("font/sfnt", MimeType.Font.Sfnt);
    }

    @Test
    public void testFontTtf() {
        assertEquals("font/ttf", MimeType.Font.Ttf);
    }

    @Test
    public void testFontWoff() {
        assertEquals("font/woff", MimeType.Font.Woff);
    }

    @Test
    public void testFontWoff2() {
        assertEquals("font/woff2", MimeType.Font.Woff2);
    }
}
