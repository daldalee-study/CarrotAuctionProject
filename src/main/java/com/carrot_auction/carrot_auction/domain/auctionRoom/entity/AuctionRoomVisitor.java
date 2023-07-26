package com.carrot_auction.carrot_auction.domain.auctionRoom.entity;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.id.AuctionRoomVisitorId;
import com.carrot_auction.carrot_auction.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AuctionRoomVisitor extends BaseEntity {

    @EmbeddedId
    private AuctionRoomVisitorId auctionRoomVisitorId;

    @ManyToOne
    @JoinColumn(name = "autority_id")
    private ActionRoomAuthority authority;

}
