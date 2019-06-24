// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class CreateClusterRequestBuilderOps(val self: CreateClusterRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.clusterName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeTypeAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.nodeType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicationFactorAsScala(value: Option[Int]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.replicationFactor(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala(value: Option[Seq[String]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.availabilityZones(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.subnetGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala(value: Option[Seq[String]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.securityGroupIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preferredMaintenanceWindowAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.preferredMaintenanceWindow(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationTopicArnAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.notificationTopicArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamRoleArnAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.iamRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala(value: Option[String]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.parameterGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateClusterRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseSpecificationAsScala(value: Option[SSESpecification]): CreateClusterRequest.Builder = {
    value.fold(self) { v =>
      self.sseSpecification(v)
    }
  }

}

final class CreateClusterRequestOps(val self: CreateClusterRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeTypeAsScala: Option[String] = Option(self.nodeType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replicationFactorAsScala: Option[Int] = Option(self.replicationFactor)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availabilityZonesAsScala: Option[Seq[String]] = Option(self.availabilityZones).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNameAsScala: Option[String] = Option(self.subnetGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def securityGroupIdsAsScala: Option[Seq[String]] = Option(self.securityGroupIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def preferredMaintenanceWindowAsScala: Option[String] = Option(self.preferredMaintenanceWindow)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationTopicArnAsScala: Option[String] = Option(self.notificationTopicArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamRoleArnAsScala: Option[String] = Option(self.iamRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterGroupNameAsScala: Option[String] = Option(self.parameterGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseSpecificationAsScala: Option[SSESpecification] = Option(self.sseSpecification)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClusterRequestOps {

  implicit def toCreateClusterRequestBuilderOps(v: CreateClusterRequest.Builder): CreateClusterRequestBuilderOps =
    new CreateClusterRequestBuilderOps(v)

  implicit def toCreateClusterRequestOps(v: CreateClusterRequest): CreateClusterRequestOps =
    new CreateClusterRequestOps(v)

}
