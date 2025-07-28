class Student {
    int rollno;
    String name;
}

class Studentarray {
    public static void main(String[] args) {
        // Creating student 1
        Student student = new Student();
        student.rollno = 1;
        student.name = "Tanmay Mahajan";

        // Creating student 2
        Student student1 = new Student();
        student1.rollno = 2;
        student1.name = "Parth Khatke";

        // Storing in array
        Student stud[] = new Student[2];
        stud[0] = student;
        stud[1] = student1;

        // Printing student data
        for (int i = 0; i < stud.length; i++) {
            System.out.println("Roll No: " + stud[i].rollno + ", Name: " + stud[i].name);
        }
    }
}
