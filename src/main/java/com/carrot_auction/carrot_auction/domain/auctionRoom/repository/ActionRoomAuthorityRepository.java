package com.carrot_auction.carrot_auction.domain.auctionRoom.repository;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.ActionRoomAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRoomAuthorityRepository extends JpaRepository<ActionRoomAuthority, String> {
}
