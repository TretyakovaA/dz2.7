import java.util.Objects;

public class Employee {
    private String fio;
    private int salaryStaff;
    private int departmentNumber;
    private int id;
    private static int counter;
    static {
        counter = 1;
    }

    public Employee (String fio, int salaryStaff, int departmentNumber) {
        this.fio = fio;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;
        id = counter++;


    }

    public String getFio () {
        return fio;
    }

    public int getId() {
        return this.id++;
    }
    public int getSalaryStaff () {return salaryStaff;}
    public int getDepartmentNumber () {return departmentNumber;}

    public void setSalaryStaff(int salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", salaryStaff=" + salaryStaff +
                ", departmentNumber=" + departmentNumber +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salaryStaff == employee.salaryStaff && departmentNumber == employee.departmentNumber && id == employee.id && Objects.equals(fio, employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, salaryStaff, departmentNumber, id);
    }
}

