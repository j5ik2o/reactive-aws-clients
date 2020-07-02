// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class ClusterBuilderOps(val self: Cluster.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v => self.clusterArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalNodesAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v => self.totalNodes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeNodesAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v => self.activeNodes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeTypeAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v => self.nodeType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterDiscoveryEndpointAsScala(value: Option[Endpoint]): Cluster.Builder = {
    value.fold(self) { v => self.clusterDiscoveryEndpoint(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIdsToRemoveAsScala(value: Option[Seq[String]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nodeIdsToRemove(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodesAsScala(value: Option[Seq[Node]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.nodes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preferredMaintenanceWindowAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v => self.preferredMaintenanceWindow(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationConfigurationAsScala(value: Option[NotificationConfiguration]): Cluster.Builder = {
    value.fold(self) { v => self.notificationConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v => self.subnetGroup(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala(value: Option[Seq[SecurityGroupMembership]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroups(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamRoleArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v => self.iamRoleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupAsScala(value: Option[ParameterGroupStatus]): Cluster.Builder = {
    value.fold(self) { v => self.parameterGroup(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseDescriptionAsScala(value: Option[SSEDescription]): Cluster.Builder = {
    value.fold(self) { v => self.sseDescription(v) }
  }

}

final class ClusterOps(val self: Cluster) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalNodesAsScala: Option[Int] = Option(self.totalNodes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeNodesAsScala: Option[Int] = Option(self.activeNodes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeTypeAsScala: Option[String] = Option(self.nodeType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterDiscoveryEndpointAsScala: Option[Endpoint] = Option(self.clusterDiscoveryEndpoint)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeIdsToRemoveAsScala: Option[Seq[String]] =
    Option(self.nodeIdsToRemove).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodesAsScala: Option[Seq[Node]] =
    Option(self.nodes).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationConfigurationAsScala: Option[NotificationConfiguration] = Option(self.notificationConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupAsScala: Option[String] = Option(self.subnetGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupsAsScala: Option[Seq[SecurityGroupMembership]] =
    Option(self.securityGroups).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamRoleArnAsScala: Option[String] = Option(self.iamRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupAsScala: Option[ParameterGroupStatus] = Option(self.parameterGroup)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseDescriptionAsScala: Option[SSEDescription] = Option(self.sseDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClusterOps {

  implicit def toClusterBuilderOps(v: Cluster.Builder): ClusterBuilderOps = new ClusterBuilderOps(v)

  implicit def toClusterOps(v: Cluster): ClusterOps = new ClusterOps(v)

}
