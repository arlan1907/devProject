package encapsulation;

public class Apple {
    public static void main(String[] args) {
        Department department1 = new Department("IT", 1, "Cupertino CA");
        Department department2 = new Department("Finance", 2, "Austin TX");
        Department department3 = new Department("HR", 3, "Austin TX");

        Employee employee1 = new Employee("John Doe", 101, department1);
        Employee employee2 = new Employee("Patel Harsh", 102, department2);
        Employee employee3 = new Employee("Kim Yan", 103, department2);
        Employee employee4 = new Employee("Kate Connor", 104, department3);
        Employee employee5 = new Employee("Brad Pitt", 105, department1);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        for(Employee emp : employees){
            System.out.println(emp.getName()+ " works in " + emp.getDepartment().getName()+ " department");
        }

        for(Employee emp : employees){
            if(emp.getDepartment().getName().equalsIgnoreCase("it")){
                System.out.println(emp.getEmpId());
            }
        }


        //count number of emp who works in Austin TX
        int count = 0;
        for(Employee emp : employees){
            if(emp.getDepartment().getLocation().equalsIgnoreCase("austin tx")) count++;
        }
        System.out.println(count);
    }

    // get emp names who has empId and departmentId as even number
    // get emp names who works in Cupertina and emp name has more than 5 chars
}







