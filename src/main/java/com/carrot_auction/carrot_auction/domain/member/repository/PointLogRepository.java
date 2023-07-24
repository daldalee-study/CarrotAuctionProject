package com.carrot_auction.carrot_auction.domain.member.repository;

import com.carrot_auction.carrot_auction.domain.member.entity.PointLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointLogRepository extends JpaRepository<PointLog, String> {
}
