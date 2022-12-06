package hmwrk1;

public class Course {
    private String courseName;
    private double price;
    private int studentAmount;
    private String beginningDate;
    private int duration;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStudentAmount() {
        return studentAmount;
    }

    public void setStudentAmount(int studentAmount) {
        this.studentAmount = studentAmount;
    }

    public String getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(String beginningDate) {
        this.beginningDate = beginningDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
