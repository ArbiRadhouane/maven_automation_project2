package Day4;

import java.util.HashMap;

public class T1_Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> TriageStudents = new HashMap<>();
        //add some value for the triagestudents hashmap
        TriageStudents.put("oyon",25);
        TriageStudents.put("Shakeb",29);
        TriageStudents.put("Tanvir",27);
        TriageStudents.put("Angie",21);
        //print out the size of the hashmap
        System.out.println("the size of the hashmap is " + TriageStudents.size() );
        //print out the contamt of the hashmap
        System.out.println( TriageStudents);
        //print out oyon age
        int oyonsAge= TriageStudents.get("oyon");
        System.out.println("oyon age is " + oyonsAge);
        //print out Noyons age if it exists in the data set
        if ( TriageStudents.containsKey("Noyon")) {
            System.out.println("Noyon age is " + TriageStudents.get("Noyon"));
        }else {
            System.out.println("Noyon does not exist in the data set");
        }
    }
}
