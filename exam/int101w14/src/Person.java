public class Person {
    private final int id;
    private String name;
    public static int nextId = 0;

    public Person(String name) {
        this.id = ++nextId;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}