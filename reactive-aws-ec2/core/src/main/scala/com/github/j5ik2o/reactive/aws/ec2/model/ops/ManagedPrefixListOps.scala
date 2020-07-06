// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ManagedPrefixListBuilderOps(val self: ManagedPrefixList.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala(value: Option[String]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.prefixListId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressFamilyAsScala(value: Option[String]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.addressFamily(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[PrefixListState]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.state(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateMessageAsScala(value: Option[String]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.stateMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListArnAsScala(value: Option[String]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.prefixListArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListNameAsScala(value: Option[String]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.prefixListName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxEntriesAsScala(value: Option[Int]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.maxEntries(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[Long]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.version(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ManagedPrefixList.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): ManagedPrefixList.Builder = {
    value.fold(self) { v => self.ownerId(v) }
  }

}

final class ManagedPrefixListOps(val self: ManagedPrefixList) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala: Option[String] = Option(self.prefixListId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addressFamilyAsScala: Option[String] = Option(self.addressFamily)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[PrefixListState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateMessageAsScala: Option[String] = Option(self.stateMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListArnAsScala: Option[String] = Option(self.prefixListArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListNameAsScala: Option[String] = Option(self.prefixListName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxEntriesAsScala: Option[Int] = Option(self.maxEntries)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[Long] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToManagedPrefixListOps {

  implicit def toManagedPrefixListBuilderOps(v: ManagedPrefixList.Builder): ManagedPrefixListBuilderOps =
    new ManagedPrefixListBuilderOps(v)

  implicit def toManagedPrefixListOps(v: ManagedPrefixList): ManagedPrefixListOps = new ManagedPrefixListOps(v)

}
