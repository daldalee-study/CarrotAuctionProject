package com.carrot_auction.carrot_auction.domain.member.repository;

import com.carrot_auction.carrot_auction.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,String> {
}
