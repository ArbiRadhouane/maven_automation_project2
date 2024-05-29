package Day2;

import java.util.ArrayList;

public class T3_Forloop {
    public static void main(String[] args) {

        //declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
//add some values to the countries array list
        countries.add("Tunisia");//INDEX 0
        countries.add("India");//INDEX 1
        countries.add("Bangladesh");//INDEX 2
        countries.add("USA");//INDEX 3
        countries.add("canada");//INDEX 4

//print out all the countries using a for loop
        //i++ means add one to the value of i
        for (int i = 0; i < countries.size(); i++ ){
            //print out which index is at
            System.out.println("the value of i is" + i);
            //print out the country located at index i
            System.out.println("My countries are " + countries.get(i));
        }//end of for loop
    } //end of main
}
