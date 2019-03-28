// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTagsOfResourceRequest => ScalaListTagsOfResourceRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ ListTagsOfResourceRequest => JavaListTagsOfResourceRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTagsOfResourceRequestOps {

  implicit class ScalaListTagsOfResourceRequestOps(val self: ScalaListTagsOfResourceRequest) extends AnyVal {

    def toJava: JavaListTagsOfResourceRequest = {
      val result = new JavaListTagsOfResourceRequest()
      self.resourceArn.filter(_.nonEmpty).foreach(v => result.withResourceArn(v)) // String
      self.nextToken.filter(_.nonEmpty).foreach(v => result.withNextToken(v))     // String

      result
    }

  }

}
