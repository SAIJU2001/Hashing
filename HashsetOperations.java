// Hashset Operations

import java.util.*;

public class HashsetOperations
{
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        HashSet<Integer>set=new HashSet<>();
        int operation;
        do
        {
            System.out.print("\nFor exit press 0\nCheck set is empty or not press 1\nCheck the size of the set press 2\nAdd a value to the set press 3\nCheck any value is present int the set or not press 4\nTo remove any value press 5\nTo remove all the value from the set press 6\nFor print all the value from the set press 7\n\nPress here : ");
            operation=Sc.nextInt();
            switch( operation )
            {
                case 0 :
                            System.out.println("Program Terminated!!!");
                            break;
                case 1 :    //to check the set is empty or not
                            if( set.isEmpty() )
                                System.out.println("Set is Empty.");
                            else
                                System.out.println("Set is not Empty.");
                        break;
                case 2:     //to get the size of the set
                        System.out.println("The Size of the Set is : "+set.size() );
                        break;
                case 3:     //add to the set
                            System.out.print("Enter your Value : ");
                            int val=Sc.nextInt();
                            //check the value is already in the set
                            if( set.contains(val) )
                            {
                                System.out.println("Your value is already present in the set.");
                            }
                            else
                            {
                                set.add( val);
                                System.out.println("Your value is Sucessfully added to the set.");
                            }
                        break;
                case 4:     //to check any value is present or not
                            System.out.print("Enter your Value : ");
                            val=Sc.nextInt();
                            if( set.contains(val) )
                            {
                                System.out.println("Your value is already present in the set.");
                            }
                            else
                            {
                                System.out.println("Your value is not present to the set.");
                            }
                        break;
                case 5:     //remove any value from the set
                            System.out.print("Enter the value : ");
                            val=Sc.nextInt();
                            set.remove(val);
                            System.out.println("The value is removed from the set");
                        break;
                case 6:     //clear the set
                            set.clear();
                            System.out.println("Set is Empty.");
                        break;
                case 7:     //print all the element
                            Iterator it=set.iterator();
                            while( it.hasNext() )
                            {
                                System.out.print( it.next()+" " );
                            }
                            System.out.println();
                        break;
                default:
                            System.out.println("Please enter the Correct value");
            }
        }while( operation!=0);
    }
}