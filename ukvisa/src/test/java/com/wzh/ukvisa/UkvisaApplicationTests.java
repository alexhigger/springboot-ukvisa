package com.wzh.ukvisa;

import com.wzh.ukvisa.entities.Agency;
import com.wzh.ukvisa.entities.TeamAgency;
import com.wzh.ukvisa.mapper.AgencyMapper;
import com.wzh.ukvisa.mapper.TeamMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UkvisaApplicationTests {
    @Autowired
    AgencyMapper agencyMapper;


    @Test
    void contextLoads() {
//        Agency a = new Agency();
//        a.setAgencyname("阳光国旅");
//        List<Agency> agencys = agencyMapper.getAgencys(a);
//        System.out.println(agencys.get(0));


        Agency agency = agencyMapper.getAgencyByAid(2);
        System.out.println(agency);

        agency.setAgencyname("阳光国旅xxxxxxx");
        int size = agencyMapper.updateAgency(agency);
        System.out.println(size);

//        agencyMapper.deleteAgencyByAid(6);


    }

//    @Autowired
//    TeamMapper teamMapper;
//            @Test
//    public void teamTest(){
//                teamMapper.getTeamByTid(2)
//            }

}
