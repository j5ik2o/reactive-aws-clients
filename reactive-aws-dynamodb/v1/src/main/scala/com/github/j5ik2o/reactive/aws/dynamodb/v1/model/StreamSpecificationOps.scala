// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamSpecification => ScalaStreamSpecification, _ }
import com.amazonaws.services.dynamodbv2.model.{ StreamSpecification => JavaStreamSpecification }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamSpecificationOps {

  implicit class ScalaStreamSpecificationOps(val self: ScalaStreamSpecification) extends AnyVal {

    def toJava: JavaStreamSpecification = {
      val result = new JavaStreamSpecification()
      self.streamEnabled.map(_.booleanValue).foreach(v => result.withStreamEnabled(v)) // Boolean
      self.streamViewType.foreach { v =>
        import StreamViewTypeOps._; result.withStreamViewType(v.toJava)
      } // String

      result
    }

  }

  implicit class JavaStreamSpecificationOps(val self: JavaStreamSpecification) extends AnyVal {

    def toScala: ScalaStreamSpecification = {
      ScalaStreamSpecification()
        .withStreamEnabled(Option(self.getStreamEnabled).map(_.booleanValue)) // Boolean
        .withStreamViewType(Option(self.getStreamViewType).map { v =>
          import StreamViewTypeOps._; v.toScala
        }) // String
    }

  }

}
