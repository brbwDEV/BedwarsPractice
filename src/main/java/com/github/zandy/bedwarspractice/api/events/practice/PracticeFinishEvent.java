package com.github.zandy.bedwarspractice.api.events.practice;

import com.github.zandy.bedwarspractice.api.utils.data.PracticeData;
import com.github.zandy.bedwarspractice.engine.GameEngine;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PracticeFinishEvent extends Event {
   public static final HandlerList handlers = new HandlerList();
   private final Player player;
   private final GameEngine.PracticeType practiceType;
   private final PracticeData practiceData;

   public PracticeFinishEvent(Player var1, GameEngine.PracticeType var2, PracticeData var3) {
      this.player = var1;
      this.practiceType = var2;
      this.practiceData = var3;
   }

   public HandlerList getHandlers() {
      return handlers;
   }

   public static HandlerList getHandlerList() {
      return handlers;
   }

   public Player getPlayer() {
      return this.player;
   }

   public GameEngine.PracticeType getPracticeType() {
      return this.practiceType;
   }

   public PracticeData getPracticeData() {
      return this.practiceData;
   }
}
