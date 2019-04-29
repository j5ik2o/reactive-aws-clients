// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class VpcConfigRequestBuilderOps(val self: VpcConfigRequest.Builder) extends AnyVal {

  final def subnetIdsAsScala(value: Option[Seq[String]]): VpcConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): VpcConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

}

final class VpcConfigRequestOps(val self: VpcConfigRequest) extends AnyVal {

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcConfigRequestOps {

  implicit def toVpcConfigRequestBuilderOps(v: VpcConfigRequest.Builder): VpcConfigRequestBuilderOps =
    new VpcConfigRequestBuilderOps(v)

  implicit def toVpcConfigRequestOps(v: VpcConfigRequest): VpcConfigRequestOps = new VpcConfigRequestOps(v)

}
