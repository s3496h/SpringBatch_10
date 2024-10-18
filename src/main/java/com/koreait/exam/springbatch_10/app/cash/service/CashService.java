package com.koreait.exam.springbatch_10.app.cash.service;

import com.koreait.exam.springbatch_10.app.cart.entity.CartItem;
import com.koreait.exam.springbatch_10.app.cart.repository.CartItemRepository;
import com.koreait.exam.springbatch_10.app.cash.entity.CashLog;
import com.koreait.exam.springbatch_10.app.cash.repository.CashRepository;
import com.koreait.exam.springbatch_10.app.member.entity.Member;
import com.koreait.exam.springbatch_10.app.product.entity.ProductOption;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CashService {
    private final CashRepository cashRepository;
    public CashLog addCash(Member member, long price, String eventType) {
        CashLog cashLog = CashLog.builder()
                .member(member)
                .price(price)
                .eventType(eventType).build();
        cashRepository.save(cashLog);
        return cashLog;
    }

}
