// A class to represent SeniorDataAnalysts.
public class SeniorDataAnalyst extends DataAnalyst {
    public double getSalary() {

        return super.getSalary() + 5000.0;      // $45,000.00 / year
    }

    public void writeReport() {

        System.out.println("This will take forever.");
    }
}
