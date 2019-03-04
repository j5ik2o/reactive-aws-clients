package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ StreamSpecification => JavaStreamSpecification }
import com.github.j5ik2o.reactive.dynamodb.model.{ StreamViewType, StreamSpecification => ScalaStreamSpecification }

object StreamSpecificationOps {

  implicit class ScalaStreamSpecificationOps(val self: ScalaStreamSpecification) extends AnyVal {

    def toJava: JavaStreamSpecification = {
      val result = new JavaStreamSpecification()
      self.streamEnabled.foreach(v => result.setStreamEnabled(v))
      self.streamViewType.map(_.entryName).foreach(result.setStreamViewType)
      result
    }

  }

  implicit class JavaStreamSpecificationOps(val self: JavaStreamSpecification) extends AnyVal {

    def toScala: ScalaStreamSpecification = {
      ScalaStreamSpecification()
        .withStreamEnabled(Option(self.getStreamEnabled)).withStreamViewType(
          Option(self.getStreamViewType).map(StreamViewType.withName)
        )
    }

  }

}
