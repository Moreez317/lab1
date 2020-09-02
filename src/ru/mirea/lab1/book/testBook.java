package ru.mirea.lab1.book;

public class testBook {
    public static void main(String[] args){
        book book1;
        book1 = new book();
        book1.weightCount(150, 20, 30);
        System.out.println(book1.toString());
    }
}
