import java.util.*;
public class TestStack01 {
    public static void main(String[] args) {
        //Deklarasi var Stack
        Stack<String> stack=new Stack<String>();
        System.out.println("Apakah stack kosong? "+stack.empty());
        System.out.println("tambah data push()");
        stack.push("Mangga");
        stack.push("Jeruk");
        stack.push("Apel");
        System.out.println("Apakah stack kosong? "+stack.empty());
        System.out.println("Berapa size()nya? "+stack.size());
        System.out.println("pop()? "+stack.pop());
        System.out.println("pop()? "+stack.pop());
        System.out.println("pop()? "+stack.pop());
        System.out.println("Apakah stack kosong? "+stack.empty());
    }
}
