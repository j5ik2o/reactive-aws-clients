// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateManagedPrefixListResponseBuilderOps(val self: CreateManagedPrefixListResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAsScala(value: Option[ManagedPrefixList]): CreateManagedPrefixListResponse.Builder = {
    value.fold(self) { v => self.prefixList(v) }
  }

}

final class CreateManagedPrefixListResponseOps(val self: CreateManagedPrefixListResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListAsScala: Option[ManagedPrefixList] = Option(self.prefixList)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateManagedPrefixListResponseOps {

  implicit def toCreateManagedPrefixListResponseBuilderOps(
      v: CreateManagedPrefixListResponse.Builder
  ): CreateManagedPrefixListResponseBuilderOps = new CreateManagedPrefixListResponseBuilderOps(v)

  implicit def toCreateManagedPrefixListResponseOps(
      v: CreateManagedPrefixListResponse
  ): CreateManagedPrefixListResponseOps = new CreateManagedPrefixListResponseOps(v)

}
