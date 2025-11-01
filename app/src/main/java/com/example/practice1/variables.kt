package com.example.practice1

fun main(){
    print("hello world")

//    mutable
//    we can re assign values to mutable variables
    var age : Int = 20
    age = 25
    print(age)

//    immutable
//    we cannot re assign values to immutable variables
    val roll = 15
    println(roll)


    var a : Boolean = true
    var b : Char = 'R'
    var c : Byte = 12
    var d : Short = -356
    var e : Int = 43543
    var f : Long = -51321354L
    var i : Float = 5.6451344F
    var h : Double = 7.32644564

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)


    var x: Double = 132.32
    var y: Int = x.toInt()
    var z: Byte = y.toByte()

    println(x)
    println(y)
    println(z)


    var aa: String = "Hello world"
    var ii: Int = aa.length
    var xx: Boolean = a.equals("Hello world")
    var username: String = "   softwarica   "

    println(username.trim())
    println(aa)
    println(ii)
    println(aa.isEmpty())
    println(aa.lowercase())
    println(aa.uppercase())
    println(xx)
    print(aa.plus(", How are you?"))

}