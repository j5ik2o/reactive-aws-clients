// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RestoreManagedPrefixListVersionResponseBuilderOps(val self: RestoreManagedPrefixListVersionResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAsScala(value: Option[ManagedPrefixList]): RestoreManagedPrefixListVersionResponse.Builder = {
    value.fold(self) { v => self.prefixList(v) }
  }

}

final class RestoreManagedPrefixListVersionResponseOps(val self: RestoreManagedPrefixListVersionResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAsScala: Option[ManagedPrefixList] = Option(self.prefixList)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreManagedPrefixListVersionResponseOps {

  implicit def toRestoreManagedPrefixListVersionResponseBuilderOps(
      v: RestoreManagedPrefixListVersionResponse.Builder
  ): RestoreManagedPrefixListVersionResponseBuilderOps = new RestoreManagedPrefixListVersionResponseBuilderOps(v)

  implicit def toRestoreManagedPrefixListVersionResponseOps(
      v: RestoreManagedPrefixListVersionResponse
  ): RestoreManagedPrefixListVersionResponseOps = new RestoreManagedPrefixListVersionResponseOps(v)

}
