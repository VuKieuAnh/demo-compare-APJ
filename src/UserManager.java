import java.util.*;

public class UserManager {
    List<User> users = new ArrayList<>();

    public void sortUser(){
//        Collections.sort(users, new Comparator<User>(){
//            public int compare(User user, User user1){
//                return user.age - user1.age;
//            }
//        });
        Comparator<User> a = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.salary - o2.salary;
            }
        };

        Collections.sort(users, a);

        for (User u:users
             ) {
            System.out.println(u);
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public static void main(String[] args) {
        UserManager kieuanh = new UserManager();
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "U1", 19, 100));
        userList.add(new User(2, "U2", 29, 11));
        userList.add(new User(3, "U3", 39, 100));
        userList.add(new User(4, "U4", 18, 100));
        kieuanh.setUsers(userList);
        kieuanh.sortUser();
    }

}