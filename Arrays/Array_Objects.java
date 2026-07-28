class Student{
    int rollno;
    String name;
    double marks;
}

public class Array_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Sujay";
        s1.marks = 99.9;

       // System.out.println(s1); --> This will print the reference of the object in memory

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Kaivayla";
        s2.marks = 88.8;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Ashu";
        s3.marks = 50.5;

        Student students[] = new Student[3]; //Array which can hold student references
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i =0; i<students.length;i++){
            System.out.println(students[i].name + ":" + students[i].marks);
        }

    }

}
