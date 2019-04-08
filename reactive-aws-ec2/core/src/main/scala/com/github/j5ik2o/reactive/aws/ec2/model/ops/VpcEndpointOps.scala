// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcEndpointBuilderOps(val self: VpcEndpoint.Builder) extends AnyVal {

  final def vpcEndpointIdAsScala(value: Option[String]): VpcEndpoint.Builder = {
    value.fold(self) { v =>
      self.vpcEndpointId(v)
    }
  }

  final def vpcEndpointTypeAsScala(value: Option[VpcEndpointType]): VpcEndpoint.Builder = {
    value.fold(self) { v =>
      self.vpcEndpointType(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): VpcEndpoint.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def serviceNameAsScala(value: Option[String]): VpcEndpoint.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  final def stateAsScala(value: Option[State]): VpcEndpoint.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def policyDocumentAsScala(value: Option[String]): VpcEndpoint.Builder = {
    value.fold(self) { v =>
      self.policyDocument(v)
    }
  }

  final def routeTableIdsAsScala(value: Option[Seq[String]]): VpcEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.routeTableIds(v.asJava)
    }
  }

  final def subnetIdsAsScala(value: Option[Seq[String]]): VpcEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    }
  }

  final def groupsAsScala(value: Option[Seq[SecurityGroupIdentifier]]): VpcEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def privateDnsEnabledAsScala(value: Option[Boolean]): VpcEndpoint.Builder = {
    value.fold(self) { v =>
      self.privateDnsEnabled(v)
    }
  }

  final def networkInterfaceIdsAsScala(value: Option[Seq[String]]): VpcEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaceIds(v.asJava)
    }
  }

  final def dnsEntriesAsScala(value: Option[Seq[DnsEntry]]): VpcEndpoint.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.dnsEntries(v.asJava)
    }
  }

  final def creationTimestampAsScala(value: Option[java.time.Instant]): VpcEndpoint.Builder = {
    value.fold(self) { v =>
      self.creationTimestamp(v)
    }
  }

}

final class VpcEndpointOps(val self: VpcEndpoint) extends AnyVal {

  final def vpcEndpointIdAsScala: Option[String] = Option(self.vpcEndpointId)

  final def vpcEndpointTypeAsScala: Option[VpcEndpointType] = Option(self.vpcEndpointType)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  final def stateAsScala: Option[State] = Option(self.state)

  final def policyDocumentAsScala: Option[String] = Option(self.policyDocument)

  final def routeTableIdsAsScala: Option[Seq[String]] = Option(self.routeTableIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def groupsAsScala: Option[Seq[SecurityGroupIdentifier]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def privateDnsEnabledAsScala: Option[Boolean] = Option(self.privateDnsEnabled)

  final def networkInterfaceIdsAsScala: Option[Seq[String]] = Option(self.networkInterfaceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def dnsEntriesAsScala: Option[Seq[DnsEntry]] = Option(self.dnsEntries).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcEndpointOps {

  implicit def toVpcEndpointBuilderOps(v: VpcEndpoint.Builder): VpcEndpointBuilderOps = new VpcEndpointBuilderOps(v)

  implicit def toVpcEndpointOps(v: VpcEndpoint): VpcEndpointOps = new VpcEndpointOps(v)

}
