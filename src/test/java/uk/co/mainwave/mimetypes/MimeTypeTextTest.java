package uk.co.mainwave.mimetypes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MimeTypeTextTest {
    @Test
    public void testTextCss() {
        assertEquals("text/css", MimeType.Text.Css);
    }

    @Test
    public void testTextCsv() {
        assertEquals("text/csv", MimeType.Text.Csv);
    }

    @Test
    public void testTextHtml() {
        assertEquals("text/html", MimeType.Text.Html);
    }

    @Test
    public void testTextJavascript() {
        assertEquals("text/javascript", MimeType.Text.Javascript);
    }

    @Test
    public void testTextPlain() {
        assertEquals("text/plain", MimeType.Text.Plain);
    }

    @Test
    public void testTextRichtext() {
        assertEquals("text/richtext", MimeType.Text.Richtext);
    }

    @Test
    public void testTextSgml() {
        assertEquals("text/sgml", MimeType.Text.Sgml);
    }

    @Test
    public void testTextXml() {
        assertEquals("text/xml", MimeType.Text.Xml);
    }

    @Test
    public void testTextYaml() {
        assertEquals("text/yaml", MimeType.Text.Yaml);
    }
}
