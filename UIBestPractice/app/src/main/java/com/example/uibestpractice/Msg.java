package com.example.uibestpractice;

/**
 * Created by 秦龙 on 2017/8/2.
 */

public class Msg {
    public static final int TYPE_RECEIVED=0;
    public static final int TYPE_SENT=1;
    private String content;
    private int type;

    public Msg(String content,int type){
        this.content=content;
        this.type=type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
