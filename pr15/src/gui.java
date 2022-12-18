import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame {
    String[] options =
            {
                    "Хурма",
                    "Яблоко",
                    "Ананас"
            };

    JFrame g;


     public gui() {
         super("practice 15");
         g = new JFrame("ComboBox Example");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JComboBox editComboBox = new JComboBox(options);
         editComboBox.setBounds(200, 230, 100, 20);
         editComboBox.setEditable(true);
         g.add(editComboBox);
         g.setPreferredSize(new Dimension(500, 500));
         g.setLocationRelativeTo(null);
         JTextArea t = new JTextArea("информация");

         t.setBounds(100, 130, 100, 50);
         g.add(t);

         g.setLayout(null);
         g.setSize(500, 500);
         g.setVisible(true);

         ActionListener cbActionListener = new ActionListener() {//add actionlistner to listen for change
             @Override
             public void actionPerformed(ActionEvent e) {

                 String s = (String) editComboBox.getSelectedItem();//get the selected item

                 switch (s) {//check for a match
                     case "Хурма":
                         t.setText("хурма класс");
                         break;
                     case "Яблоко":
                         t.setText("яблоко класс");
                         break;
                     case "Ананас":
                         t.setText("ананас не класс");
                         break;
                 }
             }
         };
         editComboBox.addActionListener(cbActionListener);
     }



    public static void main(String[] args) {
         new gui();
            }

}

