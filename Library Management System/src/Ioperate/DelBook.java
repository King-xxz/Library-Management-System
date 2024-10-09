package Ioperate;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class DelBook implements IOperate{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择要删除的图书名字");
        String name=scanner.nextLine();
        int index=0;
        for(int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBooks()[i];
            if(book.getName().equals(name)){
                index=i;
                break;
            }
            if(i==bookList.getSize()-1){
                System.out.println("未发现该书籍");
                return;
            }
        }
        for (int i=index;i<bookList.getSize()-1;i++){
            bookList.getBooks()[i]=bookList.getBooks()[i+1];
        }
        bookList.setSize(bookList.getSize()-1);
    }
}
