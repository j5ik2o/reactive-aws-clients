// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class VPCDerivedInfoBuilderOps(val self: VPCDerivedInfo.Builder) extends AnyVal {

  final def vpcIdAsScala(value: Option[String]): VPCDerivedInfo.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  } // String

  final def subnetIdsAsScala(value: Option[Seq[String]]): VPCDerivedInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    } // Seq[String]
  }

  final def availabilityZonesAsScala(value: Option[Seq[String]]): VPCDerivedInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.availabilityZones(v.asJava)
    } // Seq[String]
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): VPCDerivedInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    } // Seq[String]
  }

}

final class VPCDerivedInfoOps(val self: VPCDerivedInfo) extends AnyVal {

  final def vpcIdAsScala: Option[String] = Option(self.vpcId) // String

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVPCDerivedInfoOps {

  implicit def toVPCDerivedInfoBuilderOps(v: VPCDerivedInfo.Builder): VPCDerivedInfoBuilderOps =
    new VPCDerivedInfoBuilderOps(v)

  implicit def toVPCDerivedInfoOps(v: VPCDerivedInfo): VPCDerivedInfoOps = new VPCDerivedInfoOps(v)

}
