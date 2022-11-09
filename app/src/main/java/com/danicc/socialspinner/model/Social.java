package com.danicc.socialspinner.model;

public class Social {
    int icon;//R.id de drawable
    String name;
    boolean like;
    int totalUser;

    public Social(int icon, String name, boolean like, int totalUser) {
        this.icon = icon;
        this.name = name;
        this.like = like;
        this.totalUser = totalUser;
    }

    public Social(int android, String android1) {
        this.icon=android;
        this.name=android1;

    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    @Override
    public String toString() {
        return name;
    }
}
