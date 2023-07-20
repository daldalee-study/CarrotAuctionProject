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
@Table(name="AuctionRoomLog")
public class AuctionRoomLog {

    @Id
    @Column(name = "AuctionRoomId")
    private String auctionRoomId;

    @Column(name = "Detail", length = 1300)
    private String detail;

    @CreatedDate
    @Column(name = "CreateAt", nullable = false, updatable = false)
    private LocalDateTime createAt;
}
