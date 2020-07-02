// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class CreateNodegroupRequestBuilderOps(val self: CreateNodegroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala(value: Option[String]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.nodegroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scalingConfigAsScala(value: Option[NodegroupScalingConfig]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.scalingConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskSizeAsScala(value: Option[Int]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.diskSize(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala(value: Option[Seq[String]]): CreateNodegroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnets(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypesAsScala(value: Option[Seq[String]]): CreateNodegroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceTypes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amiTypeAsScala(value: Option[AMITypes]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.amiType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def remoteAccessAsScala(value: Option[RemoteAccessConfig]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.remoteAccess(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeRoleAsScala(value: Option[String]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.nodeRole(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala(value: Option[Map[String, String]]): CreateNodegroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.labels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): CreateNodegroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.clientRequestToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala(value: Option[String]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.version(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def releaseVersionAsScala(value: Option[String]): CreateNodegroupRequest.Builder = {
    value.fold(self) { v => self.releaseVersion(v) }
  }

}

final class CreateNodegroupRequestOps(val self: CreateNodegroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodegroupNameAsScala: Option[String] = Option(self.nodegroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scalingConfigAsScala: Option[NodegroupScalingConfig] = Option(self.scalingConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def diskSizeAsScala: Option[Int] = Option(self.diskSize)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala: Option[Seq[String]] =
    Option(self.subnets).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypesAsScala: Option[Seq[String]] =
    Option(self.instanceTypes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def amiTypeAsScala: Option[AMITypes] = Option(self.amiType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def remoteAccessAsScala: Option[RemoteAccessConfig] = Option(self.remoteAccess)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nodeRoleAsScala: Option[String] = Option(self.nodeRole)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala: Option[Map[String, String]] =
    Option(self.labels).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionAsScala: Option[String] = Option(self.version)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def releaseVersionAsScala: Option[String] = Option(self.releaseVersion)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNodegroupRequestOps {

  implicit def toCreateNodegroupRequestBuilderOps(v: CreateNodegroupRequest.Builder): CreateNodegroupRequestBuilderOps =
    new CreateNodegroupRequestBuilderOps(v)

  implicit def toCreateNodegroupRequestOps(v: CreateNodegroupRequest): CreateNodegroupRequestOps =
    new CreateNodegroupRequestOps(v)

}
