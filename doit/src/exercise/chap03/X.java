package exercise.chap03;

import java.util.Comparator;

//클래스 X의 내부에서  comparator를 정의하는 방법은 다음과 같습니다.

class X {
	//필드, 메서드 등
	public static final Comparator<T> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
}
