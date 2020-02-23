package day61;

import java.util.*;

public class JobHunter  {
    public static void main(String[] args) {

        Job j1 = new Job("Red Balloon",120000,"New York");
        Job j2 = new Job("San Antonio",90000,"T-Mobile");
        System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2));


        List<Job> jobList = new LinkedList<>();
        jobList.add(new Job("Austin",85000,"Verizon"));
        jobList.add(new Job("Houston",95000,"Sprint"));
        jobList.add(new Job("Dallas",105000,"AT&T"));
        jobList.add(new Job("San Antonio",90000,"T-Mobile"));
        jobList.add(new Job("Houston",125000,"Apple"));
        jobList.add(new Job("New York",120000,"Red Balloon"));

        System.out.println("jobList before sort = " + jobList);


        Collections.sort(jobList);
        System.out.println("jobList after sort = " + jobList);

        // reversed comparing logic
        Collections.sort(jobList, Comparator.reverseOrder());
        System.out.println("jobList = " + jobList);

        // Collections.sort(jobList,Collections.reverseOrder());




    }
}
