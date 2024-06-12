package objects;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John",101,true, 'M');
        Employee employee2 = new Employee("Patel",102,true,'M');
        Employee employee3 = new Employee("Kim",103,false,'M');
        Employee employee4 = new Employee("Sarah",104,false,'F');
        Employee employee5 = new Employee("Srinivasan",105,true,'M');

        Employee[] employees={employee1,employee2,employee3,employee4,employee5};
        // Print name of emp whose name contains letter 'a' or 'e' and has id as an even number
        for (Employee emp : employees){
            if((emp.name.contains("a")||emp.name.contains("e"))&&emp.id%2==0){
                System.out.println(emp.name);
            }
        }

        // Print last three character of names of male emp who works remotely.
        for (Employee emp : employees){
            if(emp.gender =='M' && emp.isRemote){
                System.out.println(emp.name.substring(emp.name.length()-3));
            }
        }
    }
}
