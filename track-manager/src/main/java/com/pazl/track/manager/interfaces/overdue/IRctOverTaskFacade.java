package com.pazl.track.manager.interfaces.overdue;

import com.pazl.module.common.core.Result;
import com.pazl.track.manager.constant.RctOverdueTaskDefined;
import com.pazl.track.manager.interfaces.IFacade;
import com.pazl.track.manager.request.overdue.RctOverdueTaskQuery;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

public interface IRctOverTaskFacade extends IFacade {

    @GetMapping(value= RctOverdueTaskDefined.SEARCH)
    Result search (@Validated RctOverdueTaskQuery query);
}
