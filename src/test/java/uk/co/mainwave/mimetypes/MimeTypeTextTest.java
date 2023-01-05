package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeTextTest {
    @Test
    public void testTextCalendar() {
        assertEquals("text/calendar", MimeType.Text.CALENDAR);
    }

    @Test
    public void testTextCss() {
        assertEquals("text/css", MimeType.Text.CSS);
    }

    @Test
    public void testTextCsv() {
        assertEquals("text/csv", MimeType.Text.CSV);
    }

    @Test
    public void testTextHtml() {
        assertEquals("text/html", MimeType.Text.HTML);
    }

    @Test
    public void testTextJavascript() {
        assertEquals("text/javascript", MimeType.Text.JAVASCRIPT);
    }

    @Test
    public void testTextPlain() {
        assertEquals("text/plain", MimeType.Text.PLAIN);
    }

    @Test
    public void testTextRichtext() {
        assertEquals("text/richtext", MimeType.Text.RICHTEXT);
    }

    @Test
    public void testTextSgml() {
        assertEquals("text/sgml", MimeType.Text.SGML);
    }

    @Test
    public void testTextXml() {
        assertEquals("text/xml", MimeType.Text.XML);
    }

    @Test
    public void testTextYaml() {
        assertEquals("text/yaml", MimeType.Text.YAML);
    }
}
