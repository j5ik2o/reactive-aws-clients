package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ TagResourceRequest => JavaTagResourceRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TagResourceRequest => ScalaTagResourceRequest }

import scala.collection.JavaConverters._

object TagResourceRequestOps {

  import TagOps._

  implicit class ScalaTagResourceRequestOps(val self: ScalaTagResourceRequest) extends AnyVal {

    def toJava: JavaTagResourceRequest = {
      val result = new JavaTagResourceRequest()
      self.tags.map(_.map(_.toJava).asJava).foreach(result.setTags)
      self.resourceArn.foreach(result.setResourceArn)
      result
    }

  }

  implicit class JavaTagResourceRequestOps(val self: JavaTagResourceRequest) extends AnyVal {

    def toScala: ScalaTagResourceRequest = {
      ScalaTagResourceRequest()
        .withTags(Option(self.getTags).map(_.asScala.map(_.toScala)))
        .withResourceArn(Option(self.getResourceArn))
    }

  }

}
