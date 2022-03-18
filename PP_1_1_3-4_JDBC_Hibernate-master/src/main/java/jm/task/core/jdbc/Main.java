package jm.task.core.jdbc;

public class Main {
    public static void main(String[] args) {
        List<User> users = Utils.createUsersTable("SELECT * FROM users");
        System.out.println(users);

        User user = new User();
        user.setName("Bob");
        user.setLastName("Bobby");
        user.setAge((byte) 20);


    }
}