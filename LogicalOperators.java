public class LogicalOperators {
    
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;
        
        System.out.println(x < y && y < z); // true
        System.out.println(x < y && y > z); // false
        System.out.println(x < y || y > z); // true
        System.out.println(x > y || y > z); // false
        System.out.println(!(x < y)); // false
        System.out.println(!(x > y)); // true
    }
}
