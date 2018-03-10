package com.Book.dao;

import org.apache.ibatis.annotations.Param;
import com.Book.entity.Student;

public interface StudentDao {
	/**
	 * 向数据库验证输入的密码是否正确
	 */
	Student quaryStudent(@Param("studentId") long studentId, @Param("password") long password);
}
