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
public class BidderTermsMappingLogId implements Serializable {

    @Column(name = "AuctionId")
    private String auctionId;

    @Column(name = "TermsId")
    private String termsId;

    @Column(name = "MemberId")
    private String memberId;
}
