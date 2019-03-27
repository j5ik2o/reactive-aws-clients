// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactGetItemsResponse => ScalaTransactGetItemsResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ TransactGetItemsResult => JavaTransactGetItemsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactGetItemsResponseOps {

  implicit class JavaTransactGetItemsResponseOps(val self: JavaTransactGetItemsResponse) extends AnyVal {

    def toScala: ScalaTransactGetItemsResponse = {
      ScalaTransactGetItemsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map { v =>
          import scala.collection.JavaConverters._, ConsumedCapacityOps._; v.asScala.map(_.toScala)
        }) // Seq[ConsumedCapacity]
        .withResponses(Option(self.getResponses).map { v =>
          import scala.collection.JavaConverters._, ItemResponseOps._; v.asScala.map(_.toScala)
        }) // Seq[ItemResponse]
    }

  }

}
