package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeAudioTest {
    @Test
    public void testAudioMidi() {
        assertEquals("audio/midi", MimeType.Audio.MIDI);
    }

    @Test
    public void testAudioMp4() {
        assertEquals("audio/mp4", MimeType.Audio.MP4);
    }

    @Test
    public void testAudioMpeg() {
        assertEquals("audio/mpeg", MimeType.Audio.MPEG);
    }

    @Test
    public void testAudioOgg() {
        assertEquals("audio/ogg", MimeType.Audio.OGG);
    }

    @Test
    public void testAudioWav() {
        assertEquals("audio/wav", MimeType.Audio.WAV);
    }

    @Test
    public void testAudioWebm() {
        assertEquals("audio/webm", MimeType.Audio.WEBM);
    }

    @Test
    public void testAudioXAac() {
        assertEquals("audio/x-aac", MimeType.Audio.X_AAC);
    }

    @Test
    public void testAudioXAiff() {
        assertEquals("audio/x-aiff", MimeType.Audio.X_AIFF);
    }

    @Test
    public void testAudioXMpegurl() {
        assertEquals("audio/x-mpegurl", MimeType.Audio.X_MPEGURL);
    }

    @Test
    public void testAudioXMsWma() {
        assertEquals("audio/x-ms-wma", MimeType.Audio.X_MS_WMA);
    }

    @Test
    public void testAudioXWav() {
        assertEquals("audio/x-wav", MimeType.Audio.X_WAV);
    }
}
