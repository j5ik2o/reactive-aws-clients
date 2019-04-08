// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateClusterRequestBuilderOps(val self: CreateClusterRequest.Builder) extends AnyVal {

  final def clusterNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  final def nodeTypeAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.nodeType(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def replicationFactorAsScala(value: Option[Int]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.replicationFactor(v)
    }
  }

  final def availabilityZonesAsScala(value: Option[Seq[String]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.availabilityZones(v.asJava)
    }
  }

  final def subnetGroupNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.subnetGroupName(v)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

  final def preferredMaintenanceWindowAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.preferredMaintenanceWindow(v)
    }
  }

  final def notificationTopicArnAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicArn(v)
    }
  }

  final def iamRoleArnAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.iamRoleArn(v)
    }
  }

  final def parameterGroupNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def sseSpecificationAsScala(value: Option[SSESpecification]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.sseSpecification(v)
    }
  }

}

final class CreateClusterRequestOps(val self: CreateClusterRequest) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  final def nodeTypeAsScala: Option[String] = Option(self.nodeType)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def replicationFactorAsScala: Option[Int] = Option(self.replicationFactor)

  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName)

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow)

  final def notificationTopicArnAsScala: Option[String] = Option(self.notificationTopicArn)

  final def iamRoleArnAsScala: Option[String] = Option(self.iamRoleArn)

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def sseSpecificationAsScala: Option[SSESpecification] = Option(self.sseSpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClusterRequestOps {

  implicit def toCreateClusterRequestBuilderOps(v: CreateClusterRequest.Builder): CreateClusterRequestBuilderOps =
    new CreateClusterRequestBuilderOps(v)

  implicit def toCreateClusterRequestOps(v: CreateClusterRequest): CreateClusterRequestOps =
    new CreateClusterRequestOps(v)

}
