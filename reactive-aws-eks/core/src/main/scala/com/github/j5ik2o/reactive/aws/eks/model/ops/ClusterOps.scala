// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ClusterBuilderOps(val self: Cluster.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def arnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.arn(v)
    }
  }

  final def createdAtAsScala(value: Option[java.time.Instant]): Cluster.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  final def versionAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  final def endpointAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  final def roleArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.roleArn(v)
    }
  }

  final def resourcesVpcConfigAsScala(value: Option[VpcConfigResponse]): Cluster.Builder = {
    value.fold(self) { v =>
      self.resourcesVpcConfig(v)
    }
  }

  final def statusAsScala(value: Option[ClusterStatus]): Cluster.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def certificateAuthorityAsScala(value: Option[Certificate]): Cluster.Builder = {
    value.fold(self) { v =>
      self.certificateAuthority(v)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  final def platformVersionAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.platformVersion(v)
    }
  }

}

final class ClusterOps(val self: Cluster) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def arnAsScala: Option[String] = Option(self.arn)

  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  final def versionAsScala: Option[String] = Option(self.version)

  final def endpointAsScala: Option[String] = Option(self.endpoint)

  final def roleArnAsScala: Option[String] = Option(self.roleArn)

  final def resourcesVpcConfigAsScala: Option[VpcConfigResponse] = Option(self.resourcesVpcConfig)

  final def statusAsScala: Option[ClusterStatus] = Option(self.status)

  final def certificateAuthorityAsScala: Option[Certificate] = Option(self.certificateAuthority)

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  final def platformVersionAsScala: Option[String] = Option(self.platformVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClusterOps {

  implicit def toClusterBuilderOps(v: Cluster.Builder): ClusterBuilderOps = new ClusterBuilderOps(v)

  implicit def toClusterOps(v: Cluster): ClusterOps = new ClusterOps(v)

}
