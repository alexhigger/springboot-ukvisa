package com.wzh.ukvisa.mapper;

import com.wzh.ukvisa.entities.Agency;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface AgencyMapper {
        List<Agency> getAgencys(Agency agency);//获取所有

        Agency getAgencyByAid(Integer aid);



        int addAgency(Agency agency);
        int deleteAgencyByAid(Integer aid);
        int updateAgency(Agency agency);
}
