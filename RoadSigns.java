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
public class RoadSigns {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int currentCase = 1; currentCase < cases + 1; currentCase++)
        {
            int signs = sc.nextInt();
            int w = sc.nextInt();
            int top = 0;
            ArrayList<Integer> checker = new ArrayList<>();
            sc.nextLine();
            for (int i = 0; i < signs; i++)
            {
                String line = sc.nextLine();
                String current = "";
                LinkedList<String> ints = new LinkedList<>();
                for (int j = 0; j < line.length(); j++)
                {
                    if(line.charAt(j) == '1' || line.charAt(j) == '2' || line.charAt(j) == '3' || line.charAt(j) == '4' || line.charAt(j) == '5' || line.charAt(j) == '6' || line.charAt(j) == '7' || line.charAt(j) == '8' || line.charAt(j) == '9' || line.charAt(j) == '0')
                    {
                        current += Character.toString(line.charAt(j));
                    }
                    else if (!(current.isEmpty()))
                    {
                        ints.add(current);
                        current = "";
                    }
                }
                if (!(current.isEmpty()))
                {
                ints.add(current);
                }
                current = "";
                LinkedList<Integer> real = new LinkedList<>();
                for (int j = 0; j < ints.size(); j++)
                {
                    int size = ints.get(j).length();
                    for (int l = 1; l < size + 1; l++)
                    {
                        for (int start = 0; start < size - l + 1; start++)
                        {
                            for (int grab = start; grab < start + l; grab++)
                            {
                                current += ints.get(j).charAt(grab);
                            }
                            real.add(Integer.valueOf(current));
                            current = "";
                        }
                    }
                }
                
                int stop = 1;
                while (stop == 1)
                {
                    stop = 0;
                    for (int j = 0; j < real.size(); j++)
                    {
                        if (real.get(j) <= top)
                        {
                            real.remove(j);
                            continue;
                        }
                        if (real.isEmpty())
                        {
                            break;
                        }
                        if (real.get(j) <= top + w && !(checker.contains(real.get(j))))
                        {
                            stop = 1;
                            checker.add(real.get(j));
                            
                        }
                        while (checker.contains(top + 1))
                        {
                            top++;
                            
                        }
                    }
                }
            }
            System.out.println("Case " + currentCase + ": " + top);
            
        }
    }
    
}
