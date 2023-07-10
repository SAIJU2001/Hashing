// Linked HashMap Operations
// output is same order as input

import java.util.*;

public class LinkedHashMapOperations
{
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);
        HashMap<String,Integer>lhm=new HashMap<>();
        int operation;
        do
        {
            System.out.print("\nFor exit press 0\nCheck Linked Hash map is empty or not press 1\nCheck the size of the Linked Hash map press 2\nAdd a value to the Linked Hash map press 3\nCheck any key value is present in the Linked Hash map or not press 4\nTo remove any value press 5\nTo remove all the value from the Linked Hash map press 6\nFor print all the value from the Linked Hash map press 7\n\nPress here : ");
            operation=Sc.nextInt();
            switch( operation )
            {
                case 0 :
                            System.out.println("Program Terminated!!!");
                            break;
                case 1 :    //to check the set is empty or not
                            if( lhm.isEmpty() )
                                System.out.println("Linked Hash map is Empty.");
                            else
                                System.out.println("Linked Hash map is not Empty.");
                        break;
                case 2:     //to get the size of the set
                        System.out.println("The Size of the Linked Hash map is : "+lhm.size() );
                        break;
                case 3:     //add to the set
                            System.out.println("Your key must be String type and Value must be Integer type.");
                            System.out.print("Enter your Key : ");
                            String str=Sc.next();
                            System.out.print("Enter your Value : ");
                            int val=Sc.nextInt();
                            //check the value is already in the set
                            if( lhm.containsKey(str) )
                            {
                                lhm.put( str,val);
                                System.out.println("Your key is already present in the Linked Hash map and sucessfully updateed the value.");
                            }
                            else
                            {
                                lhm.put( str,val);
                                System.out.println("Your key and value is Sucessfully added to the Linked Hash map.");
                            }
                        break;
                case 4:     //to check any value is present or not
                            System.out.print("Enter your Key : ");
                            str=Sc.next();
                            if( lhm.containsKey(str) )
                            {
                                System.out.println("Your Key is already present in the Linked Hash map and the value is : "+lhm.get(str));
                            }
                            else
                            {
                                System.out.println("Your key is not present in the Linked Hash map.");
                            }
                        break;
                case 5:     //remove any value from the set
                            System.out.print("Enter the key : ");
                            str=Sc.next();
                            lhm.remove(str);
                            System.out.println("The kay and value are sucessfully removed from the Linked Hash map");
                        break;
                case 6:     //clear the set
                            lhm.clear();
                            System.out.println("Linked Hash map is Empty.");
                        break;
                case 7:     //print all the element
                            for( String key : lhm.keySet() )
                            {
                                System.out.println( key+" : "+lhm.get(key) );
                            }
                        break;
                default:
                            System.out.println("Please enter the Correct value");
            }
        }while( operation!=0);
    }
}