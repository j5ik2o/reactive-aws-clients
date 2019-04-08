// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DnsEntryBuilderOps(val self: DnsEntry.Builder) extends AnyVal {

  final def dnsNameAsScala(value: Option[String]): DnsEntry.Builder = {
    value.fold(self) { v =>
      self.dnsName(v)
    }
  }

  final def hostedZoneIdAsScala(value: Option[String]): DnsEntry.Builder = {
    value.fold(self) { v =>
      self.hostedZoneId(v)
    }
  }

}

final class DnsEntryOps(val self: DnsEntry) extends AnyVal {

  final def dnsNameAsScala: Option[String] = Option(self.dnsName)

  final def hostedZoneIdAsScala: Option[String] = Option(self.hostedZoneId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDnsEntryOps {

  implicit def toDnsEntryBuilderOps(v: DnsEntry.Builder): DnsEntryBuilderOps = new DnsEntryBuilderOps(v)

  implicit def toDnsEntryOps(v: DnsEntry): DnsEntryOps = new DnsEntryOps(v)

}
