// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RegisterContainerInstanceRequestBuilderOps(val self: RegisterContainerInstanceRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdentityDocumentAsScala(value: Option[String]): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceIdentityDocument(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdentityDocumentSignatureAsScala(
      value: Option[String]
  ): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.instanceIdentityDocumentSignature(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalResourcesAsScala(value: Option[Seq[Resource]]): RegisterContainerInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.totalResources(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionInfoAsScala(value: Option[VersionInfo]): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.versionInfo(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnAsScala(value: Option[String]): RegisterContainerInstanceRequest.Builder = {
    value.fold(self) { v =>
      self.containerInstanceArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala(value: Option[Seq[Attribute]]): RegisterContainerInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformDevicesAsScala(value: Option[Seq[PlatformDevice]]): RegisterContainerInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.platformDevices(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): RegisterContainerInstanceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class RegisterContainerInstanceRequestOps(val self: RegisterContainerInstanceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdentityDocumentAsScala: Option[String] = Option(self.instanceIdentityDocument)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdentityDocumentSignatureAsScala: Option[String] = Option(self.instanceIdentityDocumentSignature)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def totalResourcesAsScala: Option[Seq[Resource]] = Option(self.totalResources).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionInfoAsScala: Option[VersionInfo] = Option(self.versionInfo)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesAsScala: Option[Seq[Attribute]] = Option(self.attributes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformDevicesAsScala: Option[Seq[PlatformDevice]] = Option(self.platformDevices).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
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
