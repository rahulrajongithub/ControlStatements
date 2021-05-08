import java.util.Scanner;
import Enterprise.*;

public class App {
    static Employee[] employee = new Employee[10];
    static int empId = 0;
    static int empCount = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean iterationFlag = true;

        do {
            System.out.print(
                    "\nWelcome to the Office!\n\n1. Add Employee\n2. Delete Employee\n3. Display Employee\n4. Display all Employees\n5. Check Incentive Eligibility\n6. Exit Office\n\n\tChoose your option : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    employee[empCount] = addEmployee();
                    empCount++;
                    break;
                case 2:
                    // delete employee
                    break;
                case 3:
                    displayEmployee();
                    break;
                case 4:
                    // Display all employees
                    break;
                case 5:
                    // Check incentive eligibility
                    break;
                case 6:
                    iterationFlag = false;
                    break;
                default:
                    System.out.println("Invalid Input. Try again.");
            }
        } while (iterationFlag);
        System.out.println("\nThank you. Come again!");
    }

    public static Employee addEmployee() {
        empId++;
        System.out.print("Enter the name : ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter the Appraisal Score : ");
        double aScore = sc.nextDouble();
        System.out.print("Enter experience in years : ");
        int exp = sc.nextInt();
        System.out.print("Enter the grade : ");
        int grade = sc.nextInt();

        Employee temp = new Employee(name, empId, aScore, exp, grade);
        return temp;

    }

    public static void displayEmployee(){
        System.out.print("Enter the employee ID : ");
        int id = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < empCount; i++) {
            if(employee[i].getEmpId() == id){
                System.out.println("Name : " + employee[i].getEmpName());
                System.out.println("ID : " + employee[i].getEmpId());
                System.out.println("Position : " + employee[i].getPosition());
                System.out.println("Grade : " + employee[i].getGrade());
                System.out.println("Experience : " + employee[i].getExperience());
                System.out.println("Appraisal Score : " + employee[i].getAppraisalScore());
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Employee not found!");
    }
}
