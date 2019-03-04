package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ UntagResourceRequest => JavaUntagResourceRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UntagResourceRequest => ScalaUntagResourceRequest }

import scala.collection.JavaConverters._

object UntagResourceRequestOps {

  implicit class ScalaUntagResourceRequestOps(val self: ScalaUntagResourceRequest) extends AnyVal {

    def toJava: JavaUntagResourceRequest = {
      val result = new JavaUntagResourceRequest()
      self.tagKeys.map(_.asJava).foreach(result.setTagKeys)
      self.resourceArn.foreach(result.setResourceArn)
      result
    }

  }

  implicit class JavaUntagResourceRequestOps(val self: JavaUntagResourceRequest) extends AnyVal {

    def toScala: ScalaUntagResourceRequest = {
      ScalaUntagResourceRequest()
        .withTagKeys(Option(self.getTagKeys).map(_.asScala))
        .withResourceArn(Option(self.getResourceArn))
    }

  }

}
