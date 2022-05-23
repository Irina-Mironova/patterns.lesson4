package ru.geekbrains.patterns.lesson6;

public class User {
    private Long id;
    private String lastname;
    private String firstname;
    private String nikname;
    private Integer age;
    private String email;

    public User(Long id, String lastname, String firstname, String nikname, Integer age, String email) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.nikname = nikname;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", nikname='" + nikname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
