import java.util.Vector;

public class ContohVector01 {
    //dekarasi Vector
    static Vector data;
    public static void main(String[] args) {
        data=new Vector<String>();
        System.out.println("Capacity: " + data.capacity());
        System.out.println("Size: " + data.size());
        System.out.println("Empty: " + data.isEmpty());
        data.add("Mangga");
        data.add("Jeruk");
        data.add("Apel");
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
    }
}
