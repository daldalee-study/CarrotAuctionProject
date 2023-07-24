package com.carrot_auction.carrot_auction.domain.auction.repository;

import com.carrot_auction.carrot_auction.domain.auction.entity.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepository extends JpaRepository<Auction, String> {
}
