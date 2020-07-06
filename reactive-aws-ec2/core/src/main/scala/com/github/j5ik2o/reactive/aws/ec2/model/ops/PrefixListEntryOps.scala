// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PrefixListEntryBuilderOps(val self: PrefixListEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala(value: Option[String]): PrefixListEntry.Builder = {
    value.fold(self) { v => self.cidr(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): PrefixListEntry.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class PrefixListEntryOps(val self: PrefixListEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala: Option[String] = Option(self.cidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPrefixListEntryOps {

  implicit def toPrefixListEntryBuilderOps(v: PrefixListEntry.Builder): PrefixListEntryBuilderOps =
    new PrefixListEntryBuilderOps(v)

  implicit def toPrefixListEntryOps(v: PrefixListEntry): PrefixListEntryOps = new PrefixListEntryOps(v)

}
