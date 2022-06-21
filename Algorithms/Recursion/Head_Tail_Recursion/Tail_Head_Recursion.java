package Algorithms.Recursion.Head_Tail_Recursion;

/*                                     In head recursion,

    the recursive call, when it happens, comes before other processing in the function (think of it happening at the top,
        or head, of the function).

                                      In tail recursion,

    it’s the opposite—the processing occurs before the recursive call. Choosing between the two recursive styles may seem
        arbitrary, but the choice can make all the difference.

    A function with a path with a single recursive call at the beginning of the path uses what is called head recursion.

        The factorial function of a previous exhibit uses head recursion.
        The first thing it does once it determines that recursion is needed is to call itself with the decremented parameter.

    A function with a single recursive call at the end of a path is using tail recursion

         Tail                                Head

public void tail(int n)         |     public void head(int n)
{                               |     {
    if(n == 1)                  |         if(n == 0)
        return;                 |             return;
    else                        |         else
        System.out.println(n);  |             head(n-1);
                                |
    tail(n-1);                  |         System.out.println(n);
}                               |     }
 */

public class Tail_Head_Recursion {
}
