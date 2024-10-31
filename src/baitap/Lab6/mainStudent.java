package baitap.Lab6;

import java.util.ArrayList;

public class mainStudent {
    public static void main(String[] args) {
        Student st1 = new Student("Phan Thanh Thiện", "1");
        Student st2 = new Student("Nguyễn Thanh Thiện", "2");
        Student st3 = new Student("Hồ Thanh Thiện", "3");
        Student st4 = new Student("Phạm Thanh Thiện", "4");

        ArrayList<Student> list = new ArrayList();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().startsWith("Phan")){
                System.out.println(list.get(i));
            }
        }

    }
}
