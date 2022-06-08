import java.util.Scanner;
import java.util.Vector;

public class ContohVector02 {
    public static Vector<String> cVector;
    public static void main(String[] args) {
        cVector=new Vector<String>();
        tambahData();
        viewAll();
    }
    public static void tambahData() {
        Scanner scanner=new Scanner(System.in);
        int lagi=1;
        String nama="";
        do{
            System.out.print("Enter nama barang: ");
            nama=scanner.next();
            cVector.add(nama);
            System.out.print("Entri data lagi?[1=ya 0=tidak]");
            lagi=scanner.nextInt();
        }while(lagi==1);
        System.out.println("====Tambah Data Selesai====");
        scanner.close();
    }
    public static void viewAll() {
        System.out.println("====Cetak Semua Data====");
        for(int i=0;i<cVector.size();i++){
            System.out.println(cVector.elementAt(i));
        }
    }
}
