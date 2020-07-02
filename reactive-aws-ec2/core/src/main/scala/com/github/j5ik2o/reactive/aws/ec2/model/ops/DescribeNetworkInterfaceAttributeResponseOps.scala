// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkInterfaceAttributeResponseBuilderOps(
    val self: DescribeNetworkInterfaceAttributeResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentAsScala(
      value: Option[NetworkInterfaceAttachment]
  ): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.fold(self) { v => self.attachment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[AttributeValue]): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.groups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.fold(self) { v => self.networkInterfaceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala(
      value: Option[AttributeBooleanValue]
  ): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.fold(self) { v => self.sourceDestCheck(v) }
  }

}

final class DescribeNetworkInterfaceAttributeResponseOps(val self: DescribeNetworkInterfaceAttributeResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentAsScala: Option[NetworkInterfaceAttachment] = Option(self.attachment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[AttributeValue] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupsAsScala: Option[Seq[GroupIdentifier]] =
    Option(self.groups).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceDestCheckAsScala: Option[AttributeBooleanValue] = Option(self.sourceDestCheck)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeNetworkInterfaceAttributeResponseOps {

  implicit def toDescribeNetworkInterfaceAttributeResponseBuilderOps(
      v: DescribeNetworkInterfaceAttributeResponse.Builder
  ): DescribeNetworkInterfaceAttributeResponseBuilderOps = new DescribeNetworkInterfaceAttributeResponseBuilderOps(v)

  implicit def toDescribeNetworkInterfaceAttributeResponseOps(
      v: DescribeNetworkInterfaceAttributeResponse
  ): DescribeNetworkInterfaceAttributeResponseOps = new DescribeNetworkInterfaceAttributeResponseOps(v)

}
