package com.klasevich.lesson10
//boolean is true
//Collection/Map is not empty
//Matcher has match
//String/GString is not empty
//Number/Char  !=0
//reference    !=null

//asBoolean


class ConditionRunner {
    static void main(String[] args) {
        int x = 0
        boolean booleanResult = x > 0
        if (x) {
            println x
        }

        def person = new Person(19)
        if (person) {
            println person.getId()
        }
        person?.getId() //!null
//
//       def result = x!=null?x:1
        def result = x ?: 1
        println result
    }
}
