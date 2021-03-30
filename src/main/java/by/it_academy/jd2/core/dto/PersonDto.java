package by.it_academy.jd2.core.dto;

/**
 * This is a class for create - person
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

public class PersonDto {
    private String firstName;
    private String lastName;
    private int age;

    /**
     * constructor
     * @param firstName - first name
     * @param lastName - last name
     * @param age - age
     */

    public PersonDto(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age;
    }
}
