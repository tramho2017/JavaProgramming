public class whichDayOfWeek{
   public static void main(String[] args) {
      int m=Integer.parseInt(args[0]);
      int d=Integer.parseInt(args[1]);
      int y=Integer.parseInt(args[2]);
      int y0;
      int x;
      int m0;
      int d0;
      y0=y-(14-m)/12;
      x=y0+y0/4-y0/100+y0/400;
      m0=m+12*((14-m)/12)-2;
      d0=(d+x+(31*m0)/12) %7;
      {
      if (d0==0)
      System.out.print("Sunday");
      else if(d0==1)
      System.out.print("Monday");
      else if(d0==2)
      System.out.print("Tuesday");
      else if(d0==3)
      System.out.print("Wedneday");
      else if(d0==4)
      System.out.print("Thursday");
      else if(d0==5)
      System.out.print("Friday");
      else if(d0==6)
      System.out.print("Saturday");
      }
      System.out.print(" ");
      {
      if (m==1)
      System.out.print("January");
      else if (m==2)
      System.out.print("January");
      else if(m==3)
      System.out.print("March");
      else if(m==4)
      System.out.print("April");
      else if(m==5)
      System.out.print("May");
      else if(m==6)
      System.out.print("June");
      else if(m==7)
      System.out.print("July");
      else if(m==8)
      System.out.print("August");
      else if(m==9)
      System.out.print("September");
      else if(m==10)
      System.out.print("October");
      else if(m==11)
      System.out.print("November");
      else if(m==12)
      System.out.print("December");
      }
      System.out.print(", ");
      System.out.print(y);
   }
}

