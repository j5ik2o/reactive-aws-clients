package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ Projection => JavaProjection }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ProjectionType, Projection => ScalaProjection }

import scala.collection.JavaConverters._

object ProjectionOps {

  implicit class ScalaProjectionOps(val self: ScalaProjection) extends AnyVal {

    def toJava: JavaProjection = {
      val result = new JavaProjection()
      self.projectionType.map(_.entryName).foreach(result.setProjectionType)
      self.nonKeyAttributes.map(_.asJava).foreach(result.setNonKeyAttributes)
      result
    }

  }

  implicit class JavaProjectionOps(val self: JavaProjection) extends AnyVal {

    def toScala: ScalaProjection = {
      ScalaProjection()
        .withProjectionType(Option(self.getProjectionType).map(ProjectionType.withName)).withNonKeyAttributes(
          Option(self.getNonKeyAttributes).map(_.asScala)
        )
    }

  }

}
