package com.android.wishlist.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = {PresentEntity.class/*Entity.class for all entities*/},
          version = 1,
          exportSchema = false)
@TypeConverters({Converters.class})
public abstract class DatabaseHelper extends RoomDatabase {

    public static final String DATABASE_NAME = "wishlist_database";

    public abstract WishlistDAO wishlistDAO();
}
