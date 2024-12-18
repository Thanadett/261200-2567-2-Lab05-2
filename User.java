import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User (String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void displayInfo() {
        System.out.println("User Name : " + name);
        System.out.println("Birthday : " + dob);
//        displayHappyBirthday();
    }

    public boolean isBirthday() {
        if (LocalDate.now().getDayOfMonth() == dob.getDayOfMonth() && LocalDate.now().getMonth() == dob.getMonth())
            return true;
        else
            return false;
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}
