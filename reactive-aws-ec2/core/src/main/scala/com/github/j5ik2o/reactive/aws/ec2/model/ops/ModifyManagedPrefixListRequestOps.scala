// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyManagedPrefixListRequestBuilderOps(val self: ModifyManagedPrefixListRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala(value: Option[String]): ModifyManagedPrefixListRequest.Builder = {
    value.fold(self) { v => self.prefixListId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentVersionAsScala(value: Option[Long]): ModifyManagedPrefixListRequest.Builder = {
    value.fold(self) { v => self.currentVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListNameAsScala(value: Option[String]): ModifyManagedPrefixListRequest.Builder = {
    value.fold(self) { v => self.prefixListName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addEntriesAsScala(value: Option[Seq[AddPrefixListEntry]]): ModifyManagedPrefixListRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.addEntries(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeEntriesAsScala(value: Option[Seq[RemovePrefixListEntry]]): ModifyManagedPrefixListRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeEntries(v.asJava)
    }
  }

}

final class ModifyManagedPrefixListRequestOps(val self: ModifyManagedPrefixListRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListIdAsScala: Option[String] = Option(self.prefixListId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def currentVersionAsScala: Option[Long] = Option(self.currentVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixListNameAsScala: Option[String] = Option(self.prefixListName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addEntriesAsScala: Option[Seq[AddPrefixListEntry]] =
    Option(self.addEntries).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeEntriesAsScala: Option[Seq[RemovePrefixListEntry]] =
    Option(self.removeEntries).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyManagedPrefixListRequestOps {

  implicit def toModifyManagedPrefixListRequestBuilderOps(
      v: ModifyManagedPrefixListRequest.Builder
  ): ModifyManagedPrefixListRequestBuilderOps = new ModifyManagedPrefixListRequestBuilderOps(v)

  implicit def toModifyManagedPrefixListRequestOps(
      v: ModifyManagedPrefixListRequest
  ): ModifyManagedPrefixListRequestOps = new ModifyManagedPrefixListRequestOps(v)

}
