package com.learn.ai.zsxq.model.res;

import com.learn.ai.zsxq.model.vo.Topics;

import java.util.List;

/**
 * ClassName:RespData
 * Package:com.learn.ai.zsxq.model.res
 * Description: 结果数据
 *
 * @Author: 雪儿
 * @Create: 2024/2/23 17:38
 * @Version 1.0
 */
public class RespData {

    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

}

