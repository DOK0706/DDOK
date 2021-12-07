package ForJAVAProject;

import java.awt.*;
import java.io.IOException;

public class FontTest {
    public static void main(String[] args) throws IOException {
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts = e.getAllFonts();
        for (Font font : fonts) {
            System.out.println(font.getFontName());
        }
    }
}

