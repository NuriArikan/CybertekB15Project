package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();

        accountList.add(new Account("John Snow",10000));
        accountList.add(new Account("Vald",11000));
        accountList.add(new Account("Nuri",13000));
        accountList.add(new Account("Sventlana",8000));
        accountList.add(new Account("Emme",17000));
        accountList.add(new Account("Ata",9000));

        System.out.println("accountList before =  \n" + accountList);

        Collections.sort(accountList);
        System.out.println("accountList after =  \n" + accountList);

        // Create another account with your name;
        // Transfer everyone's money to your account

        Account myAccount = new Account("Nuri",0);

        for ( Account each : accountList){

            each.transferAll(myAccount);

        }
        System.out.println("myAccount = " + myAccount);
        System.out.println("accountList = " + accountList);


        // What can be the data type of a1
        // Account a1
        // Comparable
        // Transferable a1
        // Object a1

        // An object can be referred by
        // * it is own type
        // * it s super class type
        // * interface type that it implemented

        Account a1 = new Account("Polymorphism1",10000);

        Transferable t1 = new Account("Polymorphism2",10000);

        Comparable c1 = new Account("Polymarphism3",10000);

        Object o1 = new Account("Polymorphism4",10000);










    }
}
