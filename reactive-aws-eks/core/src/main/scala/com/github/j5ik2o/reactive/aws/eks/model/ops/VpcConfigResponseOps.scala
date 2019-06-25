// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class VpcConfigResponseBuilderOps(val self: VpcConfigResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala(value: Option[Seq[String]]): VpcConfigResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): VpcConfigResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): VpcConfigResponse.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointPublicAccessAsScala(value: Option[Boolean]): VpcConfigResponse.Builder = {
    value.fold(self) { v =>
      self.endpointPublicAccess(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointPrivateAccessAsScala(value: Option[Boolean]): VpcConfigResponse.Builder = {
    value.fold(self) { v =>
      self.endpointPrivateAccess(v)
    }
  }

}

final class VpcConfigResponseOps(val self: VpcConfigResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointPublicAccessAsScala: Option[Boolean] = Option(self.endpointPublicAccess)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointPrivateAccessAsScala: Option[Boolean] = Option(self.endpointPrivateAccess)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcConfigResponseOps {

  implicit def toVpcConfigResponseBuilderOps(v: VpcConfigResponse.Builder): VpcConfigResponseBuilderOps =
    new VpcConfigResponseBuilderOps(v)

  implicit def toVpcConfigResponseOps(v: VpcConfigResponse): VpcConfigResponseOps = new VpcConfigResponseOps(v)

}
