import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckSwap extends JFrame implements ActionListener{
    JTextField txt1 = new JTextField(20);
    JTextField txt2 = new JTextField(20);
    JButton btn1 = new JButton("Check");
    JButton btn2 = new JButton("Swap");
    JLabel lbl1 = new JLabel();
    public CheckSwap(){
        super("Checker and Swaper");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        setLayout(new FlowLayout());
        add(txt1);
        add(btn1);
        add(txt2);
        add(btn2);
        add(lbl1);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    public static void main (String [] args){
        new CheckSwap().setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== btn1){
            if(txt1.getText().equals(txt2.getText())){
                lbl1.setText("SAME");
            }else{
                lbl1.setText("NOT THE SAME");
            }
        }else if (e.getSource()== btn2){
            String dummy = txt1.getText();
            txt1.setText(txt2.getText());
            txt2.setText(dummy);
        }
    }

}
