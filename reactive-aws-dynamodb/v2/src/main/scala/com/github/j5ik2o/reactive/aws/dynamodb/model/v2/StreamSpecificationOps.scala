package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamSpecification => ScalaStreamSpecification, _ }
import software.amazon.awssdk.services.dynamodb.model.{ StreamSpecification => JavaStreamSpecification }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamSpecificationOps {

  implicit class ScalaStreamSpecificationOps(val self: ScalaStreamSpecification) extends AnyVal {

    def toJava: JavaStreamSpecification = {
      val result = JavaStreamSpecification.builder()
      self.streamEnabled.map(_.booleanValue).foreach(v => result.streamEnabled(v)) // Boolean, case Boolean
      self.streamViewType.foreach { v =>
        import StreamViewTypeOps._; result.streamViewType(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaStreamSpecificationOps(val self: JavaStreamSpecification) extends AnyVal {

    def toScala: ScalaStreamSpecification = {
      ScalaStreamSpecification()
        .withStreamEnabled(Option(self.streamEnabled).map(_.booleanValue)) // Boolean
        .withStreamViewType(Option(self.streamViewType).map { v =>
          import StreamViewTypeOps._; v.toScala
        }) // String
    }

  }

}
