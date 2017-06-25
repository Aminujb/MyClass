package com.jsquad.android.myclass.Util;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class ActivityUtils {
    /**
     * Adds a fragment to an Activity.
     *
     * @param fragmentManager (getSupportFragmentManager() would do just fine here)
     * @param resourceId - The container to hold the Fragment (eg FrameLayout)
     * @param fragment - The fragment to be added. It has to be a Support Fragment
     * @param tag - A tag to identify the fragment (This is optional)
     */
    public static void hostFragment(FragmentManager fragmentManager,
                                    int resourceId,
                                    Fragment fragment,
                                    @Nullable String tag) {
        if (fragment != null) {
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(resourceId, fragment, tag)
                    .commit();
        }
    }

}
