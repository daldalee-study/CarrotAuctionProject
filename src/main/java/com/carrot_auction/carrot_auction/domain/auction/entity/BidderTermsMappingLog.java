package com.carrot_auction.carrot_auction.domain.auction.entity;

import com.carrot_auction.carrot_auction.domain.auction.entity.id.BidderTermsMappingLogId;
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
public class BidderTermsMappingLog {
    // 복합키 설정
    @EmbeddedId
    private BidderTermsMappingLogId bidderTermsMappingLogId;
}
