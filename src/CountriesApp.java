/**
 * Created by seandunn92 on 4/24/17.
 */
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class CountriesApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fileName = "Countries.txt";
        CountriesTextFile.createFile(fileName);
        int userInput = 0;

        do {
            System.out.println("Choose an option");
            System.out.println("1: Display countries");
            System.out.println("2: Enter in a country");
            System.out.println("Any other number Quit");
            userInput= scan.nextInt();
            scan.nextLine();
            if (userInput==1){
                CountriesTextFile.ReadFromFile(fileName);
            }
            else if (userInput==2){
                CountriesTextFile.WriteToFile(scan, fileName);
            }


        }while (userInput==1  || userInput==2);

        System.out.println("Goodbye");




    }

}
