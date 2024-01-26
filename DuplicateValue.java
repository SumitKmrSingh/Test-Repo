/* Find duplicates in an array
 * 
 * Example 1:

        Input:
        N = 4
        a[] = {0,3,1,2}
        Output: 
        -1
        Explanation: 
        There is no repeating element in the array. Therefore output is -1.
    
    Example 2:

        Input:
        N = 5
        a[] = {2,3,1,2,3}
        Output: 
        2 3 
        Explanation: 
        2 and 3 occur more than once in the given array.
 */


package ArrayPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateValue {
    public static ArrayList<Integer> duplicate(int []arr){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        // Copy all the elements of HashSet Into arrayList
        for(int x : arr){
            list.add(x);
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an array : ");
        int size=sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" of elements : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the elements of array are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        ArrayList<Integer> list = duplicate(arr);
        System.out.println("All the Dublicate Elements are : "+list);
    }
}
