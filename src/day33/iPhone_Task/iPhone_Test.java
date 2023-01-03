package day33.iPhone_Task;

public class iPhone_Test {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("proMax14","white","medium",1500);

        System.out.println(iPhone1);

        iPhone1.faceTime(532789963);
        iPhone1.faceTime("yahoo@cydeo.com");
        iPhone1.call(547897564);
        iPhone1.text(548547895);


        System.out.println(IPhone.madeIn);
        System.out.println(iPhone1.OS);
        System.out.println(IPhone.brand);



    }


}
