// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AddPrefixListEntryBuilderOps(val self: AddPrefixListEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala(value: Option[String]): AddPrefixListEntry.Builder = {
    value.fold(self) { v => self.cidr(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): AddPrefixListEntry.Builder = {
    value.fold(self) { v => self.description(v) }
  }

}

final class AddPrefixListEntryOps(val self: AddPrefixListEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cidrAsScala: Option[String] = Option(self.cidr)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPrefixListEntryOps {

  implicit def toAddPrefixListEntryBuilderOps(v: AddPrefixListEntry.Builder): AddPrefixListEntryBuilderOps =
    new AddPrefixListEntryBuilderOps(v)

  implicit def toAddPrefixListEntryOps(v: AddPrefixListEntry): AddPrefixListEntryOps = new AddPrefixListEntryOps(v)

}
