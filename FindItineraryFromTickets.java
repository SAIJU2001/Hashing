//journey itenarary
/*
 * input :
 *          "chennai" to "bengaluru"
 *          "mumbai" to "delhi"
 *          "goa" to "chennai"
 *          "delhi" to "goa"
 * 
 * output :
 *          mumbai => delhi => goa => chennai => bengaluru
 */

import java.util.*;

public class FindItineraryFromTickets 
{
    //finding the starting poin
    public static String getStart( HashMap<String,String>ticket )
    {
        //implemenet the reverse map key=value and value=key
        HashMap<String,String>reverse=new HashMap<>();
        for( String key : ticket.keySet() )
        {
            reverse.put( ticket.get(key), key );
        }
        for( String key : ticket.keySet() )
        {
            if( !reverse.containsKey(key) )
                return key;
        }
        return "";
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        HashMap<String,String>ticket=new HashMap<>();
        System.out.print("how many tickets you want to add : ");
        int n=Sc.nextInt();
        while( n-->0 )
        {
            //put the values to the hash map
            System.out.print("Enter the source first the destination : ");
            ticket.put( Sc.next(), Sc.next() );
        }
        String startPoint=getStart( ticket );   //call the function and find start poin
        System.out.print(startPoint);
        for( String key : ticket.keySet())
        {
            startPoint=ticket.get(startPoint);
            System.out.print("==>"+startPoint);
        }


    }
}
