// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ServiceDetailBuilderOps(val self: ServiceDetail.Builder) extends AnyVal {

  final def serviceNameAsScala(value: Option[String]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  final def serviceTypeAsScala(value: Option[Seq[ServiceTypeDetail]]): ServiceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceType(v.asJava)
    }
  }

  final def availabilityZonesAsScala(value: Option[Seq[String]]): ServiceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.availabilityZones(v.asJava)
    }
  }

  final def ownerAsScala(value: Option[String]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

  final def baseEndpointDnsNamesAsScala(value: Option[Seq[String]]): ServiceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.baseEndpointDnsNames(v.asJava)
    }
  }

  final def privateDnsNameAsScala(value: Option[String]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

  final def vpcEndpointPolicySupportedAsScala(value: Option[Boolean]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.vpcEndpointPolicySupported(v)
    }
  }

  final def acceptanceRequiredAsScala(value: Option[Boolean]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.acceptanceRequired(v)
    }
  }

}

final class ServiceDetailOps(val self: ServiceDetail) extends AnyVal {

  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  final def serviceTypeAsScala: Option[Seq[ServiceTypeDetail]] = Option(self.serviceType).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ownerAsScala: Option[String] = Option(self.owner)

  final def baseEndpointDnsNamesAsScala: Option[Seq[String]] = Option(self.baseEndpointDnsNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  final def vpcEndpointPolicySupportedAsScala: Option[Boolean] = Option(self.vpcEndpointPolicySupported)

  final def acceptanceRequiredAsScala: Option[Boolean] = Option(self.acceptanceRequired)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceDetailOps {

  implicit def toServiceDetailBuilderOps(v: ServiceDetail.Builder): ServiceDetailBuilderOps =
    new ServiceDetailBuilderOps(v)

  implicit def toServiceDetailOps(v: ServiceDetail): ServiceDetailOps = new ServiceDetailOps(v)

}
