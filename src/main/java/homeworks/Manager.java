package homeworks;

public class Manager {

    String managerName;
    int managerId;
    int salary;
    Department department;

    public Manager(String managerName, int managerId, int salary, Department department) {
        this.managerName = managerName;
        this.managerId = managerId;
        this.salary = salary;
        this.department = department;
    }

    public String getManagerName() {
        return managerName;
    }

    public int getManagerId() {
        return managerId;
    }

    public int getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }
}
