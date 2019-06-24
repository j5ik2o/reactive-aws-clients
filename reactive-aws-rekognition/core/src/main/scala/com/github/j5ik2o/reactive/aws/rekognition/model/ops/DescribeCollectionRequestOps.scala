// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DescribeCollectionRequestBuilderOps(val self: DescribeCollectionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala(value: Option[String]): DescribeCollectionRequest.Builder = {
    value.fold(self) { v =>
      self.collectionId(v)
    }
  }

}

final class DescribeCollectionRequestOps(val self: DescribeCollectionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def collectionIdAsScala: Option[String] = Option(self.collectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCollectionRequestOps {

  implicit def toDescribeCollectionRequestBuilderOps(
      v: DescribeCollectionRequest.Builder
  ): DescribeCollectionRequestBuilderOps = new DescribeCollectionRequestBuilderOps(v)

  implicit def toDescribeCollectionRequestOps(v: DescribeCollectionRequest): DescribeCollectionRequestOps =
    new DescribeCollectionRequestOps(v)

}
