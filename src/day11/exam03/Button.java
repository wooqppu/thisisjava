package day11.exam03;

public class Button {
	// 필드 
	OnClickListener listener;
	// 메소드 
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	// 강제성 
	void touch() {
		listener.onClick();
	}
	// 중첩 인터페이스(정적 멤버 인터페이스) 
	static interface OnClickListener {
		// 추상 메소드 
		void onClick();
		
	}
}
