package homeworks.exceptionAssigment;

public class AgeDataClass {

    public void validateAge(int age){
        if(age>=0 && age<=150){
            System.out.println("Valid age");
        }else {
            throw new InvalidAgeException("Given age is invalid");
        }
    }

    public static void main(String[] args) {

        AgeDataClass ageDataClass = new AgeDataClass();
        ageDataClass.validateAge(170);
    }

}
