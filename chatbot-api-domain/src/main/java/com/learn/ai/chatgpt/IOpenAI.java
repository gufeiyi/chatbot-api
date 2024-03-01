package com.learn.ai.chatgpt;

import java.io.IOException;

/**
 * ClassName:IOpenAI
 * Package:com.learn.ai.chatgpt
 * Description: chatgpt open ai 接口
 *
 * @Author: 雪儿
 * @Create: 2024/2/24 19:54
 * @Version 1.0
 */
public interface IOpenAI {

    String doChatGPT (String question) throws IOException;
}
