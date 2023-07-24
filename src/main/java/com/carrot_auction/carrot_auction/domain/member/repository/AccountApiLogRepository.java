package com.carrot_auction.carrot_auction.domain.member.repository;

import com.carrot_auction.carrot_auction.domain.member.entity.AccountApiLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountApiLogRepository extends JpaRepository<AccountApiLog, Long> {
}
