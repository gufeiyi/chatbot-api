package com.learn.ai.zsxq.model.aggregates;

import com.learn.ai.zsxq.model.res.RespData;

/**
 * ClassName:UnAnsweredQuestionsAggregates
 * Package:com.learn.ai.zsxq.model.aggregates
 * Description:未回答问题的聚合信息
 *
 * @Author: 雪儿
 * @Create: 2024/2/23 17:36
 * @Version 1.0
 */
public class UnAnsweredQuestionsAggregates {

    private boolean succeeded;
    private RespData resp_data;

    // 获取成功的状态
    public boolean isSucceeded() {
        return succeeded;
    }

    // 修改成功的状态
    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    // 获取返回数据
    public RespData getResp_data() {
        return resp_data;
    }

    // 修改返回数据
    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }

}

