package com.tjoeun.jickbangcopy_20210228.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.tjoeun.jickbangcopy_20210228.datas.Room
import java.util.ArrayList

class RoomAdapter(val mContext : Context,
                  val resId : Int,
                  val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {


}