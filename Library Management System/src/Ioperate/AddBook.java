package Ioperate;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class AddBook implements IOperate{
    @Override
    public void work(BookList bookList) { Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书籍的名称");
        String name=scanner.nextLine();
        System.out.println("请输入作者的名称");
        String author=scanner.nextLine();
        System.out.println("请输入书籍的价格");
        int price=scanner.nextInt();
        System.out.println("请输入书籍的类型");
        String type=scanner.nextLine();
        bookList.getBooks()[bookList.getSize()-1]=new Book(name,author,price,type);
        System.out.println("新增图书成功");
    }
}
