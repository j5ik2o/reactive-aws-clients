package com.github.j5ik2o.reactive.aws.dynamodb.model.v2


import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListTagsOfResourceResponse => ScalaListTagsOfResourceResponse, _ }
import software.amazon.awssdk.services.dynamodb.model.{ ListTagsOfResourceResponse => JavaListTagsOfResourceResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListTagsOfResourceResponseOps {

  implicit class JavaListTagsOfResourceResponseOps(val self: JavaListTagsOfResourceResponse) extends AnyVal {

    def toScala: ScalaListTagsOfResourceResponse = {
      ScalaListTagsOfResourceResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
                    .withTags(Option(self.tags).map{ v => import scala.collection.JavaConverters._, TagOps._; v.asScala.map(_.toScala)}) // Seq[Tag], Seq-6
            .withNextToken(Option(self.nextToken)) // String
    }

  }

}