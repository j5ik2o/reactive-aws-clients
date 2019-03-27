// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  ListTagsOfResourceResponse => ScalaListTagsOfResourceResponse,
  _
}
import com.amazonaws.services.dynamodbv2.model.{ ListTagsOfResourceResult => JavaListTagsOfResourceResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTagsOfResourceResponseOps {

  implicit class JavaListTagsOfResourceResponseOps(val self: JavaListTagsOfResourceResponse) extends AnyVal {

    def toScala: ScalaListTagsOfResourceResponse = {
      ScalaListTagsOfResourceResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTags(Option(self.getTags).map { v =>
          import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)
        }) // Seq[Tag]
        .withNextToken(Option(self.getNextToken)) // String
    }

  }

}
