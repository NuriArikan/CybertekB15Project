package day48;

public class HR_Action {

    public static void main(String[] args) {


        HourlyEmployee e1 = new HourlyEmployee("Nuri",100,55,50000);
        e1.calculateAnnualSalary();

        System.out.println("e1 = " + e1);

        HourlyEmployee e2 = new HourlyEmployee("Ying",101,40,30000);
        e2.calculateAnnualSalary();


        FullTimeEmployee e3 = new FullTimeEmployee("Nuri",99,10000);
        e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        // each and every class we create , it will become a data type (reference type)

    }
}
