public class StaticExample258 {
    public static void main(String[] args) {
        int num = 13;

        // in what class is the 'isTeen' method located?
        System.out.print("is this in the teens? " + num + ":  ");
        System.out.println(isTeen(num));
        System.out.println(StaticExample258.isTeen(num));

        // in what class is the 'isEven' method located?
        System.out.print("\nis this even? " + num + ":  ");
        System.out.println(NumUtil.isEven(num));

        // to call a static method, what is the syntax?

    } // close main method


    // returns true if a number is in the 'teens'
    public static boolean isTeen(int p){
        return p > 12 && p < 20;
    } // close method 



} // close Main class




class NumUtil{
    // we can have class variables
    static double myPi = 3.14;

    // we can have a variety of methods
    public static boolean isEven(int p){
        return p%2==0;
    } // close method  

} // close class


