import java.util.Scanner;

public class ContohArray03{
    public static void main(String []args){
        int data[]=new int[7];
        String namaHari[]=new String[7];
        namaHari[0]=new String("Senin");

        int total=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<data.length;i++){
           System.out.print("Masukkan Omset hari " + (i+1)+ ": ");
           data[i]=sc.nextInt();
           total +=data[i];
        }
        sc.close();
        System.out.println("Total Penjualan:" + total);
    }
}