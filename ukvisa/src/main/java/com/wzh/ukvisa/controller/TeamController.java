package com.wzh.ukvisa.controller;

import com.wzh.ukvisa.entities.Agency;
import com.wzh.ukvisa.entities.Team;
import com.wzh.ukvisa.entities.TeamAgency;
import com.wzh.ukvisa.mapper.AgencyMapper;
import com.wzh.ukvisa.mapper.TeamMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class TeamController {
    Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    AgencyMapper agencyMapper;
    @Autowired
    TeamMapper teamMapper;


    @GetMapping("/teams")
    public String list(Map<String,Object> map, Team team){
        logger.info("账单查询中"+team);
        //获取所有团组
        List<TeamAgency> teamAgencys = teamMapper.getTeams(team);

        //获取所有供应商
        List<Agency> agencys = agencyMapper.getAgencys(null);
        //用于搜索回显数据
        map.put("teamAgencys",teamAgencys);
        map.put("agencys",agencys);
        map.put("teamname",team.getTeamname());
        map.put("teamnum",team.getTeamnum());
        map.put("money",team.getMoney());
        map.put("vip",team.getVip());
        map.put("aid",team.getAid());
        return "team/list";
    }


    //查看某个旅行社详情
    @GetMapping("/team/{tid}")
    public String view(@PathVariable("tid") Integer tid,
                       @RequestParam(value = "type",defaultValue = "view") String type,
                       Map<String, Object> map){
        logger.info("正在查询"+tid+"的团组详情");
        TeamAgency teamAgency = teamMapper.getTeamByTid(tid);
        map.put("teamAgency",teamAgency);
        //查询所有旅行社

        if("update".equals(type)) {
            List<Agency> agencys = agencyMapper.getAgencys(null);
            map.put("agencys",agencys);
        }

//        return "team/view";
        //type=null默认为view页面，type=update为修改页面
        return "team/"+type;
    }

    //修改团组信息
    @PutMapping("/team")
    public String update(Team team) {
        logger.info("修改账单信息: " + team);
        teamMapper.updateTeam(team);
        //重定向到列表页
        return "redirect:teams";
    }


    //前往添加 页面
    @GetMapping("/team")
    public String toAddPage(Map<String, Object> map) {
//查询所有供应商
        map.put("agencys", agencyMapper.getAgencys(null));
        return "team/add";
    }

    //添加数据
    @PostMapping("/team")
    public String add(Team team) {
        logger.info("添加团组数据" + team);
    //保存数据操作
        teamMapper.addTeam(team);
        return "redirect:/teams";
    }
    //删除
    @DeleteMapping("/team/{tid}")
    public String delete(@PathVariable("tid") Integer tid) {
        logger.info("删除" + tid+"团组");
        teamMapper.deleteTeamByTid(tid);
        return "redirect:/teams";
    }

}
