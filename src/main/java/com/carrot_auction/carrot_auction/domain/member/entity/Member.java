package com.carrot_auction.carrot_auction.domain.member.entity;

import com.carrot_auction.carrot_auction.global.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Member")
public class Member extends BaseEntity {

    @Id
    @Column(name = "Id", updatable = false)
    private String id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "PhoneNo", nullable = false, unique = true)
    private String phoneNo;

    @Column(name = "Point", nullable = false)
    private long point = 0;

}
