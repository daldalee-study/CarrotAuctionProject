package com.carrot_auction.carrot_auction.domain.member.repository;

import com.carrot_auction.carrot_auction.domain.member.entity.Member;
import com.carrot_auction.carrot_auction.domain.member.qRepository.MemberQRepository;
import org.springframework.data.jpa.repository.JpaRepository;

// repository 단일 사용을 위한 sample
public interface MemberRepository extends JpaRepository<Member,String>, MemberQRepository {
}
