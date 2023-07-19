/*
 *  input : arr[]={1 2 3}, k=3
 *  output : 2
 */

import java.util.HashMap;
import java.util.Scanner;

public class SubArraySumEqualToK 
{
    public static int subarraySum( int arr[], int k )
    {
        HashMap<Integer,Integer>map=new HashMap<>();    //(sum,index)
        int sum=0, ans=0;
        map.put(0 ,1);
        for( int i=0 ; i<arr.length ; i++ )
        {
            sum+=arr[i];
            if( map.containsKey(sum-k) )
            {
                ans+=map.get(sum-k);
            }
            map.put( sum, map.getOrDefault(sum, 0)+1 );
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int len=Sc.nextInt();
        int arr[]=new int[len];
        System.out.print("Enter the values : ");
        for( int i=0 ; i<arr.length ; i++ )
        {
            arr[i]=Sc.nextInt();
        }
        System.out.print("Enter the value of k : ");
        int k=Sc.nextInt();
        //function call and print the output
        System.out.println("The no of subarray sum 0 eqal to k are : "+subarraySum( arr, k));
    }
}

