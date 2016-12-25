package com.snake.kit.core.managers;

import android.content.Context;

import org.jivesoftware.smack.AbstractXMPPConnection;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yuan on 2016/11/7.
 * Detail 基础管理器...
 */

public class BaseManager implements Observer {

    public Context context;
    public AbstractXMPPConnection mConnection;

    public BaseManager(Context context, AbstractXMPPConnection mConnection) {
        this.context = context;
        this.mConnection = mConnection;
    }


    @Override
    public void update(Observable observable, Object data) {
        if (data instanceof AbstractXMPPConnection){
            this.mConnection = (AbstractXMPPConnection) data;
        }
    }
}
