package com.wzh.ukvisa.controller;

import com.wzh.ukvisa.entities.Agency;

import com.wzh.ukvisa.mapper.AgencyMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 旅行社的控制层
 */
@Controller
public class AgencyController {
    Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    AgencyMapper agencyMapper;

    @GetMapping("/agencys")                   //非必须传入
    public String list(Map<String,Object> map,Agency agency){
        logger.info("旅行社列表中"+agency);
        List<Agency> agencys = agencyMapper.getAgencys(agency);
        map.put("agencys",agencys);
        map.put("agencyname",agency.getAgencyname());
        return "agency/list";
    }

    //查看某个旅行社详情
    @GetMapping("/agency/{aid}")
    public String view(@PathVariable("aid") Integer aid,
                       @RequestParam(value = "type",defaultValue = "view") String type,
                       Map<String, Object> map){
        logger.info("正在查询"+aid+"的旅行社详情");
        Agency agency = agencyMapper.getAgencyByAid(aid);
        map.put("agency",agency);

//        return "agency/view";
        //type=null默认为view页面，type=update为修改页面
        return "agency/"+type;
    }

    //修改旅行社信息(保存)
    @PutMapping("/agency")
    public String update(Agency agency) {
        logger.info("修改旅行社信息: " + agency);
        agencyMapper.updateAgency(agency);
        //重定向到列表页
        return "redirect:agencys";
    }

    //添加旅行社
    @GetMapping("/agency")
    public  String toAddPage(){
        //前往旅行社页面
        return "agency/add";
    }

    //处理添加旅行社请求
    @PostMapping("/agency")
    public String addAgency(Agency agency){
        //springmvc会自动将请求参数与形参对象的属性绑定
        //要求：请求参数名要与形参对象的属性名相同
        logger.info("添加旅行社信息"+agency);
        agencyMapper.addAgency(agency);
        return "redirect:agencys";

    }

    //删除操作
    @DeleteMapping("agency/{aid}")
    public String delete(@PathVariable("aid") Integer aid) {
        logger.info("删除旅行社：" + aid);
        agencyMapper.deleteAgencyByAid(aid);
        return "redirect:/agencys";
    }

}
