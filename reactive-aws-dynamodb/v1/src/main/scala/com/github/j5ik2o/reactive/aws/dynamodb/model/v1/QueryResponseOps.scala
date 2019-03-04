package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ QueryResult => JavaQueryResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ QueryResponse => ScalaQueryResponse }

import scala.collection.JavaConverters._

object QueryResponseOps {

  import AttributeValueOps._
  import ConsumedCapacityOps._

  implicit class JavaQueryResponseOps(val self: JavaQueryResponse) extends AnyVal {

    def toScala: ScalaQueryResponse = {
      ScalaQueryResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withItems(Option(self.getItems).map(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))))
        .withCount(Option(self.getCount))
        .withScannedCount(Option(self.getScannedCount))
        .withLastEvaluatedKey(Option(self.getLastEvaluatedKey).map(_.asScala.toMap.mapValues(_.toScala)))
        .withConsumedCapacity(Option(self.getConsumedCapacity).map(_.toScala))
    }

  }

}
