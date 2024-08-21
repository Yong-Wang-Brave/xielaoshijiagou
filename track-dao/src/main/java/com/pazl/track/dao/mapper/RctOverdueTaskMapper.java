package com.pazl.track.dao.mapper;

import com.pazl.track.dao.condition.RctOverdueTaskQuery;
import com.pazl.track.model.overdue.RctOverdueTaskResponse;
import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface RctOverdueTaskMapper {

        List<RctOverdueTaskResponse>   search(@Param("request")RctOverdueTaskQuery request);
}
