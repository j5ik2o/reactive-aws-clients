// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyNetworkInterfaceAttributeRequestBuilderOps(val self: ModifyNetworkInterfaceAttributeRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentAsScala(
      value: Option[NetworkInterfaceAttachmentChanges]
  ): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.attachment(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[AttributeValue]): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala(value: Option[Seq[String]]): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala(
      value: Option[AttributeBooleanValue]
  ): ModifyNetworkInterfaceAttributeRequest.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

}

final class ModifyNetworkInterfaceAttributeRequestOps(val self: ModifyNetworkInterfaceAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentAsScala: Option[NetworkInterfaceAttachmentChanges] = Option(self.attachment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[AttributeValue] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala: Option[Seq[String]] = Option(self.groups).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
