// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ServiceConfigurationBuilderOps(val self: ServiceConfiguration.Builder) extends AnyVal {

  final def serviceTypeAsScala(value: Option[Seq[ServiceTypeDetail]]): ServiceConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.serviceType(v.asJava)
    }
  }

  final def serviceIdAsScala(value: Option[String]): ServiceConfiguration.Builder = {
    value.fold(self) { v =>
      self.serviceId(v)
    }
  }

  final def serviceNameAsScala(value: Option[String]): ServiceConfiguration.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  final def serviceStateAsScala(value: Option[ServiceState]): ServiceConfiguration.Builder = {
    value.fold(self) { v =>
      self.serviceState(v)
    }
  }

  final def availabilityZonesAsScala(value: Option[Seq[String]]): ServiceConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.availabilityZones(v.asJava)
    }
  }

  final def acceptanceRequiredAsScala(value: Option[Boolean]): ServiceConfiguration.Builder = {
    value.fold(self) { v =>
      self.acceptanceRequired(v)
    }
  }

  final def networkLoadBalancerArnsAsScala(value: Option[Seq[String]]): ServiceConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkLoadBalancerArns(v.asJava)
    }
  }

  final def baseEndpointDnsNamesAsScala(value: Option[Seq[String]]): ServiceConfiguration.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.baseEndpointDnsNames(v.asJava)
    }
  }

  final def privateDnsNameAsScala(value: Option[String]): ServiceConfiguration.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

}

final class ServiceConfigurationOps(val self: ServiceConfiguration) extends AnyVal {

  final def serviceTypeAsScala: Option[Seq[ServiceTypeDetail]] = Option(self.serviceType).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  final def serviceStateAsScala: Option[ServiceState] = Option(self.serviceState)

  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def acceptanceRequiredAsScala: Option[Boolean] = Option(self.acceptanceRequired)

  final def networkLoadBalancerArnsAsScala: Option[Seq[String]] = Option(self.networkLoadBalancerArns).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def baseEndpointDnsNamesAsScala: Option[Seq[String]] = Option(self.baseEndpointDnsNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceConfigurationOps {

  implicit def toServiceConfigurationBuilderOps(v: ServiceConfiguration.Builder): ServiceConfigurationBuilderOps =
    new ServiceConfigurationBuilderOps(v)

  implicit def toServiceConfigurationOps(v: ServiceConfiguration): ServiceConfigurationOps =
    new ServiceConfigurationOps(v)

}
