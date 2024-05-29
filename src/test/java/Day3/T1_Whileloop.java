package Day3;

public class T1_Whileloop {
    public static void main(String[] args) {
        // A while Loop will continue to execute the block of code and loop while the condition is true. However, the moment
        //it's false, it will stop the loop.
        // i++ is also equivalent to i=i+1. What this does is that after each loop it adds 1 and starts the new loop
        //with that new number. so if i=0, it'll start as 0 and then enter the loop, then when it's done it will hit i++ or
        //i=i+1, that 0 will add 1 where it will now become 1 and enter the new loop, until it meets that condition. If condition
        //is i<=5 then it will keep going until that 0 becomes 6, then it'll stop when after that because 6 isn't less than or equal to 5.
        int i = 0;
        while (i <= 5) {
            System.out.println("Hello world " + i);
            i = i+1;
        } //End of while loop
    }//End of main
}
