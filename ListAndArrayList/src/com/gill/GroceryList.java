package com.gill;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
        System.out.println(item + " added to the list");
    }

    public void printList(){
        //System.out.println(groceryList);
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        //groceryList.remove(item);
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(theItem + " removed from the list");
    }

    public String findItem(String searchItem) {
       //boolean exists = groceryList.contains(searchItem);
       int position = groceryList.indexOf(searchItem);
       if(position >= 0) {
           return groceryList.get(position);
       }
       return null;
    }
}
