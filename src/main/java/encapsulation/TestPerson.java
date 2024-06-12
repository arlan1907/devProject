package encapsulation;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("John");
        person.setAge(20);
        person.setGender('M');
        person.setAdult(true);

        Person person2 = new Person();
        person2.setName("Patel");
        person2.setAge(25);
        person2.setGender('M');
        person2.setAdult(true);

        Person person3 = new Person();
        person3.setName("Kim");
        person3.setAge(16);
        person3.setGender('M');
        person2.setAdult(false);

        Person person4 = new Person();
        person4.setName("Kate");
        person4.setAge(28);
        person4.setGender('F');
        person4.setAdult(true);

        Person[] people = {person, person2, person3, person4};


        System.out.println(person.getName());
        System.out.println(person2.getAge());
        System.out.println(person);

        // print people name whose age more than or equal to 25

        for (int i = 0; i < people.length; i++) {
            if(people[i].getAge()>=25){
                System.out.println(people[i].getName());
            }
        }

        for (int i = 0; i < people.length; i++) {
            if(people[i].getGender() == 'M' && people[i].getName().contains("o")){
                System.out.println(people[i].getName());
            }
        }






    }
}
