package com.github.j5ik2o.reactive.dynamodb.model.v2
import com.github.j5ik2o.reactive.dynamodb.model.{ ProjectionType, Projection => ScalaProjection }
import software.amazon.awssdk.services.dynamodb.model.{ Projection => JavaProjection }

import scala.collection.JavaConverters._

object ProjectionOps {

  implicit class ScalaProjectionOps(val self: ScalaProjection) extends AnyVal {

    def toJava: JavaProjection = {
      val result = JavaProjection.builder()
      self.projectionType.map(_.entryName).foreach(result.projectionType)
      self.nonKeyAttributes.map(_.asJava).foreach(result.nonKeyAttributes)
      result.build()
    }

  }

  implicit class JavaProjectionOps(val self: JavaProjection) extends AnyVal {

    def toScala: ScalaProjection = {
      ScalaProjection()
        .withProjectionType(Option(self.projectionType).map(_.toString).map(ProjectionType.withName)).withNonKeyAttributes(
          Option(self.nonKeyAttributes).map(_.asScala)
        )
    }

  }
}
