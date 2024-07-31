package com.harry18121911.cursoaristi

fun main(){
    mutableList()
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miércoles","Jueves","Viernes")

    readOnly.forEach{ day -> println(day) }
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miércoles","Jueves","Viernes")
    weekDays.add(0, "Sabado")
    print(weekDays)

}