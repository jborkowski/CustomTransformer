package custom.transformer

import org.scalatest.{FlatSpec, Matchers}
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql._


class CustomTransformerSpec extends FlatSpec with Matchers {
  "A Stack" should "pop values in last-in-first-out order" in {

    val ss = SparkSession.builder.master("local[*]").getOrCreate

    val sentenceDataFrame = ss.createDataFrame(Seq(
      (0, "Hi I heard about Spark"),
      (1, "I wish Java could use case classes"),
      (2, "Logistic,regression,models,are,neat")
    )).toDF("label", "sentence")
    val customTokenizer = (new CustomTransformer).setInputCol("sentence").setOutputCol("words")

    val tokenized = customTokenizer.transform(sentenceDataFrame)
    tokenized.select("words", "label").show

  }
}
