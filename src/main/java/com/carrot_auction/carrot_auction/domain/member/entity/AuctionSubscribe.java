package com.carrot_auction.carrot_auction.domain.member.entity;

import com.carrot_auction.carrot_auction.global.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="AuctionSubscribe")
public class AuctionSubscribe extends BaseEntity {
    @Id
    @Column(name = "Id", updatable = false)
    private String id;

    @Column(name = "AuctionId", nullable = false)
    private String auctionId;

    @Column(name = "MemberId", nullable = false)
    private String memberId;

    @Column(name = "OpenAt", nullable = false)
    private LocalDateTime openAt;

}
