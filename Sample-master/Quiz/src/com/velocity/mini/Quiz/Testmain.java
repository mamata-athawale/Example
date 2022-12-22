package com.velocity.mini.Quiz;

import java.sql.SQLException;
import java.util.Random;

public class Testmain {

	public static void main(String[] args) throws SQLException {
		 StudentLogin std=new StudentLogin();
		 std.registration();
		 std.login();
	}

}
