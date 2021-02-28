package com.tjoeun.jickbangcopy_20210228

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.tjoeun.jickbangcopy_20210228.adapters.RoomAdapter
import com.tjoeun.jickbangcopy_20210228.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(Room(8000, "서울시 종로구", 4, "종로의 4층 방"))
        mRoomList.add(Room(9000, "서울시 동대문구", 3, "동대문의 3층 방"))
        mRoomList.add(Room(8000, "서울시 강남구", 11, "강남의 11층 방"))
        mRoomList.add(Room(1100, "서울시 서대문구", -1, "종로의 4층 방"))
        mRoomList.add(Room(10000, "서울시 은평구", 0, "종로의 4층 방"))
        mRoomList.add(Room(26000, "경기도 성남시", 2, "종로의 4층 방"))
        mRoomList.add(Room(12000, "서울시 강북구", -2, "종로의 4층 방"))
        mRoomList.add(Room(15000, "충청도 천안시", 4, "종로의 4층 방"))
        mRoomList.add(Room(18000, "경기도 용인시", 15, "종로의 4층 방"))
        mRoomList.add(Room(14000, "서울시 마포구", 0, "종로의 4층 방"))
        mRoomList.add(Room(22500, "경기도 고양시", 9, "종로의 4층 방"))

        mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->

//            클릭 된 방이 어떤 방인지 ?
            val clickedRoom = mRoomList[position]

//            이 방 정보를 등록 => 상세 화면으로 이동 Intent(2) 사용

            val myintent = Intent(this, ViewRoomDetailActivity::class.java)

            myintent.putExtra("roomInfo", clickedRoom)
            
            startActivity(myintent)

        }
    }
}