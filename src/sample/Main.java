package sample;

import sample.database.CSVReader;
import sample.model.User;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        reader.CSVReaderMethod();

        User user = new User();
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome! Please enter your age.");
        int age = s.nextInt();
        user.setAge(age);
        System.out.println("Please select your gender: press 1 (for Female)/or 2 (for Male)");
        int gender = s.nextInt();
        user.setGender(gender);

        if(gender==1){

            System.out.println("Are you pregnant? (y/n)");
            String pregnancy = s.nextLine();
            if(pregnancy=="y"){
                user.setPregnant(true);

            }else if(pregnancy=="n"){
                user.setPregnant(false);

            }

        }else if(gender==2){



        }





    }
}
