package com.andben;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        MyLinkedList cityList = new MyLinkedList(null);
//
        String stringData = "Chicago Portland Seattle Washington Melbourne NewYork";
//        String[] data = stringData.split(" ");
//        for (String city: data) {
//            cityList.addItem(new Node(city));
//        }
//
//        cityList.traverse(cityList.getRoot());
//        cityList.removeItem(new Node("Washington"));
//        cityList.traverse(cityList.getRoot());
//        cityList.removeItem(new Node("Portland"));
//        cityList.traverse(cityList.getRoot());
//        cityList.removeItem(new Node("Chicago"));
//        cityList.traverse(cityList.getRoot());

        SearchTree tree = new SearchTree(null);

//        String stringData = "4 6 0 3 5 1 2 9";
        String[] data = stringData.split(" ");

        for (String s: data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
    }

 }

