package encapsulation;

public class Employee {

    private String name;
    private int empId;
    private Department department;

    public Employee(String name, int empId, Department department) {
        this.name = name;
        this.empId = empId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", department=" + department +
                '}';
    }
}
