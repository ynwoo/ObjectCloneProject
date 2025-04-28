package com.clone.object.movie;

/**
 * 예매
 */
public class Reservation {
    /**
     * 예매자
     */
    private Customer customer;
    /**
     * 상영
     */
    private Screening screening;
    /**
     * 금액
     */
    private Money fee;
    /**
     * 인원수
     */
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
