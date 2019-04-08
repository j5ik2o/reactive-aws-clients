// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyImageAttributeRequestBuilderOps(val self: ModifyImageAttributeRequest.Builder) extends AnyVal {

  final def attributeAsScala(value: Option[String]): ModifyImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  final def descriptionAsScala(value: Option[AttributeValue]): ModifyImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def imageIdAsScala(value: Option[String]): ModifyImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.imageId(v)
    }
  }

  final def launchPermissionAsScala(
      value: Option[LaunchPermissionModifications]
  ): ModifyImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.launchPermission(v)
    }
  }

  final def operationTypeAsScala(value: Option[OperationType]): ModifyImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.operationType(v)
    }
  }

  final def productCodesAsScala(value: Option[Seq[String]]): ModifyImageAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.productCodes(v.asJava)
    }
  }

  final def userGroupsAsScala(value: Option[Seq[String]]): ModifyImageAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.userGroups(v.asJava)
    }
  }

  final def userIdsAsScala(value: Option[Seq[String]]): ModifyImageAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.userIds(v.asJava)
    }
  }

  final def valueAsScala(value: Option[String]): ModifyImageAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class ModifyImageAttributeRequestOps(val self: ModifyImageAttributeRequest) extends AnyVal {

  final def attributeAsScala: Option[String] = Option(self.attribute)

  final def descriptionAsScala: Option[AttributeValue] = Option(self.description)

  final def imageIdAsScala: Option[String] = Option(self.imageId)

  final def launchPermissionAsScala: Option[LaunchPermissionModifications] = Option(self.launchPermission)

  final def operationTypeAsScala: Option[OperationType] = Option(self.operationType)

  final def productCodesAsScala: Option[Seq[String]] = Option(self.productCodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def userGroupsAsScala: Option[Seq[String]] = Option(self.userGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def userIdsAsScala: Option[Seq[String]] = Option(self.userIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyImageAttributeRequestOps {

  implicit def toModifyImageAttributeRequestBuilderOps(
      v: ModifyImageAttributeRequest.Builder
  ): ModifyImageAttributeRequestBuilderOps = new ModifyImageAttributeRequestBuilderOps(v)

  implicit def toModifyImageAttributeRequestOps(v: ModifyImageAttributeRequest): ModifyImageAttributeRequestOps =
    new ModifyImageAttributeRequestOps(v)

}
