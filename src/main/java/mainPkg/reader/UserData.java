package mainPkg.reader;

/**
 * Created by Denis on 12.04.2017.
 */
public class UserData {
    private String lastName;
    private int age;
    private int height;
    private int weight;

    public UserData(String lastName, int age, int height, int weight) {
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
