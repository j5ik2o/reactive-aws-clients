// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ProjectVersionDescriptionBuilderOps(val self: ProjectVersionDescription.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala(value: Option[String]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.projectVersionArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimestampAsScala(value: Option[java.time.Instant]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.creationTimestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minInferenceUnitsAsScala(value: Option[Int]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.minInferenceUnits(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ProjectVersionStatus]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala(value: Option[String]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.statusMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billableTrainingTimeInSecondsAsScala(value: Option[Long]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.billableTrainingTimeInSeconds(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trainingEndTimestampAsScala(value: Option[java.time.Instant]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.trainingEndTimestamp(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputConfigAsScala(value: Option[OutputConfig]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.outputConfig(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trainingDataResultAsScala(value: Option[TrainingDataResult]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.trainingDataResult(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def testingDataResultAsScala(value: Option[TestingDataResult]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.testingDataResult(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def evaluationResultAsScala(value: Option[EvaluationResult]): ProjectVersionDescription.Builder = {
    value.fold(self) { v => self.evaluationResult(v) }
  }

}

final class ProjectVersionDescriptionOps(val self: ProjectVersionDescription) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectVersionArnAsScala: Option[String] = Option(self.projectVersionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimestampAsScala: Option[java.time.Instant] = Option(self.creationTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def minInferenceUnitsAsScala: Option[Int] = Option(self.minInferenceUnits)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ProjectVersionStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusMessageAsScala: Option[String] = Option(self.statusMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def billableTrainingTimeInSecondsAsScala: Option[Long] = Option(self.billableTrainingTimeInSeconds)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trainingEndTimestampAsScala: Option[java.time.Instant] = Option(self.trainingEndTimestamp)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputConfigAsScala: Option[OutputConfig] = Option(self.outputConfig)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def trainingDataResultAsScala: Option[TrainingDataResult] = Option(self.trainingDataResult)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def testingDataResultAsScala: Option[TestingDataResult] = Option(self.testingDataResult)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def evaluationResultAsScala: Option[EvaluationResult] = Option(self.evaluationResult)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProjectVersionDescriptionOps {

  implicit def toProjectVersionDescriptionBuilderOps(
      v: ProjectVersionDescription.Builder
  ): ProjectVersionDescriptionBuilderOps = new ProjectVersionDescriptionBuilderOps(v)

  implicit def toProjectVersionDescriptionOps(v: ProjectVersionDescription): ProjectVersionDescriptionOps =
    new ProjectVersionDescriptionOps(v)

}
