package com.sxt.service;

import com.sxt.domain.Bill;
import com.sxt.domain.Type;
import com.sxt.vo.BillVo;

import java.util.List;

public interface TypeService {

    //查询所有账单
    List<Type> queryAllType();

}
