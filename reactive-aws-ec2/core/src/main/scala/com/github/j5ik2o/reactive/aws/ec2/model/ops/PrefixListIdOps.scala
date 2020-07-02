// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PrefixListIdBuilderOps(val self: PrefixListId.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): PrefixListId.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala(value: Option[String]): PrefixListId.Builder = {
    value.fold(self) { v => self.prefixListId(v) }
  }

}

final class PrefixListIdOps(val self: PrefixListId) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala: Option[String] = Option(self.prefixListId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPrefixListIdOps {

  implicit def toPrefixListIdBuilderOps(v: PrefixListId.Builder): PrefixListIdBuilderOps = new PrefixListIdBuilderOps(v)

  implicit def toPrefixListIdOps(v: PrefixListId): PrefixListIdOps = new PrefixListIdOps(v)

}
