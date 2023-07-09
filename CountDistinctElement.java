// Count distinct(unique) element

import java.util.*;

public class CountDistinctElement
{
    public static int countUnique( int arr[] )
    {
        int count=0;
        //initialize hashset
        HashSet<Integer>set=new HashSet<>();

        for( int i=0 ; i<arr.length ; i++ )
        {
            //check if not present the value then add and increase the count
            if( !set.contains(arr[i]) )
            {
                count++;
                set.add(arr[i]);
            }
        } 
        return count;
    }
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter how many values to be input : ");
        int len=Sc.nextInt();
        int arr[]=new int[len];
        for( int i=0 ; i<arr.length ; i++ )
        {
            System.out.print("Enter the value : ");
            arr[i]=Sc.nextInt();
        }
        //function call and print the output
        System.out.println("The no of Distinct element are : "+countUnique( arr ));
    }
}