package com.example.lab1.objeto

enum class tipoPlaneta{
    terrestre, gaseoso, enano
}

class planeta constructor(var nombre:String, var satelites:Int, var masa:Double, var volumen:Double, var distanciaSol:Int, var tipo:tipoPlaneta){
    val distanciaExt:Int = 149597870

    init {
        println("El nombre del planeta es ${nombre} y tiene ${satelites} satélites.")
        println("El planeta ${nombre} es un planeta ${tipo}, su masa es de ${masa} kg y su volumen es de ${volumen} kg.")
        println("Además, su distancia con respecto a su sol es de ${distanciaSol} km.")
    }

    fun obtenerDensidad():Double {
        return (masa / volumen)
    }

    fun esExterior(): String {
        if (distanciaSol > distanciaExt){
            return "exterior."
        }
        else{
            return "uno no exterior."
        }
    }
}