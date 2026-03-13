package Basics;

class Student{
    String name;
    long rollno;
    double marks;
}

public class T08Arrays2 {
    static void main(String ard[]){

        int nums[] = new int[4];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 8;
        nums[3] = 16;

        //Iterate between the nums.
        for(int n : nums){
            System.out.println(n);
        }


        Student s1 = new Student();
        s1.name = "Akshit";
        s1.rollno = 2510042026L;
        s1.marks = 98.7;

        Student s2 = new Student();
        s2.name = "Dakshpreet Singh";
        s2.rollno = 2510042027L;
        s2.marks = 85.87;

        Student s3 = new Student();
        s3.name = "Nandani";
        s3.rollno = 2510042028L;
        s3.marks = 91.2;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

//        for(int i = 0; i < students.length; i++){
//            System.out.println(students[i].name + ": " + students[i].rollno);
//        }
        //FOR-EACH or enhanced for loop!!
        for(Student stud : students){
            System.out.println(stud.name + ": " + stud.rollno + ": " + stud.marks);
        }

    }
}
