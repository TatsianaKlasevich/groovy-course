package com.klasevich.lesson24

import com.klasevich.lesson17.Student

@Category(Student.class)
class DefaultStudentsMethods {
    def testStr() {
        println "$age, $firstName"
    }

    static def anotherMethod(Student self, String value) {
        println "$self, args: $value"
    }
}
