
public class DivisibileByEight{
   public static void main(String[] args){
     int firstNum=Integer.parseInt(args[0]);
      int sedNum=Integer.parseInt(args[1]);
   if (firstNum %8==0 && sedNum %8==0)
   System.out.print(" true");
   else
   System.out.print(" false");  
   }
}