public class Employee extends Person {
    private String role;
    private int employeeId;

    public Employee() { super(); }

    public Employee(String name, int age, String gender, String role, int employeeId) {
        super(name, age, gender);
        this.role = role;
        this.employeeId = employeeId;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
}