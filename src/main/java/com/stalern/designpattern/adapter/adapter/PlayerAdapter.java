package com.stalern.designpattern.adapter.adapter;

import com.stalern.designpattern.adapter.adaptee.Adaptee;

/**
 * 作为关联系统期待接口和WindowsMediaPlayer、RealPlayer的Adapter
 * @author stalern
 * @date 2019/12/03~15:06
 */
public class PlayerAdapter implements Player {

    private Adaptee adaptee = null;
    public PlayerAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void openPlayer() {
        System.out.println("适配成功");
        adaptee.action();
    }
}
