// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAddressesRequestBuilderOps(val self: DescribeAddressesRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeAddressesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def publicIpsAsScala(value: Option[Seq[String]]): DescribeAddressesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.publicIps(v.asJava)
    }
  }

  final def allocationIdsAsScala(value: Option[Seq[String]]): DescribeAddressesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.allocationIds(v.asJava)
    }
  }

}

final class DescribeAddressesRequestOps(val self: DescribeAddressesRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def publicIpsAsScala: Option[Seq[String]] = Option(self.publicIps).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def allocationIdsAsScala: Option[Seq[String]] = Option(self.allocationIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAddressesRequestOps {

  implicit def toDescribeAddressesRequestBuilderOps(
      v: DescribeAddressesRequest.Builder
  ): DescribeAddressesRequestBuilderOps = new DescribeAddressesRequestBuilderOps(v)

  implicit def toDescribeAddressesRequestOps(v: DescribeAddressesRequest): DescribeAddressesRequestOps =
    new DescribeAddressesRequestOps(v)

}
