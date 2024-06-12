package encapsulation;

public class Person {
    private String name;
    private int age;
    private char gender;
    private boolean isAdult;

    public void setName(String name){
        if(name.length()>=3){
            this.name = name;
        }else{
            System.out.println("Invalid name");
        }
    }

    public String getName(){
    return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }

    public void setAdult(boolean adult){
        this.isAdult = adult;
    }

    public boolean getAdult(){
        return isAdult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isAdult=" + isAdult +
                '}';
    }
}
