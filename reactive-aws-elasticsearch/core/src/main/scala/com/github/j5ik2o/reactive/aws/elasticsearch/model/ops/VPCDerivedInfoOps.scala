// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class VPCDerivedInfoBuilderOps(val self: VPCDerivedInfo.Builder) extends AnyVal {

  final def vpcIdAsScala(value: Option[String]): VPCDerivedInfo.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def subnetIdsAsScala(value: Option[Seq[String]]): VPCDerivedInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    }
  }

  final def availabilityZonesAsScala(value: Option[Seq[String]]): VPCDerivedInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.availabilityZones(v.asJava)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): VPCDerivedInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

}

final class VPCDerivedInfoOps(val self: VPCDerivedInfo) extends AnyVal {

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVPCDerivedInfoOps {

  implicit def toVPCDerivedInfoBuilderOps(v: VPCDerivedInfo.Builder): VPCDerivedInfoBuilderOps =
    new VPCDerivedInfoBuilderOps(v)

  implicit def toVPCDerivedInfoOps(v: VPCDerivedInfo): VPCDerivedInfoOps = new VPCDerivedInfoOps(v)

}
