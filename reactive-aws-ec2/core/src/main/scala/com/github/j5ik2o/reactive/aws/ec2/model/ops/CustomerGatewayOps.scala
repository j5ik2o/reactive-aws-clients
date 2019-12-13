// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CustomerGatewayBuilderOps(val self: CustomerGateway.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bgpAsnAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.bgpAsn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerGatewayIdAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.customerGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipAddressAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.ipAddress(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateArnAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.certificateArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.deviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CustomerGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CustomerGatewayOps(val self: CustomerGateway) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def bgpAsnAsScala: Option[String] = Option(self.bgpAsn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def customerGatewayIdAsScala: Option[String] = Option(self.customerGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ipAddressAsScala: Option[String] = Option(self.ipAddress)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateArnAsScala: Option[String] = Option(self.certificateArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[String] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def typeAsScala: Option[String] = Option(self.`type`)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deviceNameAsScala: Option[String] = Option(self.deviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCustomerGatewayOps {

  implicit def toCustomerGatewayBuilderOps(v: CustomerGateway.Builder): CustomerGatewayBuilderOps =
    new CustomerGatewayBuilderOps(v)

  implicit def toCustomerGatewayOps(v: CustomerGateway): CustomerGatewayOps = new CustomerGatewayOps(v)

}
