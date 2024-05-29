package Day2;

import java.util.ArrayList;

public class T2_Arraylist {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("Tunisia");//INDEX 0
        countries.add("India");//INDEX 1
        countries.add("Bangladesh");//INDEX 2
        countries.add("USA");//INDEX 3
//print out Tunisia
        System.out.println("the first country is " +countries.get(0));
        //print out the size of the arraylist
        System.out.println("the total size of country arraylist is "+countries.size());
        countries.add("CANADA");//index 4
        System.out.println("the total size of country arraylist is " +countries.size());



    }//and of main
}//end of class


