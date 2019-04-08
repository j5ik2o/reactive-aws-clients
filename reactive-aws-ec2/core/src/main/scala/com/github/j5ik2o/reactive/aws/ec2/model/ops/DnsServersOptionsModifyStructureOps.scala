// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DnsServersOptionsModifyStructureBuilderOps(val self: DnsServersOptionsModifyStructure.Builder)
    extends AnyVal {

  final def customDnsServersAsScala(value: Option[Seq[String]]): DnsServersOptionsModifyStructure.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.customDnsServers(v.asJava)
    }
  }

  final def enabledAsScala(value: Option[Boolean]): DnsServersOptionsModifyStructure.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

}

final class DnsServersOptionsModifyStructureOps(val self: DnsServersOptionsModifyStructure) extends AnyVal {

  final def customDnsServersAsScala: Option[Seq[String]] = Option(self.customDnsServers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDnsServersOptionsModifyStructureOps {

  implicit def toDnsServersOptionsModifyStructureBuilderOps(
      v: DnsServersOptionsModifyStructure.Builder
  ): DnsServersOptionsModifyStructureBuilderOps = new DnsServersOptionsModifyStructureBuilderOps(v)

  implicit def toDnsServersOptionsModifyStructureOps(
      v: DnsServersOptionsModifyStructure
  ): DnsServersOptionsModifyStructureOps = new DnsServersOptionsModifyStructureOps(v)

}
