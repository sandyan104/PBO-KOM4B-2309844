package TugasPertemuan8.No2;

public class Faculty extends Employee {
    protected String jamKerja;
    protected String peringkat;

    public Faculty(String nama, String alamat, String noTelp, String email,
            String kantor, double gaji, MyDate dateHired, String jamKerja, String peringkat) {
        super(nama, alamat, noTelp, email, kantor, gaji, dateHired);
        this.jamKerja = jamKerja;
        this.peringkat = peringkat;
    }

    @Override
    public String toString() {
        return "Faculty: " + nama;
    }
}
