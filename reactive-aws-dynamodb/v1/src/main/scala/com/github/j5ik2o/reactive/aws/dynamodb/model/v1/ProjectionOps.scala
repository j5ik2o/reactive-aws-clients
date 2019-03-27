// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Projection => ScalaProjection, _ }
import com.amazonaws.services.dynamodbv2.model.{ Projection => JavaProjection }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ProjectionOps {

  implicit class ScalaProjectionOps(val self: ScalaProjection) extends AnyVal {

    def toJava: JavaProjection = {
      val result = new JavaProjection()
      self.projectionType.foreach { v =>
        import ProjectionTypeOps._; result.withProjectionType(v.toJava)
      } // String
      self.nonKeyAttributes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._; result.withNonKeyAttributes(v.asJava)
      } // Seq[String]

      result
    }

  }

  implicit class JavaProjectionOps(val self: JavaProjection) extends AnyVal {

    def toScala: ScalaProjection = {
      ScalaProjection()
        .withProjectionType(Option(self.getProjectionType).map { v =>
          import ProjectionTypeOps._; v.toScala
        }) // String
        .withNonKeyAttributes(Option(self.getNonKeyAttributes).map { v =>
          import scala.collection.JavaConverters._; v.asScala
        }) // Seq[String]
    }

  }

}
