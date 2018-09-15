package com.moke.service;

import com.moke.common.Result;
import com.moke.dao.domain.Data;

public interface IDataService {
    Result<?> addData(Data data) throws Exception;
}
