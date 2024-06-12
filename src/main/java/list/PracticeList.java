package list;

import java.util.ArrayList;
import java.util.List;

public class PracticeList {
    public static void main(String[] args) {

        List<String> company = new ArrayList<>(List.of("Google","Apple","Mindtek","Tesla","Netflix","Amazon"));

        System.out.println(company);
        System.out.println(company.get(company.size()-1));
        System.out.println(company.get(company.indexOf("Amazon")));

        for (int i = 0; i < company.size(); i++) {
            if(company.get(i).startsWith("N")){
                company.set(i,"Microsoft");
            }
        }
        System.out.println(company);

// Remove the companies which has 5 characters
        for (int i = 0; i < company.size(); i++) {
            if(company.get(i).length()==5){
                company.remove(company.get(i));
            }
        }
        System.out.println(company);
    }


}
