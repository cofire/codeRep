package com.merck.service;

import com.merck.common.Result;
import com.merck.dao.domain.Data;

public interface IDataService {
    Result<?> addData(Data data) throws Exception;
}
