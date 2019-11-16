public class profile{

public static void main (String[] args)
{

String[] wordlistOne= { " preety", "good" , "cute", "beautiful" , "hot" , "normal "};
String[] wordlistTwo = { " angry" , "calm" , "cool", "aggresive" , "sometimes angry" };
String[] wordlistThree = { " hardworking" , "looser" , " selfish" , "introvert" , " friendly"};
int One = wordlistOne.length;
int Two = wordlistTwo.length;
int three = wordlistThree.length;
int rand1 = (int) (Math.random() * One);
 int rand2 = (int) (Math.random() * Two);
int rand3 = (int) (Math.random() * three);
String phase = wordlistOne[rand1] + ", " + wordlistTwo[rand2] + ", " + wordlistThree[rand3];
 System.out.println(" what we need is a " + phase);
}
}

