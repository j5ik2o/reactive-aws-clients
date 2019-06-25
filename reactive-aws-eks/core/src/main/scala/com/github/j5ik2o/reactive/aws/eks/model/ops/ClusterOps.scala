// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ClusterBuilderOps(val self: Cluster.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): Cluster.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesVpcConfigAsScala(value: Option[VpcConfigResponse]): Cluster.Builder = {
    value.fold(self) { v =>
      self.resourcesVpcConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingAsScala(value: Option[Logging]): Cluster.Builder = {
    value.fold(self) { v =>
      self.logging(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ClusterStatus]): Cluster.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateAuthorityAsScala(value: Option[Certificate]): Cluster.Builder = {
    value.fold(self) { v =>
      self.certificateAuthority(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

}

final class ClusterOps(val self: Cluster) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[String] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endpointAsScala: Option[String] = Option(self.endpoint)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesVpcConfigAsScala: Option[VpcConfigResponse] = Option(self.resourcesVpcConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def loggingAsScala: Option[Logging] = Option(self.logging)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ClusterStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def certificateAuthorityAsScala: Option[Certificate] = Option(self.certificateAuthority)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClusterOps {

  implicit def toClusterBuilderOps(v: Cluster.Builder): ClusterBuilderOps = new ClusterBuilderOps(v)

  implicit def toClusterOps(v: Cluster): ClusterOps = new ClusterOps(v)

}
