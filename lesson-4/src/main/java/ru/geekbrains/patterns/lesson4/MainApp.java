package ru.geekbrains.patterns.lesson4;

// Реализация паттерна Proxy
public class MainApp {
    public static void main(String[] args) {
        UserProxy userService = new UserProxy(new UserService());
        userService.createNews("Привет");
        userService.deleteNews();
    }
}
