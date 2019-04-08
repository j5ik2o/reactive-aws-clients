// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyNetworkInterfaceAttributeRequestBuilderOps(val self: ModifyNetworkInterfaceAttributeRequest.Builder)
    extends AnyVal {

  final def attachmentAsScala(
      value: Option[NetworkInterfaceAttachmentChanges]
  ): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attachment(v)
    }
  }

  final def descriptionAsScala(value: Option[AttributeValue]): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupsAsScala(value: Option[Seq[String]]): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def sourceDestCheckAsScala(
      value: Option[AttributeBooleanValue]
  ): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

}

final class ModifyNetworkInterfaceAttributeRequestOps(val self: ModifyNetworkInterfaceAttributeRequest) extends AnyVal {

  final def attachmentAsScala: Option[NetworkInterfaceAttachmentChanges] = Option(self.attachment)

  final def descriptionAsScala: Option[AttributeValue] = Option(self.description)

  final def groupsAsScala: Option[Seq[String]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def sourceDestCheckAsScala: Option[AttributeBooleanValue] = Option(self.sourceDestCheck)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyNetworkInterfaceAttributeRequestOps {

  implicit def toModifyNetworkInterfaceAttributeRequestBuilderOps(
      v: ModifyNetworkInterfaceAttributeRequest.Builder
  ): ModifyNetworkInterfaceAttributeRequestBuilderOps = new ModifyNetworkInterfaceAttributeRequestBuilderOps(v)

  implicit def toModifyNetworkInterfaceAttributeRequestOps(
      v: ModifyNetworkInterfaceAttributeRequest
  ): ModifyNetworkInterfaceAttributeRequestOps = new ModifyNetworkInterfaceAttributeRequestOps(v)

}
