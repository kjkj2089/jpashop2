package jpabook.jpashop2.Repository;


import jpabook.jpashop2.domain.Order;
import jpabook.jpashop2.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EntityManager;

@Getter @Setter
public class OrderSearch {

    private String memberName; // 회원 이름
    private OrderStatus orderStatus; //주문 상태[ORDER, CANCLE];
}
