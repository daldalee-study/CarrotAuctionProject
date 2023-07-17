package com.carrot_auction.carrot_auction.domain.auctionRoom.repository;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.AuctionRoomLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRoomLogRepository extends JpaRepository<AuctionRoomLog, String> {
}
