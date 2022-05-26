package org.testplugin.data;

import org.bukkit.entity.Player;
import java.time.LocalTime;

import java.util.HashMap;

public class MinecraftTimer {

    private HashMap<String, String> playerHashMap = new HashMap<String, String>();

    // When a player calls starttimer it will register their current system time
    // When a player calls gettimer it will substract reg_sys_time - cur_sys_time
    // When a player calls resettime check if they have a time assigned to them,
    // if not then we check their sys_time and put it in a dataset

    // Default constructor
    public void startTimer(Player iPlayer) {
        LocalTime localTime = LocalTime.now();
        this.playerHashMap.put(iPlayer.getDisplayName(), String.valueOf(localTime));
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
        //sdfsdf
    }

    public HashMap<String, String> getPlayerHashMap() {
        return this.playerHashMap;
    }

    public void getTimer() {

    }

    public void resetTime() {

    }

    public MinecraftTimer() {

    }



}
