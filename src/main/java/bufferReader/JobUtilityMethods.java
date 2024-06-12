package bufferReader;

import java.util.ArrayList;
import java.util.List;

public class JobUtilityMethods {
    /**
     * This method will get jobId of job that has the highest salary.
     * Example:
     * ,getJobOfHighestSalary(jobs); - > returns "JobId"
     */
    public static String getJobOfHighestSalary(List<Job> jobs){
        String jobId = jobs.get(0).getJobId();
        int highestSalary = jobs.get(0).getSalary();


        for(Job jb : jobs){
            if(jb.getSalary()>highestSalary) {
                jobId = jb.getJobId();
                highestSalary = jb.getSalary();
            }
        }
        return jobId;
    }

/**
 * Method will return list of job titles that has salary less than average salary.
 * Example:
 * .getTitlesLessThanAvgSalary(jobs); ->returns [Staock Clerk.....]
 */

public static List<String> getTitlesLessThanAvgSalary(List<Job> jobs){
    List<String> title = new ArrayList<>();
    int sum = 0;
    int average = 0;
    int count = 0;

    for (Job jb : jobs){
        sum+=jb.getSalary();
        count++;
    }
    average = sum/count;

    for (Job jb : jobs){
        if(jb.getSalary()<average){
           title.add(jb.getTitle());
        }
    }
    return title;
}
/**
 * Method returns salary of provided job title.
 * Example:
 * .getSalary(jobs, "Accounting")
 */

public static int getSalaryOf(List<Job> jobs, String title){
    for(Job jb : jobs){
        if(jb.getTitle().equalsIgnoreCase(title));
        return jb.getSalary();
    }
    return -1;
}

/**
 * Method updates salary of jobs for provided titles with specific percentage
 * Example:
 * .increaseSalary(jobs, title, 10) -> return list of all jobs with updated salaries
 */

public static List<Job> increaseSalary(List<Job> jobs, List<String> titles, int percentage){
    for(String st : titles){
        for (int i = 0; i < jobs.size(); i++) {
            if(jobs.get(i).getTitle().equalsIgnoreCase(st)){
                //update salary
                int salary = jobs.get(i).getSalary();
                salary = salary+salary*percentage/100;
                jobs.get(i).setSalary(salary);
                break;
                    }
                }
            }
    return jobs;
}
}
