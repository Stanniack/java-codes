package model;

public class Human extends Animal {
    public String name;
    public Integer age;

    public Human(String type, String name, Integer age) {
        super(type);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
