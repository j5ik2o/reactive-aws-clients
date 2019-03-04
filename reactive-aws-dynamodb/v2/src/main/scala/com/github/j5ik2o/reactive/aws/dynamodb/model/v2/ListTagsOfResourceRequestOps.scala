package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTagsOfResourceRequest => ScalaListTagsOfResourceRequest }
import software.amazon.awssdk.services.dynamodb.model.{ ListTagsOfResourceRequest => JavaListTagsOfResourceRequest }

object ListTagsOfResourceRequestOps {

  implicit class ScalaListTagsOfResourceRequestOps(val self: ScalaListTagsOfResourceRequest) extends AnyVal {

    def toJava: JavaListTagsOfResourceRequest = {
      val result = JavaListTagsOfResourceRequest.builder()
      self.resourceArn.foreach(result.resourceArn)
      self.nextToken.foreach(result.nextToken)
      result.build()
    }

  }

  implicit class JavaListTagsOfResourceRequestOps(val self: JavaListTagsOfResourceRequest) extends AnyVal {

    def toScala: ScalaListTagsOfResourceRequest = {
      ScalaListTagsOfResourceRequest()
        .withResourceArn(Option(self.resourceArn)).withNextToken(Option(self.nextToken))
    }

  }

}
