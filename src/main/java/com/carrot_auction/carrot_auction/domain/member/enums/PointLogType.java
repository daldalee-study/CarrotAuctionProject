package com.carrot_auction.carrot_auction.domain.member.enums;

import com.carrot_auction.carrot_auction.global.common.EnumMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum PointLogType implements EnumMapper {

    ADD("적립"),
    USED("사용"),
    EXCHANGE("환전");

    @Getter
    private final String state;

    @Override
    public String getValue() {
        return getState();
    }

    @Override
    public String getName() {
        return name();
    }
}
