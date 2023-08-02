package com.carrot_auction.carrot_auction.domain.auction.entity.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AuctionTermsMappingLogId implements Serializable {

    @Column
    private String auctionId;

    @Column
    private String termsId;

    @Column
    private String sellerId;
}
