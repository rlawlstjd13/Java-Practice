SET @rowCount := 239;
SET @pageNumber := 1;
SET @pagePer := 100;
SET @totalPage := @pageNumber / ;

 --  239행을 가지는 country 테이블을 각 페이지별 행의 개수와 보고자 하는 페이지 번호를 정하면
 --  해당 row들을 조회할 수 있는 SELECT 문을 작성해보기.
PREPARE STMT FROM 'SELECT * FROM country Limit?';
EXECUTE STMT USING @pagePer;