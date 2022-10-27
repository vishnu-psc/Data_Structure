class Classes
{
    

    public static void main(String[] args) {
        Student[] students = new Student[5];

        // students[0].name = "Vishnu";
        // students[0].marks = 435.455;
        // students[0].roll_no = 65;

        Student me = new Student();
        me.marks = 85.5f;
        System.out.println(me.marks);

        System.out.println(students);



    }
}

class Student
    {
        int roll_no;
        String name;
        float marks;
    }