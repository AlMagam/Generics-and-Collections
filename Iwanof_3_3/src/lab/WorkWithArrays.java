package lab;

import java.util.Arrays;

public class WorkWithArrays {
    private Object[] arr = {};
    public static<T> void swapElementsGroup(T[] arr, int from1, int to1, int from2, int to2) {
        Object[] newArr = new Object[arr.length];
        int firstIntervalLen = to1 - from1 + 1, secondIntervalLen = to2 - from2 + 1;
        int indexOfLastCopiedElement = 0;
        System.arraycopy(arr,0,newArr,0,from1);
        indexOfLastCopiedElement += from1;
        System.arraycopy(arr,from2,newArr,from1,secondIntervalLen);
        indexOfLastCopiedElement += secondIntervalLen;
        System.arraycopy(arr,to1 + 1,newArr,indexOfLastCopiedElement,from2 - to1 - 1);
        indexOfLastCopiedElement += from2 - to1 - 1;
        System.arraycopy(arr,from1,newArr,indexOfLastCopiedElement,firstIntervalLen);
        indexOfLastCopiedElement += firstIntervalLen;
        System.arraycopy(arr,to2 + 1,newArr,indexOfLastCopiedElement,arr.length - (indexOfLastCopiedElement));
        System.arraycopy(newArr,0,arr,0,arr.length);
    }

    public static<T> void swapPairsOfElements(T[] arr) {
        for (int i = 0 ; i < arr.length - 1; i+=2) {
            T tempObject = arr[i];
            arr[i] = arr[i + 1];
            arr[i+1] = tempObject;
        }
    }
    public static<T> void swapGroupOfElementWithAnotherArr(T[] dstArr, int from, int to,T[] srcArr) {
        int copyingLen = to - from > srcArr.length ? srcArr.length : to - from;
        System.arraycopy(srcArr,0,dstArr,from,copyingLen + 1);
    }
}

