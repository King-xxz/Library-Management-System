package Ioperate;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class ReturnBook implements IOperate{
    @Override
    public void work(BookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你要归还的书籍名称:");
        String name=scanner.nextLine();
        for(int i=0;i< bookList.getSize();i++){
            Book book=bookList.getBooks()[i];
            if(book.getName().equals(name)){
                if(book.getBorrowed().equals(true)){
                    book.setBorrowed(false);
                    System.out.println("归还成功");
                    break;
                }else{
                    System.out.println("该书未被借阅");
                    break;
                }

            }
            if(bookList.getSize()-1==i){
                System.out.println("没找到该书籍");
            }
        }

    }
}
