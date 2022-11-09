package com.minigame

import android.graphics.drawable.Drawable

object Game {
    val title = " День сурка "
    val endTitle = " Победа! Джейк вернулся к своей обычной жизни!"
    val startQuestion = 1
    val finish = -1
    val questions : List<Question> = listOf(
        Question(
           id = 1,
           title = "Джейк проснулся, раскалывается голова, он не помнит, что вчера произошло...",
           hint = "Если Джейк сейчас не встанет, то произойдёт катастрофа...",
           answers = listOf(
               Answer(
                   title = "Встать с постели, одеться",
                   questionId = 2,
                   description = "Надо вспомнить, что произошло...",
                   picture = "first"
               ),
               Answer(
                   title = "Поспать ещё",
                   questionId = null,
                   description = "Слишком много спать вредно",
                   picture = "jackssleeps"
               ),
               Answer(
                   title = "Перевернуться на другой бок",
                   questionId = null,
                   description = "Так, ничего не изменилось",
                   picture = "jackandclock"
               ),
           ) ,
        ),
        Question(
            id = 2,
            title = "Отлично! Теперь нужно бы подкрепиться",
            hint = "Джейк, только не затягивай с завтраком, у тебя на сегодня запланирована важная встреча...",
            answers = listOf(

                Answer(
                    title = "Доесть позавчерашний бутерброд",
                    questionId = null,
                    description = "Кажется, у Джейка несварение желудка",
                    picture = "jackissick"
                ),
                Answer(
                    title = "Заказать суши",
                    questionId = null,
                    description = "Доставку ждать 40 минут, попробуйте ещё раз",
                    picture = "sushi"
                ),
                Answer(
                    title = "Поесть внизу у Фреда",
                    questionId = 3,
                    description = "Ммм.. можно перехватить любимы сэндвич с ветчиной...",
                    picture = "food"
                ),
            ),
        ),
            Question(
            id = 3,
            title = "Джейк поел у Фреда. А что насчёт встречи? Хм...",
            hint = "это как-то связано с маленьким зверьком...",
            answers = listOf(

                Answer(
                    title = "Джейк звонит своей подруге Рите",
                    questionId = null,
                    description = "Увы, Рита не хочет сейчас разговаривать",
                    picture = "ritacall"
                ),
                Answer(
                    title = "Джейк решает отправиться на городскую площадь",
                    questionId = 4,
                    description = "Да, Вы двигаетесь в нужном направлении",
                    picture = "goingtocelebration"
                ),
                Answer(
                    title = "Джейк идёт в барбершоп",
                    questionId = null,
                    description = "Сейчас не время",
                    picture = "nottime"
                ),
            ),
        ),
        Question(
            id = 4,
            title = "Точно! Джейк же теле-метеоролог и сегодня он участвует в репортаже.",
            hint = "Сегодня день сурка! Но настроение так себе...",
            answers = listOf(
                Answer(
                    title = "После репортажа Джейк пойдёт на праздничный бал",
                    questionId = null,
                    description = "Совсем нет настроения идти на бал...",
                    picture = "fest"
                ),
                Answer(
                    title = "Вернётся обратно в гостиницу и будет спать",
                    questionId = 5,
                    description = "Отличная идея",
                    picture = "jackssleeps"
                ),
                Answer(
                    title = "Пойдёт в паб вместе с Ритой и Ларри",
                    questionId = null,
                    description = "Может, выпьем в другой раз?",
                    picture = "first"
                ),
            ),

        ),
        Question(
            id = 5,
            title = "Упс.. но наступило снова утро. Под какую музыку проснётся Джейк?",
            hint = "Поверьте, он её услышит ещё 25 раз...",
            answers = listOf(

                Answer(
                    title = "It Takes a Lot to Laugh, It Takes a Train to Cry",
                    questionId = null,
                    description = "Хороший трек, но мимо",
                    picture = "surokhaha"
                ),
                Answer(
                    title = "Good Day Sunshine",
                    questionId = null,
                    description = "Ничего хорошего Джейку сегодня не светит",
                    picture = "surokhaha"
                ),
                Answer(
                    title = "I Got You Babe",
                    questionId = 6,
                    description = "Сурок смеётся над Джейком",
                    picture = "surokhaha"
                ),
            ),
        ),
        Question(
            id = 6,
            title = "Как же бесит эта песня Джейка... Как же вырваться из этого порочного круга?",
            hint = "Теперь можно делать всё, что угодно...",
            answers = listOf(

                Answer(
                    title = "Джейк грабит инкассаторов и проматывает деньги",
                    questionId = null,
                    description = "Сурок хихикает и потерает свои маленькие лапки",
                    picture = "surokhaha"
                ),
                Answer(
                    title = "Джейк решает поделиться своей проблемой с Ритой",
                    questionId = 7,
                    description = "Да, это точно должно помочь",
                    picture = "ritatalk"
                ),
                Answer(
                    title = "Джейк напивается и хулиганит, объедается сладостями",
                    questionId = null,
                    description = "Это сурку тоже нравится",
                    picture = "nottime"
                ),
            ),
        ),
        Question(
            id = 7,
            title = "Джейк рассказывает Рите о метаморфозе, которая с ним приключилась",
            hint = "Рита предлагает изменить Джейку взгляды на жизнь...",
            answers = listOf(
                Answer(
                    title = " Джейк начинает самосовершенствование",
                    questionId = 8,
                    description = "Ого, это наверняка должно помочь!",
                    picture = "jacksmile"
                ),
                Answer(
                    title = "Джейк пытается покончить жизнь самоубийством",
                    questionId = null,
                    description = "Ой нет, кажется, мы идём не потой дорожке",
                    picture = "jackjump"
                ),
                Answer(
                    title = "Джейк идёт к гадалке",
                    questionId = null,
                    description = "Ууу, мэйджик",
                    picture = "first"
                ),
            ),
        ),
        Question(
            id = 8,
            title = "Джейк помогает людям, делает добрые дела, начинает привязываться к Рите",
            hint = "Такое",
            answers = listOf(
                Answer(
                    title = "Рита раз за разом даёт ему понять, что им не быть вместе",
                    questionId = 9,
                    description = "Джейк, всё ещё впереди",
                    picture = "ritano"
                ),
                Answer(
                    title = "Рита делает Джейка лучше, они влюбляются в друг друга",
                    questionId = null,
                    description = "Мда, быдло бы неплохо, но не в этот раз",
                    picture = "ritalove"
                ),
                Answer(
                    title = "Джейк испытывает к Рите только дружеские чувства",
                    questionId = null,
                    description = "Френдзона!? Нид хэлп!",
                    picture = "friends"
                ),
            ),
        ),
        Question(
            id = 9,
            title = "Но в один день, Джейк совершает много хороших поступков, приходит на бал и...",
            hint = "Может, у Риты что-то ёкнуло в сердце?",
            answers = listOf(

                Answer(
                    title = "Рита поздравляет Джейка с его преображением, проклятие исчезает",
                    questionId = null,
                    description = "Похоже на правду, но нет",
                    picture = "fest"
                ),
                Answer(
                    title = "Рита снова даёт понять Джейку, что между ними ничего не будет",
                    questionId = null,
                    description = "Нет повести печальнее на свете...",
                    picture = "ritano"
                ),
                Answer(
                    title = "Рита видит его преображение, они проводят ночь вместе",
                    questionId = -1,
                    description = "Фантастика! Действительно так и было",
                    picture = "inbed"
                ),

            )
        )
    )
}