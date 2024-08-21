package com.pazl.track.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.pazl.track.domain.provider.IRctOverdueTaskDomain;
import com.pazl.track.model.overdue.RctOverdueTaskQuery;
import com.pazl.track.model.overdue.RctOverdueTaskResponse;
import com.pazl.track.service.interfaces.IRctOverdueTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RctOverdueTaskService extends AbstractRctOverdueTaskService implements IRctOverdueTaskService
{
    @Autowired
    private IRctOverdueTaskDomain overdueTaskDomain;


    @Override
    public List<RctOverdueTaskResponse> search(RctOverdueTaskQuery req) {
        com.pazl.track.dao.condition.RctOverdueTaskQuery rctOverdueTaskQuery = BeanUtil.copyProperties(req, com.pazl.track.dao.condition.RctOverdueTaskQuery.class);
        return overdueTaskDomain.search(rctOverdueTaskQuery);
    }
    // 无需实现，空实现方便Spring Boot自动注入
}
