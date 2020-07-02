// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DescribeImageScanFindingsResponseBuilderOps(val self: DescribeImageScanFindingsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): DescribeImageScanFindingsResponse.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): DescribeImageScanFindingsResponse.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala(value: Option[ImageIdentifier]): DescribeImageScanFindingsResponse.Builder = {
    value.fold(self) { v => self.imageId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanStatusAsScala(value: Option[ImageScanStatus]): DescribeImageScanFindingsResponse.Builder = {
    value.fold(self) { v => self.imageScanStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanFindingsAsScala(value: Option[ImageScanFindings]): DescribeImageScanFindingsResponse.Builder = {
    value.fold(self) { v => self.imageScanFindings(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeImageScanFindingsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeImageScanFindingsResponseOps(val self: DescribeImageScanFindingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdAsScala: Option[ImageIdentifier] = Option(self.imageId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanStatusAsScala: Option[ImageScanStatus] = Option(self.imageScanStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanFindingsAsScala: Option[ImageScanFindings] = Option(self.imageScanFindings)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImageScanFindingsResponseOps {

  implicit def toDescribeImageScanFindingsResponseBuilderOps(
      v: DescribeImageScanFindingsResponse.Builder
  ): DescribeImageScanFindingsResponseBuilderOps = new DescribeImageScanFindingsResponseBuilderOps(v)

  implicit def toDescribeImageScanFindingsResponseOps(
      v: DescribeImageScanFindingsResponse
  ): DescribeImageScanFindingsResponseOps = new DescribeImageScanFindingsResponseOps(v)

}
