package com.cseru;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //        System.out.println("Enter your address: ");
//        Scanner scanner = new Scanner(System.in);
//        String address = scanner.nextLine();
//        System.out.println("You live at: " + address);

        //Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your grade: ");
//        int grade = scanner.nextInt();
//        if(grade > 90){
//            System.out.println("Wow! you did well!");
//        }else{
//            System.out.println("Not bad, but you can do better next time!");
//        }
//
//        //Guess Number game
//        int randomNumber = (int)(Math.random() * 100) +1;
//        boolean hasWon = false;
//        System.out.println("I have randomly chosen a number between 1 and 100.");
//        System.out.println("Try to guess it.");
//
//        Scanner scanner = new Scanner(System.in);
//        for(int count = 10; count > 0; count--){
//            System.out.println("You have " + count + " guess(es) left. choose again: ");
//            int guess = scanner.nextInt();
//
//            if(randomNumber < guess){
//                System.out.println("It's smaller than " + guess + ".");
//            }else if(randomNumber > guess){
//                System.out.println("It's Bigger than " + guess + ".");
//            }else{
//                hasWon = true;
//                break;
//            }
//        }
//        if(hasWon){
//            System.out.println("CORRECT....YOU WON!!!");
//        }else{
//            System.out.println("GAME OVER... YOU LOSE!!!");
//            System.out.println("The number was : " + randomNumber);
//        }
//    }

        File file = new File("resources//testfile.txt");
        int words = 0;
        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            words = words + line.split(" ").length;
        }
        System.out.println("The file contains: " + words + " words.");



        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner scanner = new Scanner(System.in);
        try {
            int month = scanner.nextInt();
            System.out.print(months[month]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.print("Index is out of bounds");
        } catch (InputMismatchException exception) {
            System.out.print("Input mismatch");
        }
    }
}
