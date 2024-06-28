package com.leet.code

class Singleton private constructor(val value:String){
    companion object{
        private var instance: Singleton? = null
        fun getInstance (value:String): Singleton? {
            if(instance == null) {
                instance = Singleton(value)
            }
            return instance
        }
    }
}

fun main(){
    val singleton: Singleton? = Singleton.getInstance("FOO")
    val anotherSingleton: Singleton? = Singleton.getInstance("BAR")
    println(singleton?.value)
    println(anotherSingleton?.value)
    println(singleton == anotherSingleton)
}