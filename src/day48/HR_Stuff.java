package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR_Stuff {

    public static void main(String[] args) {

        // Employee is abstract super type
        // HourlyEmployee and FulltimeEmployee is specific type

        // if we have Employee data type for e1 variable
        // we can write down the address of anything IS-A Employee

        Employee       e1 = new HourlyEmployee("Nuri",100,55,50000);

        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);
        System.out.println("===================");

                       e1 = new FullTimeEmployee("Nuri",99,10000);

        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);



        Employee       e2 = new HourlyEmployee("Ying",101,50,40000);

        Employee       e3 = new HourlyEmployee("Roksana",102,45,30000);

        System.out.println("===================");


        List<Employee> AllEmployee = Arrays.asList(e1,e2,e3) ;

        for ( Employee each : AllEmployee){
        //    System.out.println("each = " + each);

            System.out.println("Name is : " + each.name);
              each.calculateAnnualSalary();

        }


    }


}
