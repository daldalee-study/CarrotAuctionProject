package com.carrot_auction.carrot_auction.domain.auction.entity;

import com.carrot_auction.carrot_auction.domain.auction.entity.id.AuctionTermsMappingLogId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="AuctionTermsMappingLog")
public class AuctionTermsMappingLog {
    // 복합키 설정
    @EmbeddedId
    private AuctionTermsMappingLogId auctionTermsMappingLogId;
}