import java.util.*;
public class _85_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello ");

        sb.append("Java");// add
        System.out.println(sb);// string updated

        sb.insert(1, "Java"); // insert at a position
        System.out.println(sb);// prints HJavaello

        sb.replace(1, 3, "c++"); // replace
        System.out.println(sb);// prints HJavalo

        sb.delete(1, 3); // delete
        System.out.println(sb);// prints Hlo

        sb.reverse();
        System.out.println(sb);// prints olleH

        System.out.println(sb.capacity());// default 16

        sb.append("Java is my favourite language");
        System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

    }
}