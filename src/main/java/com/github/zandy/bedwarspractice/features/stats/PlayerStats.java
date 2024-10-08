package com.github.zandy.bedwarspractice.features.stats;

import com.github.zandy.bamboolib.database.Database;

import java.util.HashMap;
import java.util.UUID;

public class PlayerStats {
    private static final HashMap<UUID, PlayerStats> playerStatsMap = new HashMap<>();
    private final UUID uuid;
    private final HashMap<Stats.StatsType, Double> stats;

    public PlayerStats(UUID uuid, HashMap<Stats.StatsType, Double> stats) {
        this.stats = stats;
        this.uuid = uuid;
        playerStatsMap.put(uuid, this);
    }

    public static PlayerStats get(UUID uuid) {
        return playerStatsMap.get(uuid);
    }

    public double get(Stats.StatsType statsType) {
        return this.stats.get(statsType);
    }

    public void set(Stats.StatsType statsType, double value) {
        if (statsType != null) {
            double value2 = Double.parseDouble(String.format("%,.2f", value).replace(",", "."));
            this.stats.put(statsType, value2);
            Database.getInstance().setDouble(this.uuid, value2, statsType.name(), Stats.getTableName());
        }
    }
}
