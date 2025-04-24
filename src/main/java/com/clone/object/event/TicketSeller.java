package com.clone.object.event;

/**
 * 판매원
 */
public class TicketSeller {
    /**
     * 매표소
     */
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
