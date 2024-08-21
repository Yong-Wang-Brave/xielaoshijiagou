package com.pazl.track.domain.core;


import com.pazl.track.dao.mapper.RctOverdueTaskMapper;
import com.pazl.track.dao.condition.RctOverdueTaskQuery;
import com.pazl.track.domain.AbstractDomain;
import com.pazl.track.domain.provider.IRctOverdueTaskDomain;
import com.pazl.track.model.overdue.RctOverdueTaskResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RctOverdueTaskDomain extends AbstractDomain implements IRctOverdueTaskDomain {

  @Autowired
  private RctOverdueTaskMapper   rctOverdueTaskMapper;


    @Override
    public List<RctOverdueTaskResponse> search(RctOverdueTaskQuery request) {

return rctOverdueTaskMapper.search(request);
    }
}
