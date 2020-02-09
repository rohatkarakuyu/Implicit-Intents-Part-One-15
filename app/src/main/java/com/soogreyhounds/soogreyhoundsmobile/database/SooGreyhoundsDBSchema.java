package com.soogreyhounds.soogreyhoundsmobile.database;

public class SooGreyhoundsDBSchema {
    public static final class PhotoTable {
        public static final String NAME = "photos";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String URL = "url";
            public static final String NOTE = "note";
            public static final String PERSON = "person";
        }
    }
}
