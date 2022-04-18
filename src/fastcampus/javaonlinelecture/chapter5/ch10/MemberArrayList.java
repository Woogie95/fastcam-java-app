package fastcampus.javaonlinelecture.chapter5.ch10;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arraysList;

    public MemberArrayList() {
        arraysList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        arraysList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        arraysList.add(member);
    }

    public boolean removeMember(int memberId) {

        for (int i = 0; i < arraysList.size(); i++) {
            Member member = arraysList.get(i);

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arraysList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arraysList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
