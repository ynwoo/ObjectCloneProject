package com.clone.object.event;

/**
 * 티켓
 */
public class Ticket {
    /**
     * 요금
     */
    private Long fee;

    public Long getFee() {
        return fee;
    }

    public Ticket(Long fee) {
        this.fee = fee;
    }
}
