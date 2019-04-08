// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeDhcpOptionsRequestBuilderOps(val self: DescribeDhcpOptionsRequest.Builder) extends AnyVal {

  final def dhcpOptionsIdsAsScala(value: Option[Seq[String]]): DescribeDhcpOptionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dhcpOptionsIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeDhcpOptionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

}

final class DescribeDhcpOptionsRequestOps(val self: DescribeDhcpOptionsRequest) extends AnyVal {

  final def dhcpOptionsIdsAsScala: Option[Seq[String]] = Option(self.dhcpOptionsIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDhcpOptionsRequestOps {

  implicit def toDescribeDhcpOptionsRequestBuilderOps(
      v: DescribeDhcpOptionsRequest.Builder
  ): DescribeDhcpOptionsRequestBuilderOps = new DescribeDhcpOptionsRequestBuilderOps(v)

  implicit def toDescribeDhcpOptionsRequestOps(v: DescribeDhcpOptionsRequest): DescribeDhcpOptionsRequestOps =
    new DescribeDhcpOptionsRequestOps(v)

}
