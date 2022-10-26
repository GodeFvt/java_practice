public class Person {
    private long id;
    private boolean isMale;
    private String name;
    private Person mom;

    public long getId() { //gettter // camel case // snake case get_id
        return id;
    }

    public Person getMom() {
        return mom;
    }

    public String getName() {
        return name;
    }
    public boolean getisMale(){
        return  isMale;
    }

    public void setId(long id) { //setter
        this.id = id;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setName(String name) {
        this.name = name;
    }

}
