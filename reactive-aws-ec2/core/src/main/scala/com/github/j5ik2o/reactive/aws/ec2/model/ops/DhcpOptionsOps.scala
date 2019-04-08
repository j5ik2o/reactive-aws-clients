// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DhcpOptionsBuilderOps(val self: DhcpOptions.Builder) extends AnyVal {

  final def dhcpConfigurationsAsScala(value: Option[Seq[DhcpConfiguration]]): DhcpOptions.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dhcpConfigurations(v.asJava)
    }
  }

  final def dhcpOptionsIdAsScala(value: Option[String]): DhcpOptions.Builder = {
    value.fold(self) { v =>
      self.dhcpOptionsId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): DhcpOptions.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): DhcpOptions.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class DhcpOptionsOps(val self: DhcpOptions) extends AnyVal {

  final def dhcpConfigurationsAsScala: Option[Seq[DhcpConfiguration]] = Option(self.dhcpConfigurations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def dhcpOptionsIdAsScala: Option[String] = Option(self.dhcpOptionsId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDhcpOptionsOps {

  implicit def toDhcpOptionsBuilderOps(v: DhcpOptions.Builder): DhcpOptionsBuilderOps = new DhcpOptionsBuilderOps(v)

  implicit def toDhcpOptionsOps(v: DhcpOptions): DhcpOptionsOps = new DhcpOptionsOps(v)

}
