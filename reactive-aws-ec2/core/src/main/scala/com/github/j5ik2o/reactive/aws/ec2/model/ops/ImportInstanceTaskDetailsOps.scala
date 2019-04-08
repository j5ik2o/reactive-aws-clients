// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ImportInstanceTaskDetailsBuilderOps(val self: ImportInstanceTaskDetails.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): ImportInstanceTaskDetails.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def instanceIdAsScala(value: Option[String]): ImportInstanceTaskDetails.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def platformAsScala(value: Option[PlatformValues]): ImportInstanceTaskDetails.Builder = {
    value.fold(self) { v =>
      self.platform(v)
    }
  }

  final def volumesAsScala(value: Option[Seq[ImportInstanceVolumeDetailItem]]): ImportInstanceTaskDetails.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.volumes(v.asJava)
    }
  }

}

final class ImportInstanceTaskDetailsOps(val self: ImportInstanceTaskDetails) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def platformAsScala: Option[PlatformValues] = Option(self.platform)

  final def volumesAsScala: Option[Seq[ImportInstanceVolumeDetailItem]] = Option(self.volumes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
