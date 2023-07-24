package com.carrot_auction.carrot_auction.domain.auction.repository;

import com.carrot_auction.carrot_auction.domain.auction.entity.AuctionTermsMappingLog;
import com.carrot_auction.carrot_auction.domain.auction.entity.id.AuctionTermsMappingLogId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionTermsMappingLogRepository extends JpaRepository<AuctionTermsMappingLog, AuctionTermsMappingLogId> {
}
