// A class to represent a Cloud Developer to accompany other employees

public class CloudDeveloper extends SoftwareDeveloper {

    CloudDeveloper() {

        super();
        super.salary *= 1.3 ;
        super.vacationDays += 4 ;
        super.vacationForm = super.vacationForm + super.vacationForm + super.vacationForm ;
    }

    public void getVacationForm () {

        System.out.println( "pinkpinkpink");
    }
}
