package custom.transformer
/**
  * Created by jborkowski on 24/08/16.
  */
import org.apache.spark.ml._
import org.apache.spark.ml.util._
import org.apache.spark.ml.param._
import org.apache.spark.sql.types.{ArrayType, DataType, StringType}

class CustomTransformer (override val uid: String)
extends UnaryTransformer[String, Seq[String], CustomTransformer] with DefaultParamsWritable {
  def this() = this(Identifiable.randomUID("cto"))

  override protected def createTransformFunc: (String) => Seq[String] = { originStr =>
//    val re = $(pattern).r
//    val str = if ($(toUppercase)) originStr.toUpperCase else originStr
//    val tokens = if ($(gaps)) re.split(str).toSeq else re.findAllIn(str).toSeq
    originStr.toUpperCase().split(" ")
  }

  override protected def outputDataType: DataType = new ArrayType(StringType, true)
}
