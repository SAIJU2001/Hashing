// Count Duplicate element

import java.util.*;

public class CountDuplicateElement
{
    public static int countUnique( int arr[] )
    {
        int count=0;
        //initialize hashset
        HashSet<Integer>set=new HashSet<>();

        for( int i=0 ; i<arr.length ; i++ )
        {
            //check if not present the value then add and if present increase the count
            if( !set.contains(arr[i]) )
            {
                set.add(arr[i]);
            }
            else
            {
                count++;
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
        System.out.println("The no of Duplicate elements are : "+countUnique( arr ));
    }
}