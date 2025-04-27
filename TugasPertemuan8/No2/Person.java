package TugasPertemuan8.No2;

public class Person {
    protected String nama;
    protected String alamat;
    protected String noTelp;
    protected String email;

    public Person(String nama, String alamat, String noTelp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    public String toString() {
        return "Person: " + nama;
    }
}
