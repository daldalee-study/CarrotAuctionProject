package com.carrot_auction.carrot_auction.domain.auction.entity;

import com.carrot_auction.carrot_auction.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Terms extends BaseEntity {

    @Id
    @Column
    private String id;

    @Column(length = 1300)
    private String comment;

    @Column
    private String type; //ex. 서비스 이용 약관 ..
}
