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
    public boolean hasInvitation() {
        return invitation != null;
    }

    /**
     * @return 티켓이 있는지 체크합니다.
     */
    public boolean hasTicket() {
        return ticket != null;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
