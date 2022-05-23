package ru.geekbrains.patterns.lesson6;

public class MainApp6 {
    public static void main(String[] args) {
        UserMapper userMapper = new UserMapper();
        System.out.println(userMapper.findById(3L));
    }
}
