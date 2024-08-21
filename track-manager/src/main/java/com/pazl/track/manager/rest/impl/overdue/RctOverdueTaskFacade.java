package com.pazl.track.manager.rest.impl.overdue;


import cn.hutool.core.bean.BeanUtil;
import com.pazl.module.common.core.Result;
import com.pazl.track.manager.interfaces.overdue.IRctOverTaskFacade;
import com.pazl.track.manager.request.overdue.RctOverdueTaskQuery;
import com.pazl.track.manager.rest.impl.AbstractFacade;

import com.pazl.track.service.interfaces.IRctOverdueTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RctOverdueTaskFacade extends AbstractFacade implements IRctOverTaskFacade {
    @Autowired
    private IRctOverdueTaskService overdueTaskService;
    @Override
    public Result search(@Validated RctOverdueTaskQuery query) {
        com.pazl.track.model.overdue.RctOverdueTaskQuery rctOverdueTaskQuery = BeanUtil.copyProperties(query, com.pazl.track.model.overdue.RctOverdueTaskQuery.class);

        return Result.sucess(overdueTaskService.search(rctOverdueTaskQuery));
    }
}
