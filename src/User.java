import java.util.Comparator;

public class User implements Comparator<User> {
    int id;
    String name;
    int age;
    int salary;

    public User(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compare(User o1, User o2) {
        return o1.age-o2.age;
    }
}