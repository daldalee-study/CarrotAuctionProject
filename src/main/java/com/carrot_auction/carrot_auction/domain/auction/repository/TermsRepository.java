package com.carrot_auction.carrot_auction.domain.auction.repository;

import com.carrot_auction.carrot_auction.domain.auction.entity.Terms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TermsRepository extends JpaRepository<Terms, String> {

}
