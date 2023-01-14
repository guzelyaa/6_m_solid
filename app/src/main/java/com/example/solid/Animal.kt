package com.example.solid

//1: Single Responsibility Principle
//Суперкласс
open class Animal() {
    open fun makeVoice(): String {
        return ""
    }

    open fun legCount(): Int {
        return 0
    }
}

class AnimalDB {
    fun saveAnimal(animal: Animal) {
    }

    fun getAnimal(): Animal {
        return Animal()
    }
}

//Подклассы
class Lion() : Animal() {
    override fun makeVoice(): String {
        return "Roar"
    }

    override fun legCount(): Int {
        return 4
    }
}

class Mouse() : Animal() {
    override fun makeVoice(): String {
        return "Squeak"
    }

    override fun legCount(): Int {
        return 4
    }
}

class Horse() : Animal() {
    override fun makeVoice(): String {
        return "Iuuuuu"
    }

    override fun legCount(): Int {
        return 4
    }
}

class Snake() : Animal() {
    override fun makeVoice(): String {
        return "Shhhh"
    }

    override fun legCount(): Int {
        return 0
    }
}

class Dog() : Animal() {
    override fun makeVoice(): String {
        return "GavGav"
    }

    override fun legCount(): Int {
        return 4
    }
}