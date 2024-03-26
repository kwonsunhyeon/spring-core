package hello.springcore.discount;

import hello.springcore.member.Grade;
import hello.springcore.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    int discountFixAmount = 1000;  //vip 클라이언트에게 고정금액 천원 할인 적용
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
