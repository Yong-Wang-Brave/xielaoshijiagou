package com.pazl.track.client.overdue;

import com.pazl.module.common.core.Result;
import com.pazl.track.client.IClient;
import com.pazl.track.client.request.overdue.OverdueTaskOutRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

public interface OverdueTaskOutClient extends IClient {
    Result dealHandler(@Validated @RequestBody OverdueTaskOutRequest request);
}
