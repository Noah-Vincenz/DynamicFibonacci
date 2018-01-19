import java.util.*;

public class FibonacciDynamicTest {

  public static Map<Integer, Integer> fibMap = new HashMap<Integer, Integer>();

  public static int fib1(int n) {
   if (n <= 1) return n;
   else return fib1(n-1) + fib1(n-2);
  }

  public static int fib2(int n) {
   if (!fibMap.containsKey(n)) {
    fibMap.put(n, fib2(n-1) + fib2(n-2));
   }
   return fibMap.get(n);
  }

  public static void main (String args[]) {

    fibMap.put(0,0);
    fibMap.put(1,1);
/*
    long tStart = System.nanoTime();
    System.out.println(fib1(45));
    long tEnd = System.nanoTime();
    long tDelta = tEnd - tStart;
    double elapsedSeconds = tDelta / 1000000;
    System.out.println("Nanotime for fib1 = " + elapsedSeconds);
    System.out.println("Millisecondstime for fib1 = " + elapsedSeconds / 1000000);
    System.out.println("Secondstime for fib1 = " + elapsedSeconds / 1000000 / 1000);
*/
    long tStart = System.nanoTime();
    System.out.println(fib2(45));
    long tEnd = System.nanoTime();
    long tDelta = tEnd - tStart;
    double elapsedSeconds1 = tDelta;
    System.out.println("Nanotime for fib2 = " + elapsedSeconds1);
    System.out.println("Millisecondstime for fib2 = " + elapsedSeconds1 / 1000000);
    System.out.println("Secondstime for fib2 = " + elapsedSeconds1 / 1000000 / 1000);


 }


}
