package com.prostack.dao;

import java.util.List;

public interface ITestDao {
		void insertRecords();
		List selectRecords();
		public default void m1() {
			System.out.println("Default Method");
		}

}
