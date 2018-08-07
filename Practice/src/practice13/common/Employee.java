package practice13.common;

public class Employee extends practice13.common.Person {
	/*
	 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
	 *
	 * フィールド
	 * 		departmentNm（部署名）		:	String
	 * 		departmentCnt（部署人数）	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 */

	String departmentNm;
	int departmentCnt;

	//ゲッター
	public String getDepartmentNm() {
		return this.departmentNm;
	}

	public int getDepartmentCnt() {
		return this.departmentCnt;
	}

	//セッター
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}

	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
}
