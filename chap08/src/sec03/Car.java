package sec03;

public class Car {
		
	private String color;
	int speed;
	
	Car() {
		
	}
	
	//생성자오버로딩 
	Car(String color, int speed){
		this.color= color;
		this.speed = speed;
	}
	
	String getColor() {
		return color;
	}
	
	void upSpeed(int value) {
		speed = speed +value;
	
		System.out.println("현재 속도(Car, 부모 클래스)"+this.speed);
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
}