// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Projection => ScalaProjection, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Projection => JavaProjection }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ProjectionOps {

  implicit class ScalaProjectionOps(val self: ScalaProjection) extends AnyVal {

    def toJava: JavaProjection = {
      val result = JavaProjection.builder()
      self.projectionType.foreach { v =>
        import ProjectionTypeOps._; result.projectionType(v.toJava)
      } // String
      self.nonKeyAttributes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.nonKeyAttributes(v.asJava)
      } // Seq[String]

      result.build()
    }

  }

  implicit class JavaProjectionOps(val self: JavaProjection) extends AnyVal {

    def toScala: ScalaProjection = {
      ScalaProjection()
        .withProjectionType(Option(self.projectionType).map { v =>
          import ProjectionTypeOps._; v.toScala
        }) // String
        .withNonKeyAttributes(Option(self.nonKeyAttributes).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
    }

  }

}
