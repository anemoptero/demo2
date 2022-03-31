package com.example.demo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.example.demo.controller.BookContoller;
import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class BookContollerTest {

	@InjectMocks
	private BookContoller bookContoller;

	@Mock
	BookDao BookDao;

	@Test
	public void testGet() {

		// 1. 測設取得所有書籍資料
		{
			this.show(bookContoller.get());
		}
	}

	@Test
	public void testPost() {
		// 2. 測試新增一筆書籍資料
		{
			Book book = new Book("完全Coding手冊", "工程師", "工程師", "978-0-7334-2609-4", "我自己", new Date(), 1);
			when(BookDao.save(any(Book.class))).thenReturn(book);
		
			this.show(bookContoller.post(book));
		}
	}

	@Test
	public void testPut() {
		// 3. 測試修改一筆書籍資料
		{
			Book book = new Book("完全Coding手冊", "工程師", "工程師", "978-0-7334-2609-4", "我自己", new Date(), 1);
			when(BookDao.save(any(Book.class))).thenReturn(book);
			
			this.show(bookContoller.put(book));
		}
	}

	@Test
	public void testDelete() {
		// 4. 測試刪除一筆書籍資料
		{
			Book book = new Book("完全Coding手冊", "工程師", "工程師", "978-0-7334-2609-4", "我自己", new Date(), 1);
			this.show(bookContoller.delete(book));
		}
	}

	private void show(ResponseEntity<Object> resp) {
		log.info("HttpStatus:{}", resp.getStatusCodeValue());
		log.info("responseBody:{}", resp.getBody());
	}
}
