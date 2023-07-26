package com.carrot_auction.carrot_auction.domain.auctionRoom.entity.id;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.AuctionRoom;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class AuctionRoomVisitorId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "auction_room_id")
    private AuctionRoom auctionRoom;

    @Column(name = "member_id")
    private String memberId;
}
