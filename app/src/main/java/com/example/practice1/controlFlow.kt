package com.example.practice1

import androidx.compose.animation.scaleOut
import kotlin.random.Random

// Decision making :
//if statement
//when

//Looping Statements
//for
//for-each
//while
//do-while

fun main(){
    //IF
//    print("Enter a number: \n")
//    var num : Any = readln().toInt()
//    if(num.toString().toInt() % 2 == 0){
//        println("Even")
//    }
//    else{
//        println("Odd")
//    }

//    When - similar to If
//    print("ENter a day number of week: \n")
//    var dayNumber: Int = readln().toInt()
//    var day: String
//    when (dayNumber){
//        1 -> day = "Sunday"
//        2 -> day = "Monday"
//        3 -> day = "Tuesday"
//        4 -> day = "Wednesday"
//        5 -> day = "Thursday"
//        6 -> day = "Friday"
//        7 -> day = "Saturday"
//        else -> day = "invalid"
//    }
//    print(day)


    // For loop

//    for (j in 0 .. 10){
//        println(j)
//    }
//    for(i in 0 until 10){
//        println(i)
//    }

//    var vehicle = arrayListOf<String>("Tata","Kia","Hyundai")
//    for(y in vehicle.indices){
//        println("The value is $y index is "+ vehicle[y])
//    }


//    For each

//    var vehicle = arrayListOf<String>("Tata","Kia","Hyundai","MG")
//
//    vehicle.forEach{
//        print(it)
//    }

//    while loop

//    var i = 0
//    while (i < 5){
//        println(i)
//        i++
//    }

//    Infinite Loop

//    var num = Random.nextInt(0,1000)
//    println("Enter any num from 0 to 1000")
//    while (2 > 1){
//        var userGuess : Int = readln().toInt()
//        if(userGuess == num){
//            print("Congrats: \n")
//            break
//        }
//        else if (userGuess < num){
//            println("Increase guess")
//        }
//        else{
//            println("Decrease guess")
//        }
//    }

// DO while loop

    var num = 1
    do{
        println(num)
        num ++
    } while(num <=15)
}