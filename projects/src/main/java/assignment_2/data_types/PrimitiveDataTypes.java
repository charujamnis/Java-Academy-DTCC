package assignment_2.data_types;

public class PrimitiveDataTypes {
    public static void main (String args[]) {
        boolean flag=true;
        byte byte_number=0;
        char yesOrNo='Y';
        short short_number=0;
        int i = 100;
        long long_number=21433;
        float float_number=5.5f;
        double double_number=10.5;

        //Cast your int type into a new variable of type double
        double d=(double)i;
        System.out.println("integer to double: "+d);

        //Multiply your float and original double type variable and store the result in a float
        float_number= (float) (float_number*double_number);
        System.out.println("Float number is "+float_number);

        //Perform the same steps as the last bullet, but store the value in an int instead, and note the result
        i= (int) (float_number*double_number);
        System.out.println("Integer i is "+i);

        //Declare a new char variable, cast it to an int and print the result
        int cast_char_int=(int)yesOrNo;
        System.out.println("The number after casting the character to int "+cast_char_int);
    }
}
