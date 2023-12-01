interface A {
   public void test();
   public void test1();
}
interface B {
   public void test();
   public void test2();
}
interface C extends A,B {
   public void test3();
}
class D implements C {
   public void test() {
      System.out.println("Testing
");
   }
   public void test1() {
      System.out.println("Testing1
");
   }
   public void test2() {
      System.out.println("Testing2
");
   }
   public void test3() {
      System.out.println("Testing3");
   }
}
public class Main {
   public static void main(String[] args) {
      D d=new D();
      d.test();
      d.test1();
      d.test2();
      d.test3();
   }
 }
