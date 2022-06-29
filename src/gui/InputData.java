package gui;

import DataHandler.DataHandler;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class InputData extends JPanel {
    JButton button;
    DataHandler dataHandler;

    JPanel textAreaPanel;
    JPanel buttonPanel;

    public InputData() throws IOException {
        this.setLayout(new BorderLayout());
        Path file = Path.of("C:\\Users\\Francesco Ryu\\Desktop\\Todo\\src\\data.txt");
        String str = Files.readString(file);

        dataHandler = new DataHandler();
        button = new JButton("Speichern");
        JTextArea area = new JTextArea();
        area.setText(str);
        area.setBorder(new MatteBorder(2, 2, 2, 2, Color.BLACK));
        area.setPreferredSize(new Dimension(500, 300));

        textAreaPanel = new JPanel();
        textAreaPanel.add(area);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataHandler.writeFile(area.getText());
            }
        });

        buttonPanel = new JPanel();
        buttonPanel.add(button);

        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(textAreaPanel, BorderLayout.CENTER);
    }

}
