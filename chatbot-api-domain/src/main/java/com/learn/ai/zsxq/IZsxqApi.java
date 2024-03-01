package com.learn.ai.zsxq;

import com.learn.ai.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;

import java.io.IOException;

/**
 * ClassName:IZsxqApi
 * Package:com.learn.ai.zsxq
 * Description:
 *
 * @Author: 雪儿
 * @Create: 2024/2/23 16:56
 * @Version 1.0
 */
public interface IZsxqApi {
    // 接口是给出groupId和cookie，他帮你找出来TopicId，这个是回答问题时候请求路径上面需要的
    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionsTopicId(String groupId, String cookie) throws IOException;

    // 调用回答问题的接口  silenced 是否其他人可见
    boolean answer(String groupId, String cookie, String topicId, String text, boolean silenced) throws IOException;
}
