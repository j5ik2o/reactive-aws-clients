// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CreateProjectVersionRequestBuilderOps(val self: CreateProjectVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala(value: Option[String]): CreateProjectVersionRequest.Builder = {
    value.fold(self) { v =>
      self.projectArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNameAsScala(value: Option[String]): CreateProjectVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputConfigAsScala(value: Option[OutputConfig]): CreateProjectVersionRequest.Builder = {
    value.fold(self) { v =>
      self.outputConfig(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trainingDataAsScala(value: Option[TrainingData]): CreateProjectVersionRequest.Builder = {
    value.fold(self) { v =>
      self.trainingData(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def testingDataAsScala(value: Option[TestingData]): CreateProjectVersionRequest.Builder = {
    value.fold(self) { v =>
      self.testingData(v)
    }
  }

}

final class CreateProjectVersionRequestOps(val self: CreateProjectVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectArnAsScala: Option[String] = Option(self.projectArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionNameAsScala: Option[String] = Option(self.versionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputConfigAsScala: Option[OutputConfig] = Option(self.outputConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trainingDataAsScala: Option[TrainingData] = Option(self.trainingData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def testingDataAsScala: Option[TestingData] = Option(self.testingData)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateProjectVersionRequestOps {

  implicit def toCreateProjectVersionRequestBuilderOps(
      v: CreateProjectVersionRequest.Builder
  ): CreateProjectVersionRequestBuilderOps = new CreateProjectVersionRequestBuilderOps(v)

  implicit def toCreateProjectVersionRequestOps(v: CreateProjectVersionRequest): CreateProjectVersionRequestOps =
    new CreateProjectVersionRequestOps(v)

}
