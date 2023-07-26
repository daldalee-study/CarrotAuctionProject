package com.carrot_auction.carrot_auction.domain.member.entity;

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
public class AccountApiLog {
    // 로그 테이블의 id로 seq 역할을 한다고 판단해서 GenerationType.IDENTITY로 생성
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    private String memberId;

    @Column(nullable = false, length = 1300)
    private String url;

    @Column(length = 1300)
    private String response;

    @Column(length = 1300)
    private String request;

    @Column
    private String status;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createAt;
}
