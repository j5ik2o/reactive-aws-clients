// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTagsOfResourceRequest => ScalaListTagsOfResourceRequest, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListTagsOfResourceRequest => JavaListTagsOfResourceRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTagsOfResourceRequestOps {

  implicit class ScalaListTagsOfResourceRequestOps(val self: ScalaListTagsOfResourceRequest) extends AnyVal {

    def toJava: JavaListTagsOfResourceRequest = {
      val result = JavaListTagsOfResourceRequest.builder()
      self.resourceArn.filter(_.nonEmpty).foreach(v => result.resourceArn(v)) // String
      self.nextToken.filter(_.nonEmpty).foreach(v => result.nextToken(v))     // String

      result.build()
    }

  }

}
