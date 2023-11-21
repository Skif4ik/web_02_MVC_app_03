package by.itclass.model.db;

import by.itclass.model.entities.User;

import java.util.ArrayList;
import java.util.List;

public class DbInMemory {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Vasia Pupkin", "vasia.pup@gmail.com"));
        users.add(new User(2, "Ivan Ivanov", "ivan.vano@mail.ru"));
        users.add(new User(3, "Petr Petrov", "petruha25@gmail.com"));
        users.add(new User(4, "Dima Medved", "dimon.bear@yandex.ru"));
    }

    public static boolean isContainsInDb(String fio) {
       return users.stream()
                .anyMatch(it -> fio.equalsIgnoreCase(it.getFio()));
    }
}
