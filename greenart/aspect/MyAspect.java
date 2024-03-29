package kr.co.greenart.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	private static final Logger logger = LoggerFactory.getLogger(MyAspect.class);
	// 접근제한자 리턴타입 패키지.클래스.메소드(파라미터)
	
	@Pointcut("execution(* kr.co.greenart.model.file.FileDBRepository.getAllnames(..))") // 적힌거 실행시?
	public void print() {
		
	}
	@Pointcut("within(@org.springframework.stereotype.Repository *)")
	public void repository(){
		
	}// 해당어노테이션이 있는 모든 메소드
	
	@Around("repository()")
	public Object loggingTime(ProceedingJoinPoint jp) throws Throwable{
		long start = System.nanoTime();
		logger.info("시작시간 : " + start); // 위가 먼저
		Object proceed = jp.proceed();
		long end = System.nanoTime(); // 밑은 다음
		logger.info("종료시간:" + end);
		
		logger.info(jp.getSignature().getName() + "메소드의 실행시간:" + (end - start));
		return proceed;
	}
	
	//포인트컷 전에 하기
	@Before("print()")
	public void printBefore() {
		
	}
	//포인트컨 후에 하기
	@After("print()")
	public void printAfter() {
		
	}
//	@Before("execution(* kr.co.greenart.model.file.FileDBRepository.getAllnames(..))")
//    public void printBefore() {
//		logger.info("파일을 목록을 불러오기전에 실행됩니다");
//	}
//	@After("execution(* kr.co.greenart.model.file.FileDBRepository.getAllnames(..))")
//	public void printAfter() {
//		logger.info("파일목록을 불러온 후");
//	}
}
