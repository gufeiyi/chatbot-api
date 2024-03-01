package com.learn.ai.zsxq.model.vo;

/**
 * ClassName:UserSpecific
 * Package:com.learn.ai.zsxq.model.vo
 * Description:
 *
 * @Author: 雪儿
 * @Create: 2024/2/23 17:06
 * @Version 1.0
 */
public class UserSpecific {

    private boolean liked;

    private boolean subscribed;

    public void setLiked(boolean liked){
        this.liked = liked;
    }
    public boolean getLiked(){
        return this.liked;
    }
    public void setSubscribed(boolean subscribed){
        this.subscribed = subscribed;
    }
    public boolean getSubscribed(){
        return this.subscribed;
    }

}

