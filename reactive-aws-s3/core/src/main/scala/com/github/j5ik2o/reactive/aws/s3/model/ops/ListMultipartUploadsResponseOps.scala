// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ListMultipartUploadsResponse => ScalaListMultipartUploadsResponse, _ }
import software.amazon.awssdk.services.s3.model.{ ListMultipartUploadsResponse => JavaListMultipartUploadsResponse }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListMultipartUploadsResponseOps {

  implicit class JavaListMultipartUploadsResponseOps(val self: JavaListMultipartUploadsResponse) extends AnyVal {

    def toScala: ScalaListMultipartUploadsResponse = {
      ScalaListMultipartUploadsResponse()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withBucket(Option(self.bucket)) // String
        .withKeyMarker(Option(self.keyMarker)) // String
        .withUploadIdMarker(Option(self.uploadIdMarker)) // String
        .withNextKeyMarker(Option(self.nextKeyMarker)) // String
        .withPrefix(Option(self.prefix)) // String
        .withDelimiter(Option(self.delimiter)) // String
        .withNextUploadIdMarker(Option(self.nextUploadIdMarker)) // String
        .withMaxUploads(Option(self.maxUploads).map(_.intValue)) // Int
        .withIsTruncated(Option(self.isTruncated).map(_.booleanValue)) // Boolean
        .withUploads(Option(self.uploads).map { v =>
          import scala.collection.JavaConverters._, MultipartUploadOps._; v.asScala.map(_.toScala)
        }) // Seq[MultipartUpload]
        .withCommonPrefixes(Option(self.commonPrefixes).map { v =>
          import scala.collection.JavaConverters._, CommonPrefixOps._; v.asScala.map(_.toScala)
        }) // Seq[CommonPrefix]
        .withEncodingType(Option(self.encodingType).map { v =>
          import EncodingTypeOps._; v.toScala
        }) // String
    }

  }

}
