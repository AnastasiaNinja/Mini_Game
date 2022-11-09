package com.minigame.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.minigame.Answer
import com.minigame.Game
import com.minigame.Navigation
import com.minigame.databinding.FragmentAnswerDescriptionBinding


class AnswerDescriptionFragment : Fragment(){
    companion object {
        fun bundle(questionId: Int, answer: String): Bundle{
            val bundle = Bundle()
            bundle.putInt("QUESTION_ID", questionId)
            bundle.putString("ANSWER", answer)
            return bundle
        }
    }
        lateinit var binding : FragmentAnswerDescriptionBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentAnswerDescriptionBinding.inflate(inflater)
            return binding.root
        }



        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val questionId = requireArguments().getInt("QUESTION_ID")
            val answerText = requireArguments().getString("ANSWER")
            val question = Game.questions.first { quest -> quest.id == questionId }
            val answer = question.answers.first { answer -> answer.title == answerText }

            binding.message.text = answer.description

            binding.answerDescription.setOnClickListener { processAnswer(answer) }

           binding.image.setImageResource(requireContext().resources.getIdentifier(answer.picture,
           "drawable", requireContext().packageName))

        }


            private fun processAnswer(answer: Answer) {
                when (answer.questionId) {
                    null -> Navigation.question(parentFragmentManager, Game.startQuestion)
                    -1 -> Navigation.end(parentFragmentManager)
                    else -> Navigation.question(parentFragmentManager, answer.questionId)
                }
            }


}