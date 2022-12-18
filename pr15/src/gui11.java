import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class gui11 extends JFrame {
        public gui11()
        {
            super("Calculator");
            setBounds(100, 100, 265, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            add(new JPanelApp());
            setVisible(true);
        }

    public static void main(String[] args)
    {
        new gui11();
    }
}



