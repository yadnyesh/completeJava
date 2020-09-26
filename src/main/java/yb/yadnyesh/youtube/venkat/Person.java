package yb.yadnyesh.youtube.venkat;

public class Person {
    private String firstName;
    private Gender gender;
    private int age;

    public Person(){

    }

    public Person(String firstName, Gender gender, int age) {
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
