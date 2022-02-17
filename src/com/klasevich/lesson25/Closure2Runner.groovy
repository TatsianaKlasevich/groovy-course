package com.klasevich.lesson25

import com.klasevich.lesson17.Student

class Closure2Runner {
    static void main(String[] args) {
        Closure closure = {
            firstName = "Sveta"
        }
        println closure.thisObject
        println closure.owner
        println closure.delegate //owner

        def student = new Student("Ivan", "Ivanov", 28)
        println student
//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()

//        student.with closure
//        println student

        student.getInfo()()
    }
}
