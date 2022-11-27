package lab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] testStrArr1 ={"Antoshka","idem","kopat'" ,"kartoshku"};
        String[] testStrArr2 = {"ne idem kopat'","budem otdihat'"};
        System.out.println(Arrays.toString(testStrArr1));
        WorkWithArrays.swapElementsGroup(testStrArr1,0,1,2,3);
        System.out.println("Swap 0-1 indexes with 2-3");
        System.out.println(Arrays.toString(testStrArr1));
        System.out.println("Swap pairs");
        WorkWithArrays.swapPairsOfElements(testStrArr1);
        System.out.println(Arrays.toString(testStrArr1));
        System.out.println("Swap 1-2 indexes with another array");
        WorkWithArrays.swapGroupOfElementWithAnotherArr(testStrArr1,1,2,testStrArr2);
        System.out.println(Arrays.toString(testStrArr1));
        System.out.println("=======================");
        Integer[] testIntArr1 = {1,4,8,7,0};
        Integer[] testIntArr2 = {3,2,2};
        System.out.println(Arrays.toString(testIntArr1));
        System.out.println("Swap 0-1 indexes with 2-4");
        WorkWithArrays.swapElementsGroup(testIntArr1,0,1,2,4);
        System.out.println(Arrays.toString(testIntArr1));
        System.out.println("Swap pairs of elements");
        WorkWithArrays.swapPairsOfElements(testIntArr1);
        System.out.println(Arrays.toString(testIntArr1));
        System.out.println("Swap 0-2 indexes with another array");
        WorkWithArrays.swapGroupOfElementWithAnotherArr(testIntArr1,0,2,testIntArr2);
        System.out.println(Arrays.toString(testIntArr1));
        System.out.println("=======================");
        Double[] testDoubleArr1 = {1.0,4.0,4.0,4.0,0.0};
        Double[] testDoubleArr2 = {3.0,2.0,2.0};
        System.out.println(Arrays.toString(testDoubleArr1));
        System.out.println("Swap 0-1 indexes with 2-4");
        WorkWithArrays.swapElementsGroup(testDoubleArr1,0,1,2,4);
        System.out.println(Arrays.toString(testDoubleArr1));
        System.out.println("Swap pairs of elements");
        WorkWithArrays.swapPairsOfElements(testDoubleArr1);
        System.out.println(Arrays.toString(testDoubleArr1));
        System.out.println("Swap 0-2 indexes with another array");
        WorkWithArrays.swapGroupOfElementWithAnotherArr(testDoubleArr1,0,2,testDoubleArr2);
        System.out.println(Arrays.toString(testDoubleArr1));
        System.out.println("=======================");
    }
}

