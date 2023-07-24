package com.carrot_auction.carrot_auction.domain.auction.repository;

import com.carrot_auction.carrot_auction.domain.auction.entity.BidderTermsMappingLog;
import com.carrot_auction.carrot_auction.domain.auction.entity.id.BidderTermsMappingLogId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidderTermsMappingLogRepository extends JpaRepository<BidderTermsMappingLog, BidderTermsMappingLogId> {
}
