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
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name="AccountApiLog")
public class AccountApiLog {
    // 로그 테이블의 id로 seq 역할을 한다고 판단해서 GenerationType.IDENTITY로 생성
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MemberId", updatable = false)
    private String memberId;

    @Column(name = "Url", nullable = false)
    private String url;

    @Column(name = "Response")
    private String response;

    @Column(name = "Request")
    private String request;

    @Column(name = "Status")
    private String status;

    @CreatedDate
    @Column(name = "CreateAt", nullable = false, updatable = false)
    private LocalDateTime createAt;
}
