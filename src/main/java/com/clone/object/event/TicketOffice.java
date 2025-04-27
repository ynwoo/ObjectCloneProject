package com.clone.object.event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소
 */
public class TicketOffice {
    /**
     * 티켓 판매 금액
     */
    private Long amount;

    /**
     * 판매할 티켓
     */
    private List<Ticket> tickets = new ArrayList<Ticket>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    /**
     * 관람객에게 티켓을 판매합니다.
     *
     * @param audience 관람객
     */
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
