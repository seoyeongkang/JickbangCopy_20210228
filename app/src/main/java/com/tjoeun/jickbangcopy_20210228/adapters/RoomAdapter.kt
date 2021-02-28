package com.tjoeun.jickbangcopy_20210228.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

//        row
        val data = mList[position]
//        mRoomList.add(Room(8000, "서울시 종로구", 4, "종로의 4층 방"))

        //?사진어캄
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

//        설명 문구는 : 있는 그대로

        descriptionTxt.text = data.description

//        주소/층수 => ~~시 ~~구, 5층 => String 가공

//        층수 : 1이상, 0, -1 이하냐 에 따라 다르게 가공되어야함
//        상황에 따라 다르게 층수를 가공하는 기능을 => Room의 기능으로 추가해보자

        addressAndFloorTxt.text = "${data.address}, ${data.getFormatedFloor()}"

        return row
    }
}