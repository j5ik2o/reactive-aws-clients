// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetManagedPrefixListEntriesRequestBuilderOps(val self: GetManagedPrefixListEntriesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala(value: Option[String]): GetManagedPrefixListEntriesRequest.Builder = {
    value.fold(self) { v => self.prefixListId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetVersionAsScala(value: Option[Long]): GetManagedPrefixListEntriesRequest.Builder = {
    value.fold(self) { v => self.targetVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): GetManagedPrefixListEntriesRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetManagedPrefixListEntriesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class GetManagedPrefixListEntriesRequestOps(val self: GetManagedPrefixListEntriesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala: Option[String] = Option(self.prefixListId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetVersionAsScala: Option[Long] = Option(self.targetVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetManagedPrefixListEntriesRequestOps {

  implicit def toGetManagedPrefixListEntriesRequestBuilderOps(
      v: GetManagedPrefixListEntriesRequest.Builder
  ): GetManagedPrefixListEntriesRequestBuilderOps = new GetManagedPrefixListEntriesRequestBuilderOps(v)

  implicit def toGetManagedPrefixListEntriesRequestOps(
      v: GetManagedPrefixListEntriesRequest
  ): GetManagedPrefixListEntriesRequestOps = new GetManagedPrefixListEntriesRequestOps(v)

}
