// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DescribeCustomKeyStoresRequestBuilderOps(val self: DescribeCustomKeyStoresRequest.Builder) extends AnyVal {

  final def customKeyStoreIdAsScala(value: Option[String]): DescribeCustomKeyStoresRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

  final def customKeyStoreNameAsScala(value: Option[String]): DescribeCustomKeyStoresRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreName(v)
    }
  }

  final def limitAsScala(value: Option[Int]): DescribeCustomKeyStoresRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def markerAsScala(value: Option[String]): DescribeCustomKeyStoresRequest.Builder = {
    value.fold(self) { v =>
      self.marker(v)
    }
  }

}

final class DescribeCustomKeyStoresRequestOps(val self: DescribeCustomKeyStoresRequest) extends AnyVal {

  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

  final def customKeyStoreNameAsScala: Option[String] = Option(self.customKeyStoreName)

  final def limitAsScala: Option[Int] = Option(self.limit)

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
