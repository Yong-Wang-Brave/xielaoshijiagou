package com.pazl.track.domain.provider;

import com.pazl.track.dao.condition.RctOverdueTaskQuery;
import com.pazl.track.model.overdue.RctOverdueTaskResponse;

import java.util.List;

public interface IRctOverdueTaskDomain {
    
    List<RctOverdueTaskResponse> search(RctOverdueTaskQuery request);
}
