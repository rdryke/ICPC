/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icpc;
import java.util.*;

/**
 *
 * @author Rob
 */
public class Townsquare {
    public class Point {
    
    int x, y;
    
}
    public Townsquare()
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 1; i < cases + 1; i++)
        {
            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();
            Point p4 = new Point();
            p1.x = sc.nextInt();
            p1.y = sc.nextInt();
            p2.x = sc.nextInt();
            p2.y = sc.nextInt();
            p3.x = sc.nextInt();
            p3.y = sc.nextInt();
            p4.x = sc.nextInt();
            p4.y = sc.nextInt();
            
            if (p1.x == p2.x || p1.x == p3.x || p1.x == p4.x || p2.x == p3.x || p2.x == p4.x || p3.x == p4.x)
            {
                System.out.println("Case " + i + ": no solution");
                continue;
            }
            if (p1.y == p2.y || p1.y == p3.y || p1.y == p4.y || p2.y == p3.y || p2.y == p4.y || p3.y == p4.y)
            {
                System.out.println("Case " + i + ": no solution");
                continue;
            }
            int maxy = p1.y;
            int maxx = p1.x;
            int minx = p1.x;
            int miny = p1.y;
            if (p2.x > maxx)
            {
                maxx = p2.x;
            }
            if (p3.x > maxx)
            {
                maxx = p3.x;
            }
            if (p4.x > maxx)
            {
                maxx = p4.x;
            }
            if (p2.y > maxy)
            {
                maxy = p2.y;
            }
            if (p3.y > maxy)
            {
                maxy = p3.y;
            }
            if (p4.y > maxy)
            {
                maxy = p4.y;
            }
            if (p2.x < minx)
            {
                minx = p2.x;
            }
            if (p3.x < minx)
            {
                minx = p3.x;
            }
            if (p4.x < minx)
            {
                minx = p4.x;
            }
            if (p2.y < miny)
            {
                miny = p2.y;
            }
            if (p3.y < miny)
            {
                miny = p3.y;
            }
            if (p4.y < miny)
            {
                miny = p4.y;
            }
            
            LinkedList<Point> lst = new LinkedList<>();
            lst.add(p1);
            lst.add(p2);
            lst.add(p3);
            lst.add(p4); 
            
            for (int k = 0; k < 4; k++)
            {
                if (lst.get(k).x == minx && lst.get(k).y == miny)
                {
                    System.out.println("Case " + i + ": no solution");
                    continue;
                }
                if (lst.get(k).x == maxx && lst.get(k).y == miny)
                {
                    System.out.println("Case " + i + ": no solution");
                    continue;               
                }
                if (lst.get(k).x == minx && lst.get(k).y == maxy)
                {
                    System.out.println("Case " + i + ": no solution");
                    continue;
                }
                if (lst.get(k).x == maxx && lst.get(k).y == maxy)
                {
                    System.out.println("Case " + i + ": no solution");
                    continue;
                }
            }
            
            if (maxx - minx == maxy - miny)
            {
                int length = maxx - minx + 10;
                    System.out.println("Case " + i + ": " + length);
                    continue;
            }
            else 
            {
                System.out.println("Case " + i + ": no solution");
                    continue;
            }
            
            
            
            
            
            
        }
    }
    
    
}
