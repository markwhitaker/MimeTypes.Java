package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeFontTest {
    @Test
    public void testFontCollection() {
        assertEquals("font/collection", MimeType.Font.COLLECTION);
    }

    @Test
    public void testFontOtf() {
        assertEquals("font/otf", MimeType.Font.OTF);
    }

    @Test
    public void testFontSfnt() {
        assertEquals("font/sfnt", MimeType.Font.SFNT);
    }

    @Test
    public void testFontTtf() {
        assertEquals("font/ttf", MimeType.Font.TTF);
    }

    @Test
    public void testFontWoff() {
        assertEquals("font/woff", MimeType.Font.WOFF);
    }

    @Test
    public void testFontWoff2() {
        assertEquals("font/woff2", MimeType.Font.WOFF_2);
    }
}
