package tests;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        //    int a = 10;
//    String b = "Hi Mubeen ";
//    boolean x = true;
//   double  d = 2.334;
//char g = 'Z';
        int[] arr = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 102, 1023, 2022};
        for (int i = 0; i <= arr.length; i++) {
//            System.out.println(i);
//        }
            // for(int a: arr)  // Enhannced for loop in java
            {
                if (arr[i] % 2 == 0) {
                    System.out.println("This value is devided by 2 >> " + arr[i]);

                } else {
                    System.out.println(arr[i] + "This values are not devided by 2");
                    break;
                }
            }
        }
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }
    }
   }




