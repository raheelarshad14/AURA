public class WrapperAutoBoxing {
   public static void main(String[] args) {
       Integer a = 100;
       Integer b = 100;

       Integer x = 200;
       Integer y = 200;

       System.out.println(a == b);
       System.out.println(a.equals(b));

       System.out.println(x == y);
       System.out.println(x.equals(y));
       

   }

}
