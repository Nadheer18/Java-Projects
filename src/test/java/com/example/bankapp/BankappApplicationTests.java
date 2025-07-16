package com.example.bankapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.bankapp.BankappApplication;  // ✅ Add this import

@SpringBootTest(classes = BankappApplication.class)  // ✅ Fix here
class BankappApplicationTests {

	@Test
	void contextLoads() {
	}

}

