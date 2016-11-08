package data;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public class Student {

    private String prename;
    private String surname;
    private int course;
    private int mn;
    private int gender;

    public Student(String prename, String surname, int course, int mn, int gender) {
        this.prename = prename;
        this.surname = surname;
        this.course = course;
        this.mn = mn;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "prename='" + prename + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", mn=" + mn +
                ", gender=" + gender +
                '}';
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMn() {
        return mn;
    }

    public void setMn(int mn) {
        this.mn = mn;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
