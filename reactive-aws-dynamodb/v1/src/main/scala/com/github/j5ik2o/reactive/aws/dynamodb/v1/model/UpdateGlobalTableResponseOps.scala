// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateGlobalTableResponse => ScalaUpdateGlobalTableResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ UpdateGlobalTableResult => JavaUpdateGlobalTableResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateGlobalTableResponseOps {

  implicit class JavaUpdateGlobalTableResponseOps(val self: JavaUpdateGlobalTableResponse) extends AnyVal {

    def toScala: ScalaUpdateGlobalTableResponse = {
      ScalaUpdateGlobalTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withGlobalTableDescription(Option(self.getGlobalTableDescription).map { v =>
          import GlobalTableDescriptionOps._; v.toScala
        }) // GlobalTableDescription
    }

  }

}
