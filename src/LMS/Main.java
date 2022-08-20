package LMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter the user name: ");
            String username = input.nextLine();
            System.out.println("Enter the password: ");
            String password = input.nextLine();
            if (username.equals("abir") && password.equals("1234")){
                while (true){
                    System.out.println("..............................................................................WELCOME TO MY LIBRARY ! HERE IT GOES........................................................... ");

                    System.out.println("Enter 1 to show all the books are available in the library");
                    System.out.println("Enter 2 to show Available books for issuing");
                    System.out.println("Enter 3 to add a new book in the Library");
                    System.out.println("Enter 4 to issue a book");

                    int options = input.nextInt();

                    switch (options){

                        case (1):
                            Books books = new Books();
                            books.allbooks();
                            break;
                        case (2):
                            Books books1 = new Books();
                            books1.afterissue();
                            break;
                        case (3):
                            Books books2 = new Books();
                            books2.addBooks();
                            break;
                        case (4):
                            Books books3 = new Books();
                            books3.Issue_Book();
                            break;
                    }
                }
            }
            else {
                System.out.println("Your user id or password is not correct... please try again!");
            }
        }
    }
}
