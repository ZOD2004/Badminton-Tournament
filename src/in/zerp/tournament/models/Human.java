package in.zerp.tournament.models;

public class Human {
    private int height;
    private int age;
    private final String ethnicity;
    private String name;

    public Human(int age, String ethnicity, int height, String name) {
        this.age = age;
        this.ethnicity = ethnicity;
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEthnicity() {
        return ethnicity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
