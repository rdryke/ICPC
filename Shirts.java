/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc;
import java.util.*;
import java.math.*;
/**
 *
 * @author Rob
 */
public class Shirts {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = 1;
        while (true)
        {
            
            long days = sc.nextLong();
            long shirts = sc.nextLong();
            long dur = sc.nextLong();
            if (days == 0 && shirts == 0 && dur == 0)
            {
                break;
            }
            else
            {
            shirts = shirts;
            if (shirts < 0)
            {
                shirts = 0;
            }
            System.out.println(cases + "  "  + shirts);
            cases = cases + 1;
            }
        }
    }
    
}
