// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetManagedPrefixListAssociationsRequestBuilderOps(val self: GetManagedPrefixListAssociationsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala(value: Option[String]): GetManagedPrefixListAssociationsRequest.Builder = {
    value.fold(self) { v => self.prefixListId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): GetManagedPrefixListAssociationsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetManagedPrefixListAssociationsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class GetManagedPrefixListAssociationsRequestOps(val self: GetManagedPrefixListAssociationsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala: Option[String] = Option(self.prefixListId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetManagedPrefixListAssociationsRequestOps {

  implicit def toGetManagedPrefixListAssociationsRequestBuilderOps(
      v: GetManagedPrefixListAssociationsRequest.Builder
  ): GetManagedPrefixListAssociationsRequestBuilderOps = new GetManagedPrefixListAssociationsRequestBuilderOps(v)

  implicit def toGetManagedPrefixListAssociationsRequestOps(
      v: GetManagedPrefixListAssociationsRequest
  ): GetManagedPrefixListAssociationsRequestOps = new GetManagedPrefixListAssociationsRequestOps(v)

}
