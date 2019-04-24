package com.sxt.service.impl;

import com.sxt.domain.Bill;
import com.sxt.domain.Type;
import com.sxt.mapper.BillMapper;
import com.sxt.mapper.TypeMapper;
import com.sxt.service.BillService;
import com.sxt.service.TypeService;
import com.sxt.vo.BillVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> queryAllType() {
        return typeMapper.queryAllType();
    }
}
