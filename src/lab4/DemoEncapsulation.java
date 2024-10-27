package lab4;

public class DemoEncapsulation {
    public long id;
    private String full_name;
    private long salary;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFull_name() {
        String upper_full_name = this.full_name.toUpperCase();
        return upper_full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public long getSalary() {
        //lúc nhập USD
        //lấy tỷ giá VND
        return salary*24000;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    /**
     * hàm để tạo object (DemoEncapsulation)
     * @param id
     * @param full_name
     */
    public DemoEncapsulation(long id, String full_name) {
        this.id = id;
        this.full_name = full_name;
    }
}
