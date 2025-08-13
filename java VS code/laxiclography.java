/*
 public class laxiclography {

    public static void lexical(String fruit[]) {
        String large =  fruit[0];
                for (int i = 1; i < fruit.length; i++) {
                    if (large. compareTo (fruit[i])  < 0  ) {
                        large = fruit[i];
                    }
            
        } System.out.println(large);
    }

    public static void main(String[] args) {
        String fruit[] = { "apple " , "mango" , "banana"};
        lexical(fruit);
         

    }
}*/








public class laxiclography {

    public static void find_largest (String fruits[]) {
        String largest_now = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest_now . compareTo (fruits[i]) < 0 ){
                largest_now = fruits[i];
            } }
        System.out.println(largest_now); }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango" ,"banana"};
        find_largest(fruits);
    } }













