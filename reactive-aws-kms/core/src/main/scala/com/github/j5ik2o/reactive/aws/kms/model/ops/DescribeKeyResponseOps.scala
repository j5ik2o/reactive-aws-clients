// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DescribeKeyResponseBuilderOps(val self: DescribeKeyResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyMetadataAsScala(value: Option[KeyMetadata]): DescribeKeyResponse.Builder = {
    value.fold(self) { v =>
      self.keyMetadata(v)
    }
  }

}

final class DescribeKeyResponseOps(val self: DescribeKeyResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyMetadataAsScala: Option[KeyMetadata] = Option(self.keyMetadata)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeKeyResponseOps {

  implicit def toDescribeKeyResponseBuilderOps(v: DescribeKeyResponse.Builder): DescribeKeyResponseBuilderOps =
    new DescribeKeyResponseBuilderOps(v)

  implicit def toDescribeKeyResponseOps(v: DescribeKeyResponse): DescribeKeyResponseOps = new DescribeKeyResponseOps(v)

}
