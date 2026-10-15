package com.levented256.surfacemapmod;

import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class WaypointManager {
    private static final List<Waypoint> waypoints = new ArrayList<>();

    public static void addWaypoint(String name, BlockPos pos) {
        waypoints.add(new Waypoint(name, pos));
    }

    public static List<Waypoint> getWaypoints() {
        return new ArrayList<>(waypoints);
    }

    public static class Waypoint {
        private final String name;
        private final BlockPos pos;

        public Waypoint(String name, BlockPos pos) {
            this.name = name;
            this.pos = pos;
        }

        public String getName() {
            return name;
        }

        public BlockPos getPos() {
            return pos;
        }
    }
}