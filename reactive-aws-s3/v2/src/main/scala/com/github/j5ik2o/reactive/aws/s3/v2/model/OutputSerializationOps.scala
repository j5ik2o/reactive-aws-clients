// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ OutputSerialization => ScalaOutputSerialization, _ }
import software.amazon.awssdk.services.s3.model.{ OutputSerialization => JavaOutputSerialization }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object OutputSerializationOps {

  implicit class ScalaOutputSerializationOps(val self: ScalaOutputSerialization) extends AnyVal {

    def toJava: JavaOutputSerialization = {
      val result = JavaOutputSerialization.builder()
      self.csv.foreach { v =>
        import CSVOutputOps._; result.csv(v.toJava)
      } // CSVOutput
      self.json.foreach { v =>
        import JSONOutputOps._; result.json(v.toJava)
      } // JSONOutput

      result.build()
    }

  }

  implicit class JavaOutputSerializationOps(val self: JavaOutputSerialization) extends AnyVal {

    def toScala: ScalaOutputSerialization = {
      ScalaOutputSerialization()
        .withCsv(Option(self.csv).map { v =>
          import CSVOutputOps._; v.toScala
        }) // CSVOutput
        .withJson(Option(self.json).map { v =>
          import JSONOutputOps._; v.toScala
        }) // JSONOutput
    }

  }

}
