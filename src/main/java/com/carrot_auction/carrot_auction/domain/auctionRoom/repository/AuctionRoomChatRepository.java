package com.carrot_auction.carrot_auction.domain.auctionRoom.repository;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.AuctionRoomChat;
import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.id.AuctionRoomChatId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRoomChatRepository extends JpaRepository<AuctionRoomChat, AuctionRoomChatId> {
}
