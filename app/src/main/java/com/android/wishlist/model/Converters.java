package com.android.wishlist.model;

import androidx.room.TypeConverter;

import java.util.Date;

public class Converters {

    //EXAMPLE
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }
}
