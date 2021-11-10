package ca.concordia.cejv416.fall2021.Class_16;




// product -> item
// sku -> integer
// name -> string
// HM (key = sku, value = name)

// 1. Create the map
// 2. If we'd need to enter extra things like "price" "stock on hand" how would we handle this?
// 3. Add some records.
// 4. Use the records - Ask the user for a sku, and show the item name.  No need for a loop.
// 5. Determine if a record exists in your item list.

import java.util.HashMap;
import java.util.Scanner;

public class HashMapReview {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<Integer, String> storeItems = new HashMap<>();

        storeItems.put(1, "Lawnmower");
        storeItems.put(2, "Weeder");

        System.out.print("Enter the sku to display the description >");
        String searchSkuInput = sc.nextLine();
        int searchSku = Integer.parseInt(searchSkuInput); // HELLO
        String productName = storeItems.get(searchSku);

        //if (productName == null)
        if (!storeItems.containsKey(searchSku))
        {
            System.out.println("We do not carry this sku in our system.");
        }
        else
        {
            System.out.println("The item description for the sku " + searchSkuInput + " is " + productName);
        }
    }
}
