package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        Util.getConnection();
        UserServiceImpl user = new UserServiceImpl();

        user.createUsersTable();
        user.saveUser("Igor", "Shubin", (byte) 27);
        user.saveUser("Alexander", "Pulemetov", (byte) 80);
        user.saveUser("Jack", "Golubev", (byte) 50);
        user.saveUser("Marsel", "Evdakimov", (byte) 6);

        user.removeUserById(2);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
