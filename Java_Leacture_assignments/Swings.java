
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator implements ActionListener {

    JFrame f;
    JTextField t;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton add, sub, mul, div, eq, clr;

    double num1, num2, result;
    char operator;

    SwingCalculator() {

        f = new JFrame("Calculator");

        t = new JTextField();
        t.setBounds(30,40,240,30);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        eq = new JButton("=");
        clr = new JButton("C");

        b1.setBounds(30,80,50,40);
        b2.setBounds(90,80,50,40);
        b3.setBounds(150,80,50,40);
        add.setBounds(210,80,50,40);

        b4.setBounds(30,130,50,40);
        b5.setBounds(90,130,50,40);
        b6.setBounds(150,130,50,40);
        sub.setBounds(210,130,50,40);

        b7.setBounds(30,180,50,40);
        b8.setBounds(90,180,50,40);
        b9.setBounds(150,180,50,40);
        mul.setBounds(210,180,50,40);

        b0.setBounds(30,230,50,40);
        clr.setBounds(90,230,50,40);
        eq.setBounds(150,230,50,40);
        div.setBounds(210,230,50,40);

        JButton buttons[] = {b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,eq,clr};

        for(JButton b : buttons){
            f.add(b);
            b.addActionListener(this);
        }

        f.add(t);

        f.setSize(320,350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if((s.charAt(0)>='0') && (s.charAt(0)<='9')){
            t.setText(t.getText()+s);
        }

        else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            num1 = Double.parseDouble(t.getText());
            operator = s.charAt(0);
            t.setText("");
        }

        else if(s.equals("=")){
            num2 = Double.parseDouble(t.getText());

            switch(operator){
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            t.setText(String.valueOf(result));
        }

        else if(s.equals("C")){
            t.setText("");
        }
    }

    public static void main(String args[]) {
        new SwingCalculator();
    }
}