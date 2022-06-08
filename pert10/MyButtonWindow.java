import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;
public class MyButtonWindow extends JFrame{
    JButton buttonOke;
    JButton buttonCancel;
    JLabel label;
    public MyButtonWindow(String judul){
        super(judul);
        buttonOke=new JButton("OKE");
        buttonCancel=new JButton("CANCEL");
        label=new JLabel("Program GUI Pertama");
        getContentPane().setLayout(new FlowLayout());
        add(label);
        add(buttonOke);
        add(buttonCancel);
        buttonOke.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                label.setText("Button OKE Clicked");
            }
        });
        buttonCancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                label.setText("Button CANCEL clicked");
            }
        });
        setSize(300, 300);
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MyButtonWindow mbw=new MyButtonWindow("My Button Window");
        mbw.setVisible(true);
    }
}
