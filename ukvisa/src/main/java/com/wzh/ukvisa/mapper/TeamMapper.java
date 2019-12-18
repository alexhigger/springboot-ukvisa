package com.wzh.ukvisa.mapper;

import com.wzh.ukvisa.entities.Team;
import com.wzh.ukvisa.entities.TeamAgency;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TeamMapper {

    List<TeamAgency> getTeams(Team team);
    TeamAgency getTeamByTid(Integer tid);

//    List<BillProvider>getBills(Bill bill);
//    BillProvider getBillByBid(Integer bid);

    int addTeam(Team team);
    int updateTeam(Team team);
    int deleteTeamByTid(Integer tid);

}
