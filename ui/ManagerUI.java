package ui;
import controller.*;
import java.util.Scanner;

public class ManagerUI {
    private SalesController salesController;
    private ProductController productController;

    /**
     * Constructor for objects of class LoanMenu
     */
    public ManagerUI() {
        // initialise instance variables
        productController = new ProductController();
        salesController = new SalesController();
    }

    public void start() {
        ManagerMenu();
    }

    private void ManagerMenu() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            switch (choice) {
                case 1:
                  System.out.println(" Denne er ikke implementeret endnu!");
                  break;
                case 0:
                  running = false;
                  break;
                default:
                  System.out.println("En uforklarlig fejl er sket med choice = " + choice);
                  break;
            }
        }
    }
    
    private int writeManagerMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Udl�nsmenu ******");
        System.out.println(" (1) Opret l�n");
        System.out.println(" (0) Tilbage");
        System.out.print("\n V�lg:");
        int choice = getIntegerFromUser(keyboard);
        return choice;
    }
    
    private int getIntegerFromUser(Scanner keyboard) {
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal v�re et tal - pr�v igen");
            keyboard.nextLine();
        }
        return keyboard.nextInt();
    }
}