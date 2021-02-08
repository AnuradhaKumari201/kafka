package com.knoldus;

public class User {
   private String id;
  private   int age;
   private String name;
    private String course;

    public User() {

    }

    public User(String id, int age, String name, String course) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}


