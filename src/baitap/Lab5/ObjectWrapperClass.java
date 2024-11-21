//Convert từ kiểu primitive type sang non-primitive type
//ex: boolen-Boolen, byte-Byte, short-Short,....(Viết hoa đầu chữ cái)


//Boxing là convert từ primitive type chuyển thành Object
//Unboxing là convert từ Object chuyển thành Primitive type
package baitap.Lab5;

import java.util.ArrayList;
import java.util.List;

public class ObjectWrapperClass {
    public static void main(String[] args) {
        Integer i = new Integer(-8);

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(i);
        System.out.println("absolute value of " + i + " = " + absVal);

        List<Double> ld = new ArrayList<>();
        ld.add(3.1416);    // Π is autoboxed through method invocation.

        // 2. Unboxing through assignment
        double pi = ld.get(0);
        System.out.println("pi = " + pi);
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
        //biến = Biểu thức logic ? Câu lệnh khi biểu thức trả về true : Câu lệnh khi biểu thức trả về false;
    }

    
}
