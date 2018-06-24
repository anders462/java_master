package com.andben;


import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    /**
     * Add an item to the grocery list
     * @param item
     */

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    /**
     * Prints grocery list
     */


    public void printGroveryList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("List item " + (i + 1) + " is " + groceryList.get(i));
        }

    }

    /**
     * Overloaded method that Replaces oldItem with newItem
     * @param oldItem
     * @param newItem
     */

    // overloaded method
    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    /**
     * Replaces item in position
     * @param position
     * @param item
     */

    private void modifyGroceryItem(int position, String item) {
        if (groceryList.size() > position ) {
            groceryList.set(position, item);
            System.out.println("Item in position " + (position + 1) + " has been modified");
        } else {
            System.out.println("No such position exits");
        }
    }

    /**
     * Removes item
     * @param item
     */

    // overloaded method
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    /**
     * Removes item in position
     * @param position
     */

    private void removeGroceryItem(int position) {
        if (groceryList.size() > position ) {
            System.out.println(groceryList.get(position) + " at position " + (position + 1) + " will be deleted");
            groceryList.remove(position);
            System.out.println("Item in position " + (position + 1) + " has been deleted");
        } else {
            System.out.println("No such position exits");
        }
    }

    /**
     * Return index of search item
     * @param searchItem
     * @return index of item
     */

    private int findItem(String searchItem) {
       return groceryList.indexOf(searchItem);
    }

    /**
     *Return true of item is on file
     * @param item
     * @return true if item is on file
     */

    public boolean onFile(String item) {
        return groceryList.contains(item);
    }
}


