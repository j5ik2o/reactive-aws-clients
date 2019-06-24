// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class ContainerPropertiesBuilderOps(val self: ContainerProperties.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.image(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vcpusAsScala(value: Option[Int]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.vcpus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala(value: Option[Int]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.memory(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala(value: Option[Seq[String]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.command(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobRoleArnAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.jobRoleArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala(value: Option[Seq[Volume]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala(value: Option[Seq[KeyValuePair]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environment(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mountPointsAsScala(value: Option[Seq[MountPoint]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.mountPoints(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readonlyRootFilesystemAsScala(value: Option[Boolean]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.readonlyRootFilesystem(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privilegedAsScala(value: Option[Boolean]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ulimitsAsScala(value: Option[Seq[Ulimit]]): ContainerProperties.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ulimits(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala(value: Option[String]): ContainerProperties.Builder = {
    value.fold(self) { v =>
      self.instanceType(v)
    }
  }

}

final class ContainerPropertiesOps(val self: ContainerProperties) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageAsScala: Option[String] = Option(self.image)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vcpusAsScala: Option[Int] = Option(self.vcpus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def memoryAsScala: Option[Int] = Option(self.memory)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def commandAsScala: Option[Seq[String]] = Option(self.command).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobRoleArnAsScala: Option[String] = Option(self.jobRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala: Option[Seq[Volume]] = Option(self.volumes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentAsScala: Option[Seq[KeyValuePair]] = Option(self.environment).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def mountPointsAsScala: Option[Seq[MountPoint]] = Option(self.mountPoints).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def readonlyRootFilesystemAsScala: Option[Boolean] = Option(self.readonlyRootFilesystem)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def privilegedAsScala: Option[Boolean] = Option(self.privileged)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ulimitsAsScala: Option[Seq[Ulimit]] = Option(self.ulimits).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userAsScala: Option[String] = Option(self.user)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTypeAsScala: Option[String] = Option(self.instanceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToContainerPropertiesOps {

  implicit def toContainerPropertiesBuilderOps(v: ContainerProperties.Builder): ContainerPropertiesBuilderOps =
    new ContainerPropertiesBuilderOps(v)

  implicit def toContainerPropertiesOps(v: ContainerProperties): ContainerPropertiesOps = new ContainerPropertiesOps(v)

}
