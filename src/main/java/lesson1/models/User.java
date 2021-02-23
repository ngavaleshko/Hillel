package models;

import models.Human;

public class User extends Human {
    public User(String name, String surname, int age, String email, String password) {
        super(name, surname, age, email, password, "USER");
    }

}