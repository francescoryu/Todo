package gui;

import DataHandler.DataHandler;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Welcome extends JPanel {
    JLabel welcomeLabel;
    JButton button;
    DataHandler dataHandler;

    JPanel textAreaPanel;
    JPanel buttonPanel;

    public Welcome() throws IOException {
        Font f4 = new Font(Font.DIALOG_INPUT, Font.BOLD, 50);
        welcomeLabel = new JLabel("WELCOME");
        welcomeLabel.setFont(f4);


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
        textAreaPanel.setLayout(new BorderLayout());
        textAreaPanel.add(welcomeLabel);
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
