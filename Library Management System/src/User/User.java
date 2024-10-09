package User;

import Book.BookList;
import Ioperate.IOperate;

public abstract class User {
    protected String name;
    protected IOperate[] iOperates;
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public abstract void doWork(int choice, BookList bookList);
}
