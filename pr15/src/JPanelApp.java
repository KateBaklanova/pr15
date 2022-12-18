import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelApp extends JPanel {
    JTextField txt1 = null;
    int res = 0;
    int res2=0;
    int res1 = 0;
    String op = "";
    String sixop = "";

    public JPanelApp() {
        try {
            MetodCalc mc = new MetodCalc();
            String strOp = op;
            setLayout(null);
            // Specifies the position of the element
            final TextField txt1 = new TextField();
            txt1.setBounds(10, 10, 235, 25);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 190, 50, 50);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 270, 50, 50);

            JButton b2 = new JButton("2");
            b2.setBounds(60, 190, 50, 50);

            JButton b3 = new JButton("3");
            b3.setBounds(110, 190, 50, 50);

            JButton b4 = new JButton("4");
            b4.setBounds(10, 110, 50, 50);

            JButton b5 = new JButton("5");
            b5.setBounds(60, 110, 50, 50);

            JButton b6 = new JButton("6");
            b6.setBounds(110, 110, 50, 50);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);

            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);

            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);

            JButton bRes = new JButton("=");
            bRes.setBounds(85, 270, 75, 50);
            Font bigFont = new Font("serif", Font.BOLD, 22);
            bRes.setFont(bigFont);

            JButton bPlus = new JButton("+");
            bPlus.setBounds(170, 40, 75, 50);
            Font bigFontPlus = new Font("serif", Font.BOLD, 22);
            bPlus.setFont(bigFontPlus);

            JButton bMinus = new JButton("-");
            bMinus.setBounds(170, 110, 75, 50);
            Font bigFontMinus = new Font("serif", Font.BOLD, 22);
            bMinus.setFont(bigFontMinus);

            JButton bMulti = new JButton("*");
            bMulti.setBounds(170, 190, 75, 50);
            Font bigFontMulti = new Font("serif", Font.BOLD, 22);
            bMulti.setFont(bigFontMulti);

            JButton bDivision = new JButton("/");
            bDivision.setBounds(170, 270, 75, 50);
            Font bigFontDivision = new Font("serif", Font.BOLD, 22);
            bDivision.setFont(bigFontDivision);

            JButton bClear = new JButton("C");
            bClear.setBounds(10, 340, 100, 50);
            Font bigFonClear = new Font("serif", Font.BOLD, 22);
            bDivision.setFont(bigFontDivision);



            add(txt1);
            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(bRes);
            add(bPlus);
            add(bMinus);
            add(bMulti);
            add(bDivision);
            add(bClear);

            int result =0;

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 1;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 1;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 2;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 2;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 3;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 3;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 4;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 4;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 5;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 5;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 6;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 6;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 7;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 7;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 8;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 8;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 9;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 9;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        System.out.println("efjmdmdcfcmfcef");
                        String strRes = String.valueOf(mc.calc(res, op, res2));
                        txt1.setText(strRes);
                        res1=Integer.parseInt(strRes);
                        op="";
                        res=res1;
                    }
                }
            });

            b0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    txt1.setText(txt1.getText() + 1);
                    if (res == 0) {
                        res = 0;
                        txt1.setText(String.valueOf(res));
                    } else {
                        res2 = 0;
                        txt1.setText(String.valueOf(res1));
                    }
                    if (op!="")
                    {
                        if (op=="/")
                        {
                            if (res2==0)
                            {
                                txt1.setText("ошибка");
                                res=0;
                                res2=0;
                                res1=0;
                            }
                        }
                        else {
                            // System.out.println("efjmdmdcfcmfcef");
                            String strRes = String.valueOf(mc.calc(res, op, res2));
                            txt1.setText(strRes);
                            res1 = Integer.parseInt(strRes);
                            op = "";
                            res = res1;
                        }
                    }
                }
            });

            bPlus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "+";
                }
            });

            bMinus.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "-";
                }
            });

            bMulti.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "*";
                }
            });

            bClear.addActionListener(new ActionListener() {
                                         @Override
                                         public void actionPerformed(ActionEvent arg1) {
                                             res = 0;
                                             txt1.setText("");
                                             op = "";
                                         }
                                     });

            bDivision.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg1) {
                    res = Integer.valueOf(txt1.getText());
                    txt1.setText("");
                    op = "/";
                }
            });

            bRes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {

                    txt1.setText(String.valueOf(res1));
                }
            });
        } catch (ArithmeticException exception) {
            //System.out.println("Can not divide by zero ");
        }




    }
}
