// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ClusterBuilderOps(val self: Cluster.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredContainerInstancesCountAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.registeredContainerInstancesCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runningTasksCountAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.runningTasksCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pendingTasksCountAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.pendingTasksCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeServicesCountAsScala(value: Option[Int]): Cluster.Builder = {
    value.fold(self) { v =>
      self.activeServicesCount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statisticsAsScala(value: Option[Seq[KeyValuePair]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.statistics(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala(value: Option[Seq[ClusterSetting]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.settings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProvidersAsScala(value: Option[Seq[String]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capacityProviders(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultCapacityProviderStrategyAsScala(
      value: Option[Seq[CapacityProviderStrategyItem]]
  ): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.defaultCapacityProviderStrategy(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala(value: Option[Seq[Attachment]]): Cluster.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attachments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsStatusAsScala(value: Option[String]): Cluster.Builder = {
    value.fold(self) { v =>
      self.attachmentsStatus(v)
    }
  }

}

final class ClusterOps(val self: Cluster) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterArnAsScala: Option[String] = Option(self.clusterArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registeredContainerInstancesCountAsScala: Option[Int] = Option(self.registeredContainerInstancesCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def runningTasksCountAsScala: Option[Int] = Option(self.runningTasksCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def pendingTasksCountAsScala: Option[Int] = Option(self.pendingTasksCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def activeServicesCountAsScala: Option[Int] = Option(self.activeServicesCount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statisticsAsScala: Option[Seq[KeyValuePair]] = Option(self.statistics).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala: Option[Seq[ClusterSetting]] = Option(self.settings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capacityProvidersAsScala: Option[Seq[String]] = Option(self.capacityProviders).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def defaultCapacityProviderStrategyAsScala: Option[Seq[CapacityProviderStrategyItem]] =
    Option(self.defaultCapacityProviderStrategy).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala: Option[Seq[Attachment]] = Option(self.attachments).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsStatusAsScala: Option[String] = Option(self.attachmentsStatus)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToClusterOps {

  implicit def toClusterBuilderOps(v: Cluster.Builder): ClusterBuilderOps = new ClusterBuilderOps(v)

  implicit def toClusterOps(v: Cluster): ClusterOps = new ClusterOps(v)

}
