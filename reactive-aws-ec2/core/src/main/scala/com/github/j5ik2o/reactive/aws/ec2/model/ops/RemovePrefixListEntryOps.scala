// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RemovePrefixListEntryBuilderOps(val self: RemovePrefixListEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala(value: Option[String]): RemovePrefixListEntry.Builder = {
    value.fold(self) { v => self.cidr(v) }
  }

}

final class RemovePrefixListEntryOps(val self: RemovePrefixListEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala: Option[String] = Option(self.cidr)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemovePrefixListEntryOps {

  implicit def toRemovePrefixListEntryBuilderOps(v: RemovePrefixListEntry.Builder): RemovePrefixListEntryBuilderOps =
    new RemovePrefixListEntryBuilderOps(v)

  implicit def toRemovePrefixListEntryOps(v: RemovePrefixListEntry): RemovePrefixListEntryOps =
    new RemovePrefixListEntryOps(v)

}
