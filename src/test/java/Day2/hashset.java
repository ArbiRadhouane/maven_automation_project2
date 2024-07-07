package Day2;

import java.util.ArrayList;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");
        colors.add("Rainbow");
        colors.add("Rainbow");
        colors.add("Green");
        colors.add("Pink");
        HashSet<String> set = new HashSet<>(colors);
        ArrayList<String> uniqueColors = new ArrayList<>(set);
        System.out.println("The new arraylist values after removing the duplicates are " + uniqueColors);

   //reverse
        String originalString = "I am hungry";
        String reversedString = "";
        for (int i= originalString.length()-1; i>=0; i--){
            reversedString += originalString.charAt(i);
        }
        System.out.println(reversedString);


        String originalName ="Oyon is very quiet today";
        StringBuilder sb = new StringBuilder(originalName);
        String reversedName = sb.reverse().toString();
        System.out.println(reversedName);
    }


    }

