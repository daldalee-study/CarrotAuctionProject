package com.carrot_auction.carrot_auction.domain.auction.entity;

import com.carrot_auction.carrot_auction.domain.member.entity.Member;
import com.carrot_auction.carrot_auction.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Award")
public class Award extends BaseEntity {
    @Id
    @Column(name = "Id", updatable = false)
    private String id;

    // JPA에서는 대상 테이블이 FK를 가지고 있는 것을 허용하지 않기 때문에 맵핑하지 않고 String 값으로 가져옴
    @Column(name = "AuctionId")
    private String auctionId;

    @Column(name = "MinimumBidAmount", nullable = false)
    private int minimumBidAmount = 0;

    @ManyToOne
    @JoinColumn(name = "BuyerId", nullable = false)
    private Member buyer;

    @Column(name = "FinalBidAmount", nullable = false)
    private int finalBidAmount = 0;

    @Column(name="IsPaid", nullable = false, columnDefinition = "boolean default false")
    private Boolean isPaid;

    @Column(name = "PaymentDate")
    private LocalDateTime paymentDate;
}
