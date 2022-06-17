import javax.management.RuntimeErrorException;

// 은행계좌
// 필드 : 잔고(int)
// 메소드 : 입금(int) : void;
//     : 출금 (int) : void >> 출금액이 보유 잔고 이상일떄; 예외(부족한 금액이 얼마?)를 발생시켜서 throws....
//      :getter() : int 
class BankMoneyOutException extends RuntimeException {
	private int lack;

	public BankMoneyOutException(String message, int lack) {
		super(message);
		this.lack = lack;

	}

	public int getLack() {
		return lack;
	}
}

class BankAccount {
	private int money; // 필드

	public BankAccount(int money) { // 생성자
		super();
		this.money = money;
	}

	public int MoneyInsert(int insert) { // 입금메소드
		return money += insert;
	}

	public void MoneyOut(int out) throws RuntimeException { // 출금 메소드
		if (money >= out) {
			money -= out;
			
            
		} else {
			throw new BankMoneyOutException("하남자 특 돈없음", money - out);
		}

	}

	public int getMoney() { // 게터 필드를 출력해줄수있음.
		return money;
	}

}

public class Main6 {
	public static void main(String[] args) {
		// 은행 계좌 객체 생성
		// 입금/ 출금 / 게터 테스트
		// 출금 // 예외처리

		BankAccount acc = new BankAccount(1000); // acc 객체생성 () 생성자로 돈넣기.

		acc.MoneyInsert(100);
		try {
			acc.MoneyOut(3000);
			// acc.getMoney();
			System.out.println(acc.getMoney());
		} catch (BankMoneyOutException e) { // 예외메세지
			System.out.println(e.getMessage());
			System.out.println(e.getLack());
		}
		// System.out.println(acc.MoneyOut(5000));

	}

}
