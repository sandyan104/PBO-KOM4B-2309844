package TugasPertemuan8.No2;

public class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    protected String status;

    public Student(String nama, String alamat, String noTelp, String email, String status) {
        super(nama, alamat, noTelp, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + nama;
    }
}
