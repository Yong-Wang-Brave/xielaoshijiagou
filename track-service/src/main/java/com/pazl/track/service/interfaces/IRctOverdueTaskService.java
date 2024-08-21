package com.pazl.track.service.interfaces;

import com.pazl.track.model.overdue.RctOverdueTaskQuery;
import com.pazl.track.model.overdue.RctOverdueTaskResponse;

import java.util.List;

public interface IRctOverdueTaskService {
List<RctOverdueTaskResponse> search(RctOverdueTaskQuery req);
}
