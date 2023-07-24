package com.carrot_auction.carrot_auction.domain.auctionRoom.repository;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.AuctionRoomVisitor;
import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.id.AuctionRoomVisitorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRoomVisitorRepository extends JpaRepository<AuctionRoomVisitor, AuctionRoomVisitorId> {
}
