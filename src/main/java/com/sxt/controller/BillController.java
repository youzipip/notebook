package com.sxt.controller;

import com.sxt.domain.Bill;
import com.sxt.domain.Type;
import com.sxt.service.BillService;
import com.sxt.service.TypeService;
import com.sxt.vo.BillVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.awt.image.IntegerComponentRaster;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("bill")
public class BillController {

    @Autowired
    private BillService billService;
    @Autowired
    private TypeService typeService;



    /**
     * 显示所有账单
     * @param model
     * @return
     */
    @RequestMapping("queryAllBill")
    public String queryAllBill(Model model,BillVo billVo){
        List<Bill> bills = this.billService.loadAllBill(billVo);
        List<Type> types = this.typeService.queryAllType();
        Map<Integer,String> map = new HashMap<>();
        for (Type type : types) {
            map.put(type.getId(),type.getName());
        }
        model.addAttribute("bill",bills);
        model.addAttribute("types",types);
        model.addAttribute("map",map);
        return "list";
    }

    /**
     * 添加账单
     * @param billVo
     */
    @RequestMapping("addBill")
    public void addBill(BillVo billVo){
        this.billService.addBill(billVo);
    }
}
