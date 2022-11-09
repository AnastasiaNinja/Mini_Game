package com.minigame

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.minigame.ui.main.AnswerDescriptionFragment
import com.minigame.ui.main.EndFragment
import com.minigame.ui.main.MainFragment
import com.minigame.ui.main.QuestionFragment

object Navigation {
    fun main(fragmentManager: FragmentManager) = replace(
        fragmentManager = fragmentManager,
        fragmentClass = MainFragment::class.java
    )

    fun end(fragmentManager: FragmentManager) = replace(
        fragmentManager = fragmentManager,
        fragmentClass = EndFragment::class.java
    )


    fun question(fragmentManager: FragmentManager, questionId: Int) = replace(
        fragmentManager = fragmentManager,
        fragmentClass = QuestionFragment::class.java,
        args = QuestionFragment.bundle(questionId = questionId)
    )

    fun answer(
        fragmentManager: FragmentManager,
        questionId: Int,
        answer: String,
    ) = replace(
        fragmentManager,
        AnswerDescriptionFragment::class.java,
        AnswerDescriptionFragment.bundle(
            questionId = questionId,
            answer = answer,

        )
    )


    private fun replace(
        fragmentManager: FragmentManager,
        fragmentClass: Class<out Fragment?>,
        args: Bundle? = null,
    ) {
        fragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.slide_in, R.anim.slide_out)
            .replace(R.id.container, fragmentClass, args)
            .commit()
    }
}