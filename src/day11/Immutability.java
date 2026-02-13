package day11;

public final class Immutability {
    private static volatile Immutability ins;
    private final int id;
    private final String name;
    private final String role;

    private Immutability(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Immutability{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static Immutability getInit(int id, String name, String role){
        if(ins == null){
            synchronized (Immutability.class) { // can use method too
                if (ins == null){ // double lock in case of 2 thread
                    // but why volatile is needed and what is it
                    ins = new Immutability(id,name,role);
                }
            }
        }
        else{
            throw new NewInstanceForSingleton("new obj are not allowed to create");
        }
        return ins;
    }

}
