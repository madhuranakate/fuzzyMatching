import com.github.vickumar1981.stringdistance.StringDistance._
import com.github.vickumar1981.stringdistance.StringSound._
import com.github.vickumar1981.stringdistance.impl.{ConstantGap, LinearGap}

object FuzzyMatch extends App {
  // Cosine Similarity
  val cosSimilarity: Double = Cosine.score("hello", "chello") // 0.935

  // Damerau-Levenshtein Distance
  val damerauDist: Int = Damerau.distance("martha", "marhta") // 1
  val damerau: Double = Damerau.score("martha", "marhta") // 0.833

  // Dice Coefficient
  val diceCoefficient: Double = DiceCoefficient.score("martha", "marhta") // 0.4

  // Hamming Distance
  val hammingDist: Int = Hamming.distance("martha", "marhta") // 2
  val hamming: Double = Hamming.score("martha", "marhta") // 0.667

  // Jaccard Similarity
  val jaccard: Double = Jaccard.score("karolin", "kathrin", 1)

  // Jaro and Jaro Winkler
  val jaro: Double = Jaro.score("martha", "marhta") // 0.944
  val jaroWinkler: Double = JaroWinkler.score("martha", "marhta", 0.1) // 0.961

  // Levenshtein Distance
  val levenshteinDist: Int = Levenshtein.distance("martha", "marhta") // 2
  val levenshtein: Double = Levenshtein.score("martha", "marhta") // 0.667

  // Longest Common Subsequence
  val longestCommonSubSeq: Int = LongestCommonSeq.distance("martha", "marhta") // 5

  // Needleman Wunsch
  val needlemanWunsch: Double = NeedlemanWunsch.score("martha", "marhta", ConstantGap()) // 0.667

  // N-Gram Similarity and Distance
  val ngramDist: Int = NGram.distance("karolin", "kathrin", 1) // 5
  val bigramDist: Int = NGram.distance("karolin", "kathrin", 2) // 2
  val ngramSimilarity: Double = NGram.score("karolin", "kathrin", 1) // 0.714
  val bigramSimilarity: Double = NGram.score("karolin", "kathrin", 2) // 0.333

  // N-Gram tokens, returns a List[String]
  val tokens: List[String] = NGram.tokens("martha", 2) // List("ma", "ar", "rt", "th", "ha")

  // Overlap Similarity
  val overlap: Double = Overlap.score("karolin", "kathrin", 1) // 0.286
  val overlapBiGram: Double = Overlap.score("karolin", "kathrin", 2) // 0.667

  // Smith Waterman Similarities
  val smithWaterman: Double = SmithWaterman.score("martha", "marhta", (LinearGap(gapValue = -1), Integer.MAX_VALUE))
  val smithWatermanGotoh: Double = SmithWatermanGotoh.score("martha", "marhta", ConstantGap())

  // Tversky Similarity
  val tversky: Double = Tversky.score("karolin", "kathrin", 0.5) // 0.333

  // Phonetic Similarity
  val metaphone: Boolean = Metaphone.score("merci", "mercy") // true
  val soundex: Boolean = Soundex.score("merci", "mercy") // true


}