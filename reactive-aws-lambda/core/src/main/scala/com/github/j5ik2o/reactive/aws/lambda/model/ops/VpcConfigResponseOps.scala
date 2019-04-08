// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class VpcConfigResponseBuilderOps(val self: VpcConfigResponse.Builder) extends AnyVal {

  final def subnetIdsAsScala(value: Option[Seq[String]]): VpcConfigResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    } // Seq[String]
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): VpcConfigResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    } // Seq[String]
  }

  final def vpcIdAsScala(value: Option[String]): VpcConfigResponse.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  } // String

}

final class VpcConfigResponseOps(val self: VpcConfigResponse) extends AnyVal {

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def vpcIdAsScala: Option[String] = Option(self.vpcId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcConfigResponseOps {

  implicit def toVpcConfigResponseBuilderOps(v: VpcConfigResponse.Builder): VpcConfigResponseBuilderOps =
    new VpcConfigResponseBuilderOps(v)

  implicit def toVpcConfigResponseOps(v: VpcConfigResponse): VpcConfigResponseOps = new VpcConfigResponseOps(v)

}
