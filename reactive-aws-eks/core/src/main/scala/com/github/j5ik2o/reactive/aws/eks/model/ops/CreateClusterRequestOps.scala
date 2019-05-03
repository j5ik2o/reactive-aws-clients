// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class CreateClusterRequestBuilderOps(val self: CreateClusterRequest.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def versionAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  final def roleArnAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  final def resourcesVpcConfigAsScala(value: Option[VpcConfigRequest]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.resourcesVpcConfig(v)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class CreateClusterRequestOps(val self: CreateClusterRequest) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def versionAsScala: Option[String] = Option(self.version)

  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  final def resourcesVpcConfigAsScala: Option[VpcConfigRequest] = Option(self.resourcesVpcConfig)

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClusterRequestOps {

  implicit def toCreateClusterRequestBuilderOps(v: CreateClusterRequest.Builder): CreateClusterRequestBuilderOps =
    new CreateClusterRequestBuilderOps(v)

  implicit def toCreateClusterRequestOps(v: CreateClusterRequest): CreateClusterRequestOps =
    new CreateClusterRequestOps(v)

}
