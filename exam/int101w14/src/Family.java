import java.util.Arrays;

public class Family {
    private Person father;
    private Person mother;
    private Person[] children;
    int cont ;
    int contCheckChild;

    public Family(String father, String mother, int childrenCont) {
        this.father = new Person(father);
        this.mother = new Person(mother);
        this.cont = childrenCont;
        this.children = new Person[childrenCont];
    }
    public boolean addChild(String name){
        contCheckChild++;
        boolean ChildCheck = true;
        if (name != null){
            if (contCheckChild <= cont){
                for (int i = 0 ; i < cont ; i++){
                    if (children[i] == null){
                        children[i] = new Person(name);
                        break;
                    }
                }
            }else {
                ChildCheck =false;
            }
        }
        else {
            ChildCheck =false;
        }
        return ChildCheck ;
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children =" + Arrays.toString(children) +
                ", childrenCont=" + cont +
                '}';
    }

    public static void main(String[] args) {
        Family got = new Family("got","got2",5);
        System.out.println(got.addChild("got3"));
        System.out.println(got.addChild("got4"));
        System.out.println(got.addChild("got5"));
        System.out.println(got.addChild("got6"));
        System.out.println(got.addChild("got7"));
        System.out.println(got.addChild("got8"));
        System.out.println(got);
    }
}
