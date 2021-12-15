/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package practicing;

import com.google.common.io.ByteArrayDataOutput;

import java.util.*;


public class Library {
    public static void main(String[] args) {
        Animal dog = new Duck();
        dog.vv();
        dog.bb();
        Cat duck2 = new Duck(); // Object from interface

        System.out.println(Cat.name);

        Cat sshf = new Donky();
//        System.out.println("hi");
//        System.out.println(repeatedWord("my name is slim shady hi slim shady"));
//        int arr[] = {1,1, 2, 3, 4, 7, 9};
//        int arr2[] = {1, 2, 3, 4, 7, 9, 0};
//        System.out.println(repeatedIntegerIndex(arr));
//        System.out.println(repeatedIntegerIndex2(arr));
//        System.out.println(swap(5,6));
//        int array[] = {1, 2, 3, 4, 10, 7, 9, 8, 6, 5,7,8};
//        System.out.println(secondMax(arr));
//        System.out.println(largerNumers(array));
//        System.out.println(isPrime(8, 2));
//        isPrime1();


//        System.out.println(checkCube(153));
//        System.out.println(reverse(1234));
//        System.out.println(tekrarString("aaaddcjfbirc"));
//        System.out.println(Arrays.toString(middleAdding(arr, 2)));
//        System.out.println(reverseSentence("hi my name is slim shady"));
//        int arrays[] = {2, 2, 3, 4, 4, 15, 15};
//        System.out.println(sumsss(arrays));
//        print(3);
//        int array[] = {1, 2, 3, 4, 5, 6};
//        System.out.println(hi(3, array));
//        uoec();
//        int []arr = {0, 5, 4, 9, 3};
//        System.out.println(Arrays.toString(miss(arr)));
//        int []shuffArray= {2,5,1,3,4,7};
//        System.out.println(Arrays.toString(shuffleFromN(shuffArray, 3)));
//        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
//        int[] arr2 = {2, 1, 4, 3, 9, 6};
//
//        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
//
        int[] arr3 = {28, 6, 22, 8, 44, 17};
        int[] arr4 = {22, 28, 8, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr3, arr4)));

//        int[] arrayssssss = {1, 1, 2, 2, 2};
//        winner(arrayssssss);
//
//        System.out.println(tekrar2("000111",3));
        int[] arr = {1, 2, 3, 4};
        System.out.println(summ(80,95));
//        Set<Integer> set= new TreeSet<>();
//        set.add(5);
//        set.add(2);
//        set.add(3);
        //SORTED DATA AND REFUSE DUPLICATES.
//        set.add(4);
//        set.add(1);
//        set.add(5);
//        set.add(5);
//        System.out.println(set);
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

    ////////////////////////// return third max integer in an array ////////notyet////////
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

    ////////////////////////////////////////
    public static ArrayList<Integer> sumsss(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
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

    ///////////////////////////////////////////////////////
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

    static boolean isPrimes(int n) {
        boolean sah = true;
        if (n < 2) return false;
        if (n == 2) return true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) return false;
        }
        return sah;
    }

    static int isPrime1() {
        int counter = 0;
        for (int j = 2; j < 100; j++) {
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
            int y = number % 10;
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

    static int[] middleAdding(int[] array, int m) {
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            array[i] = array[i - 1];
        }
        array[array.length / 2] = m;
        return array;
    }

    static int[] miss(int[] array) {
        int max = array[0];
        int min = array[0];
        HashSet<Integer> H = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            H.add(array[i]);
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int n = (max + 1) - min;
        int m = n / 2 + (max + min);
        int[] newArr = new int[m - array.length];
        int counter = 0;
        for (int i = min; i <= max; i++) {
            if (!H.contains(i)) {
                newArr[counter] = i;
                counter++;
            }
        }
        return newArr;
    }

    static String reverseSentence(String arrays) {
        String string = "";
        String strings = "";
        for (int i = arrays.length() - 1; i >= 0; i--) {
            if (arrays.charAt(i) == ' ') {
                strings = strings + " " + string;
                string = "";
            } else {
                string = arrays.charAt(i) + string;
            }
        }
        return strings;
    }

    public static void print(int number) {
        int counter = 1;
        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(counter);
                counter++;
            }
        }
    }

    static ArrayList<Integer> hi(int n, int[] his) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = his.length - n; i <= his.length - 1; i++) {

            list.add(his[i]);
        }
        for (int i = 1; i <= his.length - n; i++) {
            list.add(i);
        }
        return list;
    }

    static void uoec() {
        try {
            System.out.println("hi");
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("bye");
        }
    }

    //[2,5,1,3,4,7], N=3
    //[2,3,5,4,1,7]
    public static int[] shuffleFromN(int[] nums, int number) {
        int newArray[] = new int[nums.length];
        newArray[0] = nums[0];
        int counter = 1;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (i % 2 == 0) {
                newArray[i] = nums[counter];
                counter++;
            } else {
                newArray[i] = nums[number];
                number++;
            }
        }
        return newArray;
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] newArray = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            newArray[arr1[i]]++;
        }
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < newArray[arr2[i]]; j++) {
                arr1[k++] = arr2[i];
            }
            newArray[arr2[i]] = 0;
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i]; j++) {
                arr1[k++] = i;
            }
        }
        return arr1;
    }

    static void winner(int[] array) {
        int player1 = 0;
        int player2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                player1++;
            }
            if (array[i] == 2) {
                player2++;
            }
        }
        if (player1 > player2) {
            System.out.println(player1);
        } else {
            System.out.println(player2);
        }
        if (player1 == player2) System.out.println("draw");
    }
    // "00011111100011001" n=6
    static boolean tekrar2(String str, int n) {
        int counter = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                counter++;
            } else {
                counter = 1;
            }
        }
        if (counter == n) return true;
        return false;
    }

    public static int summ(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        return sum;
    }

}