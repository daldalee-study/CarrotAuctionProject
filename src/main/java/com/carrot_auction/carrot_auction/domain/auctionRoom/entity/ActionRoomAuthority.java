package com.carrot_auction.carrot_auction.domain.auctionRoom.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ActionRoomAuthority {
    @Id
    @Column
    private String id; //seller, bidders, audience
}
