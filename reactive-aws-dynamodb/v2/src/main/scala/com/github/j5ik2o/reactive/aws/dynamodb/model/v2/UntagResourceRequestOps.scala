package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UntagResourceRequest => ScalaUntagResourceRequest }
import software.amazon.awssdk.services.dynamodb.model.{ UntagResourceRequest => JavaUntagResourceRequest }

import scala.collection.JavaConverters._

object UntagResourceRequestOps {

  implicit class ScalaUntagResourceRequestOps(val self: ScalaUntagResourceRequest) extends AnyVal {

    def toJava: JavaUntagResourceRequest = {
      val result = JavaUntagResourceRequest.builder()
      self.tagKeys.map(_.asJava).foreach(result.tagKeys)
      self.resourceArn.foreach(result.resourceArn)
      result.build()
    }

  }

  implicit class JavaUntagResourceRequestOps(val self: JavaUntagResourceRequest) extends AnyVal {

    def toScala: ScalaUntagResourceRequest = {
      ScalaUntagResourceRequest()
        .withTagKeys(Option(self.tagKeys).map(_.asScala))
        .withResourceArn(Option(self.resourceArn))
    }

  }

}
