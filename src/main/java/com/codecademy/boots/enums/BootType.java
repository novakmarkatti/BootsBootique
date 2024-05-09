package com.codecademy.boots.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BootType {
 CHELSEA,
 CHUKKA,
 DRESS,
 COWBOY,
 GOGO,
 RUSSIAN,
 UGG,
 RIGGER,
 RAIN,
 RACING,
 MOTOCROSS,
 WADER,
 GALOSH,
 SNOW,
 TOURING;

     @JsonCreator
    public static BootType fromString(String value) {
        for (BootType type : BootType.values()) {
            if (type.toString().equalsIgnoreCase(value)) {
                return type;
            }
        }
        return null; // or throw an exception if needed
    }

    @JsonValue
    public String toJson() {
        return this.toString();
    }
}