// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ServiceDetailBuilderOps(val self: ServiceDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNameAsScala(value: Option[String]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala(value: Option[String]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.serviceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceTypeAsScala(value: Option[Seq[ServiceTypeDetail]]): ServiceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.serviceType(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala(value: Option[Seq[String]]): ServiceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.availabilityZones(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala(value: Option[String]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baseEndpointDnsNamesAsScala(value: Option[Seq[String]]): ServiceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.baseEndpointDnsNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsNameAsScala(value: Option[String]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.privateDnsName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointPolicySupportedAsScala(value: Option[Boolean]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.vpcEndpointPolicySupported(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptanceRequiredAsScala(value: Option[Boolean]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.acceptanceRequired(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managesVpcEndpointsAsScala(value: Option[Boolean]): ServiceDetail.Builder = {
    value.fold(self) { v =>
      self.managesVpcEndpoints(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): ServiceDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class ServiceDetailOps(val self: ServiceDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceTypeAsScala: Option[Seq[ServiceTypeDetail]] = Option(self.serviceType).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala: Option[String] = Option(self.owner)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def baseEndpointDnsNamesAsScala: Option[Seq[String]] = Option(self.baseEndpointDnsNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privateDnsNameAsScala: Option[String] = Option(self.privateDnsName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcEndpointPolicySupportedAsScala: Option[Boolean] = Option(self.vpcEndpointPolicySupported)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptanceRequiredAsScala: Option[Boolean] = Option(self.acceptanceRequired)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def managesVpcEndpointsAsScala: Option[Boolean] = Option(self.managesVpcEndpoints)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceDetailOps {

  implicit def toServiceDetailBuilderOps(v: ServiceDetail.Builder): ServiceDetailBuilderOps =
    new ServiceDetailBuilderOps(v)

  implicit def toServiceDetailOps(v: ServiceDetail): ServiceDetailOps = new ServiceDetailOps(v)

}
