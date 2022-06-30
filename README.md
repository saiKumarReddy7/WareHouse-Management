# WareHouse-Management
#In this project we are going to store the list of computers, and we are going to do various operations using Java
package Main;
import java.util.Scanner;
public class Menu {
    public void menu( Shelf shelf ) {

        int value;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("List Of Features :");
            System.out.println();
            System.out.println("1. Add Computers");
            System.out.println("2. Remove Computers");
            System.out.println("3. Filter Computers");
            System.out.println("4. Display all Computers");
            System.out.println("5. Print price of computers");
            System.out.println("6. print Square root value of price");
            System.out.println("7. Print Square value of price");
            System.out.println("8. Close the application");
            System.out.println();
            value = input.nextInt();
            if(value==1)
            {System.out.println("On which shelf you want to add the computer");
                int position1=input.nextInt();
                Input input1=new Input();
                input1.input(shelf,position1);
            } else if (value==2) {
                System.out.println("Enter position of the computer to remove");
                int position=input.nextInt();
                shelf.removeComputer(position);
            }
            else if(value==3)
            {
                System.out.println("Enter the search element : ");
                String search=input.next();
                shelf.fiterComputers(search,shelf);
            }
            else if(value==4)
            {
                shelf.displayComputers();
            }
            else if(value==5)
            {
                shelf.priceOfComputer(shelf);
            }
            else if(value==6)
            {
                shelf.sqrt(shelf);
            }
            else if(value==7)
            {
                shelf.power2(shelf);
            }
            else
                break;
        } while (value != 8);
    }
}
