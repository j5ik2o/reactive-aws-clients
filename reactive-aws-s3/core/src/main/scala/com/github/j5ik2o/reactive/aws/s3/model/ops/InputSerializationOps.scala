// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ InputSerialization => ScalaInputSerialization, _ }
import software.amazon.awssdk.services.s3.model.{ InputSerialization => JavaInputSerialization }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object InputSerializationOps {

  implicit class ScalaInputSerializationOps(val self: ScalaInputSerialization) extends AnyVal {

    def toJava: JavaInputSerialization = {
      val result = JavaInputSerialization.builder()
      self.csv.foreach { v =>
        import CSVInputOps._; result.csv(v.toJava)
      } // CSVInput
      self.compressionType.foreach { v =>
        import CompressionTypeOps._; result.compressionType(v.toJava)
      } // String
      self.json.foreach { v =>
        import JSONInputOps._; result.json(v.toJava)
      } // JSONInput
      self.parquet.foreach { v =>
        import ParquetInputOps._; result.parquet(v.toJava)
      } // ParquetInput

      result.build()
    }

  }

  implicit class JavaInputSerializationOps(val self: JavaInputSerialization) extends AnyVal {

    def toScala: ScalaInputSerialization = {
      ScalaInputSerialization()
        .withCsv(Option(self.csv).map { v =>
          import CSVInputOps._; v.toScala
        }) // CSVInput
        .withCompressionType(Option(self.compressionType).map { v =>
          import CompressionTypeOps._; v.toScala
        }) // String
        .withJson(Option(self.json).map { v =>
          import JSONInputOps._; v.toScala
        }) // JSONInput
        .withParquet(Option(self.parquet).map { v =>
          import ParquetInputOps._; v.toScala
        }) // ParquetInput
    }

  }

}
