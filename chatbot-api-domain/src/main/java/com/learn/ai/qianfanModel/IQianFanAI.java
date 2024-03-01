package com.learn.ai.qianfanModel;

import java.io.IOException;

/**
 * ClassName:IQianFanAI
 * Package:com.learn.ai.qianfanModel
 * Description:
 *
 * @Author: 雪儿
 * @Create: 2024/2/25 9:58
 * @Version 1.0
 */
public interface IQianFanAI {

    String doQianFanAnswer(String question) throws IOException;
}
