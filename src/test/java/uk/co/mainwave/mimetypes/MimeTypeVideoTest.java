package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeVideoTest {
    @Test
    public void testVideoThreegpp() {
        assertEquals("video/3gpp", MimeType.Video.THREE_GPP);
    }

    @Test
    public void testVideoH264() {
        assertEquals("video/h264", MimeType.Video.H264);
    }

    @Test
    public void testVideoMp4() {
        assertEquals("video/mp4", MimeType.Video.MP4);
    }

    @Test
    public void testVideoMpeg() {
        assertEquals("video/mpeg", MimeType.Video.MPEG);
    }

    @Test
    public void testVideoOgg() {
        assertEquals("video/ogg", MimeType.Video.OGG);
    }

    @Test
    public void testVideoQuicktime() {
        assertEquals("video/quicktime", MimeType.Video.QUICKTIME);
    }

    @Test
    public void testVideoWebm() {
        assertEquals("video/webm", MimeType.Video.WEBM);
    }
}
