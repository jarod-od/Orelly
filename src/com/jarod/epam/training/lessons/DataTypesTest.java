package com.jarod.epam.training.lessons;

public class DataTypesTest {
    public static void main(String[] args) {

//  Check double type
        double d1 = 0.0f;
        Double d2 = new Double(.0f);
//        Double d3 = 0.0f;
//        Double d4 = new Double("1L");
        Double d5 = 0.d;
//        Double d6 = 1L;
//        System.out.println(d5);


//        Check Integer types
        int i1 = Integer.parseInt("14");
        Integer i2 = 85;
//        int i3 = Integer.decode('12');
        int i4 = Integer.valueOf("21");
//        int i5 = Integer.valueOf(null);
        int i6 = new Integer("15");
//        System.out.println(i6);


//        Check Sout compilation
//        System.out.println(new Integer(null));
//          System.out.println(new String(null));
//        System.out.println(new String("null")); pass+
//          System.out.println((char[])null);
//        System.out.println((true ? null : 0));  pass+
//          System.out.println((String)null);     pass+

       /* Byte b = new Byte("3");  // line 1
        System.out.println(b.floatValue() + " " + b.getClass().getName());  // line 2
        */

        /*Double d = Double.POSITIVE_INFINITY;
        double d8 = d.intValue() + Double.NEGATIVE_INFINITY;
        System.out.println(d8);
        */

        //BigDecimal
    }

}
