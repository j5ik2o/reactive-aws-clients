// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateGlobalTableResponse => ScalaCreateGlobalTableResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ CreateGlobalTableResult => JavaCreateGlobalTableResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateGlobalTableResponseOps {

  implicit class JavaCreateGlobalTableResponseOps(val self: JavaCreateGlobalTableResponse) extends AnyVal {

    def toScala: ScalaCreateGlobalTableResponse = {
      ScalaCreateGlobalTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTableDescription(Option(self.getGlobalTableDescription).map { v =>
          import GlobalTableDescriptionOps._; v.toScala
        }) // GlobalTableDescription
    }

  }

}
