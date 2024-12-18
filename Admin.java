import java.time.LocalDate;

public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin (String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: Admin.");
    }

    public void displayInfo(boolean full) {
        if (full) {
            displayInfo();
            System.out.println("Date : " + LocalDate.now());
        } else {
            System.out.println("User Name : " + super.getName());
        }
    }

    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear() - getDob().getYear();
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }
}
