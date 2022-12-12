package exam;

import java.util.Arrays;

import static exam.Person.checkString;

public class Department {
    private int code;
    private int nextCode = 400 ;
    private final String title;
    private Person[] staff;
    private int count;

    public Department(String title){
        this.code =nextCode++;
        this.title = checkString(title) ? title : "Kanarat";
        this.staff = new Person[28];
    }

    public int getCode() {
        return code;
    }
    public String getTitle() {
        return title;
    }
    public int getCount() {
        return count;
    }

    public boolean addStaff(String firstname, String lastname, int type){
        if (count == staff.length || !checkString(firstname) || !checkString(lastname)){
            return false ;
        }else {
            staff[count++] = new Person(firstname,lastname,type);
            return true ;
        }
    }

    public int getTypeCount(int type){
        int countStaffs = 0;
        for (int i = 0 ; i < count ;i++){
            if (staff[i].getType() == type){
                countStaffs++;
            }
        }
        return countStaffs ;
    }

    public int[] getAllCodes(){
        int[] arrCode = new int[count];
        for (int i = 0 ; i < count ;i++){
            arrCode[i] = staff[i].getCode();
        }
        return arrCode;
    }

    public Person getStaff(int code){
        for (int i = 0 ; i < count ;i++){
            if (staff[i].getCode() == code){
                return staff[i];
            }
        }
        return null ;
    }

    @Override
    public String toString() {
        return "[Department:" +
                code +
                " (" + title + ") " +
                count +
                "]";
    }

    public int[] getAllTypes(){
        var temp = new int[count];
        for (int i = 0; i < count; i++) temp[i] = staff[i].getType();
        Arrays.sort(temp);

        int size = 0;
        for (int i = 1; i < count; i++) if (temp[size] != temp[i]) temp[++size] = temp[i];
        return Arrays.copyOfRange(temp, 0, ++size);
    }
}
