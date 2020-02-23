package day62;

import day61.Job;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Job_TreeSet {
    public static void main(String[] args) {

        // Create a SortedSet of Job(from day 61) with TreeSet implementation

        Job j1 = new Job("Red Balloon", 120000, "New York");
        Job j2 = new Job("Apple", 100000, "New York");
        Job j3 = new Job("Market", 90000, "New York");
        Job j4 = new Job("Verizon", 110000, "New York");
        Job j5 = new Job("AT&T", 115000, "New York");


        SortedSet<Job> myFavoriteJob = new TreeSet<>(Arrays.asList(j1, j2, j3, j4, j5));

        myFavoriteJob.forEach(each -> System.out.println("each = " + each));

        // How does HashSet decide 5 person object (name,age) are duplicate or not



    }

}

