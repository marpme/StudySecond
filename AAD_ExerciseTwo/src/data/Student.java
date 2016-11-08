package data;

/**
 * Created by marvinpiekarek on 07.11.16.
 */
public class Student {

    private String name;
    private String surname;
    private int number;
    private int gender;
    private int course;

    public Student(String name, String surname, int number, int gender, int course) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.gender = gender;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                ", gender=" + gender +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
