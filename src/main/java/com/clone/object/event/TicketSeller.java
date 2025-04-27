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

    // 03 설계 개선하기 - 자율성을 높이자
//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    /**
     * // 03 설계 개선하기 - 캡슐화(encapsulation)
     * 관람객에게 티켓을 판매합니다.
     *
     * @param audience 관람객
     */
    public void sellTo(Audience audience) {
        // 03 설계 개선하기 - 자율성을 높이자

//        // 1. 초대장이 있는 경우
//        if (audience.getBag().hasInvitation()) {
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().setTicket(ticket); // 관람객의 가방에 티켓을 준다.
//        } else { // 2. 초대장이 없는 경우
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().minusAmount(ticket.getFee()); // 관람객의 가방에서 현금(티켓요금) 가져간다.
//            ticketOffice.plusAmount(ticket.getFee()); // 매표소의 티켓판매금액에 현금(티켓요금)을 추가한다.
//            audience.getBag().setTicket(ticket); // 관람객의 가방에 티켓을 준다.
//        }

        // 03 설계 개선하기 - 캡슐화(encapsulation)
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
