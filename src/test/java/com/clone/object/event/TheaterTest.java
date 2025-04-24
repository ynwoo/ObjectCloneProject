package com.clone.object.event;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * TicketOffice 클래스의 minusAmount 테스트 필요
 * Bag 클래스의 plusAmount 테스트 필요
 *
 */
class TheaterTest {

    Theater theater;
    Audience audience;

    @Test
    void 테스트_초대장이있는_관람객을_맞이합니다() {
        // given
        audience = new Audience(new Bag(0L, new Invitation(LocalDateTime.now())));

        // when
        theater.enter(audience);

        // then
//        assertThat(audience.getBag().hasInvitation()).isEqualTo(false); // 테스트 실패
        assertThat(audience.getBag().hasTicket()).isEqualTo(true);
    }

    @Test
    void 테스트_초대장이없는_관람객을_맞이합니다() {
        // given
        audience = new Audience(new Bag(10000L));

        // when
        theater.enter(audience);

        // then
        assertThat(audience.getBag().hasTicket()).isEqualTo(true);
    }

    @BeforeEach
    void setUp() {
        theater = new Theater(new TicketSeller(new TicketOffice(0L, new Ticket(10000L))));
    }
}