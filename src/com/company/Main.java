package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    proccesArrayList();
                    break;
            }
            }
        }

        public static void printInstructions() {
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice option.");
            System.out.println("\t 1 - To print the list of grocery items.");
            System.out.println("\t 2 - To add an item to the list.");
            System.out.println("\t 3 - To modify an item in the list.");
            System.out.println("\t 4 - To remove an item from the list.");
            System.out.println("\t 5 - To search for an item in the list.");
            System.out.println("\t 6 - To quit the application.");
        }

        public static void addItem() {
            System.out.println("Please enter the grocery item: ");
            groceryList.addGroceryItem((s.nextLine()));
        }

        public static void modifyItem() {
            System.out.println("Current item name: ");
            String itemNo = s.nextLine();
            s.nextLine();
            System.out.println("Enter new item: ");
            String newItem = s.nextLine();
            groceryList.modifyGroceryItem(itemNo, newItem);
        }

        public static void removeItem() {
            System.out.println("Enter item number: ");
            String itemNo = s.nextLine();
            s.nextLine();
            groceryList.removeGroceryItem(itemNo);
        }

        public static void searchForItem() {
            System.out.println("Item to search for: ");
            String searchItem = s.nextLine();
            if(groceryList.onFile(searchItem)) {
                System.out.println("Found " + searchItem + " in our grocery list.");
            } else {
                System.out.println(searchItem + " was not found in the shopping list.");
            }
        }

        public static void proccesArrayList(){
            ArrayList<String> newArray = new ArrayList<String>();
            newArray.addAll(groceryList.getGroceryList());

            //The same as above but shorter, and you're creating the array at the time of running.
            ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

            //Converting ArrayList to Array.
            String[] myArray = new String[groceryList.getGroceryList().size()];
            myArray = groceryList.getGroceryList().toArray(myArray);
        }










}
