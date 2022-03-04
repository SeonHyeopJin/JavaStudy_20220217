package a11_상속;

public class TestMain {

	public static void main(String[] args) {
		Test test = new Test();
		Test test1 = new Test();
		Test test2 = new Test2();
		
		Test[] t1Array = new Test1[10];
		t1Array[0] = test1;
		//t1Array[1] = test2;
		
		//자식 -> 부모 : 업캐스팅
		Test t1 = test1;
		Test t2 = test2;
		
		Test[] tArray = new Test[2];
		tArray[0] = test1;
		tArray[1] = test2;
		
		//부모 -> 자식 : 다운캐스팅
		Test1 tt1 = (Test1)t1;
		Test2 tt2 = (Test2)t2;
		
		//잘못된 다운캐스팅
		Test ttt = new Test();
		Test1 ttt1 = (Test1)ttt;
		
		//잘못된 다운캐스팅
		Test1 tttt1 = new Test1();
		Test ttt1 = tttt; //업캐스팅
		Test2 tttt2 = (Test2)tttt;
	}
	
}
