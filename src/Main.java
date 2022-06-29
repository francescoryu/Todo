import DataHandler.DataHandler;
import gui.InputData;
import gui.List;
import gui.Welcome;

import javax.swing.*;
import java.io.IOException;

public class Main extends JFrame {
    JTabbedPane tabbedPane;
    List listPanel;
    Welcome welcome;
    InputData inputData;
    public Main() throws IOException {
        tabbedPane = new JTabbedPane();
        listPanel = new List();
        inputData = new InputData();
        welcome = new Welcome();

        tabbedPane.add(welcome, "Home");
        tabbedPane.add(listPanel, "Liste");
        tabbedPane.add(inputData, "Einfügen");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 500);
        this.add(tabbedPane);
        this.setVisible(true);
    }
    public static void main(String[] args) throws IOException {
        new Main();
        DataHandler dataHandler = new DataHandler();
    }
}
