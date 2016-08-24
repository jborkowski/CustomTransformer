package custom.tranformer

import org.scalatest.{FlatSpec, Matchers}
import org.apache.spark.sql.SparkSession

class CustomTransformerSpec extends FlatSpec with Matchers {
  "A Stack" should "pop values in last-in-first-out order" in {
    //Fake content...
    val spark = SparkSession.builder().master("local[*]").appName("MyLovelyApp").getOrCreate()
    val t = new CustomTransformer
    println(t.explainParams)

  }
}
