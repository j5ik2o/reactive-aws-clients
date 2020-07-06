// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyManagedPrefixListResponseBuilderOps(val self: ModifyManagedPrefixListResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAsScala(value: Option[ManagedPrefixList]): ModifyManagedPrefixListResponse.Builder = {
    value.fold(self) { v => self.prefixList(v) }
  }

}

final class ModifyManagedPrefixListResponseOps(val self: ModifyManagedPrefixListResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAsScala: Option[ManagedPrefixList] = Option(self.prefixList)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyManagedPrefixListResponseOps {

  implicit def toModifyManagedPrefixListResponseBuilderOps(
      v: ModifyManagedPrefixListResponse.Builder
  ): ModifyManagedPrefixListResponseBuilderOps = new ModifyManagedPrefixListResponseBuilderOps(v)

  implicit def toModifyManagedPrefixListResponseOps(
      v: ModifyManagedPrefixListResponse
  ): ModifyManagedPrefixListResponseOps = new ModifyManagedPrefixListResponseOps(v)

}
