// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ListPartsResponse => ScalaListPartsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ ListPartsResponse => JavaListPartsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListPartsResponseOps {

  implicit class JavaListPartsResponseOps(val self: JavaListPartsResponse) extends AnyVal {

    def toScala: ScalaListPartsResponse = {
      ScalaListPartsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withAbortDate(Option(self.abortDate)) // Instant
        .withAbortRuleId(Option(self.abortRuleId)) // String
        .withBucket(Option(self.bucket)) // String
        .withKey(Option(self.key)) // String
        .withUploadId(Option(self.uploadId)) // String
        .withPartNumberMarker(Option(self.partNumberMarker).map(_.intValue)) // Int
        .withNextPartNumberMarker(Option(self.nextPartNumberMarker).map(_.intValue)) // Int
        .withMaxParts(Option(self.maxParts).map(_.intValue)) // Int
        .withIsTruncated(Option(self.isTruncated).map(_.booleanValue)) // Boolean
        .withParts(Option(self.parts).map { v =>
          import scala.collection.JavaConverters._, PartOps._; v.asScala.map(_.toScala)
        }) // Seq[Part]
        .withInitiator(Option(self.initiator).map { v =>
          import InitiatorOps._; v.toScala
        }) // Initiator
        .withOwner(Option(self.owner).map { v =>
          import OwnerOps._; v.toScala
        }) // Owner
        .withStorageClass(Option(self.storageClass).map { v =>
          import StorageClassOps._; v.toScala
        }) // String
        .withRequestCharged(Option(self.requestCharged).map { v =>
          import RequestChargedOps._; v.toScala
        }) // String
    }

  }

}
