// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteTableResponse => ScalaDeleteTableResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ DeleteTableResult => JavaDeleteTableResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DeleteTableResponseOps {

  implicit class JavaDeleteTableResponseOps(val self: JavaDeleteTableResponse) extends AnyVal {

    def toScala: ScalaDeleteTableResponse = {
      ScalaDeleteTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableDescription(Option(self.getTableDescription).map { v =>
          import TableDescriptionOps._; v.toScala
        }) // TableDescription
    }

  }

}
