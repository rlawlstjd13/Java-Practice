-- 세션(Session) 변수(Variable) 세션은 한번의 접속동안은 쭉 유지되는것.

-- 세션변수는 @이고 뒤는 변수이름 := 대입연산자 10;
Set @myVar := 10; 

SELECT @myVar * 10 + 5;