package com.carrot_auction.carrot_auction.domain.auction.entity;

import com.carrot_auction.carrot_auction.domain.auction.enums.AuctionState;
import com.carrot_auction.carrot_auction.domain.member.entity.Member;
import com.carrot_auction.carrot_auction.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static com.carrot_auction.carrot_auction.domain.auction.enums.AuctionState.WAITING;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Auction extends BaseEntity {
    @Id
    @Column(updatable = false)
    private String id;

    @ManyToOne
    @JoinColumn(nullable = false, updatable = false)
    private Member seller;

    @Column(nullable = false)
    private String title;

    @Column(length = 1300)
    private String comment;

    @Column(nullable = false)
    private LocalDateTime openAt;

    @Column(nullable = false)
    private LocalDateTime closedAt;

    @Column(nullable = false)
    private int minimumBidAmount = 0;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AuctionState state = WAITING;

}
