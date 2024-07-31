package com.harry18121911.cursoaristi

//Variables

fun main(){
   val name = "Harry";
   getMonth(3);
}

fun getTremester(month:Int){
   when(month){
      in 1 .. 6 -> print("Primer trimestre")

   }
}

fun getMonth(month:Int){
   when(month){
      1 -> println("Enero")
      2 -> println("Febrero")
      3 -> println("Marzo")
      4 -> println("Enero")
      5 -> println("Enero")
      6 -> println("Enero")
      7 -> println("Enero")
      8 -> println("Enero")
      9 -> println("Enero")
      10 -> println("Enero")
      11 -> println("Enero")
      12 -> println("Enero")
      else -> println("No es un mes válido")
   }
}


