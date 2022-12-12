package int101.test;

import int101.array.Student;

public class StudentTest {
    public static void main(String[] args) {
        TestStudent();
    }
    public static void TestStudent(){
        final int arrSize = 10;
        Student[] students = new Student[arrSize];
        for (int i = 0 ; i < arrSize ; i++){
            students[i]=new Student("Student " + i);
            System.out.println(students[i]);
        }
    }
}
