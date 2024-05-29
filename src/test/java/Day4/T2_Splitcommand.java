package Day4;

public class T2_Splitcommand {
    public static void main(String[] args) {
        //declare a string variable with a single message
        String message = "my name is John";
        //declare an array to store the split message
        String[] SplitMessage = message.split(" ");
        //print out only jhon from the string
        System.out.println("the name is" + SplitMessage [3]);
        //declare an other message
        String TriageMessage ="Automation_02";
        //store the message in a lineare array
        String[] TriageMessagArray = TriageMessage.split("_");
        //print out only the number
        System.out.println("the number is " +TriageMessagArray[1]);




    }
}
