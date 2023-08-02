package com.carrot_auction.carrot_auction.domain.auctionRoom.entity;

import com.carrot_auction.carrot_auction.domain.auction.entity.Auction;
import com.carrot_auction.carrot_auction.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AuctionRoom extends BaseEntity {
    @Id
    @Column(updatable = false)
    private String id;

    @OneToOne
    @JoinColumn(name = "acution_id")
    private Auction auctionId;

    @OneToMany
    private List<AuctionRoomVisitor> auctionVisitor = new ArrayList<>();

    @Column
    private int maximumAmount = 0;
}
