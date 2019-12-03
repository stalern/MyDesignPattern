package com.stalern.designpattern.adapter;

import com.stalern.designpattern.adapter.adaptee.Adaptee;
import com.stalern.designpattern.adapter.adaptee.RealPlayer;
import com.stalern.designpattern.adapter.adapter.Player;
import com.stalern.designpattern.adapter.adapter.PlayerAdapter;

/**
 * 对象适配器模式的客户端
 * @author stalern
 * @date 2019/12/03~15:24
 */
public class AdapterClient {
    public static void runAdapter() {
        Adaptee adaptee = new RealPlayer();
        Player player = new PlayerAdapter(adaptee);
        player.openPlayer();
    }
}
