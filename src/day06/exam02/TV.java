package day06.exam02;

public class TV {
	// 필드선언 ---> 초기값 설정 
		String brand; // 브랜드
 		boolean power = false; // 전원
 		int channel = 0; // 채널
		int volume = 10; // 음량
		
		public TV() {
			
		}
		
	// 생성자
		public TV(String brand) {
			this.brand = brand;
		}
		
	// 메소드	
	// 1. 전원on
		void powerOn() {
			System.out.println("전원이 켜집니다.");
			this.power = true;
		}
	// 2. 전원off
		void powerOff() {
			System.out.println("전원이 꺼집니다.");
			this.power = false;
		}
	// 3. 채널이동 위로 
		void channel1Up() {
			if(this.power) {
				this.channel++;
				System.out.println("채널은 : " + this.channel);
			}
			else {
				System.out.println("TV 전원을 켜세요.");
			}
		}
	// 4. 채널이동 아래로
		void channel1Down() {
			if(this.power) {
				this.channel--;
				System.out.println("채널은 : " + this.channel);
			}
			else {
				System.out.println("TV 전원을 켜세요.");
			}
		}
	// 5. 음량 높이기
		void volumeUp() {
			this.volume++;
			System.out.println("음량은 : " + this.volume);
		}
	// 6. 음량줄이기
		void volumeDown() {
			this.volume--;
			System.out.println("음량은 : " + this.volume);
		}
}
