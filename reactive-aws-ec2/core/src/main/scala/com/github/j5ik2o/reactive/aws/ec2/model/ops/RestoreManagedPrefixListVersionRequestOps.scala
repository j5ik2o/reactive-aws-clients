// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RestoreManagedPrefixListVersionRequestBuilderOps(val self: RestoreManagedPrefixListVersionRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala(value: Option[String]): RestoreManagedPrefixListVersionRequest.Builder = {
    value.fold(self) { v => self.prefixListId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousVersionAsScala(value: Option[Long]): RestoreManagedPrefixListVersionRequest.Builder = {
    value.fold(self) { v => self.previousVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentVersionAsScala(value: Option[Long]): RestoreManagedPrefixListVersionRequest.Builder = {
    value.fold(self) { v => self.currentVersion(v) }
  }

}

final class RestoreManagedPrefixListVersionRequestOps(val self: RestoreManagedPrefixListVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala: Option[String] = Option(self.prefixListId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previousVersionAsScala: Option[Long] = Option(self.previousVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentVersionAsScala: Option[Long] = Option(self.currentVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreManagedPrefixListVersionRequestOps {

  implicit def toRestoreManagedPrefixListVersionRequestBuilderOps(
      v: RestoreManagedPrefixListVersionRequest.Builder
  ): RestoreManagedPrefixListVersionRequestBuilderOps = new RestoreManagedPrefixListVersionRequestBuilderOps(v)

  implicit def toRestoreManagedPrefixListVersionRequestOps(
      v: RestoreManagedPrefixListVersionRequest
  ): RestoreManagedPrefixListVersionRequestOps = new RestoreManagedPrefixListVersionRequestOps(v)

}
