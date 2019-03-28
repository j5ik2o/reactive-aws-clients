// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ UpdateTableResponse => ScalaUpdateTableResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ UpdateTableResult => JavaUpdateTableResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object UpdateTableResponseOps {

  implicit class JavaUpdateTableResponseOps(val self: JavaUpdateTableResponse) extends AnyVal {

    def toScala: ScalaUpdateTableResponse = {
      ScalaUpdateTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableDescription(Option(self.getTableDescription).map { v =>
          import TableDescriptionOps._; v.toScala
        }) // TableDescription
    }

  }

}
