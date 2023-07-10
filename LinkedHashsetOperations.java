// LinkedHashset Operations
//It is ordered Hasing Data structure

import java.util.*;

public class LinkedHashsetOperations
{
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
        int operation;
        do
        {
            System.out.print("\nFor exit press 0\nCheck Linked Hash Set is empty or not press 1\nCheck the size of the Linked Hash Set press 2\nAdd a value to the Linked Hash Set press 3\nCheck any value is present in the Linked Hash Set or not press 4\nTo remove any value form Linked Hash Set press 5\nTo remove all the value from the Linked Hash Set press 6\nFor print all the value from the Linked Hash Set press 7\n\nPress here : ");
            operation=Sc.nextInt();
            switch( operation )
            {
                case 0 :
                            System.out.println("Program Terminated!!!");
                            break;
                case 1 :    //to check the set is empty or not
                            if( lhs.isEmpty() )
                                System.out.println("Linked Hash Set is Empty.");
                            else
                                System.out.println("Linked Hash Set is not Empty.");
                        break;
                case 2:     //to get the size of the set
                        System.out.println("The Size of the Linked Hash Set is : "+lhs.size() );
                        break;
                case 3:     //add to the set
                            System.out.print("Enter your Value : ");
                            int val=Sc.nextInt();
                            //check the value is already in the set
                            if( lhs.contains(val) )
                            {
                                System.out.println("Your value is already present in the Linked Hash Set.");
                            }
                            else
                            {
                                lhs.add( val);
                                System.out.println("Your value is Sucessfully added to the Linked Hash Set.");
                            }
                        break;
                case 4:     //to check any value is present or not
                            System.out.print("Enter your Value : ");
                            val=Sc.nextInt();
                            if( lhs.contains(val) )
                            {
                                System.out.println("Your value is already present in the Linked Hash Set.");
                            }
                            else
                            {
                                System.out.println("Your value is not present to the Linked Hash Set.");
                            }
                        break;
                case 5:     //remove any value from the set
                            System.out.print("Enter the value : ");
                            val=Sc.nextInt();
                            lhs.remove(val);
                            System.out.println("The value is removed from the Linked Hash Set");
                        break;
                case 6:     //clear the set
                            lhs.clear();
                            System.out.println("Linked Hash Set is Empty.");
                        break;
                case 7:     //print all the element
                            Iterator it=lhs.iterator();
                            while( it.hasNext() )
                            {
                                System.out.print( it.next()+" " );
                            }
                            System.out.println();
                        break;
                default:
                            System.out.println("Please enter the Correct value");
                            break;
            }
        }while( operation!=0);
    }
}