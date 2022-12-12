package int101.array;

public class Student {
    public static boolean[] allId = new boolean[10];
    public int id;
    public String name;

    public Student(String name){
        this.name = name;
        this.id = CheckId();

    }
    public int CheckId(){
        int id;

        int max = 9 ;
        int min = 0 ;
        int range = max - min + 1 ;

        do {
            id = (int)(Math.random() * range) + min;
        }while (allId[id]) ;
        allId[id]=true;

        return id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{ " + "Name: " + name + "," + "Id: " + id + " }";
    }

}
