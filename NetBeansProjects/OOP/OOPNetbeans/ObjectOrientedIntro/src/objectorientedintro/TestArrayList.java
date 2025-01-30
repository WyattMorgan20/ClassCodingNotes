/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedintro;

import java.util.ArrayList;

/**
 *
 * @author s540549
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Book> listBooks = new ArrayList<>();
        listBooks.add(new Book("Horse Heaven", 17));
        listBooks.add(new Book("Data Warehousing", 75));
        listBooks.add(new Book("The Kite Runner", 25));
        listBooks.add(new Book("Naruto", 12));
        
        // Enhanced for loops ex:
        System.out.println("Enhanced for loop ex:");
        for(Book objBook: listBooks){
            System.out.println(objBook);
        }
        
        System.out.println("------");
        System.out.println("Updated enhanced for loop:");
        Book b = listBooks.get(2);
        listBooks.set(2, new Book("Boruto", b.getPrice()));
        for(Book objBook: listBooks){
            System.out.println(objBook);
        }
        
        // Normal for loop ex:
        System.out.println("------");
        System.out.println("Normal for loop ex:");
        for(int i = 0; i < listBooks.size(); i++){
            System.out.println(listBooks.get(i));
        }
    }
}