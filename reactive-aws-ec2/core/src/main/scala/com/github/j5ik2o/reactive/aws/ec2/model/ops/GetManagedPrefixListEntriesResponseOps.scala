// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetManagedPrefixListEntriesResponseBuilderOps(val self: GetManagedPrefixListEntriesResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala(value: Option[Seq[PrefixListEntry]]): GetManagedPrefixListEntriesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.entries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetManagedPrefixListEntriesResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class GetManagedPrefixListEntriesResponseOps(val self: GetManagedPrefixListEntriesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala: Option[Seq[PrefixListEntry]] =
    Option(self.entries).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetManagedPrefixListEntriesResponseOps {

  implicit def toGetManagedPrefixListEntriesResponseBuilderOps(
      v: GetManagedPrefixListEntriesResponse.Builder
  ): GetManagedPrefixListEntriesResponseBuilderOps = new GetManagedPrefixListEntriesResponseBuilderOps(v)

  implicit def toGetManagedPrefixListEntriesResponseOps(
      v: GetManagedPrefixListEntriesResponse
  ): GetManagedPrefixListEntriesResponseOps = new GetManagedPrefixListEntriesResponseOps(v)

}
