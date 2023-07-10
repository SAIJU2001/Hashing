// TreeSet Operations
//It is Sorted(Ascending ordered) Hasing Data structure

import java.util.*;

public class TreeSetOperations
{
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        TreeSet<Integer>ts=new TreeSet<>();
        int operation;
        do
        {
            System.out.print("\nFor exit press 0\nCheck Tree Set is empty or not press 1\nCheck the size of the Tree Set press 2\nAdd a value to the Tree Set press 3\nCheck any value is present in the Tree Set or not press 4\nTo remove any value form Tree Set press 5\nTo remove all the value from the Tree Set press 6\nFor print all the value from the Tree Set press 7\n\nPress here : ");
            operation=Sc.nextInt();
            switch( operation )
            {
                case 0 :
                            System.out.println("Program Terminated!!!");
                            break;
                case 1 :    //to check the set is empty or not
                            if( ts.isEmpty() )
                                System.out.println("Tree Set is Empty.");
                            else
                                System.out.println("Tree Set is not Empty.");
                        break;
                case 2:     //to get the size of the set
                        System.out.println("The Size of the Tree Set is : "+ts.size() );
                        break;
                case 3:     //add to the set
                            System.out.print("Enter your Value : ");
                            int val=Sc.nextInt();
                            //check the value is already in the set
                            if( ts.contains(val) )
                            {
                                System.out.println("Your value is already present in the Tree Set.");
                            }
                            else
                            {
                                ts.add( val);
                                System.out.println("Your value is Sucessfully added to the Tree Set.");
                            }
                        break;
                case 4:     //to check any value is present or not
                            System.out.print("Enter your Value : ");
                            val=Sc.nextInt();
                            if( ts.contains(val) )
                            {
                                System.out.println("Your value is already present in the Tree Set.");
                            }
                            else
                            {
                                System.out.println("Your value is not present to the Tree Set.");
                            }
                        break;
                case 5:     //remove any value from the set
                            System.out.print("Enter the value : ");
                            val=Sc.nextInt();
                            ts.remove(val);
                            System.out.println("The value is removed from the Tree Set");
                        break;
                case 6:     //clear the set
                            ts.clear();
                            System.out.println("Tree Set is Empty.");
                        break;
                case 7:     //print all the element
                            Iterator it=ts.iterator();
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