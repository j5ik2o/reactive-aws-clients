// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ListObjectsV2Response => ScalaListObjectsV2Response, _ }
import software.amazon.awssdk.services.s3.model.{ ListObjectsV2Response => JavaListObjectsV2Response }

import scala.compat.java8.OptionConverters._
import scala.collection.JavaConverters._

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListObjectsV2ResponseOps {

  implicit class JavaListObjectsV2ResponseOps(val self: JavaListObjectsV2Response) extends AnyVal {

    def toScala: ScalaListObjectsV2Response = {
      ScalaListObjectsV2Response()
        .withStatusCode(Option(self.sdkHttpResponse().statusCode()))
        .withStatusText(self.sdkHttpResponse().statusText().asScala)
        .withHttpHeaders(Option(self.sdkHttpResponse().headers().asScala.mapValues(_.asScala).toMap))
        .withIsTruncated(Option(self.isTruncated).map(_.booleanValue)) // Boolean
        .withContents(Option(self.contents).map { v =>
          import scala.collection.JavaConverters._, S3ObjectOps._; v.asScala.map(_.toScala)
        }) // Seq[S3Object]
        .withName(Option(self.name)) // String
        .withPrefix(Option(self.prefix)) // String
        .withDelimiter(Option(self.delimiter)) // String
        .withMaxKeys(Option(self.maxKeys).map(_.intValue)) // Int
        .withCommonPrefixes(Option(self.commonPrefixes).map { v =>
          import scala.collection.JavaConverters._, CommonPrefixOps._; v.asScala.map(_.toScala)
        }) // Seq[CommonPrefix]
        .withEncodingType(Option(self.encodingType).map { v =>
          import EncodingTypeOps._; v.toScala
        }) // String
        .withKeyCount(Option(self.keyCount).map(_.intValue)) // Int
        .withContinuationToken(Option(self.continuationToken)) // String
        .withNextContinuationToken(Option(self.nextContinuationToken)) // String
        .withStartAfter(Option(self.startAfter)) // String
    }

  }

}
