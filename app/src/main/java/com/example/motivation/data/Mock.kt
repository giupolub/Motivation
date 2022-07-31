package com.example.motivation.data

import com.example.motivation.infra.MotivationConstants
import kotlin.random.Random

data class Phrase(val description: String, val categoryId: Int, val language: String)

class Mock {

    private val infinite = MotivationConstants.FILTER.INFINITE
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sun = MotivationConstants.FILTER.SUN

    private val portuguese = MotivationConstants.LANGUAGE.PORTUGUESE
    private val english = MotivationConstants.LANGUAGE.ENGLISH
    private val french = MotivationConstants.LANGUAGE.FRENCH

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e fez.", happy, portuguese),
        Phrase(
            "Você não é derrotado quando perde, você é derrotado quando desiste!",
            happy,
            portuguese
        ),
        Phrase("Quando está mais escuro, vemos mais estrelas!", happy, portuguese),
        Phrase(
            "Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.",
            happy,
            portuguese
        ),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", happy, portuguese),
        Phrase(
            "O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?",
            happy,
            portuguese
        ),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", sun, portuguese),
        Phrase("Você perde todas as chances que você não aproveita.", sun, portuguese),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sun, portuguese),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", sun, portuguese),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sun, portuguese),
        Phrase("Se você acredita, faz toda a diferença.", sun, portuguese),
        Phrase(
            "Riscos devem ser corridos, porque o maior perigo é não arriscar nada!",
            sun,
            portuguese
        ),
        Phrase("Not knowing it was impossible, he went there and did it.", happy, english),
        Phrase(
            "You are not defeated when you lose, you are defeated when you give up!",
            happy,
            english
        ),
        Phrase("When it's darker, we see more stars!", happy, english),
        Phrase(
            "Insanity is always doing the same thing and expecting a different result.",
            happy,
            english
        ),
        Phrase("Don't stop when you're tired, stop when you're done.", happy, english),
        Phrase("What can you do now that has the biggest impact on your success?", happy, english),
        Phrase("The best way to predict the future is to invent it.", sun, english),
        Phrase("You lose every chance you don't take.", sun, english),
        Phrase("Failure is the spice that flavors success.", sun, english),
        Phrase(" As long as we are not committed, there will be hesitation!", sun, english),
        Phrase("If you don't know where you want to go, any way will do.", sun, english),
        Phrase("If you believe, it makes all the difference.", sun, english),
        Phrase(
            "Risks must be taken, because the greatest danger is not risking anything!",
            sun,
            english
        ),
        Phrase("Ne sachant pas que c'était impossible, il y est allé et l'a fait.", happy, french),
        Phrase(
            "Tu n'es pas vaincu quand tu perds, tu es vaincu quand tu abandonnes!",
            happy,
            french
        ),
        Phrase("Quand il fait plus sombre, on voit plus d'étoiles!", happy, french),
        Phrase(
            "La folie, c'est toujours faire la même chose et s'attendre à un résultat différent.",
            happy,
            french
        ),
        Phrase("Ne t'arrête pas quand tu es fatigué, arrête quand tu as fini.", happy, french),
        Phrase(
            "Que pouvez-vous faire maintenant qui a le plus grand impact sur votre succès?",
            happy,
            french
        ),
        Phrase("La meilleure façon de prédire l'avenir est de l'inventer.", sun, french),
        Phrase("Vous perdez toutes les chances que vous ne prenez pas.", sun, french),
        Phrase("L'échec est l'épice qui parfume le succès.", sun, french),
        Phrase("Tant qu'on n'est pas engagé, il y aura des hésitations!", sun, french),
        Phrase(
            "Si vous ne savez pas où vous voulez aller, n'importe quoi fera l'affaire.",
            sun,
            french
        ),
        Phrase("Si vous croyez, cela fait toute la différence.", sun, french),
        Phrase(
            "Il faut prendre des risques, car le plus grand danger est de ne rien risquer!",
            sun,
            french
        )
    )

    fun getPhrase(value: Int, language: String): String {
        var lang = language.lowercase()
        if (lang !in listOf(portuguese, english, french)) {
            lang = portuguese
        }

        val filtered = mListPhrases.filter {
            (it.categoryId == value || value == infinite) && (it.language == lang)
        }

        val random = Random.nextInt(filtered.size)

        return filtered[random].description
    }
}