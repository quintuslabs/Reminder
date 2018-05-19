package com.quintus.labs.reminder;

/**
 * Created by quintuslabs on 2017-12-29.
 */

public enum ReminderType {
    ALL("all"), ALERT("alert"), NOTE("note");

    private final String mName;

    ReminderType(String name) {
        mName = name;
    }

    public static ReminderType fromString(String name) {
        ReminderType[] actionTypes = values();
        for (ReminderType type : actionTypes) {
            if (type.mName.equals(name)) {
                return type;
            }
        }
        return null;
    }

    public String getName() {
        return mName;
    }

}
