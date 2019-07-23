// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class VpcConfigRequestBuilderOps(val self: VpcConfigRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala(value: Option[Seq[String]]): VpcConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): VpcConfigRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointPublicAccessAsScala(value: Option[Boolean]): VpcConfigRequest.Builder = {
    value.fold(self) { v =>
      self.endpointPublicAccess(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointPrivateAccessAsScala(value: Option[Boolean]): VpcConfigRequest.Builder = {
    value.fold(self) { v =>
      self.endpointPrivateAccess(v)
    }
  }

}

final class VpcConfigRequestOps(val self: VpcConfigRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdsAsScala: Option[Seq[String]] = Option(self.subnetIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointPublicAccessAsScala: Option[Boolean] = Option(self.endpointPublicAccess)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointPrivateAccessAsScala: Option[Boolean] = Option(self.endpointPrivateAccess)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcConfigRequestOps {

  implicit def toVpcConfigRequestBuilderOps(v: VpcConfigRequest.Builder): VpcConfigRequestBuilderOps =
    new VpcConfigRequestBuilderOps(v)

  implicit def toVpcConfigRequestOps(v: VpcConfigRequest): VpcConfigRequestOps = new VpcConfigRequestOps(v)

}
