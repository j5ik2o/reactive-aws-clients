// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteManagedPrefixListRequestBuilderOps(val self: DeleteManagedPrefixListRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala(value: Option[String]): DeleteManagedPrefixListRequest.Builder = {
    value.fold(self) { v => self.prefixListId(v) }
  }

}

final class DeleteManagedPrefixListRequestOps(val self: DeleteManagedPrefixListRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala: Option[String] = Option(self.prefixListId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteManagedPrefixListRequestOps {

  implicit def toDeleteManagedPrefixListRequestBuilderOps(
      v: DeleteManagedPrefixListRequest.Builder
  ): DeleteManagedPrefixListRequestBuilderOps = new DeleteManagedPrefixListRequestBuilderOps(v)

  implicit def toDeleteManagedPrefixListRequestOps(
      v: DeleteManagedPrefixListRequest
  ): DeleteManagedPrefixListRequestOps = new DeleteManagedPrefixListRequestOps(v)

}
