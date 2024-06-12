package bufferReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

    private static List<Job> jobs = new ArrayList<>();

    static {
        FileReader file = null;
        try {
            file = new FileReader("/Users/arslannurlyyev/IdeaProjects/MindtekJavaDevProject/src/main/java/bufferReader/data.csv");

        BufferedReader br = new BufferedReader(file);

        String line;

        while ((line = br.readLine())!=null){
            //line = "President,AD_PRES,4000";
            String[] data = line.split(",");
            // data = ["President", "AD_PRES", 4000]
            //System.out.println(Arrays.toString(data));
            Job job = new Job(data[0],data[1],Integer.parseInt(data[2]));
            jobs.add(job);
        }
        } catch (IOException e) {}
    }

    public static List<Job> getJobs(){
        return jobs;
    }
}
