package day11.exam03;

public class ButtonExam2 {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		// 익명구현객체
		btnOk.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("OK버튼을 클릭했습니다.");
				
			}
		});
		
		btnOk.touch();
		Button btnCancel = new Button();
		btnCancel.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel버튼을 클릭했습니다.");
				
			}
		});
		
		btnCancel.touch();
	}

}
