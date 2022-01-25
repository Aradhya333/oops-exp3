// Concatenate two numbers and strings using method overloading concepts//
class concate
{ 
  public static void main(String args[])
   {
   concate Obj=new concate();
   Obj.consum("1"+"8");
   Obj.consum("ARADHYA"+" "+"S"+" "+"PRADEEP");
   }
  void consum(int a)
  {
   System.out.println("Concated number:" +a);
  }
  void consum(String a)
   {
    System.out.println("Concated String=" +a);
   }
}

