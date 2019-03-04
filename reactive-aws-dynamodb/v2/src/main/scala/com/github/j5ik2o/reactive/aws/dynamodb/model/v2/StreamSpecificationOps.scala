package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ StreamViewType, StreamSpecification => ScalaStreamSpecification }
import software.amazon.awssdk.services.dynamodb.model.{ StreamSpecification => JavaStreamSpecification }

object StreamSpecificationOps {

  implicit class ScalaStreamSpecificationOps(val self: ScalaStreamSpecification) extends AnyVal {

    def toJava: JavaStreamSpecification = {
      val result = JavaStreamSpecification.builder()
      self.streamEnabled.foreach(v => result.streamEnabled(v))
      self.streamViewType.map(_.entryName).foreach(result.streamViewType)
      result.build()
    }

  }

  implicit class JavaStreamSpecificationOps(val self: JavaStreamSpecification) extends AnyVal {

    def toScala: ScalaStreamSpecification = {
      ScalaStreamSpecification()
        .withStreamEnabled(Option(self.streamEnabled)).withStreamViewType(
          Option(self.streamViewType).map(_.toString).map(StreamViewType.withName)
        )
    }

  }

}
