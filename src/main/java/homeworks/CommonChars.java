package homeworks;

public class CommonChars {
    /*
    Write a method that accepts two Strings as a parameters and returns common characters.

Example:
.commonChars("Code", "Mode");  returns "ode";
.commonChars("Bunny", "Sun");  returns "un";
.commonChars("Hot", "Cold");  returns "o";
     */
    public static void main(String[] args) {

        System.out.println(commonCharacters("Code","Mode"));
        System.out.println(commonCharacters("Bunny","Sun"));
        System.out.println(commonCharacters("Hot","Cold"));

    }
    public static String commonCharacters(String str1, String str2){
        StringBuilder common = new StringBuilder();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(str2.contains(String.valueOf(ch)) && common.indexOf(String.valueOf(ch))==-1){
                common.append(ch);
            }
        }
        return common.toString();
    }
}
