
public class YourClass{


    // 0 point
    // Create 2 ints as instance variables named 'a' and 'b'
    private int a;
    private int b;


    // 0 point
    // Write a constructor that takes 2 ints as parameters and sets the values of the parameters to the instance
    // variables. The first parameter is stored in 'a' and the second parameter is stored in 'b'
    public YourClass(int a, int b){
        this.a = a;
        this.b = b;
    }


    // 0 points
    // Write getter methods for 'a' and 'b' names "getA" and "getB"
    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }


    // 0 points
    // Write setter methods for 'a' and 'b' names "setA" and "setB"
    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }


    // 0 point
    // Write a method names difference that takes no paramters and returns the subtraction of 'a' minus 'b' as an int
    public int difference(){
        return this.a - this.b;
    }




    // 2 point
    // Override the toString method to return a String in the format "(a, b)"




    /* Static method */

    // 3 points
    public static void decrement(YourClass instance){
        // Subtract 1 from both 'a' and 'b' in the given instance of YourClass


    }


}
