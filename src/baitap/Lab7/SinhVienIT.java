package baitap.Lab7;

public class SinhVienIT extends SinhVien {
    private double scoreJava;
    private double scoreHTML;

    @Override
    double getScore() {
        return(this.scoreJava + this.scoreHTML) / 3;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }



    public SinhVienIT(double scoreJava, double scoreHTML) {
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }
}
