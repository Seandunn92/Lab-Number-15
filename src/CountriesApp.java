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
        String dir = "/Users/seandunn92/IdeaProjects/CountriesProject/src";


        CountriesTextFile.createFile(fileName);
        int userInput = 0;

        do {
            System.out.println();
            System.out.println("Choose an option");
            System.out.println("1: Display countries");
            System.out.println("2: Enter in a country");
            System.out.println("Any other number Quit");
            userInput= scan.nextInt();
            scan.nextLine();
            System.out.println();
            if (userInput==1){
                CountriesTextFile.ReadFromFile(dir,fileName);
            }
            else if (userInput==2){
                CountriesTextFile.WriteToFile(scan,dir, fileName);
            }


        }while (userInput==1  || userInput==2);

        System.out.println("Goodbye");




    }

}
