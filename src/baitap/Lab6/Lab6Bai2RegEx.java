package baitap.Lab6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern Class: định nghĩa "hình thức để search"
//Matcher Class: được sử dụng để search


public class Lab6Bai2RegEx {
    public static void main(String[] args) {
        Pattern CCCD = Pattern.compile("1234", Pattern.CASE_INSENSITIVE);
        Matcher m = CCCD.matcher("ABC122321423");
        System.out.println("CCCD = " + m.matches());

        Pattern email = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher e = email.matcher("Toffu0506@gmail.com");
        System.out.println("Email = " + e.matches());
    }

}
