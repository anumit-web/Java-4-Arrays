/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode4.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode4
*/

// import

public class JavaCode4 {

    public static void main(String[] args) {
        System.out.println("Java Code 4");
        System.out.println("Java Arrayss");
        System.out.println("");

        String[] cities_in_lord_of_the_rings = { "Minas Tirith", "Gondor", "Grey Havens", "Gondolin" };

        // find the highest value of x and y
        System.out.println(cities_in_lord_of_the_rings[0]);

        // Change an Array Element
        cities_in_lord_of_the_rings[0] = "Edoras";
        System.out.println(cities_in_lord_of_the_rings[0]);

        // Array Length
        // use the length property:
        System.out.println(cities_in_lord_of_the_rings.length);

        // Loop Through an Array
        for (int i = 0; i < cities_in_lord_of_the_rings.length; i++) {
            System.out.println(cities_in_lord_of_the_rings[i]);
        }

        
    }
}