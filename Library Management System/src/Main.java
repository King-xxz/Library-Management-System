import Book.BookList;
import User.User;
import User.AdminUser;
import User.NormalUser;
import java.util.Scanner;

public class Main {
    public static User logo(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的姓名");
            String name = scanner.nextLine();
            System.out.println("请输入你的身份(1:管理员,2:普通用户)");
            int choice = scanner.nextInt();
            if (choice == 1) {
                return new AdminUser(name);
            } else if (choice == 2) {
                return new NormalUser(name);
            } else {
                System.out.println("不合法的选择");
            }
        }

    }
    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=logo();
        while(true){
            int choice=user.menu();
            user.doWork(choice,bookList);}
        }


}
