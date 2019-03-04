package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTagsOfResourceResponse => ScalaListTagsOfResourceResponse }
import software.amazon.awssdk.services.dynamodb.model.{ ListTagsOfResourceResponse => JavaListTagsOfResourceResponse }

import scala.collection.JavaConverters._
import scala.compat.java8.OptionConverters._

object ListTagsOfResourceResponseOps {

  import TagOps._

  implicit class JavaListTagsOfResourceResultOps(val self: JavaListTagsOfResourceResponse) extends AnyVal {

    def toScala: ScalaListTagsOfResourceResponse = {
      ScalaListTagsOfResourceResponse()
        .withStatusCode(Option(self.sdkHttpResponse()).map(_.statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse).map(_.headers()).map(_.asScala.toMap.mapValues(_.asScala)))
        .withTags(Option(self.tags).map(_.asScala.map(_.toScala)))
        .withNextToken(Option(self.nextToken))
    }

  }

}
