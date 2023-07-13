package com.carrot_auction.carrot_auction.domain.auctionRoom.entity.id;

import com.carrot_auction.carrot_auction.domain.auctionRoom.entity.AuctionRoom;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AuctionRoomLogId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "AuctionRoomId")
    private AuctionRoom auctionRoom;

    @Column(name = "Detail")
    private String detail;

    @CreatedDate
    @Column(name = "CreateAt", nullable = false, updatable = false)
    private LocalDateTime createAt;
}
