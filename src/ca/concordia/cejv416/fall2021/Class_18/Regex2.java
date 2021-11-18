package ca.concordia.cejv416.fall2021.Class_18;

public class Regex2 {

    public static void main(String[] args) {

           String x = "2342343bbbb3433ccc232";

           String[] splitx = x.split("[A-Za-z]+");

           String minLengthString = splitx[0];
           int minLength = splitx[0].length();

           for (String val : splitx)
           {
               if (val.length() < minLength)
               {
                   minLengthString = val;
                   minLength = val.length();
               }
           }

        System.out.println(minLengthString);
    }
}
