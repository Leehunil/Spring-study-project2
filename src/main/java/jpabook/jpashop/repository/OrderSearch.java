package jpabook.jpashop.repository;

import jpabook.jpashop.Service.OrderService;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {

    private String memberName; //회원 이름
    private OrderService orderStatus; //주문 상태[ORDER, CANCEL]
}
