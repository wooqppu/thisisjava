package day15.exam03;

public class Box<T> {
	// 타입이 결정되지 않음
	public T content;
	
	// 메소드
	public T getContent() {
		return content;
	}
	public void setContent (T content) {
		this.content = content;
	}
	
}


