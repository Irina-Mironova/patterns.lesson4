package ru.geekbrains.patterns.lesson4;

public class UserProxy implements Actions {
    protected UserService user;

    public UserProxy(UserService user) {
        this.user = user;
    }

    @Override
    public void createNews(String text) {
        if (!text.isEmpty()) {
            user.createNews(text);
            likeNews();
        } else {
            System.out.println("Напишите новость!");
        }
    }

    @Override
    public void deleteNews() {
        user.deleteNews();
    }

    private void likeNews() {
        System.out.println("Пользователь поставил лайк");
    }


}
