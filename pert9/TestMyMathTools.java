public class TestMyMathTools {
    public static void main(String[] args) {
        int data[]={6,1,3,8,4,10,21,7,19};
        System.out.println("random(2,10):"+MyMathTools.random(2, 10));
        System.out.println("max : "+MyMathTools.cariMax(data));
        System.out.println("min : "+MyMathTools.cariMin(data));
    }
}
