import exam.Department;
import exam.Person;
import java.util.Arrays;

public class ProjectDriver {

    public static void main(String[] args) {
        testPerson();
        testDepartment();
    }

    public static void testPerson() {
        System.out.println("\n# Person # ===========");
        
        // Constructor: Person(firstname, lastname, type)
        System.out.println("\n# Constructor: Person(firstname, lastname, type) -----------------");
        System.out.println("new Person(null,null,-1) => " + new Person(null, null, -1));
        System.out.println("new Person(\"FirstName\",\"  \", 0) => " + new Person("FirstName", "  ", 0));
        System.out.println("new Person(\"\",\"LastName\", 2) => " + new Person("", "LastName", 2));

        // Constructor: Person (firstname, lastname)
        System.out.println("\n# Constructor: Person(firstname, lastname) -----------------");
        System.out.println("new Person(\"First\",\"Last\") => " + new Person("First", "Last"));
        System.out.println("new Person(null,\"Surname\") => " + new Person(null, "Surname"));

        // Getters: getCode(), getFirstname(), getLastname(), getType()
        System.out.println("\n# Getters -----------------");
        var p = new Person("GivenName", "FamilyName", 9);
        System.out.println(p);
        System.out.println("p.getCode(): " + p.getCode());
        System.out.println("p.getFirstname(): " + p.getFirstname());
        System.out.println("p.getLastname(): " + p.getLastname());
        System.out.println("p.getType(): " + p.getType());

        // Setters: setFirstname(), setLastname()
        System.out.println("\n# Setters -----------------");
        p.setFirstname("  ");
        p.setLastname("LASTname");
        System.out.println("firstname=blank, lastname=LASTname => " + p);
        p.setFirstname("FIRSTname");
        p.setLastname(null);
        System.out.println("firstname=FIRSTname, lastname=null => " + p);
        
        // toString()
        System.out.println("\n# toString() -----------------");
        System.out.println(p.toString());
        
        // equals()
        System.out.println("\n# equals() -----------------");
        var q = p;
        var r = new Person("FIRSTname", "LASTname", 9);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("r = " + r);
        System.out.println("p == q ? " + (p==q));
        System.out.println("p == r ? " + (p==r));
    }

    public static void testDepartment() {
        System.out.println("\n# Department # ===========");
        
        // Constructor: Department(title)
        System.out.println("\n# Constructor: Department(title) -----------------");
        System.out.println("new Departmet(null) => " + new Department(null));
        System.out.println("new Departmet(\"\") => " + new Department(""));
        System.out.println("new Departmet(\"Dept\") => " + new Department("Dept"));

        // Getters: getCode(), getTitle(), getCount()
        var d = new Department("DepartmentTitle");
        System.out.println(d);
        System.out.println("d.getCode(): " + d.getCode());
        System.out.println("d.getTitle(): " + d.getTitle());
        System.out.println("d.getCount(): " + d.getCount());

        // addStaff(firstname, lastname, type)
        System.out.println("d.addStaff(\"  \", \"LAST\", 2): " + d.addStaff("  ", "LAST", 2));
        System.out.println("d.addStaff(\"FIRST\", null, 4): " + d.addStaff("LAST", null, 4));
        System.out.println("d.addStaff(\"FIRST\", \"LAST\",-6): " + d.addStaff("FIRST", "LAST", -6));
        final int type = 7;
        for (int i = 0; i < 12; i++) {
            System.out.println(i + " d.addStaff(..., ..., ...): "
                    + d.addStaff("F" + i, "L" + (100 + i), (int) (Math.random()*type)) + " ... count=" + d.getCount());
            if (Math.random() < 0.5) new Person(null,null); // for skipping some Person.code
            if (Math.random() < 0.5) new Person(null,null); // for skipping some Person.code
            if (Math.random() < 0.5) new Person(null,null); // for skipping some Person.code
        }

        // getTypeCount(type)
        for (int i = 0; i < type; i++) 
            System.out.println("d.getTypeCount(" + i + ") = " + d.getTypeCount(i));

        // getAllCodes()
        System.out.println("d.getAllCodes(): " + Arrays.toString(d.getAllCodes()));

        // getStaff(code)
        for (int i = 0; i < 19; i++) {
            int x = (int) (Math.random() * 25) + 5;
            System.out.println("d.getStaff(" + x + ") = " + d.getStaff(x));
        }

        // toString()
        System.out.println("d.toString(): " + d.toString());
        
        // getAllTypes() 
        System.out.println("d.getAllType(): " + Arrays.toString(d.getAllTypes()));
    }
}

/*
0. You may import any package in the JavaSE standard library as neccessary.
    However, you are not allowed to use any class in the Java Collection Framework.
    The only collection that you can use is the basic built-in java array.
1. Create a Person class in "exam" package containing 
    the following instance variables, which are all private:
    (1) code: int (cannot be changed after initialization).
    (2) firstname: String.
    (3) lastname: String.
    (4) type: int (cannot be changed after initialization).
1.1) Create a contructor: Person(String firstname, String lastname, int type).
    (a) This constructor will assign a unique code to each Person starting from 
    the last-three digits of your student id onward. (hint: use a static variable 
    to keep track of the code to be used for the next person).
    (b) Neither firstname nor lastname can be null or blank. If any input argument 
    violates this rule, use your firstname and your lastname as the default values 
    respectively.
    (c) The type must be a non-negative number. 
    Use 1 as the default value if the input argument violates this rule.
1.2) Create another constructor: Person(String firstname, String lastname). 
    Use the default value for type as stated in 1.1. Avoid duplicate coding. 
1.3) Create all four public getters and two public setters for firstname and lastname.
    Do not change the firstname or the lastname if the input argument is null or blank.
1.4) Override toString() method to return a string representation in this format:
    [Person: CODE (FIRSTNAME LASTNAME) TYPE] where CODE, FIRSTNAME, 
    LASTNAME, and TYPE are code, firstname, lastname, and type of the person.
1.5) Override equals(Object obj) method, so that two person objects are equal 
    when they have the same code.
2. Create a Department class in "exam" package containing 
    the following instance variables, which are all private:
    (1) code: int (auto-generated starting from 400 onward).
    (2) title: String (can not be changed after initialization).
    (3) staff: Person[].
    (4) count: int, for keeping track of the number of staff in the array.
2.1) Create a constructor: Department(String title) where
    (a) This constructor will auto-generate the code starting from 400 onward.
    (b) The title must not be null or blank. Use your old school name as the default.
    (c) Initialize the staff as an array of size equals to 10 + your date of birth (the date only).
2.2) Create three public getters for code, title, and count. No setter.
2.3) Create a public method: addStaff(String firstname, String lastname, int type). 
    This method will create a Person (without checking the type), add this person 
    into the staff array, and return true. However, if the array is full or the firstname 
    or the lastname is null or blank, do not create a Person but return false instead.
2.4) Create a public method: getTypeCount(int type): int. This method will return 
    the number of staffs that have type equals to the input argument.
2.5) Create a public method: getAllCodes(): int[]. This method will return an array 
    containing the codes of all staffs and the size of the array must be the same as 
    the number of staffs in the department.
2.6) Create a public method: getStaff(int code): Person. This method will return 
    the person in the staff array that match the code in the argument. 
    Null will be returned if no staff with that code.
2.7) Override a public method: toString(): String. This method will return 
    a string representation of the department in the following format.
    [Department: CODE (TITLE) COUNT] where CODE, TITLE, and COUNT 
    are the code, the title, and the number of staffs in the department respectively. 
2.8) Create a public method: getAllTypes(): int[]. This method will return an array 
    containing all types of staffs in the department. Make sure that there are 
    no duplicate types in the array and the size of the array equals to the number 
    of distinct types.
3. In the ProjectDriver class (which is not in any package), 
    show that all methods in 1 and 2 work correctly as it should be.
*/

