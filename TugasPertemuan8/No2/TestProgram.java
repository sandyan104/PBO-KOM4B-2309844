package TugasPertemuan8.No2;

public class TestProgram {
        public static void main(String[] args) {
                Person person = new Person("Anis", "Jakarta", "08123456789", "anis@mail.com");
                Student student = new Student("Imin", "Jakarta", "08987654321", "imin@mail.com", Student.FRESHMAN);
                Employee employee = new Employee("Owo", "Jakarta", "08234567890", "owo@mail.com",
                                "Istana Kucing", 5000, new MyDate(2020, 5, 10));
                Faculty faculty = new Faculty("Janggar", "Jakarta", "08765432123", "janggar@mail.com",
                                "Istana Kucing", 7000, new MyDate(2018, 3, 15), "9-5", "Professor");
                Staff staff = new Staff("Mahpud", "Jakarta", "08654321234", "eve@mail.com",
                                "Istana Kucing", 4000, new MyDate(2022, 1, 20), "Admin");

                System.out.println(person.toString());
                System.out.println(student.toString());
                System.out.println(employee.toString());
                System.out.println(faculty.toString());
                System.out.println(staff.toString());
        }
}
