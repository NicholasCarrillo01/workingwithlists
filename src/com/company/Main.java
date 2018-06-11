package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> nameList;
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        Main mainClass = new Main();
        mainClass.testingList();

    }

    private void testingList() {

        nameList = new ArrayList<String>();

        nameList.add("crystal");
        nameList.add("chris");
        nameList.add("bin");
        nameList.add("luke");

        System.out.println("see all the items in the ArrayList");
//       for each

        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("see a single item int thw Array list")
        System.out.println(nameList.get(2));


        System.out.println("remove a single item and list what is left in the ArrayList");
        nameList.remove(0);

        for (String name : nameList) {
            System.out.println(name);
        }

        for (int i = 0; i < nameList.size(); i++) {

            System.out.println((i + 1)" " + nameList.get(i));
        }

        System.out.println("which number would you like to remove");
        int numberToRemove = input.nextInt() - 1;

        if (numberToRemove > nameList.size() || numberToRemove < 0 {
            System.out.println("that is not a valid number");

        } else {
            nameList.remove(numberToRemove);
        }
        System.out.println("list after take out selected number");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }
    }
}