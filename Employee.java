public class Employee {

    int employeeId;
    String employeeName;
    String employeeAddress;
    float salary;
    char gender;

    void printDetails(){
        int myLcoalVar = 0;
        System.out.println("Printing details of the employee");
        System.out.println();
        System.out.println("Employee id " + employeeId);
        System.out.println("Name of the employee is " + employeeName );
        System.out.println("Address is " + employeeAddress);
        System.out.println(employeeName + " has a salary of " + salary);
        System.out.println("Gender of the employee is " + gender);
        System.out.println(myLcoalVar);
    }
}
