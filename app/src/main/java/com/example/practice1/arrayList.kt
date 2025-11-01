package com.example.practice1

fun main(){
    var age = arrayListOf<Int>(5,10,15)
    print(age)

    var name = ArrayList<String>()
    name.add("labish")
    name.add("parajuli")
    name.add("hello")
    print(name[1])
    name.removeAt(1)
    print(name)

    val mixed = arrayListOf<Any>(1,2,"hi","hello")
    print(mixed)
}