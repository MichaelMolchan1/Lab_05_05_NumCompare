public class Main {
    public static void main(String[] args) {
        int numberA = 12;
        int numberB = 12;
        if (numberA == numberB)
        {
          System.out.println("Your numbers are equal to each other.");
        }
        else if (numberA > numberB)
        {
            System.out.println("Number B is lower than number A");
        }
        else if (numberA < numberB)
        {
            System.out.println("Number A is less than number B");
        }
        else
        {
            System.out.println("INVALID INPUT PLEASE TRY AGAIN");
        }
    }
}