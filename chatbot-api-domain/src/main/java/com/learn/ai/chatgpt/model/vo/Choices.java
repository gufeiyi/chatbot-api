package com.learn.ai.chatgpt.model.vo;

/**
 * ClassName:Choices
 * Package:com.learn.ai.chatgpt.model.vo
 * Description: 选择
 *
 * @Author: 雪儿
 * @Create: 2024/2/24 19:59
 * @Version 1.0
 */
public class Choices {

    private String text;

    private int index;

    private String logprobs;

    private String finish_reason;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(String logprobs) {
        this.logprobs = logprobs;
    }

    public String getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }
}

