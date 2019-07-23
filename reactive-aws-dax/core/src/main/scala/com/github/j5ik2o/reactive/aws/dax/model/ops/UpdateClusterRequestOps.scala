// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateClusterRequestBuilderOps(val self: UpdateClusterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preferredMaintenanceWindowAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.preferredMaintenanceWindow(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationTopicArnAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationTopicStatusAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala(value: Option[String]): UpdateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): UpdateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

}

final class UpdateClusterRequestOps(val self: UpdateClusterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationTopicArnAsScala: Option[String] = Option(self.notificationTopicArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationTopicStatusAsScala: Option[String] = Option(self.notificationTopicStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateClusterRequestOps {

  implicit def toUpdateClusterRequestBuilderOps(v: UpdateClusterRequest.Builder): UpdateClusterRequestBuilderOps =
    new UpdateClusterRequestBuilderOps(v)

  implicit def toUpdateClusterRequestOps(v: UpdateClusterRequest): UpdateClusterRequestOps =
    new UpdateClusterRequestOps(v)

}
