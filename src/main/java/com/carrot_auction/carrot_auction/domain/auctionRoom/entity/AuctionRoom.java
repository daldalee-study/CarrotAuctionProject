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
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="AuctionRoom")
public class AuctionRoom extends BaseEntity {
    @Id
    @Column(name = "Id", updatable = false)
    private String id;

    @OneToOne
    @JoinColumn(name = "AcutionId")
    private Auction auctionId;

    @OneToMany
    private List<AuctionRoomVisitor> auctionVisitor = new ArrayList<>();

    @Column(name = "MaxinumAmount")
    private int maximumAmount = 0;
}
