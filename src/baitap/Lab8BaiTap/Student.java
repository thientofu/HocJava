package baitap.Lab8BaiTap;

public class Student extends Person {
    private int mark;
    private String grade;

    public Student(String id, String name, String age, int mark) {
        super(id, name, age);
        this.mark = mark;
    }


    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", grade='" + grade + '\'' +
                '}';
    }

    public void setGrade() {
        if (this.mark >= 8)
            this.grade = "A";

        if (this.mark >= 7 && this.mark < 8)
            this.grade = "B";
        if (this.mark >= 6 && this.mark < 7)
            this.grade = "C";
        if (this.mark >= 5 && this.mark < 6)
            this.grade = "D";
        if (this.mark < 5)
            this.grade = "Tạch cmnr";
    }
}
