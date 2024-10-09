package Ioperate;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

public class FindBook implements IOperate{

    @Override
    public void work(BookList bookList) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书籍的名称");
        String name=scanner.nextLine();
            for(int i=0;i<bookList.getSize();i++){
                Book book=bookList.getBooks()[i];
                if(book.getName().equals(name)){
                    System.out.println("查找到书籍");
                    break;
                }
                if(i==bookList.getSize()-1){
                    System.out.println("未发现该书籍");
                }
            }


    }
}
