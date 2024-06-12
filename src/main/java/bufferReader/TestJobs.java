package bufferReader;

import java.util.ArrayList;
import java.util.List;

public class TestJobs {

    public static void main(String[] args) {


        System.out.println(Data.getJobs());

        System.out.println(JobUtilityMethods.getJobOfHighestSalary(Data.getJobs()));
        System.out.println(JobUtilityMethods.getTitlesLessThanAvgSalary(Data.getJobs()));
        System.out.println(JobUtilityMethods.getSalaryOf(Data.getJobs(), "Accounting Manager"));
        System.out.println(JobUtilityMethods.getSalaryOf(Data.getJobs(), "President"));
        System.out.println(JobUtilityMethods.getSalaryOf(Data.getJobs(), "as"));

        List<String> titles = new ArrayList<>(List.of("Finance Manager","Programmer","Sales Manager"));
        System.out.println(JobUtilityMethods.increaseSalary(Data.getJobs(),titles,10 ));

    }


}
