// A class to represent SoftwareDevelopers.

public class SoftwareDeveloper extends Employee {
    public int getVacationDays() {

        return super.getVacationDays() + 5;           // 3 weeks vacation
    }

    public String getVacationForm() {

        return "pink";
    }

    public void deploy() {

        System.out.println("Let's get this out!");
    }
}
