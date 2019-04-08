// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ClusterBuilderOps(val self: Cluster.Builder) extends AnyVal {

  final def clusterNameAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def clusterArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterArn(v)
    }
  }

  final def totalNodesAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.totalNodes(v)
    }
  }

  final def activeNodesAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.activeNodes(v)
    }
  }

  final def nodeTypeAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.nodeType(v)
    }
  }

  final def statusAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def clusterDiscoveryEndpointAsScala(value: Option[Endpoint]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterDiscoveryEndpoint(v)
    }
  }

  final def nodeIdsToRemoveAsScala(value: Option[Seq[String]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodeIdsToRemove(v.asJava)
    }
  }

  final def nodesAsScala(value: Option[Seq[Node]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.nodes(v.asJava)
    }
  }

  final def preferredMaintenanceWindowAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.preferredMaintenanceWindow(v)
    }
  }

  final def notificationConfigurationAsScala(value: Option[NotificationConfiguration]): Cluster.Builder = {
    value.fold(self) { v =>
      self.notificationConfiguration(v)
    }
  }

  final def subnetGroupAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.subnetGroup(v)
    }
  }

  final def securityGroupsAsScala(value: Option[Seq[SecurityGroupMembership]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroups(v.asJava)
    }
  }

  final def iamRoleArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.iamRoleArn(v)
    }
  }

  final def parameterGroupAsScala(value: Option[ParameterGroupStatus]): Cluster.Builder = {
    value.fold(self) { v =>
      self.parameterGroup(v)
    }
  }

  final def sseDescriptionAsScala(value: Option[SSEDescription]): Cluster.Builder = {
    value.fold(self) { v =>
      self.sseDescription(v)
    }
  }

}

final class ClusterOps(val self: Cluster) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

  final def totalNodesAsScala: Option[Int] = Option(self.totalNodes)

  final def activeNodesAsScala: Option[Int] = Option(self.activeNodes)

  final def nodeTypeAsScala: Option[String] = Option(self.nodeType)

  final def statusAsScala: Option[String] = Option(self.status)

  final def clusterDiscoveryEndpointAsScala: Option[Endpoint] = Option(self.clusterDiscoveryEndpoint)

  final def nodeIdsToRemoveAsScala: Option[Seq[String]] = Option(self.nodeIdsToRemove).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nodesAsScala: Option[Seq[Node]] = Option(self.nodes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow)

  final def notificationConfigurationAsScala: Option[NotificationConfiguration] = Option(self.notificationConfiguration)

  final def subnetGroupAsScala: Option[String] = Option(self.subnetGroup)

  final def securityGroupsAsScala: Option[Seq[SecurityGroupMembership]] = Option(self.securityGroups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def iamRoleArnAsScala: Option[String] = Option(self.iamRoleArn)

  final def parameterGroupAsScala: Option[ParameterGroupStatus] = Option(self.parameterGroup)

  final def sseDescriptionAsScala: Option[SSEDescription] = Option(self.sseDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClusterOps {

  implicit def toClusterBuilderOps(v: Cluster.Builder): ClusterBuilderOps = new ClusterBuilderOps(v)

  implicit def toClusterOps(v: Cluster): ClusterOps = new ClusterOps(v)

}
