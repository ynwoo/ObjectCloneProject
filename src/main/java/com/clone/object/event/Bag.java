package com.clone.object.event;

import lombok.Setter;

public class Bag {
    /**
     * 현금
     */
    private Long amount;
    /**
     * 초대장
     */
    private Invitation invitation;
    /**
     * 티켓
     */
    @Setter
    private Ticket ticket;

    /**
     * 현금만 보관
     *
     * @param amount 현금
     */
    public Bag(Long amount) {
        this.amount = amount;
    }

    /**
     * 현금과 초대장을 함께 보관
     *
     * @param amount     현금
     * @param invitation 초대장
     */
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    /**
     * @return 초대장이 있는지 체크합니다.
     */
    private boolean hasInvitation() {
        return invitation != null;
    }

    /**
     * @return 티켓이 있는지 체크합니다.
     */
    public boolean hasTicket() {
        return ticket != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    /**
     * 티켓을 가지고 있습니다(?)
     * @param ticket 구매한 티켓
     * @return 지불된 금액
     */
    public Long hold(Ticket ticket) {
        // 1. 초대장이 있는 경우
        if (hasInvitation()) {
            setTicket(ticket); // 관람객의 가방에 티켓을 준다.
            return 0L;
        } else { // 2. 초대장이 없는 경우
            minusAmount(ticket.getFee()); // 관람객의 가방에서 현금(티켓요금) 가져간다.
//            ticketOffice.plusAmount(ticket.getFee()); // 매표소의 티켓판매금액에 현금(티켓요금)을 추가한다.
            setTicket(ticket); // 관람객의 가방에 티켓을 준다.

            return ticket.getFee();
        }
    }
}
