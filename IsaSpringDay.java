public class IsaSpringDay{
   public static void main(String[] args){
       int m= Integer.parseInt(args[0]);
       int d= Integer.parseInt(args[1]);
       if (3<m && m<6)
          System.out.print("true");
       else if (m==3) {
           if (d>=20)
              System.out.print("true");
           else
              System.out.print("false");
        }
       else if (m==6)
           {
           if (d<= 20)
              System.out.print("true");
           else
              System.out.print("false");
            }
       else
           System.out.print("false");
   }
}