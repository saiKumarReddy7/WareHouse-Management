package Main;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("How Many spaces does your shelf has??");
        int noOfComputers = input.nextInt();
        Shelf shelf=new Shelf(noOfComputers);
        Menu menu=new Menu();
        menu.menu(shelf);


    }
}
