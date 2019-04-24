package com.sxt.service.impl;

import com.sxt.domain.Bill;
import com.sxt.mapper.BillMapper;
import com.sxt.service.BillService;
import com.sxt.vo.BillVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    public List<Bill> loadAllBill(BillVo billVo) {
        return this.billMapper.queryAllBill(billVo);
    }

    @Override
    public void addBill(BillVo billVo) {
        this.billMapper.insertSelective(billVo);
    }
}
