// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetRecordsResponse => ScalaGetRecordsResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ GetRecordsResult => JavaGetRecordsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetRecordsResponseOps {

  implicit class JavaGetRecordsResponseOps(val self: JavaGetRecordsResponse) extends AnyVal {

    def toScala: ScalaGetRecordsResponse = {
      ScalaGetRecordsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withRecords(Option(self.getRecords).map { v =>
          import scala.collection.JavaConverters._, RecordOps._; v.asScala.map(_.toScala)
        }) // Seq[Record]
        .withNextShardIterator(Option(self.getNextShardIterator)) // String
    }

  }

}
