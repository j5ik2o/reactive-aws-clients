// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ClusterBuilderOps(val self: Cluster.Builder) extends AnyVal {

  final def clusterArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterArn(v)
    }
  }

  final def clusterNameAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  final def statusAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def registeredContainerInstancesCountAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.registeredContainerInstancesCount(v)
    }
  }

  final def runningTasksCountAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.runningTasksCount(v)
    }
  }

  final def pendingTasksCountAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.pendingTasksCount(v)
    }
  }

  final def activeServicesCountAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.activeServicesCount(v)
    }
  }

  final def statisticsAsScala(value: Option[Seq[KeyValuePair]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.statistics(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class ClusterOps(val self: Cluster) extends AnyVal {

  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  final def statusAsScala: Option[String] = Option(self.status)

  final def registeredContainerInstancesCountAsScala: Option[Int] = Option(self.registeredContainerInstancesCount)

  final def runningTasksCountAsScala: Option[Int] = Option(self.runningTasksCount)

  final def pendingTasksCountAsScala: Option[Int] = Option(self.pendingTasksCount)

  final def activeServicesCountAsScala: Option[Int] = Option(self.activeServicesCount)

  final def statisticsAsScala: Option[Seq[KeyValuePair]] = Option(self.statistics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClusterOps {

  implicit def toClusterBuilderOps(v: Cluster.Builder): ClusterBuilderOps = new ClusterBuilderOps(v)

  implicit def toClusterOps(v: Cluster): ClusterOps = new ClusterOps(v)

}
