/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package practicing;

import com.sun.source.tree.BreakTree;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;

public class Library {
    public static void main(String[] args) {
//        System.out.println("hi");
//        repeatedWord("hi my name is slim shady hi");
        int arr[] = {1, 2, 3, 4, 7, 9, 0};
//        System.out.println(repeatedIntegerIndex(arr));
//        System.out.println(repeatedIntegerIndex2(arr));
//        System.out.println(swap(5,6));
        int array[] = {2, 3, 4, 10, 7, 9, 8, 6, 5};
        System.out.println(secondMax(arr));
        System.out.println(largerNumers(array));
//        System.out.println(isPrime(13, 2));
//        isPrime1();
        System.out.println(checkCube(153));
        System.out.println(reverse(1234));
        System.out.println(tekrarString("aaaddcjfbirc"));
        System.out.println(Arrays.toString(middleAdding(arr, 2)));
        System.out.println(reverseSentence("hi my name is slim shady"));

    }

    //////////////////////repeated word///////////////////////////
    public static String repeatedWord(String strings) {
        String lowerCased = strings.toLowerCase(Locale.ROOT);
        String[] stringArr = lowerCased.split(" ");
        Hashtable<String, Integer> hashMap = new Hashtable<String, Integer>();
        for (String element : stringArr) {

            if (element.contains(",")) {
                element = element.substring(0, element.length() - 1);
            }
            if (!element.equals("")) {
                int counter = hashMap.get(element) != null ? hashMap.get(element) : 0;

                if (counter == 1) {
                    return element;
                }
                hashMap.put(element, counter + 1);
            }
        }

        return "None";
    }

    /////////////////////////////////////first repeated integer from beginning //////////////
    public static int repeatedIntegerIndex(int arr[]) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int count;
        int hi = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (hashtable.get(arr[i]) != null) {
                count = hashtable.get(arr[i]);
            } else {
                count = 0;
            }
            if (count == 1) {
                return i;
            }
            hashtable.put(arr[i], count + 1);
        }
        return hi;
    }

    ///////////////////////////first repeated integer from the end///////////////
    public static int repeatedIntegerIndex2(int arr[]) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int count;
        int hi = -1;
        for (int i = 0; i < arr.length; i++) {
            if (hashtable.get(arr[i]) != null) {
                count = hashtable.get(arr[i]);
            } else {
                count = 0;
            }
            if (count == 1) {
                return i;
            }
            hashtable.put(arr[i], count + 1);
        }
        return hi;
    }

    //////////////////////// swap 2 integers without declaring a new variable/////////////
    public static int swap(int a, int b) {
        a = 5;
        b = 6;

        a = a + b;
        b = a - b;
        a = a - b;

        return a;
    }

    ////////////////////////// return third integer in an array ////////////////
    public static int secondMax(int arr[]) {
        int max = arr[0];
        int secondMax = arr[0];
        int third = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                third = secondMax;
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                third = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        return third;
    }
///////// return a new array of the numbers that have no larger numbers on their right//////
//int arr[] = {1,2,3,4,7,9,8,6,5};

    public static ArrayList largerNumers(int arr[]) {
        ArrayList list = new ArrayList<>();
        int max = arr[arr.length - 1];
        list.add(max);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                list.add(arr[i]);
                max = arr[i];
            }
        }
        return list;
    }

    static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
    }

    static int isPrime1() {

        int counter = 0;
        for (int j = 1; j < 100; j++) {
            if (isPrime(j, 2)) {
                System.out.println(j);
            }
        }
        return counter;
    }

    static boolean checkCube(int number) {
        int sum = 0;
        int n = number;
        while (number != 0) {
            sum += (number % 10) * (number % 10) * (number % 10);
            number = number / 10;
        }
        return n == sum;
    }

    static int reverse(int number) {
        int newNumber = 0;

        while (number != 0) {
            int y = (number % 10);
            newNumber = newNumber * 10 + y;
            number = number / 10;
        }
        return newNumber;
    }

    static String tekrarString(String string) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < string.length(); i++) {
            if (hashtable.containsKey(string.charAt(i))) {
                hashtable.put(string.charAt(i), hashtable.get(string.charAt(i)) + 1);
            } else {
                hashtable.put(string.charAt(i), 1);
            }
        }
        String m = "";
        for (int i = 0; i < string.length(); i++) {
            if (hashtable.get(string.charAt(i)) == 1) {
                m = m + string.charAt(i);
            }
        }
        return m;
    }

    private static List<Integer> sumsss(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                sum = sum + arr[i];
            } else {
                sum = sum + arr[i];
                list.add(sum);
                sum = 0;
            }
        }
        if (sum != 0) {
            list.add(sum + arr[arr.length - 1]);
        } else {
            list.add(arr[arr.length - 1]);
        }
        return list;
    }

    static int[] middleAdding(int[] array, int m) {
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            array[i] = array[i - 1];
        }
        array[array.length / 2] = m;
        return array;
    }

    static String reverseSentence(String arrays) {
        String string = "";
        String strings="";
        for (int i = arrays.length() - 1; i >= 0; i--) {
            if(arrays.charAt(i) == ' '){
                strings=strings +" "+ string;
                string="";
            }else{
                string=arrays.charAt(i) + string;
            }
        }
        return strings;
    }

}