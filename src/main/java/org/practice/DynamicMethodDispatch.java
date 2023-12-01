package org.practice;
class  A {
    A( ){ }
    public void  print(){
        System.out.println("PRINT A");
    }
}

class  B extends  A {
    B( ){
    }
    @Override
    public void  print(){
        System.out.println("PRINT B");
    }
}

class  C extends B {

    C( ){
    }
    @Override
    public void  print(){
        System.out.println("PRINT C");
    }
}



public class DynamicMethodDispatch {

 public static void main(String [] args) {


     A a = new A();
     B b = new B();
     C c = new C();
     A r = a;
     r.print();
     r = b;
     r.print();
     r = c;
     c.print();


 }




}
