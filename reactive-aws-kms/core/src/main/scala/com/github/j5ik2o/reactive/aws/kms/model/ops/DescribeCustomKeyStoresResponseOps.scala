// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class DescribeCustomKeyStoresResponseBuilderOps(val self: DescribeCustomKeyStoresResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoresAsScala(
      value: Option[Seq[CustomKeyStoresListEntry]]
  ): DescribeCustomKeyStoresResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.customKeyStores(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): DescribeCustomKeyStoresResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def truncatedAsScala(value: Option[Boolean]): DescribeCustomKeyStoresResponse.Builder = {
    value.fold(self) { v =>
      self.truncated(v)
    }
  }

}

final class DescribeCustomKeyStoresResponseOps(val self: DescribeCustomKeyStoresResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customKeyStoresAsScala: Option[Seq[CustomKeyStoresListEntry]] = Option(self.customKeyStores).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
