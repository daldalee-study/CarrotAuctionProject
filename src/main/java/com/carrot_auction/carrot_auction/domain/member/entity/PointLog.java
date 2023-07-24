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
@Table(name="PointLog")
public class PointLog {

    @Id
    @Column(name = "Id", updatable = false)
    private String id;

    @Column(name = "MemberId", nullable = false, updatable = false)
    private String memberId;

    @Column(name = "Amount", nullable = false)
    private int amount = 0;

    @Column(name = "Type")
    @Enumerated(EnumType.STRING)
    private PointLogType type;

    @Column(name = "TotalPoint", nullable = false)
    private int totalPoint = 0;

    @Column(name = "IsSuccess")
    private Boolean isSuccess;

    @Column(name = "Reason")
    private String reason;

    @CreatedDate
    @Column(name = "CreateAt", nullable = false, updatable = false)
    private LocalDateTime createAt;

}
