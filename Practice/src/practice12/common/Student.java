/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

	//ゲッター

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getClassName() {
		return className;
	}

	public String getMail() {
		return mail;
	}

	public String getPassword() {
		return password;
	}

	//セッター

	public void setStudentId(int id) {
		this.studentId = id;
	}

	public void setStudentName(String name) {
		this.studentName = name;
	}

	public void setCompanyName(String name) {
		this.companyName = name;
	}

	public void setClassName(String name) {
		this.className = name;
	}

	public void setMail(String address) {
		this.mail = address;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}
}
