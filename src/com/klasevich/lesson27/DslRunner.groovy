package com.klasevich.lesson27


import static com.klasevich.lesson27.DslBuilder.mail

//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTitle("title")
//
//def body = new EmailBody()
//body.setTest("sdfdf")
//body.setImages(List.of("image.jpg"))
//email.setBody(body)


//builder
mail {
    from "from@mail.ru"
    to "to@mairl.ru"
    title "title"
    body {
        text "text of the letter"
        images(['image.jpg', 'image2.png'])
    }
}