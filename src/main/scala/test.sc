import com.github.vickumar1981.stringdistance.StringDistance._
import com.github.vickumar1981.stringdistance.impl.{ConstantGap, LinearGap}

val cosSimilarity: Double = Cosine.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme")

// Damerau-Levenshtein Distance
val damerau: Double = Damerau.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme") // 0.833

// Dice Coefficient
val diceCoefficient: Double = DiceCoefficient.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme") // 0.4

// Hamming Distance
val hamming: Double = Hamming.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme") // 0.667

// Jaccard Similarity
val jaccard: Double = Jaccard.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", 1)

// Jaro and Jaro Winkler
val jaro: Double = Jaro.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme") // 0.944
val jaroWinkler: Double = JaroWinkler.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", 0.1) // 0.961

// Levenshtein Distance
val levenshtein: Double = Levenshtein.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme") // 0.667

// Needleman Wunsch
val needlemanWunsch: Double = NeedlemanWunsch.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", ConstantGap()) // 0.667

// N-Gram Similarity and Distance
val ngramSimilarity: Double = NGram.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", 1) // 0.714
val bigramSimilarity: Double = NGram.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", 2) // 0.333

// Overlap Similarity
val overlap: Double = Overlap.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", 1) // 0.286
val overlapBiGram: Double = Overlap.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", 2) // 0.667

// Smith Waterman Similarities
val smithWaterman: Double = SmithWaterman.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", (LinearGap(gapValue = -1), Integer.MAX_VALUE))
val smithWatermanGotoh: Double = SmithWatermanGotoh.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", ConstantGap())

// Tversky Similarity
val tversky: Double = Tversky.score("Synechron Limited Group Life Scheme", "Synchron ltd Grup Life Scheme", 0.5) // 0.333
