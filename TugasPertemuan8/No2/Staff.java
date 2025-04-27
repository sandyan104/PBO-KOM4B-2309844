package TugasPertemuan8.No2;

public final class Staff extends Employee {
    protected String title;

    public Staff(String nama, String alamat, String noTelp, String email,
                 String kantor, double gaji, MyDate dateHired, String title) {
        super(nama, alamat, noTelp, email, kantor, gaji, dateHired);
        this.title = title;
    }

    @Override
    public final String toString() {
        return "Staff: " + nama;
    }
}
