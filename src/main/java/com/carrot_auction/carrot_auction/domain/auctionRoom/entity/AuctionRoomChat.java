package com.carrot_auction.carrot_auction.domain.auctionRoom.entity;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.id.AuctionRoomChatId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class AuctionRoomChat {

    @EmbeddedId
    private AuctionRoomChatId auctionChatId;

    @Column
    private int bidPrice = 0;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt;

}
