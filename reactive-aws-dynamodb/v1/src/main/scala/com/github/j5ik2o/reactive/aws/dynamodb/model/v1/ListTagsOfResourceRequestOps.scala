package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ListTagsOfResourceRequest => JavaListTagsOfResourceRequest }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTagsOfResourceRequest => ScalaListTagsOfResourceRequest }

object ListTagsOfResourceRequestOps {

  implicit class ScalaListTagsOfResourceRequestOps(val self: ScalaListTagsOfResourceRequest) extends AnyVal {

    def toJava: JavaListTagsOfResourceRequest = {
      val result = new JavaListTagsOfResourceRequest()
      self.resourceArn.foreach(result.setResourceArn)
      self.nextToken.foreach(result.setNextToken)
      result
    }

  }

  implicit class JavaListTagsOfResourceRequestOps(val self: JavaListTagsOfResourceRequest) extends AnyVal {

    def toScala: ScalaListTagsOfResourceRequest = {
      ScalaListTagsOfResourceRequest()
        .withResourceArn(Option(self.getResourceArn)).withNextToken(Option(self.getNextToken))
    }

  }

}
