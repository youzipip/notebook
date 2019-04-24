package com.sxt.service;

import com.sxt.domain.Bill;
import com.sxt.vo.BillVo;

import java.util.List;

public interface BillService {

    //查询所有账单
    List<Bill> loadAllBill(BillVo billVo);
    //添加账单
    void addBill(BillVo billVo);
}
