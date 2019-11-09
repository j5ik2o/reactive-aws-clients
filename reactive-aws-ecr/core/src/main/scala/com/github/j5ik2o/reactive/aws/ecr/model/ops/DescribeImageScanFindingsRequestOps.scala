// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DescribeImageScanFindingsRequestBuilderOps(val self: DescribeImageScanFindingsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): DescribeImageScanFindingsRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): DescribeImageScanFindingsRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[ImageIdentifier]): DescribeImageScanFindingsRequest.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeImageScanFindingsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeImageScanFindingsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeImageScanFindingsRequestOps(val self: DescribeImageScanFindingsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[ImageIdentifier] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImageScanFindingsRequestOps {

  implicit def toDescribeImageScanFindingsRequestBuilderOps(
      v: DescribeImageScanFindingsRequest.Builder
  ): DescribeImageScanFindingsRequestBuilderOps = new DescribeImageScanFindingsRequestBuilderOps(v)

  implicit def toDescribeImageScanFindingsRequestOps(
      v: DescribeImageScanFindingsRequest
  ): DescribeImageScanFindingsRequestOps = new DescribeImageScanFindingsRequestOps(v)

}
