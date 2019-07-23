// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifySnapshotAttributeRequestBuilderOps(val self: ModifySnapshotAttributeRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala(value: Option[SnapshotAttributeName]): ModifySnapshotAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createVolumePermissionAsScala(
      value: Option[CreateVolumePermissionModifications]
  ): ModifySnapshotAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.createVolumePermission(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNamesAsScala(value: Option[Seq[String]]): ModifySnapshotAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groupNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationTypeAsScala(value: Option[OperationType]): ModifySnapshotAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.operationType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala(value: Option[String]): ModifySnapshotAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.snapshotId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdsAsScala(value: Option[Seq[String]]): ModifySnapshotAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.userIds(v.asJava)
    }
  }

}

final class ModifySnapshotAttributeRequestOps(val self: ModifySnapshotAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala: Option[SnapshotAttributeName] = Option(self.attribute)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createVolumePermissionAsScala: Option[CreateVolumePermissionModifications] =
    Option(self.createVolumePermission)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNamesAsScala: Option[Seq[String]] = Option(self.groupNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationTypeAsScala: Option[OperationType] = Option(self.operationType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def snapshotIdAsScala: Option[String] = Option(self.snapshotId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdsAsScala: Option[Seq[String]] = Option(self.userIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifySnapshotAttributeRequestOps {

  implicit def toModifySnapshotAttributeRequestBuilderOps(
      v: ModifySnapshotAttributeRequest.Builder
  ): ModifySnapshotAttributeRequestBuilderOps = new ModifySnapshotAttributeRequestBuilderOps(v)

  implicit def toModifySnapshotAttributeRequestOps(
      v: ModifySnapshotAttributeRequest
  ): ModifySnapshotAttributeRequestOps = new ModifySnapshotAttributeRequestOps(v)

}
