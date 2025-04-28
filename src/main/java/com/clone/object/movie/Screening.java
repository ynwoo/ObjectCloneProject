package com.clone.object.movie;

import java.time.LocalDateTime;

/**
 * 상영
 */
public class Screening {
    /**
     * 상영할 영화
     */
    private Movie movie;
    /**
     * 순번
     */
    private int sequence;
    /**
     * 상영 시작 시간
     */
    private LocalDateTime whenScreened;

    /**
     * 상영 시작 시간을 반환합니다.
     *
     * @return 상영 시작 시간
     */
    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    /**
     * 순번의 일치 여부를 검사합니다.
     *
     * @param sequence 순서
     * @return 순번의 일치 여부
     */
    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    /**
     * 영화를 예매합니다.
     *
     * @param customer      예매자
     * @param audienceCount 인원수
     * @return
     */
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
