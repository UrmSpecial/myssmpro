package com.ct.pojo;

public class Role {
    private int id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private int age;
    private String password;

    public Role(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role() {
    }

    public Role(String username, int age) {

        this.username = username;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void roleInfo() {
        System.out.println(
                "id:" + id + ";名字：" + username + ";年龄：" + age
        );
    }
}
