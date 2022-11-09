package com.minigame

import android.graphics.drawable.Drawable
import android.widget.ImageView

class Question(
    val id: Int,
    val title: String,
    val hint: String,
    val answers: List<Answer>
)

class Answer(
    val title: String,
    val questionId: Int?,
    val description: String,
    val picture: String,
)
