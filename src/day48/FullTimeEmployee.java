package day48;

public class FullTimeEmployee extends Employee{


    double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {

        System.out.println("Full time Employee annual : " +(monthlySalary*12));
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , full time : " + (monthlySalary*12) +
                '}';
    }
}
