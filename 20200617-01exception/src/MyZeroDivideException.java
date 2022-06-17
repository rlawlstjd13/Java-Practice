import java.time.LocalTime;

public class MyZeroDivideException extends RuntimeException{ // Exception 상속 
	public MyZeroDivideException(String message) {
		super(message + ", " + LocalTime.now() + "에 발생했음");
	}
	
	

}
