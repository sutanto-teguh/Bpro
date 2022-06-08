import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.*;

public class SimpleCounter extends JFrame{
    JLabel labelJudul, labelCounter;
    JButton btnAdd, btnRst;
    int counter;
    public SimpleCounter(){
        super("Program Simple Counter");
        counter=0;
        labelJudul=new JLabel("Program Simple Counter V1");
        labelCounter=new JLabel("0");
        btnAdd=new JButton("Add");
        btnRst=new JButton("Reset");
        setLayout(new FlowLayout());
        add(labelJudul);
        add(btnAdd);
        add(btnRst);
        add(labelCounter);
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                //coding ketika click
                counter++;
                labelCounter.setText(""+counter);
            }
        }
        );
        btnRst.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                counter=0;
                labelCounter.setText(""+counter);
            }
        });
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        SimpleCounter sc=new SimpleCounter();
    }
}
