// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteManagedPrefixListResponseBuilderOps(val self: DeleteManagedPrefixListResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAsScala(value: Option[ManagedPrefixList]): DeleteManagedPrefixListResponse.Builder = {
    value.fold(self) { v => self.prefixList(v) }
  }

}

final class DeleteManagedPrefixListResponseOps(val self: DeleteManagedPrefixListResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAsScala: Option[ManagedPrefixList] = Option(self.prefixList)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteManagedPrefixListResponseOps {

  implicit def toDeleteManagedPrefixListResponseBuilderOps(
      v: DeleteManagedPrefixListResponse.Builder
  ): DeleteManagedPrefixListResponseBuilderOps = new DeleteManagedPrefixListResponseBuilderOps(v)

  implicit def toDeleteManagedPrefixListResponseOps(
      v: DeleteManagedPrefixListResponse
  ): DeleteManagedPrefixListResponseOps = new DeleteManagedPrefixListResponseOps(v)

}
