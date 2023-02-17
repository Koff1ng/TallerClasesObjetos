package tallerClasesYObjetos;

public class EjercicioStudent {
    private String fName;
    private String lName;
    private int stuId;
    private String stuStatus;
    
    public EjercicioStudent(String firstName, String lastName, int studentId, String studentStatus) {
        this.fName = firstName;
        this.lName = lastName;
        this.stuId = studentId;
        this.stuStatus = studentStatus;
    }
    
    public static void main(String[] args) {
        EjercicioStudent student = new EjercicioStudent("Lisa", "Palombo", 123456789, "Active");
        System.out.println("Student Name: " + student.fName + " " + student.lName);
        System.out.println("Student ID: " + student.stuId);
        System.out.println("Student Status: " + student.stuStatus);
    }
}