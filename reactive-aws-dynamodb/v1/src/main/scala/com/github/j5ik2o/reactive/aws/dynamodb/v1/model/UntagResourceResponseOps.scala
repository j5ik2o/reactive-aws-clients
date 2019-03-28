// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UntagResourceResponse => ScalaUntagResourceResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ UntagResourceResult => JavaUntagResourceResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UntagResourceResponseOps {

  implicit class JavaUntagResourceResponseOps(val self: JavaUntagResourceResponse) extends AnyVal {

    def toScala: ScalaUntagResourceResponse = {
      ScalaUntagResourceResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
