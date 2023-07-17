package com.carrot_auction.carrot_auction.domain.member.qRepository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import static com.carrot_auction.carrot_auction.domain.member.entity.QMember.member;
import static com.carrot_auction.carrot_auction.domain.member.entity.QPointLog.pointLog;

@RequiredArgsConstructor
public class MemberQRepositoryImpl implements MemberQRepository {

    JPAQueryFactory jpaQueryFactory;

    public void test(){

        jpaQueryFactory.select(
                member.countDistinct()
        ).from(member)
                .join(pointLog).on()
                .where()
                .groupBy().distinct();
    }
}
