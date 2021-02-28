package com.tjoeun.jickbangcopy_20210228

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.jickbangcopy_20210228.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("roomInfo") as Room

        priceTxt.text = roomData.getFormatedPrice()
        descriptionTxt.text = roomData.description

        address.text = roomData.address
        floorTxt.text = roomData.getFormatedFloor()

    }
}