// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeNetworkInterfaceAttributeResponseBuilderOps(
    val self: DescribeNetworkInterfaceAttributeResponse.Builder
) extends AnyVal {

  final def attachmentAsScala(
      value: Option[NetworkInterfaceAttachment]
  ): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.attachment(v)
    }
  }

  final def descriptionAsScala(value: Option[AttributeValue]): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupsAsScala(value: Option[Seq[GroupIdentifier]]): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def sourceDestCheckAsScala(
      value: Option[AttributeBooleanValue]
  ): DescribeNetworkInterfaceAttributeResponse.Builder = {
    value.fold(self) { v =>
      self.sourceDestCheck(v)
    }
  }

}

final class DescribeNetworkInterfaceAttributeResponseOps(val self: DescribeNetworkInterfaceAttributeResponse)
    extends AnyVal {

  final def attachmentAsScala: Option[NetworkInterfaceAttachment] = Option(self.attachment)

  final def descriptionAsScala: Option[AttributeValue] = Option(self.description)

  final def groupsAsScala: Option[Seq[GroupIdentifier]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

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
