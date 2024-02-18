public class TestingParams257{
    public static void main(String[] args) {
        // simple data types, call by value
        System.out.println("\nshowing that simple data types pass a copy to the method");
        System.out.println("this is referred to as 'call by value'");
        int num = 15;
        System.out.println("in main, num = " + num);
        passInt(num);
        System.out.println("back in main, num not changed = " + num);

        // Strings call by value
        System.out.println("\nStrings also 'call by value'");
        String st = "hello";
        System.out.println("in main, st = " + st);
        passString(st);
        System.out.println("back in main, st not changed = " + st);

        // objects call by reference
        System.out.println("\nobjects use \"Call by reference\"");
        ExObj thing = new ExObj();
        System.out.println("in main, the 'a' attribute is = " + thing.a);
        passObject(thing);
        System.out.println("back in main, the 'a' attribute changed = " + thing.a);

    } // close main


    // this method shows that the parameter is passed by value
    // the variable 'p' is local to the method
    public static void passInt(int p){
        p = 20;
        System.out.println("change the formal parameter in the method, p = " + p);
    }

    public static void passString(String s){
        s = "world";
        System.out.println("change the formal parameter in the method, s = " + s);
    }


    // this method shows that objects are passed by reference
    // the variable 't' is an alias for the variable that is passed
    // changes to 't' affect the variable that is passed
    public static void passObject(ExObj t){
        t.a = "hi"; // changing the 'a' attribute
        System.out.println("change the variable in the method, a = " + t.a); 
    }
} // close Main class


class ExObj{
    public String a;

    public ExObj(){
        a = "hello";    
    } // close constructor

} // close Ex class



