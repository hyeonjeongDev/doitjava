package chapter12;

public class Member implements Comparable<Member> {
	private int memberId; // ȸ�� ���̵�
	private String memberName; // ȸ�� �̸�

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;

	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}

	public int compareTo(Member member) {
		return (this.memberId - member.memberId) * (-1);
	}
}