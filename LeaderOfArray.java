/* WAP to find the leaders of an array */

package ArrayPractice;

import java.util.Scanner;
public class LeaderOfArray {
    public static void getLeaderOfArray(int []arr){
        System.out.print("Leader of array are : ");
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            boolean isLeader=true;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > current){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(current+" ");
            }
        }
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
        getLeaderOfArray(arr);
    }
}
