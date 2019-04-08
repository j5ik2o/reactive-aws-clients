// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DescribeCustomKeyStoresResponseBuilderOps(val self: DescribeCustomKeyStoresResponse.Builder)
    extends AnyVal {

  final def customKeyStoresAsScala(
      value: Option[Seq[CustomKeyStoresListEntry]]
  ): DescribeCustomKeyStoresResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.customKeyStores(v.asJava)
    }
  }

  final def nextMarkerAsScala(value: Option[String]): DescribeCustomKeyStoresResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  final def truncatedAsScala(value: Option[Boolean]): DescribeCustomKeyStoresResponse.Builder = {
    value.fold(self) { v =>
      self.truncated(v)
    }
  }

}

final class DescribeCustomKeyStoresResponseOps(val self: DescribeCustomKeyStoresResponse) extends AnyVal {

  final def customKeyStoresAsScala: Option[Seq[CustomKeyStoresListEntry]] = Option(self.customKeyStores).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  final def truncatedAsScala: Option[Boolean] = Option(self.truncated)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeCustomKeyStoresResponseOps {

  implicit def toDescribeCustomKeyStoresResponseBuilderOps(
      v: DescribeCustomKeyStoresResponse.Builder
  ): DescribeCustomKeyStoresResponseBuilderOps = new DescribeCustomKeyStoresResponseBuilderOps(v)

  implicit def toDescribeCustomKeyStoresResponseOps(
      v: DescribeCustomKeyStoresResponse
  ): DescribeCustomKeyStoresResponseOps = new DescribeCustomKeyStoresResponseOps(v)

}
