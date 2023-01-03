package homework;

public class FindTheResult {

    public static void main(String[] args) {

        int a = 60;
        if (a%15==0){
            System.out.println("Result: " + (a+50));
        }else {
            if (a % 3 == 0) {
                System.out.println("Result: " + (a + 20));
            }
            if (a % 5 == 0) {
                System.out.println("Result: " + (a + 25));
            }
        }
        /*
        Task 6: Create a class which is "FindTheResult" create a variable
    int a=15;
         if a is divisable by 3 add 20
         if a is divisable by 5 add 25
         if a is divisable by 15 add 50
         */
    }
}
