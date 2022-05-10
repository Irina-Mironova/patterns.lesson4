package ru.geekbrains.patterns.lesson4;

public class UserService implements Actions {

    @Override
    public void createNews(String text) {
        System.out.println("Пользователь создал новую запись: " + text);
    }

    @Override
    public void deleteNews() {
        System.out.println("Пользователь удалил запись");
    }

}