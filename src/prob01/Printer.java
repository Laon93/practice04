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
	
	public <T> void println(T t) {
		System.out.println(t);
	}
	//이렇게 여러개를 정의할 수도 있음
	/*public <T,P,Q,R> void println(){
	}*/

}
