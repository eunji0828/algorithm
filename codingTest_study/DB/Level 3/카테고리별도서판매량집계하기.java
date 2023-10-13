
public class 카테고리별도서판매량집계하기 {

	// 230714 풀이
	// 문제
	//2022년 1월의 카테고리 별 도서 판매량을 합산하고, 
	// 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트를 출력하는 SQL문을 작성해주세요.
	// 결과는 카테고리명을 기준으로 오름차순 정렬해주세요.
	
	// 문제 잘 읽기 SUM 빼먹어서 틀려서 다시 품..
	
	SELECT
    	B.CATEGORY,
    	SUM(BS.SALES) AS TOTAL_SALES
    FROM 
    	BOOK B INNER JOIN BOOK_SALES BS
    ON 
        B.BOOK_ID = BS.BOOK_ID
    WHERE 
        BS.SALES_DATE LIKE '%2022-01%'
    GROUP BY CATEGORY
    ORDER BY CATEGORY;
}
