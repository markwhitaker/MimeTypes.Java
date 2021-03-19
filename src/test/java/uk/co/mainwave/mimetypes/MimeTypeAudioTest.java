package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeAudioTest {
    @Test
    public void testAudioMidi() {
        assertEquals("audio/midi", MimeType.Audio.Midi);
    }

    @Test
    public void testAudioMp4() {
        assertEquals("audio/mp4", MimeType.Audio.Mp4);
    }

    @Test
    public void testAudioMpeg() {
        assertEquals("audio/mpeg", MimeType.Audio.Mpeg);
    }

    @Test
    public void testAudioOgg() {
        assertEquals("audio/ogg", MimeType.Audio.Ogg);
    }

    @Test
    public void testAudioWav() {
        assertEquals("audio/wav", MimeType.Audio.Wav);
    }

    @Test
    public void testAudioWebm() {
        assertEquals("audio/webm", MimeType.Audio.Webm);
    }

    @Test
    public void testAudioXAac() {
        assertEquals("audio/x-aac", MimeType.Audio.XAac);
    }

    @Test
    public void testAudioXAiff() {
        assertEquals("audio/x-aiff", MimeType.Audio.XAiff);
    }

    @Test
    public void testAudioXMpegurl() {
        assertEquals("audio/x-mpegurl", MimeType.Audio.XMpegurl);
    }

    @Test
    public void testAudioXMsWma() {
        assertEquals("audio/x-ms-wma", MimeType.Audio.XMsWma);
    }

    @Test
    public void testAudioXWav() {
        assertEquals("audio/x-wav", MimeType.Audio.XWav);
    }
}
