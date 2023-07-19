//many subarrays present with sum 0 but we have to find the greater one
/*
 *  input : arr[]={15 -2 2 -8 1 7 10 2 3}
 *  output : 5
 */

import java.util.HashMap;
import java.util.Scanner;


public class LargestSubAraryWithSum0 
{
    public static int maxLength( int arr[] )
    {
        HashMap<Integer,Integer>map=new HashMap<>();    //(sum,index)
        int sum=0, length=0;
        for( int i=0 ; i<arr.length ; i++ )
        {
            sum+=arr[i];    
            if( map.containsKey(sum) ) //key previous present means in between indexes sum are 0
            {
                //get maximum length
                length=Math.max(length, i-map.get(sum) );
            }
            else
            {
                //put the values to the hashmap
                map.put( sum, i);
            }
        }
        return length;
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
        //function call and print the output
        System.out.println("The length of largest subarray with sum 0 is : "+maxLength( arr));
    }
}
