package impl;

public interface NewCharacter {
	
	public void test();
	
	public default void test2(){
		System.out.println("���������ԣ�������");
	}
}
