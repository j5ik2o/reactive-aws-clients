package com.github.j5ik2o.reactive.aws.kinesis.model.v1

import com.amazonaws.services.kinesis.model.{ MergeShardsResult => JavaMergeShardsResponse }
import com.github.j5ik2o.reactive.aws.kinesis.model.{ MergeShardsResponse => ScalaMergeShardsResponse }

import scala.collection.JavaConverters._
object MergeShardsResponseOps {

  implicit class JavaMergeShardsResponseOps(val self: JavaMergeShardsResponse) extends AnyVal {

    def toScala: ScalaMergeShardsResponse = {
      ScalaMergeShardsResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))

    }

  }

}
