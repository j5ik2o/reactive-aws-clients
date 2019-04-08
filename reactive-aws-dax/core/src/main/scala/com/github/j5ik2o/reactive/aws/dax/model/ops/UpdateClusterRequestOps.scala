// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateClusterRequestBuilderOps(val self: UpdateClusterRequest.Builder) extends AnyVal {

  final def clusterNameAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def preferredMaintenanceWindowAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.preferredMaintenanceWindow(v)
    }
  }

  final def notificationTopicArnAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicArn(v)
    }
  }

  final def notificationTopicStatusAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicStatus(v)
    }
  }

  final def parameterGroupNameAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  }

  final def securityGroupIdsAsScala(value: Option[Seq[String]]): UpdateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    }
  }

}

final class UpdateClusterRequestOps(val self: UpdateClusterRequest) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow)

  final def notificationTopicArnAsScala: Option[String] = Option(self.notificationTopicArn)

  final def notificationTopicStatusAsScala: Option[String] = Option(self.notificationTopicStatus)

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterRequestOps {

  implicit def toUpdateClusterRequestBuilderOps(v: UpdateClusterRequest.Builder): UpdateClusterRequestBuilderOps =
    new UpdateClusterRequestBuilderOps(v)

  implicit def toUpdateClusterRequestOps(v: UpdateClusterRequest): UpdateClusterRequestOps =
    new UpdateClusterRequestOps(v)

}
