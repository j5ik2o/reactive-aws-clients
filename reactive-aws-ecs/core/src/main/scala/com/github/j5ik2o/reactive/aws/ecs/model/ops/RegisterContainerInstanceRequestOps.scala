// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RegisterContainerInstanceRequestBuilderOps(val self: RegisterContainerInstanceRequest.Builder)
    extends AnyVal {

  final def clusterAsScala(value: Option[String]): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def instanceIdentityDocumentAsScala(value: Option[String]): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceIdentityDocument(v)
    }
  }

  final def instanceIdentityDocumentSignatureAsScala(
      value: Option[String]
  ): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceIdentityDocumentSignature(v)
    }
  }

  final def totalResourcesAsScala(value: Option[Seq[Resource]]): RegisterContainerInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.totalResources(v.asJava)
    }
  }

  final def versionInfoAsScala(value: Option[VersionInfo]): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.versionInfo(v)
    }
  }

  final def containerInstanceArnAsScala(value: Option[String]): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.containerInstanceArn(v)
    }
  }

  final def attributesAsScala(value: Option[Seq[Attribute]]): RegisterContainerInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributes(v.asJava)
    }
  }

  final def platformDevicesAsScala(value: Option[Seq[PlatformDevice]]): RegisterContainerInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.platformDevices(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): RegisterContainerInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class RegisterContainerInstanceRequestOps(val self: RegisterContainerInstanceRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def instanceIdentityDocumentAsScala: Option[String] = Option(self.instanceIdentityDocument)

  final def instanceIdentityDocumentSignatureAsScala: Option[String] = Option(self.instanceIdentityDocumentSignature)

  final def totalResourcesAsScala: Option[Seq[Resource]] = Option(self.totalResources).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def versionInfoAsScala: Option[VersionInfo] = Option(self.versionInfo)

  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  final def attributesAsScala: Option[Seq[Attribute]] = Option(self.attributes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def platformDevicesAsScala: Option[Seq[PlatformDevice]] = Option(self.platformDevices).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterContainerInstanceRequestOps {

  implicit def toRegisterContainerInstanceRequestBuilderOps(
      v: RegisterContainerInstanceRequest.Builder
  ): RegisterContainerInstanceRequestBuilderOps = new RegisterContainerInstanceRequestBuilderOps(v)

  implicit def toRegisterContainerInstanceRequestOps(
      v: RegisterContainerInstanceRequest
  ): RegisterContainerInstanceRequestOps = new RegisterContainerInstanceRequestOps(v)

}
