package buscasequencial;

public class Human extends Animal {
    public String name;

    public Human(String type, String name) {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
