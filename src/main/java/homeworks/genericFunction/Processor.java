package homeworks.genericFunction;

public class Processor {

    public String process(String str, GenericFunction<String> function){
        if (str == null || str.isEmpty()) {
            return "Invalid input!";
        }

        int length = function.apply(str);

        if(length>10) return length+"(High)";
        else return length+"(Low)";
    }

}
