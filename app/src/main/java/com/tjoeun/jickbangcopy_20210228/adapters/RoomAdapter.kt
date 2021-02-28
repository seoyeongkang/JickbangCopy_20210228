package com.tjoeun.jickbangcopy_20210228.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.tjoeun.jickbangcopy_20210228.R
import com.tjoeun.jickbangcopy_20210228.datas.Room
import java.util.ArrayList

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow ==  null ){
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        return row
    }
}