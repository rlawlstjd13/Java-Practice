// 회원관리 프로그램
// 회원을 콘솔입력으로 등록할수 있게, 최대 10명
// 중복등록안됨. (이름, 키, 몸무게가 동일하면 중복입니다.)
// 기준에따라 집계를 해서 목록을 보여줘야합니다.(BMI지수가 기준)

// 회원
// 이름
// 키
// 몸무게

// BMI지수
// BMI = 몸무게(kg) / 키^2(m)

// 고도 비만 : 35이상
// 중도  비만(2단계 비만) : 30이상 35미만
// 경도 비만 (1단계 비만) : 25이상 30미만
// 과체중: 23이상 25미만
// 정상: 18.5이상 23미만
// 저체중: 18.5미만
// + 키순 오름차순 멤버조회
// 몸무게 오름차순 멤버조회.
import java.util.Scanner;
public class MemberTest {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	MemberManage manage = new MemberManage();
	manage.memberInput();
	
	
	
	
	
	}
}