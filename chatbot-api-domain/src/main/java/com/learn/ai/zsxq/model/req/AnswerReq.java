package com.learn.ai.zsxq.model.req;

/**
 * ClassName:AnswerReq
 * Package:com.learn.ai.zsxq.model.req
 * Description:请求问答接口信息
 *
 * @Author: 雪儿
 * @Create: 2024/2/23 17:46
 * @Version 1.0
 */
public class AnswerReq {

    private ReqData req_data;

    public AnswerReq(ReqData req_data) {
        this.req_data = req_data;
    }

    public ReqData getReq_data() {
        return req_data;
    }

    public void setReq_data(ReqData req_data) {
        this.req_data = req_data;
    }

}

