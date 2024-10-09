package Ioperate;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class BorrowBook implements IOperate{
    @Override
    public void work(BookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要借阅的书籍名称:");
        String name=scanner.nextLine();
        for(int i=0;i< bookList.getSize();i++){
            Book book=bookList.getBooks()[i];
            if(book.getName().equals(name)){
                book.setBorrowed(true);
                System.out.println("借阅成功");
                break;
            }
            if(bookList.getSize()-1==i){
                System.out.println("没找到该书籍");
            }
        }
    }
}
