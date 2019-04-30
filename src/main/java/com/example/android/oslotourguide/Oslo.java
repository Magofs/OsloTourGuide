package com.example.android.oslotourguide;

public class Oslo {
    private int mImageResourceId;
    private int mNameId;
    private int mParagraph;

    /**
     * Create a new Oslo object.
     *
     * @param imageResourceId is the image resource ID for the various attractions in Oslo
     * @param nameId          is the string resource Id for the various names of the attractions
     */
    public Oslo(int imageResourceId, int nameId, int paragraph) {
        mImageResourceId = imageResourceId;
        mNameId = nameId;
        mParagraph = paragraph;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getNameId() { return mNameId; }

    public int getParagraph() {
        return mParagraph;
    }
}
