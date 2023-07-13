package com.carrot_auction.carrot_auction.domain.auctionRoom.entity;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.id.AuctionRoomLogId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="AuctionRoomLog")
public class AuctionRoomLog {
    // PK값이 없는 것처럼 사용하기 위해 전체 컬럼 PK 값으로 설정
    @EmbeddedId
    private AuctionRoomLogId auctionRoomLogId;
}
