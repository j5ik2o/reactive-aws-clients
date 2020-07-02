// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeCollectionResponseBuilderOps(val self: DescribeCollectionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceCountAsScala(value: Option[Long]): DescribeCollectionResponse.Builder = {
    value.fold(self) { v => self.faceCount(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionAsScala(value: Option[String]): DescribeCollectionResponse.Builder = {
    value.fold(self) { v => self.faceModelVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionARNAsScala(value: Option[String]): DescribeCollectionResponse.Builder = {
    value.fold(self) { v => self.collectionARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimestampAsScala(value: Option[java.time.Instant]): DescribeCollectionResponse.Builder = {
    value.fold(self) { v => self.creationTimestamp(v) }
  }

}

final class DescribeCollectionResponseOps(val self: DescribeCollectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceCountAsScala: Option[Long] = Option(self.faceCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def faceModelVersionAsScala: Option[String] = Option(self.faceModelVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionARNAsScala: Option[String] = Option(self.collectionARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCollectionResponseOps {

  implicit def toDescribeCollectionResponseBuilderOps(
      v: DescribeCollectionResponse.Builder
  ): DescribeCollectionResponseBuilderOps = new DescribeCollectionResponseBuilderOps(v)

  implicit def toDescribeCollectionResponseOps(v: DescribeCollectionResponse): DescribeCollectionResponseOps =
    new DescribeCollectionResponseOps(v)

}
