// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class NodegroupBuilderOps(val self: Nodegroup.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala(value: Option[String]): Nodegroup.Builder = {
    value.fold(self) { v => self.nodegroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupArnAsScala(value: Option[String]): Nodegroup.Builder = {
    value.fold(self) { v => self.nodegroupArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): Nodegroup.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[String]): Nodegroup.Builder = {
    value.fold(self) { v => self.version(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def releaseVersionAsScala(value: Option[String]): Nodegroup.Builder = {
    value.fold(self) { v => self.releaseVersion(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): Nodegroup.Builder = {
    value.fold(self) { v => self.createdAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modifiedAtAsScala(value: Option[java.time.Instant]): Nodegroup.Builder = {
    value.fold(self) { v => self.modifiedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[NodegroupStatus]): Nodegroup.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scalingConfigAsScala(value: Option[NodegroupScalingConfig]): Nodegroup.Builder = {
    value.fold(self) { v => self.scalingConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypesAsScala(value: Option[Seq[String]]): Nodegroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceTypes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala(value: Option[Seq[String]]): Nodegroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnets(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def remoteAccessAsScala(value: Option[RemoteAccessConfig]): Nodegroup.Builder = {
    value.fold(self) { v => self.remoteAccess(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amiTypeAsScala(value: Option[AMITypes]): Nodegroup.Builder = {
    value.fold(self) { v => self.amiType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeRoleAsScala(value: Option[String]): Nodegroup.Builder = {
    value.fold(self) { v => self.nodeRole(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala(value: Option[Map[String, String]]): Nodegroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.labels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesAsScala(value: Option[NodegroupResources]): Nodegroup.Builder = {
    value.fold(self) { v => self.resources(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskSizeAsScala(value: Option[Int]): Nodegroup.Builder = {
    value.fold(self) { v => self.diskSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthAsScala(value: Option[NodegroupHealth]): Nodegroup.Builder = {
    value.fold(self) { v => self.health(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): Nodegroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class NodegroupOps(val self: Nodegroup) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala: Option[String] = Option(self.nodegroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupArnAsScala: Option[String] = Option(self.nodegroupArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[String] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def releaseVersionAsScala: Option[String] = Option(self.releaseVersion)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def modifiedAtAsScala: Option[java.time.Instant] = Option(self.modifiedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[NodegroupStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scalingConfigAsScala: Option[NodegroupScalingConfig] = Option(self.scalingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypesAsScala: Option[Seq[String]] =
    Option(self.instanceTypes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala: Option[Seq[String]] =
    Option(self.subnets).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def remoteAccessAsScala: Option[RemoteAccessConfig] = Option(self.remoteAccess)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amiTypeAsScala: Option[AMITypes] = Option(self.amiType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeRoleAsScala: Option[String] = Option(self.nodeRole)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala: Option[Map[String, String]] =
    Option(self.labels).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesAsScala: Option[NodegroupResources] = Option(self.resources)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskSizeAsScala: Option[Int] = Option(self.diskSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def healthAsScala: Option[NodegroupHealth] = Option(self.health)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNodegroupOps {

  implicit def toNodegroupBuilderOps(v: Nodegroup.Builder): NodegroupBuilderOps = new NodegroupBuilderOps(v)

  implicit def toNodegroupOps(v: Nodegroup): NodegroupOps = new NodegroupOps(v)

}
