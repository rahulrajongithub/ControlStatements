import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean iterationFlag = true;

        do {
            System.out.print(
                    "\nWelcome to the Office!\n\n1. Add Employee\n2. Delete Employee\n3. Display Employee\n4. Display all Employees\n5. Check Incentive Eligibility\n6. Exit Office\n\n\tChoose your option : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // add employee
                    break;
                case 2:
                    // delete employee
                    break;
                case 3:
                    // Display employee
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
}
