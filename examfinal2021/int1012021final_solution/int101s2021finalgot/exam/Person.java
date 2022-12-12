package exam;

import java.util.Objects;

public class Person {
    private static final int default_type = 1;
    private static int nextCode = 054;
    private final int code;
    private String firstname;
    private String lastname;
    private final int type;

    public Person(String firstname, String lastname, int type) {
        this.code = nextCode++;
        this.firstname = checkString(firstname) ? firstname : "Phuttinan";
        this.lastname = checkString(lastname) ? lastname : "Phaksaweang";
        this.type = type<0 ? default_type : type;
    }
    public static boolean checkString(String string){
        return string != null && ! string.isBlank();
    }

    public Person(String firstname, String lastname) {

        this(firstname, lastname, default_type);
    }

    public int getCode() {
        return code;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getType() {
        return type;
    }
    public void setFirstname(String firstname) {
        this.firstname = checkString(firstname) ? firstname : "Phuttinan";
    }
    public void setLastname(String lastname) {
        this.lastname = checkString(lastname) ? lastname : "Phaksaweang";
    }

    @Override
    public String toString() {
        return "[Person: " + code + "(" + firstname + " " + lastname + ")" + type + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return code == person.code && type == person.type && Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, firstname, lastname, type);
    }
}

