package com.learn.ai;

import com.learn.ai.chatgpt.IOpenAI;
import com.learn.ai.qianfanModel.IQianFanAI;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSON;
import com.learn.ai.zsxq.IZsxqApi;
import com.learn.ai.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;
import com.learn.ai.zsxq.model.vo.Topics;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * ClassName:SpringBootRunTest
 * Package:com.learn.ai
 * Description:
 *
 * @Author: 雪儿
 * @Create: 2024/2/23 18:25
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRunTest {

    private Logger logger = LoggerFactory.getLogger(SpringBootRunTest.class);

    @Value("${chatbot-api.group01.groupId}")
    private String groupId;
    @Value("${chatbot-api.group01.cookie}")
    private String cookie;

    @Resource
    private IZsxqApi zsxqApi;

    @Resource
    private IOpenAI openAI;

    @Resource
    private IQianFanAI qianFanAI;

    @Test
    public void test_zsxqApi() throws IOException {
        UnAnsweredQuestionsAggregates unAnsweredQuestionsAggregates = zsxqApi.queryUnAnsweredQuestionsTopicId(groupId, cookie);
        logger.info("测试结果：{}", JSON.toJSONString(unAnsweredQuestionsAggregates));

        List<Topics> topics = unAnsweredQuestionsAggregates.getResp_data().getTopics();
        for (Topics topic : topics) {
            String topicId = topic.getTopic_id();
            String text = topic.getQuestion().getText();
            logger.info("topicId：{} text：{}", topicId, text);

            // 回答问题
            //zsxqApi.answer(groupId, cookie, topicId, openAI.doChatGPT(openAiKey, text), false);
        }
    }

    @Test
    public void test_openAI() throws IOException {
        String response = openAI.doChatGPT("请帮我写一个java的冒泡排序");
        logger.info("测试结果：{}",response);
    }

    @Test
    public void test_qianfan() throws IOException {
        String response = qianFanAI.doQianFanAnswer("请帮我优化一下简历");
        logger.info("测试结果：{}",response);
    }



}
