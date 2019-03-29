// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.v1.model

import com.github.j5ik2o.reactive.aws.kinesis.model.{ MergeShardsResponse => ScalaMergeShardsResponse, _ }
import com.amazonaws.services.kinesis.model.{ MergeShardsResult => JavaMergeShardsResponse }

import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object MergeShardsResponseOps {

  implicit class JavaMergeShardsResponseOps(val self: JavaMergeShardsResponse) extends AnyVal {

    def toScala: ScalaMergeShardsResponse = {
      ScalaMergeShardsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
    }

  }

}
