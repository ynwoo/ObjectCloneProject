package com.clone.object.event;

import lombok.Getter;

/**
 * 관람객 : 소지품을 보관하기 위해 가방 소지 가능
 */
@Getter
public class Audience {
    /**
     * 가방
     */
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

}
