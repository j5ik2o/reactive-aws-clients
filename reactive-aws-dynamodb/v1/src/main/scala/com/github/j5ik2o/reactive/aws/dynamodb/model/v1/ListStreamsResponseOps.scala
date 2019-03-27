// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ ListStreamsResponse => ScalaListStreamsResponse, _ }
import com.amazonaws.services.dynamodbv2.model.{ ListStreamsResult => JavaListStreamsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListStreamsResponseOps {

  implicit class JavaListStreamsResponseOps(val self: JavaListStreamsResponse) extends AnyVal {

    def toScala: ScalaListStreamsResponse = {
      ScalaListStreamsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withStreams(Option(self.getStreams).map { v =>
          import scala.collection.JavaConverters._, StreamOps._; v.asScala.map(_.toScala)
        }) // Seq[Stream]
        .withLastEvaluatedStreamArn(Option(self.getLastEvaluatedStreamArn)) // String
    }

  }

}
