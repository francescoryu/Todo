package gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class List extends JPanel {
    public List() throws IOException {
        Path file = Path.of("C:\\Users\\Francesco Ryu\\Desktop\\Todo\\src\\data.txt");
        String str = Files.readString(file);
        JTextArea textDisplay = new JTextArea();
        textDisplay.setText(str);
        textDisplay.setBorder(new MatteBorder(2, 2, 2, 2, Color.BLACK));
        this.add(textDisplay);
    }
}
