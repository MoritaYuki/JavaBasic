/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;
import practice13.common.Person;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		//インスタンスを代入する配列作成
		practice13.common.Employee[] employee = new practice13.common.Employee[NAMEDATA.length];

		//インスタンスの情報を代入
		for(int i=0; i<employee.length; i++) {
			employee[i] = new practice13.common.Employee();
			
			employee[i].setUserId(Person.BASE_NO + i);
			employee[i].setUserNm(NAMEDATA[i]);
			employee[i].setMail(MAILDATA[i]);
			employee[i].setPassword(PASSDATA[i]);
			employee[i].setDepartmentNm(QUATERDATA[0][i]);
			employee[i].setDepartmentCnt(Integer.parseInt(QUATERDATA[1][i]));
		}

		//インスタンスの情報を出力
		for(Employee em: employee) {
			System.out.println("---------------------------------");
			System.out.println("ID:" + em.getUserId());
			System.out.println("ユーザー名　　　：" + em.getUserNm());
			System.out.println("メールアドレス　：" + em.getMail());
			System.out.println("パスワード　　　：" + em.getPassword());
			System.out.println("部署名　　　　　：" + em.getDepartmentNm());
			System.out.println("部署の人数　　　：" + em.getDepartmentCnt() + "\n");
		}
	}
}
