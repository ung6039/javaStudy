package com.sist.spring2;

// 1.8
public interface Hello {
  public void display();
  // ������ �޼ҵ带 ������ �� �� �ִ� 
  public default void sayHello(){}
  public static void sayHello2(){}
}
