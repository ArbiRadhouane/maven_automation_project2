package Day2;

public class T1_linearArray {
    public static void main(String[] args) {
        //declare a string array variable
        String[]studentNames;
        //store some values in the string array
        studentNames = new String[]{"Abdul","Ahmad", "Anderson", "Wahid"};
        //print out index 0 from studentName array
        //array starts with 0
        System.out.println("the value index 0 is "+ studentNames[0]);
        //print out Anderson from the studentNames array
        System.out.println("the student Name is "+ studentNames[2]);
        //print out Wahid from the studentNames array
        System.out.println("the student name  is "+ studentNames[3]);
        //print out Wahid from the studentNames array
        int[] studentGrades = new int[] {90 ,93 ,94,99};
        // print out grade 93 from the array
        System.out.println("student grade" + studentGrades[1]);


    }//and of main
}//end of class


