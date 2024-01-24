/*
 * Copyright (c) 2023.
 */

package interfaces;
enum UsageType {ENTERTAINMENT,GOVERNMENT}

public class Building {
    public Building() {
    }

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }
}
