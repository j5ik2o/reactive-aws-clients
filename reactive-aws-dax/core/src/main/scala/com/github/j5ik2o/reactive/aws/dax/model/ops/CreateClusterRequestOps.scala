// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateClusterRequestBuilderOps(val self: CreateClusterRequest.Builder) extends AnyVal {

  final def withClusterNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  } // String

  final def withNodeTypeAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.nodeType(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withReplicationFactorAsScala(value: Option[Int]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.replicationFactor(v)
    }
  } // Int

  final def withAvailabilityZonesAsScala(value: Option[Seq[String]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.availabilityZones(v.asJava)
    } // Seq[String]
  }

  final def withSubnetGroupNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.subnetGroupName(v)
    }
  } // String

  final def withSecurityGroupIdsAsScala(value: Option[Seq[String]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    } // Seq[String]
  }

  final def withPreferredMaintenanceWindowAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.preferredMaintenanceWindow(v)
    }
  } // String

  final def withNotificationTopicArnAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicArn(v)
    }
  } // String

  final def withIamRoleArnAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.iamRoleArn(v)
    }
  } // String

  final def withParameterGroupNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  } // String

  final def withTagsAsScala(value: Option[Seq[Tag]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def withSseSpecificationAsScala(value: Option[SSESpecification]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.sseSpecification(v)
    }
  } // SSESpecification

}

final class CreateClusterRequestOps(val self: CreateClusterRequest) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName) // String

  final def nodeTypeAsScala: Option[String] = Option(self.nodeType) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def replicationFactorAsScala: Option[Int] = Option(self.replicationFactor) // Int

  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName) // String

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow) // String

  final def notificationTopicArnAsScala: Option[String] = Option(self.notificationTopicArn) // String

  final def iamRoleArnAsScala: Option[String] = Option(self.iamRoleArn) // String

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName) // String

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def sseSpecificationAsScala: Option[SSESpecification] = Option(self.sseSpecification) // SSESpecification

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClusterRequestOps {

  implicit def toCreateClusterRequestBuilderOps(v: CreateClusterRequest.Builder): CreateClusterRequestBuilderOps =
    new CreateClusterRequestBuilderOps(v)

  implicit def toCreateClusterRequestOps(v: CreateClusterRequest): CreateClusterRequestOps =
    new CreateClusterRequestOps(v)

}
