package com.carrot_auction.carrot_auction.domain.auction.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Terms")
public class Terms {

    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "Type")
    private String type; //ex. 서비스 이용 약관 ..
}
