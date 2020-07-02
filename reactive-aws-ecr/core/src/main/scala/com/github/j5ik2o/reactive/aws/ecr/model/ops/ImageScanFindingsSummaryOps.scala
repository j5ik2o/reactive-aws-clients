// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ImageScanFindingsSummaryBuilderOps(val self: ImageScanFindingsSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanCompletedAtAsScala(value: Option[java.time.Instant]): ImageScanFindingsSummary.Builder = {
    value.fold(self) { v => self.imageScanCompletedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vulnerabilitySourceUpdatedAtAsScala(value: Option[java.time.Instant]): ImageScanFindingsSummary.Builder = {
    value.fold(self) { v => self.vulnerabilitySourceUpdatedAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def findingSeverityCountsAsScala(value: Option[Map[FindingSeverity, Int]]): ImageScanFindingsSummary.Builder = {
    value
      .filter(_.nonEmpty).map(_.view.map { case (k, v) => (k, v.asInstanceOf[java.lang.Integer]) }.toMap).fold(self) {
        v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.findingSeverityCounts(v.asJava)
      }
  }

}

final class ImageScanFindingsSummaryOps(val self: ImageScanFindingsSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageScanCompletedAtAsScala: Option[java.time.Instant] = Option(self.imageScanCompletedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vulnerabilitySourceUpdatedAtAsScala: Option[java.time.Instant] = Option(self.vulnerabilitySourceUpdatedAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def findingSeverityCountsAsScala: Option[Map[FindingSeverity, Int]] =
    Option(self.findingSeverityCounts).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      v.asScala.toMap.view.map { case (k, v) => (k, v.intValue()) }.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToImageScanFindingsSummaryOps {

  implicit def toImageScanFindingsSummaryBuilderOps(
      v: ImageScanFindingsSummary.Builder
  ): ImageScanFindingsSummaryBuilderOps = new ImageScanFindingsSummaryBuilderOps(v)

  implicit def toImageScanFindingsSummaryOps(v: ImageScanFindingsSummary): ImageScanFindingsSummaryOps =
    new ImageScanFindingsSummaryOps(v)

}
