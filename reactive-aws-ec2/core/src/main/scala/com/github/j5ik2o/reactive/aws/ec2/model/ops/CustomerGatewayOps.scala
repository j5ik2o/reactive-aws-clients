// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CustomerGatewayBuilderOps(val self: CustomerGateway.Builder) extends AnyVal {

  final def bgpAsnAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.bgpAsn(v)
    }
  }

  final def customerGatewayIdAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.customerGatewayId(v)
    }
  }

  final def ipAddressAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.ipAddress(v)
    }
  }

  final def stateAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def typeAsScala(value: Option[String]): CustomerGateway.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CustomerGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class CustomerGatewayOps(val self: CustomerGateway) extends AnyVal {

  final def bgpAsnAsScala: Option[String] = Option(self.bgpAsn)

  final def customerGatewayIdAsScala: Option[String] = Option(self.customerGatewayId)

  final def ipAddressAsScala: Option[String] = Option(self.ipAddress)

  final def stateAsScala: Option[String] = Option(self.state)

  final def typeAsScala: Option[String] = Option(self.`type`)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCustomerGatewayOps {

  implicit def toCustomerGatewayBuilderOps(v: CustomerGateway.Builder): CustomerGatewayBuilderOps =
    new CustomerGatewayBuilderOps(v)

  implicit def toCustomerGatewayOps(v: CustomerGateway): CustomerGatewayOps = new CustomerGatewayOps(v)

}
