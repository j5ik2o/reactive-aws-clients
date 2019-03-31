// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ SelectParameters => ScalaSelectParameters, _ }
import software.amazon.awssdk.services.s3.model.{ SelectParameters => JavaSelectParameters }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SelectParametersOps {

  implicit class ScalaSelectParametersOps(val self: ScalaSelectParameters) extends AnyVal {

    def toJava: JavaSelectParameters = {
      val result = JavaSelectParameters.builder()
      self.inputSerialization.foreach { v =>
        import InputSerializationOps._; result.inputSerialization(v.toJava)
      } // InputSerialization
      self.expressionType.foreach { v =>
        import ExpressionTypeOps._; result.expressionType(v.toJava)
      } // String
      self.expression.filter(_.nonEmpty).foreach(v => result.expression(v)) // String
      self.outputSerialization.foreach { v =>
        import OutputSerializationOps._; result.outputSerialization(v.toJava)
      } // OutputSerialization

      result.build()
    }

  }

  implicit class JavaSelectParametersOps(val self: JavaSelectParameters) extends AnyVal {

    def toScala: ScalaSelectParameters = {
      ScalaSelectParameters()
        .withInputSerialization(Option(self.inputSerialization).map { v =>
          import InputSerializationOps._; v.toScala
        }) // InputSerialization
        .withExpressionType(Option(self.expressionType).map { v =>
          import ExpressionTypeOps._; v.toScala
        }) // String
        .withExpression(Option(self.expression)) // String
        .withOutputSerialization(Option(self.outputSerialization).map { v =>
          import OutputSerializationOps._; v.toScala
        }) // OutputSerialization
    }

  }

}
