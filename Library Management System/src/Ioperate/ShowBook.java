package Ioperate;

import Book.Book;
import Book.BookList;

public class ShowBook implements IOperate{
    @Override
    public void work(BookList bookList) {
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBooks()[i];
            System.out.println(book);
        }
        System.out.println("显示图书");

    }
}
