package Ioperate;

import Book.BookList;

public class ExitBookList implements IOperate{
    @Override
    public void work(BookList bookList) {

        System.out.println("退出成功");
    }


}
