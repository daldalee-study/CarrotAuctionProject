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
@Table(name="Auction")
public class Auction extends BaseEntity {
    @Id
    @Column(name = "Id", updatable = false)
    private String id;

    @ManyToOne
    @JoinColumn(name = "SellerId", nullable = false, updatable = false)
    private Member seller;

    @Column(name = "Title", nullable = false)
    private String title;

    @Column(name = "Comment", length = 1300)
    private String comment;

    @Column(name = "OpenAt", nullable = false)
    private LocalDateTime openAt;

    @Column(name = "ClosedAt", nullable = false)
    private LocalDateTime closedAt;

    @Column(name = "MininumBidAmount", nullable = false)
    private int minimumBidAmount = 0;

    @Column(name = "State", nullable = false)
    @Enumerated(EnumType.STRING)
    private AuctionState state = WAITING;

}
