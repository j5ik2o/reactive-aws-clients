// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportInstanceTaskDetailsBuilderOps(val self: ImportInstanceTaskDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): ImportInstanceTaskDetails.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): ImportInstanceTaskDetails.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala(value: Option[PlatformValues]): ImportInstanceTaskDetails.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala(value: Option[Seq[ImportInstanceVolumeDetailItem]]): ImportInstanceTaskDetails.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.volumes(v.asJava)
    }
  }

}

final class ImportInstanceTaskDetailsOps(val self: ImportInstanceTaskDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def platformAsScala: Option[PlatformValues] = Option(self.platform)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def volumesAsScala: Option[Seq[ImportInstanceVolumeDetailItem]] = Option(self.volumes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImportInstanceTaskDetailsOps {

  implicit def toImportInstanceTaskDetailsBuilderOps(
      v: ImportInstanceTaskDetails.Builder
  ): ImportInstanceTaskDetailsBuilderOps = new ImportInstanceTaskDetailsBuilderOps(v)

  implicit def toImportInstanceTaskDetailsOps(v: ImportInstanceTaskDetails): ImportInstanceTaskDetailsOps =
    new ImportInstanceTaskDetailsOps(v)

}
