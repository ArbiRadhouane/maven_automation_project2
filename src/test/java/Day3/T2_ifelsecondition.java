package Day3;

public class T2_ifelsecondition {
    public static void main (String[] args) {
        int a = 1;
        int b = 5;
        int c = 6;

        if (a+b>c)
        {
            System.out.println ("A and B are greater than C ");
        } else if (b+b==c)
        {
            System.out.println("A and B are equal to C");
        } else {
            System.out.println("Both statements are false and this one is true");
        }
    }//End of main
}
