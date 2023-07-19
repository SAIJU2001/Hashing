//find the union and intersection between two arrays
/*
 *  arr1[]={7,3,9}
 *  arr2[]={6,3,9,2,9,4}
 *  union={7,3,9,6,2,4}
 *  intersection={3,9}
 */

 import java.util.*;

public class UnionAndIntersection 
{
    public static ArrayList<Integer> union( int arr1[], int arr2[] )
    {
        HashSet<Integer>set=new HashSet<>();
        for( int i=0 ; i<arr1.length ; i++ )
        {
            set.add(arr1[i]);
        }
        for( int i=0 ; i<arr2.length ; i++ )
        {
            set.add(arr2[i]);
        }
        return new ArrayList<>(set);
    }
    public static ArrayList<Integer> intersection( int arr1[], int arr2[] )
    {
        ArrayList<Integer>al=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for( int i=0 ; i<arr1.length ; i++ )
        {
            set.add(arr1[i]);
        }
        for( int i=0 ; i<arr2.length ; i++ )
        {
            if( set.contains( arr2[i]) )
            {
                al.add( arr2[i] );
                set.remove(arr2[i]);
            }
        }
        return al;
    }
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        //1st array
        System.out.print("Enter length of 1st array : ");
        int n1=Sc.nextInt();
        int arr1[]=new int[n1];
        System.out.print("Enter the array elements of 1st array : ");
        for( int i=0 ; i<n1 ; i++ )
        {
            arr1[i]=Sc.nextInt();
        }
        //2nd array
        System.out.print("Enter length of 2nd array : ");
        int n2=Sc.nextInt();
        int arr2[]=new int[n2];
        System.out.print("Enter the array elements of 2nd array : ");
        for( int i=0 ; i<n2 ; i++ )
        {
            arr2[i]=Sc.nextInt();
        }
        //call union method
        ArrayList<Integer>list=union( arr1, arr2 );
        System.out.print("union : ");
        //print the union values
        for( int i=0 ; i<list.size() ; i++ )
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.clear();
        //call the intersection method
        list=intersection( arr1, arr2 );
        System.out.print("intersection : ");
        //print the intersection values
        for( int i=0 ; i<list.size() ; i++ )
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
