package bufferReader;

public class Job {

    private String title;
    private String JobId;
    private int salary;

    public Job(String title, String jobId, int salary) {
        this.title = title;
        JobId = jobId;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobId() {
        return JobId;
    }

    public void setJobId(String jobId) {
        JobId = jobId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", JobId='" + JobId + '\'' +
                ", salary=" + salary +
                '}';
    }
}
