// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ QueryResponse => ScalaQueryResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ QueryResult => JavaQueryResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object QueryResponseOps {

  implicit class JavaQueryResponseOps(val self: JavaQueryResponse) extends AnyVal {

    def toScala: ScalaQueryResponse = {
      ScalaQueryResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withItems(Option(self.getItems).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._;
          v.asScala.map(_.asScala.toMap.mapValues(_.toScala))
        }) // Seq[Map[String, AttributeValue]]
        .withCount(Option(self.getCount).map(_.intValue)) // Int
        .withScannedCount(Option(self.getScannedCount).map(_.intValue)) // Int
        .withLastEvaluatedKey(Option(self.getLastEvaluatedKey).map { v =>
          import scala.collection.JavaConverters._, AttributeValueOps._; v.asScala.toMap.mapValues(_.toScala)
        }) // Map[String, AttributeValue]
        .withConsumedCapacity(Option(self.getConsumedCapacity).map { v =>
          import ConsumedCapacityOps._; v.toScala
        }) // ConsumedCapacity
    }

  }

}
