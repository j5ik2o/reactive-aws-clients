// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyVpcEndpointServicePermissionsRequestBuilderOps(
    val self: ModifyVpcEndpointServicePermissionsRequest.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala(value: Option[String]): ModifyVpcEndpointServicePermissionsRequest.Builder = {
    value.fold(self) { v => self.serviceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addAllowedPrincipalsAsScala(
      value: Option[Seq[String]]
  ): ModifyVpcEndpointServicePermissionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.addAllowedPrincipals(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeAllowedPrincipalsAsScala(
      value: Option[Seq[String]]
  ): ModifyVpcEndpointServicePermissionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeAllowedPrincipals(v.asJava)
    }
  }

}

final class ModifyVpcEndpointServicePermissionsRequestOps(val self: ModifyVpcEndpointServicePermissionsRequest)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceIdAsScala: Option[String] = Option(self.serviceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addAllowedPrincipalsAsScala: Option[Seq[String]] =
    Option(self.addAllowedPrincipals).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeAllowedPrincipalsAsScala: Option[Seq[String]] =
    Option(self.removeAllowedPrincipals).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyVpcEndpointServicePermissionsRequestOps {

  implicit def toModifyVpcEndpointServicePermissionsRequestBuilderOps(
      v: ModifyVpcEndpointServicePermissionsRequest.Builder
  ): ModifyVpcEndpointServicePermissionsRequestBuilderOps = new ModifyVpcEndpointServicePermissionsRequestBuilderOps(v)

  implicit def toModifyVpcEndpointServicePermissionsRequestOps(
      v: ModifyVpcEndpointServicePermissionsRequest
  ): ModifyVpcEndpointServicePermissionsRequestOps = new ModifyVpcEndpointServicePermissionsRequestOps(v)

}
