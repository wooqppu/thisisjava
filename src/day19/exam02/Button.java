package day19.exam02;

public class Button {
	// 정적 중첩 인터페이스
	@FunctionalInterface
	public static interface ClickListener {
		// 추상메소드 1개
		void onClick();
	}
	
	// 필드 
	private ClickListener clicklistener;
	
	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clicklistener = clickListener;
	}
	
	public void click() {
		this.clicklistener.onClick();
	}

}
