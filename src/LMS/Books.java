package LMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Books implements addBooks,removeBooks,IssuingBooks,afterIssue,Allbooks {
    // all the books that are in the library
    static ArrayList<String> All_Books = new ArrayList<>();


    // The books that are not being issued by anyone
    ArrayList<String> afterIssue = new ArrayList<>(All_Books);
    Scanner object = new Scanner(System.in);




    @Override
    public void addBooks() {
        System.out.println("Enter the book name that you want to add: ");
        All_Books.add(object.nextLine());
        System.out.println(object + " is successfully added to the list");
    }

    @Override
    public void Issue_Book() {
        System.out.println("From the list pick which book do you want to borrow !");
        for (int i = 0; i < afterIssue.size(); i++) {
            System.out.println("Press "+i+ " for :"+afterIssue.get(i));
        }
        System.out.println("Enter the book number: ");
        int inputValue = object.nextInt();

        System.out.println("Has successfully borrowed "+ afterIssue.get(inputValue) +" book From your library");

        // After borrowing the book i need to remove it form the list of available books for borrowing.

        afterIssue.remove(inputValue);

    }

    @Override
    public void Remove_Books() {
        // In this program we don't need this method because in the issue book method we can issue book and delete it from the same function
    }

    @Override
    public void afterissue() {
        System.out.println("Books are available for issue are "+ afterIssue);
    }

    @Override
    public void allbooks() {
        System.out.println("All the books that are available in the library are \n " + All_Books);
    }
}
