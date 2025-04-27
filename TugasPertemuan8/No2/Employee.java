package TugasPertemuan8.No2;

public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate mulaiKerja;

    public Employee(String nama, String alamat, String noTelp, String email,
            String kantor, double gaji, MyDate mulaiKerja) {
        super(nama, alamat, noTelp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.mulaiKerja = mulaiKerja;
    }

    @Override
    public String toString() {
        return "Employee: " + nama;
    }
}
