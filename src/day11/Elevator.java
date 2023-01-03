package day11;

public class Elevator {

    public static void main(String[] args) {

        // Solution 1

        int floorNumber = 2;
        String result = "";

        if (floorNumber>=1 && floorNumber<=3){
            if (floorNumber==1){
                result ="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            }else if (floorNumber==2){
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            }else{
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        }else{
            result = "Invalid floor";
        }
        System.out.println(result);

        // Solution 2
        /*int floorNumber = 2;
        String result = "";
        switch (floorNumber){
            case 1:
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;
            case 2:
                result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                result = "Invalid floor";
        }
        System.out.println(result);

        // Solution 3
        int floorNumber = 4;
        String result = "";
        if (floorNumber>=1 && floorNumber<=3){
            switch (floorNumber){
                case 1:
                    result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        }else{
            result = "Invalid floor";
        }
        System.out.println(result);*/

/*
2. Create a class called Elevator. A variable named floorNumber is
given, write a program that can display the floor info
when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
 anything else: print "Invalid floor - 6"
 Note:
 Solution 1: use nested if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */
    }

}
