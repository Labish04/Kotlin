package com.example.practice1

fun main(){
    // functions
    // 1. Standard library functions
    // 2. User defined functions

    // in kotlin void = unit
    // primitive = char, byte, short, int, long, float, double
    // non primitive = objects of class, string, etc.

    fun addNum (x: Int,y: Int) : Int{
        var sum = 0
        sum = x + y
        return sum
    }

    var result = addNum(10,20)
    print(result)
}