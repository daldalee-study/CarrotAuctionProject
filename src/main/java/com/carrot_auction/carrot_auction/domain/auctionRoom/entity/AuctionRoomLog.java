package com.carrot_auction.carrot_auction.domain.auctionRoom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AuctionRoomLog {

    @Id
    @Column
    private String auctionRoomId;

    @Column(length = 1300)
    private String detail;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt;
}
