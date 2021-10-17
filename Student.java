public class Student {
    int studentAge;
    String studentName;
    int studentId;
    boolean studentIdValid;
    int studentSemesterNumber;
    int studentAverageGrade;

    public void sayHello() {
        System.out.println("Hello!");

    }

    public void displayNameSemNumAvgGrade() {
        System.out.println(studentName+" "+studentSemesterNumber+" "+studentAverageGrade);
    }

    public void displayAge() {
        System.out.println(studentAge);
    }

    public void changeIdStatus(){
        if (studentIdValid=true){
            studentIdValid=false;
        }
        else if (studentIdValid=false){
            studentIdValid=true;
        }

    
    }

    public void displayNameIdValid(){
        System.out.println(studentName+" "+studentId+" "+studentIdValid);
    }

    public Student(int age, String name, int id, boolean idValid, int semesterNumber, int averageGrade) {
        studentAge = age;
        studentName = name;
        studentId = id;
        studentIdValid = idValid;
        studentSemesterNumber = semesterNumber;
        studentAverageGrade = averageGrade;

    }

    public static void main(String[] args) {
        Student student1 = new Student(20, "Filip",218408,true,3,4);
        Student student2 = new Student(21, "Kuba",219404,false,3,5);
        Student student3 = new Student(20, "Adam",218404,true,3,3);
        student1.displayNameSemNumAvgGrade();
        student1.displayNameIdValid();
        student1.changeIdStatus();
        student1.displayNameIdValid();

    }

}