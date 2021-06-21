package assignment_2.data_types;

public class BoxedDataTypes {
    public static void main (String args[]) {
        boolean isEquivalent=false;

        Integer i_1 = 10;
        // versus
        int i_2 = 10;
        isEquivalent= i_1==i_2;
        System.out.println("int value "+i_1.intValue()); //to get value associated with the wrapper class
        System.out.println("Integer and int are equivalent ?? "+isEquivalent);


        Byte b1=12;
        byte b2=12;
        isEquivalent=b1==b2;
        System.out.println("byte value "+b1.byteValue()); //to get value associated with the wrapper class
        System.out.println("Byte and byte are equivalent ?? "+isEquivalent);

        Short s1=120;
        short s2=120;
        isEquivalent=s1==s2;
        System.out.println("short value "+s1.shortValue());
        System.out.println("Short and short are equivalent ?? "+isEquivalent);

        Long l1=123453545L;
        long l2=123453545l;
        isEquivalent=l1==l2;
        System.out.println("long value "+l1.longValue());
        System.out.println("Long and long are equivalent ?? "+isEquivalent);

        Float f1=124.56F;
        float f2=124.56f;
        isEquivalent=f1==f2;
        System.out.println("float value "+f1.floatValue());
        System.out.println("Float and float are equivalent ?? "+isEquivalent);

        Double d1=10.5;
        double d2=10.5;
        isEquivalent=d1==d2;
        System.out.println("double value "+d1.doubleValue());
        System.out.println("Double and double are equivalent ?? "+isEquivalent);

        Boolean flag1=true;
        boolean flag2=true;
        isEquivalent=flag1==flag2;
        System.out.println("boolean value "+b1.doubleValue());
        System.out.println("Boolean and boolean are equivalent ?? "+isEquivalent);

        Character c1='C';
        char c2='C';
        isEquivalent=c1==c2;
        System.out.println("char value "+c1.charValue());
        System.out.println("Character and char are equivalent ?? "+isEquivalent);


    }
}
