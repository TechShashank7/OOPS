package com.student;

public class Library {
    int borrowed_books;
    private final int max_books=5;
    int books=0;
    public int borrowbook(int borrowed_books){
        if(borrowed_books>0 && borrowed_books<5){
            books++;
        }
        return books;
    }
//    public returnbook(){
//
//    }
}
