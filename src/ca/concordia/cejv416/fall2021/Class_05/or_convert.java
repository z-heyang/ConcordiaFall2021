package ca.concordia.cejv416.fall2021.Class_05;

public class or_convert {

    public static void main(String[] args) {

        String customerType = "R";
        int subTotal = 150;
        float discountPercent = 0.0f;


        // if (3 > 5 || 3 < 5)
        // if ( F or T )
        // if ( T )


        if (customerType.equals("R") && subTotal >= 100)
        {
            discountPercent = .2F;
        }

        if (customerType.equals("R") && subTotal < 100)
        {
            discountPercent = .1F;
        }

        if (!customerType.equals("R"))
        {
            discountPercent = .4F;
        }


//        if (customerType.equals("R"))
//        {
//            if (subTotal >= 100)
//                discountPercent = .2F;
//            else
//                discountPercent = .1F;
//        }
//        else
//            discountPercent = .4F;

        System.out.println(discountPercent);
    }
}
