package com.carrot_auction.carrot_auction.domain.member.entity;

import com.carrot_auction.carrot_auction.domain.member.enums.PointLogType;
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
public class PointLog {

    @Id
    @Column(updatable = false)
    private String id;

    @Column(nullable = false, updatable = false)
    private String memberId;

    @Column(nullable = false)
    private int amount = 0;

    @Column
    @Enumerated(EnumType.STRING)
    private PointLogType type;

    @Column(nullable = false)
    private int totalPoint = 0;

    @Column
    private Boolean isSuccess;

    @Column
    private String reason;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt;

}
