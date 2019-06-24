// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DescribeCustomKeyStoresRequestBuilderOps(val self: DescribeCustomKeyStoresRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala(value: Option[String]): DescribeCustomKeyStoresRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreNameAsScala(value: Option[String]): DescribeCustomKeyStoresRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): DescribeCustomKeyStoresRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala(value: Option[String]): DescribeCustomKeyStoresRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

}

final class DescribeCustomKeyStoresRequestOps(val self: DescribeCustomKeyStoresRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoreNameAsScala: Option[String] = Option(self.customKeyStoreName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def markerAsScala: Option[String] = Option(self.marker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCustomKeyStoresRequestOps {

  implicit def toDescribeCustomKeyStoresRequestBuilderOps(
      v: DescribeCustomKeyStoresRequest.Builder
  ): DescribeCustomKeyStoresRequestBuilderOps = new DescribeCustomKeyStoresRequestBuilderOps(v)

  implicit def toDescribeCustomKeyStoresRequestOps(
      v: DescribeCustomKeyStoresRequest
  ): DescribeCustomKeyStoresRequestOps = new DescribeCustomKeyStoresRequestOps(v)

}
