/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.fall24.cs44542.sec02.arrayAndArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: 44542-02 Object-Oriented Programming
 *
 * @author Wyatt Morgan
 * Description: Lab 05 Arrays Array List Scanner 
 * Due: 10/10/2024
 */

/*
The NorthwestBookDriver class is a main method class we are simulating a book store,
asking if they want to by a book, showing options and prices, storing choices, 
and calculating the total price and book list for the printed receipt.
All of this is done using arrayLists, nested arrayLists, and formatting.
*/
public class NorthwestBookDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        // Creating scanner to read file
        Scanner file = new Scanner(new File("inputFile.txt"));

        // Declaring arraylists
        ArrayList<String> genre = new ArrayList<>();
        ArrayList<String> books = new ArrayList<>();
        ArrayList<Double> bookPrice = new ArrayList<>();
        ArrayList<ArrayList<String>> booksList = new ArrayList<>();
        ArrayList<ArrayList<Double>> priceList = new ArrayList<>();

        // Place holder arraylists so i can call the newly formatted handlePurchase method:
        ArrayList<String> purchasedBooks = new ArrayList<>();
        ArrayList<Double> purchasedPrices = new ArrayList<>();

        // Adding the first line of the file to the genre arraylist
        genre.add(file.nextLine());

        // loop to iterate through each line of the file
        while (file.hasNextLine()) {
            // String to make each line a character that can be compared in a boolean
            String line = file.nextLine().trim();
            if (line.contains("@@@")) {
                booksList.add(books);
                priceList.add(bookPrice);

                if (file.hasNextLine()) {
                    genre.add(file.nextLine());
                }

                books = new ArrayList<>();
                bookPrice = new ArrayList<>();
            } else if (line.contains(".") == false) {
                books.add(line);

            } else {
                // Changing value of read character to double to make it a valid price
                double price = Double.parseDouble(line);
                bookPrice.add(price);
            }
        }

        // Introduction to store and options
        System.out.println("Welcome to the Northwest Bookstore.");
        System.out.println("1. View the book collection");
        System.out.println("2. Purchase a book");
        System.out.println("3. Exit");

        // Taking input on which method (section) they want to run
        System.out.print("Select an option: ");
        int option = input.nextInt();

        // Looping through the input prompt if the input is invalid and ending it if it is option 3
        while (option != 3) {
            if (option == 1) {
                displayBooks(genre, booksList, priceList);
                System.out.println("1. View the book collection");
                System.out.println("2. Purchase a book");
                System.out.println("3. Exit");
                System.out.print("Select an option: ");
                option = input.nextInt();
            } else if (option == 2) {
                handlePurchase(genre, booksList, priceList, purchasedBooks, purchasedPrices);
                break;
            } else {
                System.out.println("Invalid option. Please select again.");
                System.out.println("1. View the book collection");
                System.out.println("2. Purchase a book");
                System.out.println("3. Exit");
                System.out.print("Select an option: ");
                option = input.nextInt();
            }
        }
    }

    // Displaybooks method to output genres, books, and prices
    public static void displayBooks(ArrayList<String> genre, ArrayList<ArrayList<String>> books, ArrayList<ArrayList<Double>> bookPrice) {
        // making set widths for each column to help with formatting
        final int COLUMNWIDTH = 50;
        final int PRICEWIDTH = 30;

        // iterating through the different genres
        for (int i = 0; i < genre.size(); i++) {
            String genreName = genre.get(i);
            int spaces = (60 - genreName.length()) / 2; // I had to look this up but this is to center the genre above books list
            System.out.println(" ".repeat(spaces) + genreName);// I had to look this up but this is to center the genre above books list

            System.out.println("-".repeat(60));

            // making array lists for the current genre in each loop
            ArrayList<String> booksList = books.get(i);
            ArrayList<Double> priceList = bookPrice.get(i);

            // iterating through the nested arraylists for books and price to output properly with string formatting
            for (int j = 0; j < booksList.size(); j++) {
                String bookName = String.format("%-" + COLUMNWIDTH + "s", booksList.get(j));
                String price = String.format("%-" + PRICEWIDTH + ".2f", priceList.get(j));
                System.out.println(bookName + " - $" + price);
            }

            System.out.println("*".repeat(60));
        }
    }

    // handlePurchase method
    private static void handlePurchase(ArrayList<String> genre, ArrayList<ArrayList<String>> books, ArrayList<ArrayList<Double>> bookPrice,
            ArrayList<String> purchasedBooks, ArrayList<Double> purchasedPrices) { // added 2 custom arraylists I made so i could recursivly call the function properly

        // initializing scanner and variables
        Scanner input = new Scanner(System.in);
        int numCount = 1;

        // These are the two custom arraylists I added to the method so you can see what my mindset was before putting them there
//        ArrayList<String> purchasedBooks = new ArrayList<>();
//        ArrayList<Double> purchasedPrices = new ArrayList<>();
        // asking if they want to purchase a book
        System.out.println("Would you like to purchase a book?");
        System.out.println("1. Yes\n2. No");
        System.out.print("Select an option : ");
        int choice = input.nextInt();

        // taking input and either recursivley calling the method again when invalid, or offering books based on the genre
        if (choice == 1) {
            System.out.println("Select a genre to purchase from:");
            for (String type : genre) {
                System.out.println(numCount + ". " + type);
                numCount++;
            }

            int genreChoice = input.nextInt();
            if (genreChoice < 1 || genreChoice >= 9) {
                System.out.println("Invalid genre selection.");
                handlePurchase(genre, books, bookPrice, purchasedBooks, purchasedPrices);
            } else {
                // Asking for which book they want
                System.out.println("Select a book to purchase:");

                // Looping through the books list that corresponds to the given genre
                numCount = 1;
                for (int i = 0; i < books.get(genreChoice - 1).size(); i++) {
                    System.out.println(numCount + ". " + books.get(genreChoice - 1).get(i) + " - " + bookPrice.get(genreChoice - 1).get(i));
                    numCount++;
                }
                int bookChoice = input.nextInt();

                if (bookChoice >= 1 && bookChoice <= 4) {
                    // Added the chosen book AND price that corresponds to it to
                    // their respective arraylists
                    purchasedBooks.add(books.get(genreChoice - 1).get(bookChoice - 1));
                    purchasedPrices.add(bookPrice.get(genreChoice - 1).get(bookChoice - 1));
                    System.out.println("Book added to cart.");
                    handlePurchase(genre, books, bookPrice, purchasedBooks, purchasedPrices);
                } else {
                    // if invalid book input is given, resets the method
                    System.out.println("Invalid book choice");
                    handlePurchase(genre, books, bookPrice, purchasedBooks, purchasedPrices);
                }

            }
        } else if (choice == 2) {
            printReceipt(purchasedBooks, purchasedPrices);
        } else {
            handlePurchase(genre, books, bookPrice, purchasedBooks, purchasedPrices);
        }
    }

    private static void printReceipt(ArrayList<String> purchasedBooks, ArrayList<Double> purchasedPrices) {
        // making set widths for each column to help with formatting
        final int COLUMNWIDTH = 50;
        final int PRICEWIDTH = 30;
        double total = 0;

        // Header for receipt
        System.out.println("*".repeat(60));
        System.out.println("*".repeat(20) + "  Purchase Receipt  " + "*".repeat(20));
        System.out.println("*".repeat(60));

        // iterating through the nested arraylists for books and price to output properly with string formatting
        for (int j = 0; j < purchasedBooks.size(); j++) {
            String bookName = String.format("%-" + COLUMNWIDTH + "s", purchasedBooks.get(j));
            String price = String.format("%-" + PRICEWIDTH + ".2f", purchasedPrices.get(j));
            
            // adding the price of each book in the loop to the total
            total += purchasedPrices.get(j);
            System.out.println(bookName + " - $" + price);
        }
        
        // outputting total cost formatted the same
        System.out.println("-".repeat(60));
        String totalOutput = String.format("%-" + COLUMNWIDTH + "s", "Total (including tax):");
        String totalCost = String.format("%-" + PRICEWIDTH + ".2f", total);
        System.out.println(totalOutput + " - $" + totalCost);
        System.out.println("-".repeat(60));
    }
}