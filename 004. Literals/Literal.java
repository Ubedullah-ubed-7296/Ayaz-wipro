public class Literal{
    public static void main(String[] args){
        // right hand side things like 34 and A are literals
        // Primitive 
        // Numeric
        // Integral
        byte age = 34;
        short age2 = 333;
        int age3 = 56;
        long ageDino = 56666666666l; // l or L needed to specify

        // Floating Points
        float f1 = 5.6f; // f or F (we should mention f)
        double d1 = 4.66; // (by default souble) and can use d or D, but not needed 

        // Non-numeric
        char ch = 'A';
        boolean a = true;
        System.out.println(age);


        String str = "Harry";
        System.out.println(str);
    }
}