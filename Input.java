package Main;
import java.util.Scanner;
public class Input {
    public void input(Shelf shelf,int position1)
    {
            Scanner input=new Scanner(System.in);
            Computer computer = new Computer();
            System.out.println("enter the BrandName(eg...hp) : ");
            computer.setBrandName(input.next());
            System.out.println("Enter Model Name(eg...15s) : ");
            computer.setModelName(input.next());
            System.out.println("Enter  Hard Drive Capacity(eg...1TB) : ");
            computer.setHardDriveCapacity(input.nextInt());
            System.out.println("Enter Memory(eg...16GB) : ");
            computer.setMemory(input.nextInt());
            System.out.println("Enter Cpu speed(eg...1.4GHZ) : ");
            computer.setCpuSpeed(input.nextFloat());
            System.out.println("Enter Price(eg...59,000) : ");
            computer.setPrice(input.nextFloat());
            shelf.addComputer(computer,position1);

    }
}
