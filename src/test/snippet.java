public Class Sum
   {

     public static long sum(int a,int b)
     {
          return a+b;
     }

     public static void main(String [] args) 
     {
          int a ,b;
          long c;           // for long summation of numbers .

          a=Integer.parseInt(args[0]);   //using Integer wrapper Class to cast object 
                                           to primitive Datatype Integer.

          b= Integer.parseInt(args[1])  ;

          c= sum(a,b);


         System.out.println("The Sum of two number is : "+c);
     }

   } 
