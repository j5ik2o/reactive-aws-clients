// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateManagedPrefixListRequestBuilderOps(val self: CreateManagedPrefixListRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListNameAsScala(value: Option[String]): CreateManagedPrefixListRequest.Builder = {
    value.fold(self) { v => self.prefixListName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala(value: Option[Seq[AddPrefixListEntry]]): CreateManagedPrefixListRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.entries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxEntriesAsScala(value: Option[Int]): CreateManagedPrefixListRequest.Builder = {
    value.fold(self) { v => self.maxEntries(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateManagedPrefixListRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressFamilyAsScala(value: Option[String]): CreateManagedPrefixListRequest.Builder = {
    value.fold(self) { v => self.addressFamily(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateManagedPrefixListRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

}

final class CreateManagedPrefixListRequestOps(val self: CreateManagedPrefixListRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListNameAsScala: Option[String] = Option(self.prefixListName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def entriesAsScala: Option[Seq[AddPrefixListEntry]] =
    Option(self.entries).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxEntriesAsScala: Option[Int] = Option(self.maxEntries)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressFamilyAsScala: Option[String] = Option(self.addressFamily)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateManagedPrefixListRequestOps {

  implicit def toCreateManagedPrefixListRequestBuilderOps(
      v: CreateManagedPrefixListRequest.Builder
  ): CreateManagedPrefixListRequestBuilderOps = new CreateManagedPrefixListRequestBuilderOps(v)

  implicit def toCreateManagedPrefixListRequestOps(
      v: CreateManagedPrefixListRequest
  ): CreateManagedPrefixListRequestOps = new CreateManagedPrefixListRequestOps(v)

}
