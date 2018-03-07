package com.example.android.sunshine;

/**
 * Created by wade8 on 2018/3/6.
 */

interface ItemTouchHelperAdapter {
    void onItemMove(int fromPosition, int toPosition);
    void onItemDel(int position);
}
