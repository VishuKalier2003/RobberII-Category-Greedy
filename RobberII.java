/* You are a professional robber planning to rob houses along a street. Each house has a certain amount of money 
stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems 
connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you 
can rob tonight without alerting the police.
* Eg 1 : houses = [1,2,3,1]                     Output = 4
* Eg 2 : houses = [2,7,9,3,1]                   Output = 11
* Eg 3 : houses = [2,3,2]                       Output = 3
*/
import java.util.*;
public class RobberII
{
      public int MaximumCircularLoot(int houses[])
      {
            int SumEven = 0, SumOdd = 0;      //*   Variable -> O(1)
            if(houses[0] >= houses[houses.length - 1])
            {
                  for(int i = 0; i < houses.length - 1; i++)      //! Comparison -> O(N)
                  {     // We do not take the last hosue into consideration...
                        if(i % 2 == 0)
                              SumEven = SumEven + houses[i];    // Even index...
                        else
                              SumOdd = SumOdd + houses[i];    // odd index...
                  }
            }
            else
            {
                  for(int i = 1; i < houses.length; i++)      //! Comparison -> O(N)
                  {     // We do not take the first hosue into consideration...
                        if(i % 2 == 0)
                              SumEven = SumEven + houses[i];    // Even index...
                        else
                              SumOdd = SumOdd + houses[i];    // odd index...
                  }
            }
            return SumOdd = (SumEven > SumOdd) ? SumEven : SumOdd;
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter number of Houses : ");
            x = sc.nextInt();
            int array[] = new int[x];
            for(int i = 0; i < array.length; i++)
            {
                  System.out.print("Enter loot : ");
                  array[i] = sc.nextInt();
            }
            RobberII robberII = new RobberII();
            System.out.println("The Maximum Loot possible : "+robberII.MaximumCircularLoot(array));
            sc.close();
      }
}
