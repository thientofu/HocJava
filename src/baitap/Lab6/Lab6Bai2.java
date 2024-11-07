package baitap.Lab6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Lab6Bai2 {
    public static void main(String[] args) {
        Pattern CCCD = Pattern.compile("[0-9]{10}");
        Matcher m = CCCD.matcher("156324896a");
        System.out.println("CCCD = " + m.matches());
    }

}
