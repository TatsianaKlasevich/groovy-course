package com.klasevich.lesson27

class DslBuilder {

    static MailSpecification mail(@DelegatesTo(MailSpecification) Closure closure) {
        def mailSpecification = new MailSpecification()
        mailSpecification.with closure
        mailSpecification

//        closure.delegate = mailSpecification
//        closure.resolveStrategy = Closure.DELEGATE_ONLY
//        closure()

    }
}
