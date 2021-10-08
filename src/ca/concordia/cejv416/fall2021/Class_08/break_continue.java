package ca.concordia.cejv416.fall2021.Class_08;

public class break_continue {

    public static void main(String[] args) {

//        for (int y = 0; y < 10; y++)
//        {
//            if (y == 5)
//                break;
////      <-------------
//            System.out.println(y);
//        }
//
//        // 0 1 2 3 4

        for (int y = 0; y < 10; y++)
        {
            if (y == 5)
                continue;
            System.out.println(y);
        }

        // 0 1 2 3 4 6 7 8 9

    }


}
