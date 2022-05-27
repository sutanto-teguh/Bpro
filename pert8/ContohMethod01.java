public class ContohMethod01 {
    public static void main(String[] args) {
        cetakGaris();
        System.out.println("Program Penjualan");
        cetakGaris(5);
        cetakGaris(40);
    }
    public static void cetakGaris(){
        for(int i=0;i<20;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    /**
     * cetakGaris dengan parateter panjang
     * @param panjang
     */
    public static void cetakGaris(int panjang){
        for(int i=0;i<panjang;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    /**
     * 
     * @param kata
     */
    public static void cetakBanner(String kata) {
        
    }
}
