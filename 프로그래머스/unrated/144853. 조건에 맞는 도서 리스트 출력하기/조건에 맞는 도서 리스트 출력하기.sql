-- 코드를 입력하세요
SELECT BOOK_ID, date_format(published_date, '%Y-%m-%d') as PUBLISHED_DATE FROM BOOK WHERE category='인문'and published_date between '2021-01-01'and '2021-12-31' order by published_date;