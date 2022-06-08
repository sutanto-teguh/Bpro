import java.util.Collections;
import java.util.Vector;

public class ContohVector03 {
    public static Vector<String> cVector;
    public static void main(String[] args) {
        cVector=new Vector<String>();
        setupData();
        viewAll();
        Collections.sort(cVector);
        System.out.println("Data Setelah Diurutkan");
        viewAll();
    }   
    public static void setupData() {
        cVector.add("Mangga");
        cVector.add("Apel");
        cVector.add("Manggis");
        cVector.add("Nanas");
        cVector.add("Jeruk");
        cVector.add("Durian");
        cVector.add("Nangka");
        cVector.add("Cempedak");
        cVector.add("Anggur");
        cVector.add("Kurma");
    } 
    public static void viewAll() {
        for(String string:cVector){
            System.out.println(string);
        }        
    }
}
