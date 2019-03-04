package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TagResourceRequest => ScalaTagResourceRequest }
import software.amazon.awssdk.services.dynamodb.model.{ TagResourceRequest => JavaTagResourceRequest }

import scala.collection.JavaConverters._

object TagResourceRequestOps {

  import TagOps._

  implicit class ScalaTagResourceRequestOps(val self: ScalaTagResourceRequest) extends AnyVal {

    def toJava: JavaTagResourceRequest = {
      val result = JavaTagResourceRequest.builder()
      self.tags.map(_.map(_.toJava).asJava).foreach(result.tags)
      self.resourceArn.foreach(result.resourceArn)
      result.build()
    }

  }

  implicit class JavaTagResourceRequestOps(val self: JavaTagResourceRequest) extends AnyVal {

    def toScala: ScalaTagResourceRequest = {
      ScalaTagResourceRequest()
        .withTags(Option(self.tags).map(_.asScala.map(_.toScala)))
        .withResourceArn(Option(self.resourceArn))
    }

  }

}
