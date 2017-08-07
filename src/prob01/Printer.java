package prob01;

public class Printer {
	
	//generic 사용하지 않고 일일이 다 정의 해주는 경우
	/*public void println(int i) {
		System.out.println(i);
	}
	public void println(double d) {
		System.out.println(d);
	}
	
	public void println(boolean b) {
		System.out.println(b);
	}
	
	public void println(String str) {
		System.out.println(str);
	}*/
	
	//이렇게 하면 조금 문제가 될 수 있다. Why? 
	//casting을 해야하는 경우가 생기는데 casting이 잘못되는 경우가 발생할 수 있다.
	//그렇기 때문에 generic을 사용하는 것이 더욱 좋음.
	/*public void println(Object o) {
	
	}*/
	
	public <T> void println(T t ) {
		System.out.println(t);
	}
	//이렇게 여러개를 정의할 수도 있음
	/*public <T,P,Q,R> void println(){
	}*/
	
	/*public <T,Q,R,S> void println(T t, Q q, R r ,S s) {
		System.out.print(t);
		System.out.print("  " +q);
		System.out.print("  " +r);
		System.out.println("  " +s);
	}*/
	
	//String 여러개를 가져온다 뭐 이런거?
	public void println(String... params) {
	}
	//가변 변수
	public void println(Object... params) {
		for(Object o : params) {
			System.out.println(o);
		}
	}
	

}
