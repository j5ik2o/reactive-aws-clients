// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SourceBuildInformationBuilderOps(val self: SourceBuildInformation.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTypeAsScala(value: Option[SourceType]): SourceBuildInformation.Builder = {
    value.fold(self) { v => self.sourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceRepositoryAsScala(value: Option[SourceRepository]): SourceBuildInformation.Builder = {
    value.fold(self) { v => self.sourceRepository(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceLocationAsScala(value: Option[String]): SourceBuildInformation.Builder = {
    value.fold(self) { v => self.sourceLocation(v) }
  }

}

final class SourceBuildInformationOps(val self: SourceBuildInformation) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceTypeAsScala: Option[SourceType] = Option(self.sourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceRepositoryAsScala: Option[SourceRepository] = Option(self.sourceRepository)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceLocationAsScala: Option[String] = Option(self.sourceLocation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSourceBuildInformationOps {

  implicit def toSourceBuildInformationBuilderOps(v: SourceBuildInformation.Builder): SourceBuildInformationBuilderOps =
    new SourceBuildInformationBuilderOps(v)

  implicit def toSourceBuildInformationOps(v: SourceBuildInformation): SourceBuildInformationOps =
    new SourceBuildInformationOps(v)

}
