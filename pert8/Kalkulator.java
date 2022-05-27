public class Kalkulator {
    /**
     * Method untuk menjumlahkan dua bilangan
     * @param a
     * @param b
     * @return
     */
    public static int tambah(int a, int b) {
        int hasil=a+b;
        return hasil;
    }
    /**
     * Method untuk mnejumlahkan 3 buah bilangan
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static int tambah(int a, int b, int c) {
        int hasil=a+b+c;
        return hasil;
    }
    public static void main(String[] args) {
        int c=tambah(10, 20);
        System.out.println("tambah(10,20)="+c);
        int d=tambah(10, 20,30);
        System.out.println("tambah(10,20,30)="+d);
    }
}
