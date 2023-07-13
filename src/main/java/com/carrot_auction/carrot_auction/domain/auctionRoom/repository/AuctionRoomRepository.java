package com.carrot_auction.carrot_auction.domain.auctionRoom.repository;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.AuctionRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRoomRepository extends JpaRepository<AuctionRoom, String> {
}
