import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private final Map<String, String> employeeMap = new HashMap<>(Map.of());
    private int size;

    public EmployeeBook() {
        size = 0;
    }

    public void addStaff(Employee employee) {
        String value = employee.getDepartmentNumber() + " " + employee.getSalaryStaff();
        employeeMap.put(employee.getFio(), value);
    }
    public void printStaff (){
        System.out.println(employeeMap.toString());
    }

    public void  deleteStaff (String fio){
        employeeMap.remove(fio);
    }
    public  void  searchStaff (String fio){
        if (employeeMap.containsKey(fio)) {
            System.out.println(fio + " " +employeeMap.get(fio));
        } else
            System.out.println("Ничего не найдено");
    }
}
