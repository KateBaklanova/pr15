import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class gui1 {


        JFrame g;


        public gui1()
        {
            // super("practice 15");
            g=new JFrame("Menu Example");
            // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Создание строки главного меню
            JMenuBar menuBar = new JMenuBar();

            JMenu fileMenu1 = new JMenu("File");


            JMenu newMenu1 = new JMenu("Сохранить");

            fileMenu1.add(newMenu1);
            JMenu newMenu11 = new JMenu("Выйти");
            fileMenu1.add(newMenu11);
            JMenu newMenu111 = new JMenu("Правка");
            fileMenu1.add(newMenu111);

            JMenuItem txtFileItem1 = new JMenuItem("Копировать ");
            newMenu111.add(txtFileItem1);

            JMenuItem txtFileItem11 = new JMenuItem("Вставить ");
            newMenu111.add(txtFileItem11);


            JMenuItem txtFileItem111 = new JMenuItem("Вырезать ");
            newMenu111.add(txtFileItem111);


            JMenu newMenu1111 = new JMenu("Справка");
            fileMenu1.add(newMenu1111);

            JMenu fileMenu2 = new JMenu("Edit");

            JMenu fileMenu3 = new JMenu("Help");

            fileMenu1.addSeparator();

            // g.setLayout(new FlowLayout());

            menuBar.add(fileMenu1);
            menuBar.add(fileMenu2);
            menuBar.add(fileMenu3);



            JPanel jp = new JPanel(new GridLayout(0, 1));

            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");
            // g.add(button1);
            button2.setSize(100, 50); //задаем размер кнопки
            button1.setSize(100, 50); //задаем размер кнопки



            jp.setLayout(new FlowLayout()); //создаем менеджер компановки кнопок(слева на право)
            jp.add(button1); // добавляем ее в панель
            jp.add(button2); // добавляем ее в панель
            jp.setBackground(Color.yellow);
            g.add(jp);
            g.setJMenuBar(menuBar);

            g.setPreferredSize(new Dimension(500, 500));
            g.setLocationRelativeTo(null);

            g.setSize(500,500);

            g.setVisible(true);
        }

        public static void main(String[] args) {
            new gui1();
        }

    }


