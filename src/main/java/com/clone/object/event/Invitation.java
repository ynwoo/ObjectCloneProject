package com.clone.object.event;

import java.time.LocalDateTime;

/**
 * 초대장
 */
public class Invitation {
    /**
     * 초대일자
     */
    private LocalDateTime when;

    public Invitation(LocalDateTime when) {
        this.when = when;
    }
}
