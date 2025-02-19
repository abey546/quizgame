import java.util.Scanner;

class LibrarySystem {
    static String[] bookTitles = new String[100];
    static String[] bookAuthors = new String[100];
    static int[] bookQuantities = new int[100];
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nLibrary System");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    borrowBook(scanner);
                    break;
                case 3:
                    returnBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
        
        scanner.close();
    }

    public static void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter quantity: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid quantity.");
            scanner.next();
        }
        int quantity = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < bookCount; i++) {
            if (bookTitles[i].equalsIgnoreCase(title)) {
                bookQuantities[i] += quantity;
                System.out.println("Quantity updated for " + title);
                return;
            }
        }
        
        bookTitles[bookCount] = title;
        bookAuthors[bookCount] = author;
        bookQuantities[bookCount] = quantity;
        bookCount++;
        System.out.println("Book added successfully.");
    }

    public static void borrowBook(Scanner scanner) {
        System.out.print("Enter book title to borrow: ");
        String title = scanner.nextLine();
        System.out.print("Enter quantity to borrow: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid quantity.");
            scanner.next();
        }
        int quantity = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < bookCount; i++) {
            if (bookTitles[i].equalsIgnoreCase(title)) {
                if (bookQuantities[i] >= quantity) {
                    bookQuantities[i] -= quantity;
                    System.out.println("Successfully borrowed " + quantity + " copies of " + title);
                } else {
                    System.out.println("Not enough copies available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void returnBook(Scanner scanner) {
        System.out.print("Enter book title to return: ");
        String title = scanner.nextLine();
        System.out.print("Enter quantity to return: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid quantity.");
            scanner.next();
        }
        int quantity = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < bookCount; i++) {
            if (bookTitles[i].equalsIgnoreCase(title)) {
                bookQuantities[i] += quantity;
                System.out.println("Successfully returned " + quantity + " copies of " + title);
                return;
            }
        }
        System.out.println("Book not found in the library system.");
    }
}
