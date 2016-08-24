/**
  * Created by jborkowski on 24/08/16.
  */
import org.apache.spark.ml._
import org.apache.spark.ml.util._

class CustomTransformer extends UnaryTransformer[String, Seq[String], CustomTransformer] with DefaultParamsWritable {

}
