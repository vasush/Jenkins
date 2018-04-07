import java.util.*;
class levelorder
{
     public static void main(String args[])
     {
          //Queue q=new LinkedList();
          TreeMap t = new TreeMap();
          int left,right,k=1;
          t.put(1,5);
          t.put(3,6);
          t.put(2,7);
          t.put(4,15);
          t.put(8,0);
          t.put(12,35);  
          System.out.println(t.get(k));
          while( k <= t.size() )
          {
               left = 2*k;
               right = 2*k+1;
               if( t.get(left) != null )
                   System.out.println( t.get( left) );
               if( t.get(right) != null )
                   System.out.println( t.get( right ));
               k++;
          }
     }
}