// A class to represent Food Service Worker to accompany other employees

public class FoodServiceWorker extends Employee {

    // method for Food Service Worker salary to get later
    FoodServiceWorker() {

        super();
        super.hours = 60 ;
        super.salary = 30000.0 ;
        super.vacationDays = 5 ;
    }

    public void service() {
        System.out.println( "Will make your life better." );
    }
}