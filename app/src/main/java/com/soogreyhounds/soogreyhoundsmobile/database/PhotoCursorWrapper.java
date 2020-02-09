package com.soogreyhounds.soogreyhoundsmobile.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.soogreyhounds.soogreyhoundsmobile.Photo;

public class PhotoCursorWrapper extends CursorWrapper {
    public PhotoCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Photo getPhoto() {
        String uuid =
                getString(getColumnIndex(SooGreyhoundsDBSchema.PhotoTable.Cols.UUID));
        String title = getString(getColumnIndex(SooGreyhoundsDBSchema.PhotoTable.Cols.TITLE));
        String url = getString(getColumnIndex(SooGreyhoundsDBSchema.PhotoTable.Cols.URL));
        String note =
                getString(getColumnIndex(SooGreyhoundsDBSchema.PhotoTable.Cols.NOTE));
        String person = getString(getColumnIndex(SooGreyhoundsDBSchema.PhotoTable.Cols.PERSON));
        Photo photo = new Photo();
        photo.setUUID(uuid);
        photo.setTitle(title);
        photo.setURL(url);
        photo.setNote(note);
        photo.setPerson(person);
        return photo;
    }
}