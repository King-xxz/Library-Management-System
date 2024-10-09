package Book;

import java.util.Arrays;

public class BookList {
    private Book[] books=new Book[10];
    private int size;//书的数量

    public BookList() {
        books[0]=new Book("三国演义","罗贯中",30,"小说");
        books[1]=new Book("西游记","吴承恩",30,"小说");
        books[2]=new Book("红楼梦","曹雪芹",30,"小说");
        this.size = 3;
    }

    public Book[] getBooks() {
        return books;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addBook(Book book){
        books[size-1]=book;
        size+=1;
    }

    public void delBook(int index){
        for(int i=size-1;i>index;i--){
            books[i-1]=books[i];
        }
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
