/* find Maxium sum of sub array using Kadane's algorithm */

package ArrayPractice;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static int getSubArraySum(int []arr){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];

            if(sum > maxSum){
                maxSum=sum;
            }

            if(sum < 0){
                sum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the "+size+" Elements of array are : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("All the "+size+" elements of array are : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Maxium Sub array Sum : "+getSubArraySum(arr));
    }
}
