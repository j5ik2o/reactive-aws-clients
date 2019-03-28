// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ CreateTableResponse => ScalaCreateTableResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ CreateTableResult => JavaCreateTableResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object CreateTableResponseOps {

  implicit class JavaCreateTableResponseOps(val self: JavaCreateTableResponse) extends AnyVal {

    def toScala: ScalaCreateTableResponse = {
      ScalaCreateTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableDescription(Option(self.getTableDescription).map { v =>
          import TableDescriptionOps._; v.toScala
        }) // TableDescription
    }

  }

}
