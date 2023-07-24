package com.carrot_auction.carrot_auction.domain.member.repository;

import com.carrot_auction.carrot_auction.domain.member.entity.AuctionSubscribe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionSubscribeRepository extends JpaRepository<AuctionSubscribe, String> {
}
