// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetShardIteratorResponse => ScalaGetShardIteratorResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ GetShardIteratorResult => JavaGetShardIteratorResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetShardIteratorResponseOps {

  implicit class JavaGetShardIteratorResponseOps(val self: JavaGetShardIteratorResponse) extends AnyVal {

    def toScala: ScalaGetShardIteratorResponse = {
      ScalaGetShardIteratorResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withShardIterator(Option(self.getShardIterator)) // String
    }

  }

}
