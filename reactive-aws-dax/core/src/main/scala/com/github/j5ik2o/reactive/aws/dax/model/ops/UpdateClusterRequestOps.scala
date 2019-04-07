// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateClusterRequestBuilderOps(val self: UpdateClusterRequest.Builder) extends AnyVal {

  final def withClusterNameAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  } // String

  final def withDescriptionAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def withPreferredMaintenanceWindowAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.preferredMaintenanceWindow(v)
    }
  } // String

  final def withNotificationTopicArnAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicArn(v)
    }
  } // String

  final def withNotificationTopicStatusAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicStatus(v)
    }
  } // String

  final def withParameterGroupNameAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  } // String

  final def withSecurityGroupIdsAsScala(value: Option[Seq[String]]): UpdateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupIds(v.asJava)
    } // Seq[String]
  }

}

final class UpdateClusterRequestOps(val self: UpdateClusterRequest) extends AnyVal {

  final def clusterNameAsScala: Option[String] = Option(self.clusterName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow) // String

  final def notificationTopicArnAsScala: Option[String] = Option(self.notificationTopicArn) // String

  final def notificationTopicStatusAsScala: Option[String] = Option(self.notificationTopicStatus) // String

  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName) // String

  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterRequestOps {

  implicit def toUpdateClusterRequestBuilderOps(v: UpdateClusterRequest.Builder): UpdateClusterRequestBuilderOps =
    new UpdateClusterRequestBuilderOps(v)

  implicit def toUpdateClusterRequestOps(v: UpdateClusterRequest): UpdateClusterRequestOps =
    new UpdateClusterRequestOps(v)

}
