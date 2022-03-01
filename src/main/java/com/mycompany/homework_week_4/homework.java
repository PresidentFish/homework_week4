
package com.mycompany.homework_week_4;


public class homework {
    public static void main(String[] args) {
    int helloWorlds = helloRecursion(10);
    
    int n = 15;
    System.out.println(recurSum(n));
    
    
        homework ob = new homework();
        int arr[] = { 2, 3, 4, 10, 40 };
        int m = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, m - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    
    
  }
  public static int helloRecursion(int k) {
    if (k > 0) {
      System.out.println("Hello World!");
      return k + helloRecursion(k - 1);
    } else {
      return 0;
    }
  }
  
 
    public static int recurSum(int n1)
    {
        int sum = 0;
        if (n1<= 1){
            
            return n1;
        }
        if (n1%7 == 0)
            sum = n1+sum;
            
        System.out.println("The sum all digits that are values of 7 are "+ sum);
        return n1+ recurSum(n1 - 1);
    }
    
 int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l && l <= arr.length - 1) {
 
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }   
   

  
    
}
