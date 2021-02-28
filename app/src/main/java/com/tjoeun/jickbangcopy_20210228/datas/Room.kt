package com.tjoeun.jickbangcopy_20210228.datas

import java.text.NumberFormat
import java.util.*

class Room(
    val price:Int,
    val address:String,
    val floor:Int,
    val description:String ) {

//    가격 값에 따라 => 억단위 표시 여부 가공 기능 -> 함수로, " 5억 4,500" String

    fun getFormatedPrice() : String {

        if(this.price < 10000) {
//            8,500 등 컴마 처리
            return NumberFormat.getNumberInstance(Locale.US).format(this.price)
        }
        else{
//            1억 이상 ?억 4,500등 억단위 + 컴마 처리

//            억? 몇억인지 => 가격을 10000으로 나눈 몫임.
            val uk = this.price / 10000

//            억 밑은 얼마인지 => 컴마 처리
            val rest = this.price % 10000
//            rest -> 컴마 처리
            val commaRest = NumberFormat.getNumberInstance(Locale.US).format(rest)

//            최종 결과 : ?억 ?,???으로 가공
            return "${uk}억 ${commaRest}"

        }
}


//    층수 값에 따라 => 5층, 반지하, 지하 2층 등으로 가공해주는 기능 => 함수(function)
    fun getFormatedFloor() : String {

//      층수 값에 따라 다른 값을 retrun
        if(this.floor >= 1) {
//            1층, 5층 등등 => floor층
            return "${this.floor}층"
        }
        else if(this.floor == 0) {
//            0층 : 반지하
            return "반지하"
        }
        else{
//            -1층, -2층...=> 지하 1층, 지하 2층 등으로 가공
            return "지하 ${-this.floor}층"
        }

    }

}