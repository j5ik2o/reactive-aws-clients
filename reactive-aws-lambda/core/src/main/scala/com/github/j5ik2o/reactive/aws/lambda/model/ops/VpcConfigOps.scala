// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class VpcConfigBuilderOps(val self: VpcConfig.Builder) extends AnyVal {

  final def subnetIdsAsScala(value: Option[Seq[String]]): VpcConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetIds(v.asJava)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): VpcConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

}

final class VpcConfigOps(val self: VpcConfig) extends AnyVal {

  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcConfigOps {

  implicit def toVpcConfigBuilderOps(v: VpcConfig.Builder): VpcConfigBuilderOps = new VpcConfigBuilderOps(v)

  implicit def toVpcConfigOps(v: VpcConfig): VpcConfigOps = new VpcConfigOps(v)

}
