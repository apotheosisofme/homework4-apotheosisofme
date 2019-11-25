/*
Jeff Schott
CIS 2348
Dr. Peggy Lindner
Wed. 1-4pm
 */

public class EmployeeScenarios {

    public static void main( String[] args) {

        //Call method to generate info for Sales Manager
        Salesmanager salesmanager = new Salesmanager();
        System.out.println("Salesmanager");
        System.out.println("Salesmanager Salary: " + salesmanager.getSalary());
        System.out.println("Salesmanager Vacation: " + salesmanager.getVacationDays());
        System.out.println("Salesmanager Form: " + salesmanager.getVacationForm());
        System.out.println("Salesmanager Hours: " + salesmanager.getHours());

        salesmanager.special();

        //Call method to generate info for Food Service Worker
        FoodServiceWorker fsw = new FoodServiceWorker();
        System.out.println("Food Service Worker");
        System.out.println("FoodServiceWorker Salary: " + fsw.getSalary());
        System.out.println( "FoodServiceWorker Vacation Days: " + fsw.getVacationDays());
        System.out.println( "FoodServiceWorker Form: " + fsw.getVacationForm());
        System.out.println( "FoodServiceWorker Hours: " + fsw.getHours());

        //Call method to generate info for Data Analyst
        DataAnalyst dat = new DataAnalyst();
        System.out.println("Data Analyst");
        System.out.println("Data Analyst salary: " + dat.getSalary());
        System.out.println("Data Analyst Vacation: " + dat.getVacationDays());
        System.out.println("Data Analyst Form: " + dat.getVacationForm());
        System.out.println("Data Analyst Hours: " + dat.getHours());
        dat.preprocessingData("Project 4");

        //Call method to generate info for Cloud Developer
        CloudDeveloper cloud = new CloudDeveloper();
        System.out.println("Cloud Developer");
        System.out.println("Cloud Developer Salary: " + cloud.getSalary());
        System.out.println( "Cloud developer Vacation: " + cloud.getVacationDays());
        System.out.println( "Cloud developer Form: " + cloud.getVacationForm());
        System.out.println("Cloud developer Hours: " + cloud.getHours());

        //Call method to generate info for SoftwareDeveloper
        SoftwareDeveloper soft = new SoftwareDeveloper();
        System.out.println("Software Developer");
        System.out.println("Software Developer Salary: " + soft.getSalary());
        System.out.println("SoftwareDeveloper Vacation: " + soft.getVacationDays());
        System.out.println("SoftwareDeveloper Form: " + soft.getVacationForm());
        System.out.println("SoftwareDeveloper Hours: " + soft.getHours());
        soft.deploy();

        //Call method to generate info for SeniorDataAnalyst
        SeniorDataAnalyst sda = new SeniorDataAnalyst();
        System.out.println("Senior Data Analyst");
        System.out.println("SeniorDataAnalyst Salary: " + sda.getSalary());
        System.out.println("SeniorDataAnalyst Vacation: " + sda.getVacationDays());
        System.out.println("SeniorDataAnalyst Form: " + sda.getVacationForm());
        System.out.println("SeniorDataAnalyst Hours: " + sda.getHours());
        sda.writeReport();

    }

}