public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addStaff(new Employee("Ivanov", 9000, 10));
        employeeBook.addStaff(new Employee("Petrov", 15000, 11));
        employeeBook.addStaff(new Employee("Alex", 12000, 10));
        employeeBook.addStaff(new Employee("Fedorov", 14000, 10));
        employeeBook.addStaff(new Employee("Krasnov", 15000, 11));
        employeeBook.addStaff(new Employee("Ivanov", 9000, 10));
        employeeBook.deleteStaff("Petrov");
        employeeBook.searchStaff("Alex");
        employeeBook.searchStaff("Sidorov");
        employeeBook.printStaff();


    }
}