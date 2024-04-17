package com.eventique.theven.data

fun giveAnswer(name:String):String{
    return when(name.lowercase()){
        "abc"->"xyz"
        "compass"->"""I'm a spot where letters will eventually roam,
But currently, I'm not quite a home.
In a corner Near the gateway to lavad
seek me for your next reward.
"""
        "kraken"->"""I grew tall on the stage of sand,
A giant where a building expands.
Near the Jack of Spades i stand
Hiding what you want in my leafy hands
"""
        "atlantis"->"""I'm a place where wheels go round and round,
A room with pumps, my presence is found.
Pedals push, and air fills the tire,
Helping cyclists to go higher and higher.
"""
        "titanic"->"""I hold your liquid desires, a well nearby,
look like Mjolnir, but I never fly.
By your garments' domain I patiently wait,
Answer is on my back, so don't be late
"""
        else->""
    }

//    fun giveAnswer(name:String):image{
//        return when(name.lowercase()){
//            "abc"->"xyz"
//            "jack_sparrow"->"""I'm a spot where letters will eventually roam,
//But currently, I'm not quite a home.
//In a corner Near the gateway to lavad
//seek me for your next reward.
//"""
//            "el_dorado"->"""I grew tall on the stage of sand,
//A giant where a building expands.
//Near the Jack of Spades i stand
//Hiding what you want in my leafy hands
//"""
//            "black_beard"->"""I'm a place where wheels go round and round,
//A room with pumps, my presence is found.
//Pedals push, and air fills the tire,
//Helping cyclists to go higher and higher.
//"""
//            "black_pearl"->"""I hold your liquid desires, a well nearby,
//look like Mjolnir, but I never fly.
//By your garments' domain I patiently wait,
//Answer is on my back, so don't be late
//"""
//            else->"end"
//        }
}
