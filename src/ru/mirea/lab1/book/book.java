package ru.mirea.lab1.book;

public class book {
    int res;

    public void weightCount(int a,int b, int c){
        res = a * b * c;
    }

    @Override
    public String toString(){
        return "result: " + res;
    }
}
