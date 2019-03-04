package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ ListTagsOfResourceResult => JavaListTagsOfResourceResponse }
import com.github.j5ik2o.reactive.dynamodb.model.{ ListTagsOfResourceResponse => ScalaListTagsOfResourceResponse }

import scala.collection.JavaConverters._

object ListTagsOfResourceResponseOps {

  import TagOps._

  implicit class JavaListTagsOfResourceResultOps(val self: JavaListTagsOfResourceResponse) extends AnyVal {

    def toScala: ScalaListTagsOfResourceResponse = {
      ScalaListTagsOfResourceResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTags(Option(self.getTags).map(_.asScala.map(_.toScala)))
        .withNextToken(Option(self.getNextToken))
    }

  }

}
