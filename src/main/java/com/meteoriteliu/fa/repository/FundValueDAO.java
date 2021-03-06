package com.meteoriteliu.fa.repository;

import com.meteoriteliu.fa.model.FundValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by meteo on 2017/3/21.
 */
public interface FundValueDAO extends JpaRepository<FundValue, Integer> {
    FundValue findTop1ByFundIdOrderByDateDesc(int fundId);

    Page<FundValue> findByFundIdOrderByDateDesc(int fundId, Pageable pageable);
}
