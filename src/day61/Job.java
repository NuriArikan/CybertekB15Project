package day61;

public class Job implements Comparable<Job> {

    // encapsulate all the fields
    // add constructor
    // add toString method

    // let this class implements Comparable interface

     private String companyName;
     private double salary;
     private String location;

    public Job(String companyName, int salary, String location) {
        this.companyName = companyName;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public int compareTo(Job other) {

        if ( this.salary>other.salary ){
            return 1;
        } else if ( this.salary<other.salary ) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Job{" +
                "companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



}
