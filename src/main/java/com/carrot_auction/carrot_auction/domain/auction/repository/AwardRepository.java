package com.carrot_auction.carrot_auction.domain.auction.repository;

import com.carrot_auction.carrot_auction.domain.auction.entity.Award;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AwardRepository extends JpaRepository<Award, String> {
}
