package Conversions_And_Contexts.WW_Doc.Example;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main_Example {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList_<int> intArrayList = new ArrayList_<int>();
//        ArrayList_<IntClass> intClassArrayList = new ArrayList_<IntClass>();
//        intClassArrayList.add(new IntClass(54));
//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i));
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

//        for(int i=0; i<=10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }
//
//        Integer myIntValue = 56; // Integer.valueOf(56);
//        int myInt = myIntValue.intValue(); // myIntValue.intValue();
//
//        ArrayList_<Double> myDoubleValues = new ArrayList_<Double>();
//        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            myDoubleValues.add(dbl);
//        }
//
//        for (int i = 0; i < myDoubleValues.size(); i++) {
//            double value = myDoubleValues.get(i);
//            System.out.println(i + "  --> " + value);
//        }
//
//
   }
}

