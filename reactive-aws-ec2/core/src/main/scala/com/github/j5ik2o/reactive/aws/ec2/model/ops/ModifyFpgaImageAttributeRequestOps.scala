// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyFpgaImageAttributeRequestBuilderOps(val self: ModifyFpgaImageAttributeRequest.Builder)
    extends AnyVal {

  final def fpgaImageIdAsScala(value: Option[String]): ModifyFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.fpgaImageId(v)
    }
  }

  final def attributeAsScala(value: Option[FpgaImageAttributeName]): ModifyFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  final def operationTypeAsScala(value: Option[OperationType]): ModifyFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.operationType(v)
    }
  }

  final def userIdsAsScala(value: Option[Seq[String]]): ModifyFpgaImageAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.userIds(v.asJava)
    }
  }

  final def userGroupsAsScala(value: Option[Seq[String]]): ModifyFpgaImageAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.userGroups(v.asJava)
    }
  }

  final def productCodesAsScala(value: Option[Seq[String]]): ModifyFpgaImageAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productCodes(v.asJava)
    }
  }

  final def loadPermissionAsScala(
      value: Option[LoadPermissionModifications]
  ): ModifyFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.loadPermission(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): ModifyFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def nameAsScala(value: Option[String]): ModifyFpgaImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class ModifyFpgaImageAttributeRequestOps(val self: ModifyFpgaImageAttributeRequest) extends AnyVal {

  final def fpgaImageIdAsScala: Option[String] = Option(self.fpgaImageId)

  final def attributeAsScala: Option[FpgaImageAttributeName] = Option(self.attribute)

  final def operationTypeAsScala: Option[OperationType] = Option(self.operationType)

  final def userIdsAsScala: Option[Seq[String]] = Option(self.userIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def userGroupsAsScala: Option[Seq[String]] = Option(self.userGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def productCodesAsScala: Option[Seq[String]] = Option(self.productCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def loadPermissionAsScala: Option[LoadPermissionModifications] = Option(self.loadPermission)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyFpgaImageAttributeRequestOps {

  implicit def toModifyFpgaImageAttributeRequestBuilderOps(
      v: ModifyFpgaImageAttributeRequest.Builder
  ): ModifyFpgaImageAttributeRequestBuilderOps = new ModifyFpgaImageAttributeRequestBuilderOps(v)

  implicit def toModifyFpgaImageAttributeRequestOps(
      v: ModifyFpgaImageAttributeRequest
  ): ModifyFpgaImageAttributeRequestOps = new ModifyFpgaImageAttributeRequestOps(v)

}
