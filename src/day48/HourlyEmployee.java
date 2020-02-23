package day48;

public class HourlyEmployee extends Employee {

    double hourlyWage;
    int numsOfHours;


    public HourlyEmployee(String name,int id,double hourlyWage,int numsOfHours){

        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }




    @Override
    public void calculateAnnualSalary() {

        System.out.println("Hourly Employee annual : " +(hourlyWage*numsOfHours));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , annual salary = " + (hourlyWage*numsOfHours) +
                '}';
    }
}
