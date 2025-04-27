package com.clone.object.event;

/**
 * 관람객 : 소지품을 보관하기 위해 가방 소지 가능
 */
// 03 설계 개선하기 - 자율성을 높이자
//@Getter
public class Audience {
    /**
     * 가방
     */
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /**
     * 03 설계 개선하기 - 캡슐화(encapsulation)
     * 티켓을 구매합니다.
     *
     * @param ticket 구매할 티켓
     * @return 지불된 금액을 반환합니다.
     */
    public Long buy(Ticket ticket) {
        // 1. 초대장이 있는 경우
        if (bag.hasInvitation()) {
            bag.setTicket(ticket); // 관람객의 가방에 티켓을 준다.
            return 0L;
        } else { // 2. 초대장이 없는 경우
            bag.minusAmount(ticket.getFee()); // 관람객의 가방에서 현금(티켓요금) 가져간다.
//            ticketOffice.plusAmount(ticket.getFee()); // 매표소의 티켓판매금액에 현금(티켓요금)을 추가한다.
            bag.setTicket(ticket); // 관람객의 가방에 티켓을 준다.

            return ticket.getFee();
        }
    }

    /**
     * 관람객이 티켓을 가지고 있는지 체크합니다.
     *
     * @return 관람객의 티켓 소지여부
     */
    public boolean hasTicket() {
        return bag.hasTicket();
    }

}
