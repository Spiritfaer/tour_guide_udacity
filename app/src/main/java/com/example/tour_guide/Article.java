package com.example.tour_guide;

import android.app.Activity;

import java.util.ArrayList;

public class Article {
    private static final String DEV_HEADER = "lorem ipsum";
    private static final String DEV_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
            "Proin consectetur ligula quis purus aliquam, in cursus nibh mollis. Curabitur dictum, " +
            "elit sed tincidunt euismod, purus ligula vehicula erat, laoreet facilisis orci " +
            "ante eget dui. Phasellus ex quam, egestas vel nisl in, convallis ultricies ex. Phasellus " +
            "at volutpat enim. Fusce id auctor quam. Ut pulvinar laoreet eros in venenatis. Mauris " +
            "porta, neque id auctor mollis, odio est pretium risus, quis feugiat neque erat in augue. " +
            "Nam felis nunc, fringilla non iaculis sit amet, posuere id augue. Duis vel tristique ipsum. " +
            "Donec viverra metus sed pulvinar tempor. Donec eleifend dui vitae mattis porttitor. " +
            "Nam eu facilisis libero. Proin in rutrum nulla, non malesuada nibh. Maecenas convallis " +
            "fringilla dignissim. Nunc pharetra iaculis libero, ut porta diam malesuada a. Nunc " +
            "sollicitudin tincidunt lorem.\n\n" +
            "Nunc dignissim lectus in massa maximus, vel pharetra enim faucibus. Donec condimentum " +
            "mi lectus, non placerat tortor ultrices vitae. Suspendisse leo diam, tempus in scelerisque " +
            "non, venenatis a lacus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices " +
            "posuere cubilia curae; Orci varius natoque penatibus et magnis dis parturient montes, " +
            "nascetur ridiculus mus. Curabitur ut aliquam mi, vel luctus elit. Vestibulum eu purus ac " +
            "nisi pellentesque tincidunt vitae vel nibh. Donec aliquam dignissim posuere. Pellentesque " +
            "eleifend feugiat velit vitae posuere. Duis vel diam in metus bibendum lacinia. Sed malesuada " +
            "enim nec sapien scelerisque suscipit. Nullam aliquet nunc et venenatis ullamcorper. " +
            "Nullam elementum ipsum non mi accumsan, mattis laoreet ligula scelerisque. Fusce " +
            "condimentum congue ipsum, eget vulputate ligula dapibus vitae. Donec egestas neque in " +
            "egestas semper.\n\n" +
            "Proin laoreet arcu sit amet hendrerit varius. Nunc in sapien nec eros vulputate tempor " +
            "accumsan nec elit. Donec neque nunc, pretium ac consectetur in, mattis id orci. " +
            "Suspendisse eu eros erat. Aliquam eu libero et ex dignissim tristique eget id lorem. " +
            "Curabitur tincidunt hendrerit aliquam. Donec nisi neque, laoreet eu nulla quis, lacinia " +
            "vehicula elit. Cras ut massa ipsum. Ut eu tristique tellus. Donec nec gravida magna, ac " +
            "vestibulum arcu. Aliquam ultricies, enim a luctus interdum, massa nulla cursus diam, sit " +
            "amet viverra purus tortor a justo. Nulla et pulvinar odio. Quisque condimentum purus tellus, " +
            "vel maximus nibh viverra vitae. Cras imperdiet tempor ullamcorper. Proin imperdiet nisi " +
            "eget finibus interdum. Fusce eleifend condimentum justo.";

    private final String mHeader;
    private final String mText;
    private final int mImageResource;
    private final boolean hasImage;

    public Article() {
        mHeader = DEV_HEADER;
        mText = DEV_TEXT;
        mImageResource = 0;
        hasImage = false;
    }

    public Article(String title, String text) {
        mHeader = title;
        mText = text;
        mImageResource = 0;
        hasImage = false;
    }

    public Article(String title, String text, int imageResource) {
        mHeader = title;
        mText = text;
        mImageResource = imageResource;
        hasImage = true;
    }

    public String getHeader() {
        return mHeader;
    }

    public String getText() {
        return mText;
    }

    public int getImageResource() {
        return mImageResource;
    }
    public boolean hasImage() {
        return hasImage;
    }
}