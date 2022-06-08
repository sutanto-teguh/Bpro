import javax.swing.JFrame;
public class MyWindow extends JFrame {
    public static final int LEBAR=400;
    public static final int TINGGI=300;
    public static final int POSX=100;
    public static final int POSY=100;
    public MyWindow(String judul){
        super(judul);
        setSize(LEBAR, TINGGI);
        setLocation(POSX, POSY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyWindow window=new MyWindow("Windowku Lagi");
    }
}
