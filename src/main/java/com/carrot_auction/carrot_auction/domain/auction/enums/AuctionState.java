package com.carrot_auction.carrot_auction.domain.auction.enums;

import com.carrot_auction.carrot_auction.global.common.EnumMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AuctionState implements EnumMapper {
    WAITING("대기"),
    IN_PROGRESS("진행중"),
    AWARDED("낙찰"),
    FAILED("유찰");

    @Getter
    public final String state;

    @Override
    public String getValue() {
        return getState();
    }

    @Override
    public String getName() {
        return name();
    }
}
