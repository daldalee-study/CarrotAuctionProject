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
@AllArgsConstructor
@NoArgsConstructor
public class Award extends BaseEntity {
    @Id
    @Column(updatable = false)
    private String id;

    // Auction과 OneToOne 맵핑 관계로 Award에서만 ActionId로 FK로 갖게 하려는 의도를 가졌으나
    // PA에서는 대상 테이블이 FK를 가지고 있는 것을 허용하지 않기 때문에 맵핑하지 않고 String 값으로 가져옴
    @Column
    private String auctionId;

    @Column(nullable = false)
    private int minimumBidAmount = 0;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Member buyer;

    @Column(nullable = false)
    private int finalBidAmount = 0;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean isPaid;

    @Column
    private LocalDateTime paymentDate;
}
