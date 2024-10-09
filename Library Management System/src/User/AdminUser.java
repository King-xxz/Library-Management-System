package User;

import Book.BookList;
import Ioperate.*;

import java.util.Scanner;

public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
        this.iOperates=new IOperate[]{
                new ExitBookList(),
                new FindBook(),
                new AddBook(),
                new DelBook(),
                new ShowBook()
        };
    }

    @Override
    public int menu() {
        System.out.println("*******普通用户菜单*******");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        Scanner scnner=new Scanner(System.in);
        System.out.println("请输入你的选择");
        int choice=scnner.nextInt();
        return choice;
    }

    @Override
    public void doWork(int choice, BookList bookList) {
        this.iOperates[choice].work(bookList);
    }
}
