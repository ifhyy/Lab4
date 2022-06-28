import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

        Clothes[] arr = {
                new Clothes("Nike", "T-shirt", 20, 3000, "red"),
                new Clothes("Adidas", "Sneakers", 70, 10000, "white"),
                new Clothes("Under Armour", "Cap", 45, 20000, "beige"),
                new Clothes("Zara", "Jeans", 150, 5000, "black"),
                new Clothes("Bershka", "Hoodie", 50, 2000, "yellow"),
                new Clothes("Tommy Hillfiger", "Shirt", 300, 500, "camo")
        };
        Arrays.sort(arr, new SortByType());
        System.out.println("Sorting by type:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getType());
        }
        Arrays.sort(arr, new SortByPrice().reversed());
        System.out.println("\nSorting by price:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getPrice());
        }
    }
}
