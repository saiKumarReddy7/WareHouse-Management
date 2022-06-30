package Main;
import java.util.Scanner;
import java.lang.Math.*;
public class Shelf {

    Computer[] computerArray;
    Shelf(int maxNoOfComputers)
    {
        computerArray=new Computer[maxNoOfComputers];
    }

    public void addComputer(Computer computer,int position1) {
        computerArray[position1]=computer;
    }
    public void displayComputers() {
        for(int i=0;i<computerArray.length;i++)
        {
            if(computerArray[i]!=null)
            {
                System.out.printf("* Position %d = ",i);
                System.out.printf("Computer{ Brand Name : %s  Model Name : %s  Hard Drive Capacity : %d  Memory : %d  Cpu Speed : %f  Price : %f }",computerArray[i].getBrandName(),computerArray[i].getModelName(),computerArray[i].getHardDeriveCapacity(),computerArray[i].getMemory(),computerArray[i].getCpuSpeed(),computerArray[i].getPrice());
            }
            else {
                System.out.printf("* Position %d = Null",i);
            }
            System.out.println();
        }
    }

    public void removeComputer(int position) {
        computerArray[position]=null;
    }

    public void fiterComputers(String search,Shelf shelf) {
        for(int i=0;i<computerArray.length;i++)
        {
            if(shelf.computerArray[i]!=null)
            {
                if(computerArray[i].getBrandName().contains(search)|| computerArray[i].getModelName().contains(search))
                {
                    System.out.printf("Computer{ Brand Name : %s  Model Name : %s  Hard Drive Capacity : %d  Memory : %d  Cpu Speed : %f  Price : %f }",computerArray[i].getBrandName(),computerArray[i].getModelName(),computerArray[i].getHardDeriveCapacity(),computerArray[i].getMemory(),computerArray[i].getCpuSpeed(),computerArray[i].getPrice());
                    System.out.println();
                }
            }
        }
    }

    public void priceOfComputer(Shelf shelf) {
        for(int i=0; i<computerArray.length;i++)

        {
            if (shelf.computerArray[i]!=null) {
                System.out.printf("Price : %f", computerArray[i].getPrice());
                System.out.println();


            }
            else{
                System.out.println("Empty");
            }
        }
    }

    public void sqrt(Shelf shelf) {
        for(int i=0;i<computerArray.length;i++)
        {
            if(shelf.computerArray[i]!=null)
            System.out.println(Math.sqrt(computerArray[i].getPrice()));
            else
                System.out.println("Empty");
        }

    }

    public void power2(Shelf shelf) {
        for(int i=0;i<computerArray.length;i++) {
            if(shelf.computerArray[i]!=null)
            System.out.println(Math.pow(computerArray[i].getPrice(),2));
            else
                System.out.println("Empty");
        }
    }
}
