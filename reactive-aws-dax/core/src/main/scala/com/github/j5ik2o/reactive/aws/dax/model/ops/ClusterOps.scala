// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ClusterBuilderOps(val self: Cluster.Builder) extends AnyVal {

  final def withClusterNameAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withClusterArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterArn(v)
    }
  } // String

  final def withTotalNodesAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.totalNodes(v)
    }
  } // Int

  final def withActiveNodesAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.activeNodes(v)
    }
  } // Int

  final def withNodeTypeAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.nodeType(v)
    }
  } // String

  final def withStatusAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // String

  final def withClusterDiscoveryEndpointAsScala(value: Option[Endpoint]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterDiscoveryEndpoint(v)
    }
  } // Endpoint

  final def withNodeIdsToRemoveAsScala(value: Option[Seq[String]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodeIdsToRemove(v.asJava)
    } // Seq[String]
  }

  final def withNodesAsScala(value: Option[Seq[Node]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodes(v.asJava)
    } // Seq[Node]
  }

  final def withPreferredMaintenanceWindowAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.preferredMaintenanceWindow(v)
    }
  } // String

  final def withNotificationConfigurationAsScala(value: Option[NotificationConfiguration]): Cluster.Builder = {
    value.fold(self) { v =>
      self.notificationConfiguration(v)
    }
  } // NotificationConfiguration

  final def withSubnetGroupAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.subnetGroup(v)
    }
  } // String

  final def withSecurityGroupsAsScala(value: Option[Seq[SecurityGroupMembership]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    } // Seq[SecurityGroupMembership]
  }

  final def withIamRoleArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.iamRoleArn(v)
    }
  } // String

  final def withParameterGroupAsScala(value: Option[ParameterGroupStatus]): Cluster.Builder = {
    value.fold(self) { v =>
      self.parameterGroup(v)
    }
  } // ParameterGroupStatus

  final def withSseDescriptionAsScala(value: Option[SSEDescription]): Cluster.Builder = {
    value.fold(self) { v =>
      self.sseDescription(v)
    }
  } // SSEDescription

}

final class ClusterOps(val self: Cluster) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def clusterArnAsScala: Option[String] = Option(self.clusterArn) // String

  final def totalNodesAsScala: Option[Int] = Option(self.totalNodes) // Int

  final def activeNodesAsScala: Option[Int] = Option(self.activeNodes) // Int

  final def nodeTypeAsScala: Option[String] = Option(self.nodeType) // String

  final def statusAsScala: Option[String] = Option(self.status) // String

  final def clusterDiscoveryEndpointAsScala: Option[Endpoint] = Option(self.clusterDiscoveryEndpoint) // Endpoint

  final def nodeIdsToRemoveAsScala: Option[Seq[String]] = Option(self.nodeIdsToRemove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def nodesAsScala: Option[Seq[Node]] = Option(self.nodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Node]

  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow) // String

  final def notificationConfigurationAsScala: Option[NotificationConfiguration] =
    Option(self.notificationConfiguration) // NotificationConfiguration

  final def subnetGroupAsScala: Option[String] = Option(self.subnetGroup) // String

  final def securityGroupsAsScala: Option[Seq[SecurityGroupMembership]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[SecurityGroupMembership]

  final def iamRoleArnAsScala: Option[String] = Option(self.iamRoleArn) // String

  final def parameterGroupAsScala: Option[ParameterGroupStatus] = Option(self.parameterGroup) // ParameterGroupStatus

  final def sseDescriptionAsScala: Option[SSEDescription] = Option(self.sseDescription) // SSEDescription

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClusterOps {

  implicit def toClusterBuilderOps(v: Cluster.Builder): ClusterBuilderOps = new ClusterBuilderOps(v)

  implicit def toClusterOps(v: Cluster): ClusterOps = new ClusterOps(v)

}
